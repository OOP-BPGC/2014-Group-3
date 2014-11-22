package zephyr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.regex.Pattern;



/* Registration class
 * 
 * 
 * public boolean registerID (String id, String path);
 * public void writeID(String id, String path);
 * public boolean lastWriteSuccessful();  
 *
 * 
 */

public class Registration {
		private	static final int[] costtshirt={300,300,300};
		
		private static final int costnight=1000;
		/* Original Patterns Compiled ; Pattern.matches(regEx,String) is a more convenient static method available
		
		Pattern idPat1 = Pattern.compile("[2][0][0][4-9]"); //Expression for 2004 - 2009
		Pattern idPat2= Pattern.compile("[2][0][1][0-4]");  // Expression for 2010 - 2014
		
		
		Pattern idPat3 = Pattern.compile("[A][123478][P|T][S][0-9][0-9][0-9][G]");     //Expression for single degree student
		Pattern idPat4 = Pattern.compile("[A][123478][A][123478][0-9][0-9][0-9][G]"); // Special Duals
		Pattern idPat5 = Pattern.compile("[A][123478][B][12345][0-9][0-9][0-9][G]"); //  Reverse Dual
		Pattern idPat6 = Pattern.compile("[B][12345][A][123478][0-9][0-9][0-9][G]"); //Expressions for Dualites
		Pattern idPat7 = Pattern.compile("[B][12345][B][12345][0-9][0-9][0-9][G]");  // Ashwin Krishnan - 2012B5B4
		Pattern idPat8 = Pattern.compile("[B][12345][P|T][S][0-9][0-9][0-9][G]"); // Single Degree MSc.
		
		*/
	
		
	static public int registerNight(String id) throws IOException{
		/*
		 * return 1 if invalid ID no.
		 * return 2 if already used
		 * return 0 if registered successfully*/
		int regerror = 0; 
		boolean istrue = Registration.validID(id);
		if(istrue){
			if(new Registration().writeNight(id,"Registration.txt"))
				regerror=0;
			else
				regerror=2;
		}
		else{
			regerror=1;
		}
		if(regerror==0)
			User.revenue=User.revenue+costnight;
		return regerror;
	} 
	static public int registerTshirt(String id,String[] size,int[] number) throws IOException, ClassNotFoundException{
		int regerror=0;
		boolean istrue = validID(id);
		if(istrue){
			for(int i = 0;i<number.length;i++){
				if(number[i]!=0){
					if(new Registration().writeTshirt(id,"tshirt"+(i+1)+".txt",size[i],number[i])){
						User.revenue=User.revenue+(number[i]*costtshirt[i]);
						regerror=0;
						}
					else
						regerror=2;
				}
			}
		}	
		else{
			regerror=1;
		}
		User.save();
		return regerror;
	}
	public boolean writeTshirt(String id,String path,String size,int number) throws IOException {
		PrintWriter out = null;
		File file=new File(path);
	
		if(file.exists()){
			if(registered(id, path)){
				return false;
			}
		}
		else{
			FileOutputStream fos=new FileOutputStream(file);
			fos.close();
		}		
		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter(path,true)));
			out.println();
			out.println(id);
			out.println(size);
			out.println(number);
			return true;
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
			}
		finally {
			out.close();
		}
		return false;			
	}
	public boolean writeNight(String id,String path) throws IOException {
		PrintWriter out = null;
		File file=new File(path);
		if(file.exists()){
			if(registered(id, path)){
				return false;
			}
		}
		else{
			FileOutputStream fos=new FileOutputStream(file);
			fos.close();
		}		
		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter(path,true)));
			out.println();
			out.println(id);
			return true;
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
			}
		finally {
			out.close();
		}
		return false;			
	}
	static public boolean registered(String id_1,String path){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String sourceID;
		try {
			while((sourceID = br.readLine()) != null) {
				if(sourceID.toUpperCase().equals(id_1.toUpperCase())) {
					br.close();
					return true;
				}	
			}
		//	return false;
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return false;
	}
	
	static public boolean validID(String id){
		id.toUpperCase(); //Standardize search
		/*
			Split the ID into the batch year and the remaining characters
		*/
		String year = id.substring(0,4);
		String branch = id.substring(4,id.length());
		
		boolean matchers[] = new boolean[6]; //Buffer to store all the various combinations
		
		matchers[0] = Pattern.matches("[A][123478][P|T][S][0-9][0-9][0-9][G]", branch);
		matchers[1] = Pattern.matches("[A][123478][A][123478][0-9][0-9][0-9][G]", branch);
		matchers[2] = Pattern.matches("[A][123478][B][12345][0-9][0-9][0-9][G]", branch);
		matchers[3] = Pattern.matches("[B][12345][A][123478][0-9][0-9][0-9][G]", branch);
		matchers[4] = Pattern.matches("[B][12345][B][12345][0-9][0-9][0-9][G]", branch);
		matchers[5] = Pattern.matches("[B][12345][P|T][S][0-9][0-9][0-9][G]", branch);
				
		if(Pattern.matches("[2][0][0][4-9]", year) || Pattern.matches("[2][0][1][0-4]", year)) {
			if( matchers[0] || matchers[1] || matchers[2] || matchers[3] || matchers[4] || matchers[5]) {
				return true;
			}
		}
		return false;	
	} 
	/*public static void main(String args[]) throws IOException {
		String[] size={"S","M","L"};
		int[] number={1,2,3};
		Registration.registerTshirt("2013A7PS115G",size,number);
		System.out.println(Registration.registered("2013A7PS115G", "tshirt1.txt"));
		}	*/
}

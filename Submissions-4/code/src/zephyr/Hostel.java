package zephyr;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

/* 	Hostel names refered to as numbers starting from 0
 *
 * 	hostelarray[][0] name
 *	hostelarray[][1] password
 *	hostelarray[][2] betting details
 *	hostelarray[][3] points
 */

@SuppressWarnings("serial")
public class Hostel implements Serializable{
	 static String[][] hostelarray = new String[14][4];	
	 String[][] hostelarrayo = new String[14][4];
	
	static String[][] gethostelarray() throws FileNotFoundException, IOException, ClassNotFoundException{
		
		return Hostel.hostelarray;
	}
	 
	static public String getHostelDetails(int n, int m) throws FileNotFoundException, ClassNotFoundException, IOException{//n-hostel,m-column
		
		return(Hostel.gethostelarray()[n][m]);
	}
	
	static void setpassword(int n, String passwd) throws FileNotFoundException, ClassNotFoundException, IOException{
		
		Hostel.gethostelarray()[n][1] = passwd;
	}
	
	static void setHostelname(int n,String name) throws FileNotFoundException, ClassNotFoundException, IOException{
		
		Hostel.gethostelarray()[n][0] = name;
	}
	
	static void setHostelpoints(int n, int point){
		
		int i = (Integer.parseInt(Hostel.hostelarray[n][3])) + point;
		Hostel.hostelarray[n][3] = Integer.toString(i);
	}
}

/*

*/
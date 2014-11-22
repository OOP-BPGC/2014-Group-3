package zephyr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import java.util.Scanner;

public class User {
	private String convenerpassword = "password";
	 
	static int revenue=0;
	
	public boolean convenerLogin(String pwd){
		
		if(convenerpassword.equals(pwd))
			return true;
		else
			return false;	
	}
	
	public void setconvenerpassword(String s){
	
		this.convenerpassword = s;
	}
		
	public boolean emLogin(String pwd, String eventname) throws FileNotFoundException, IOException, ClassNotFoundException{
		File file = new File(eventname.toLowerCase()+".txt");
		if(file.exists()){
			
			ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream(eventname.toLowerCase() + ".txt"));
	        Events eve = (Events) objectInputStream2.readObject();
	        objectInputStream2.close();
	        if(eve.getpassword().equals(pwd))
	        	return true;
	        else 
	        	return false;
	        }
		else
			return false;
	}
	
	public boolean hrLogin(String pwd, String hostelname) throws FileNotFoundException, ClassNotFoundException, IOException{
		
		for(int i = 0; i < 14; i++)
		{
			if(Hostel.gethostelarray()[i][0].equals(hostelname))
				if(Hostel.gethostelarray()[i][1].equals(pwd))
					return true;
		}
		return false;
	}
	
	public static void outputstream(String filename,Object o) throws FileNotFoundException, IOException{
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename));
        objectOutputStream.writeObject(o);
        objectOutputStream.flush();
        objectOutputStream.close();
    }
	
	public static void initialize() throws FileNotFoundException, IOException, ClassNotFoundException{
		
		File file = new File("hostel.txt");
		File file1 = new File("Schedule.txt");
		File file2 = new File("revenue.txt");
		if((file.exists())&&(file1.exists())){
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("hostel.txt"));
			Hostel hostel = (Hostel) objectInputStream.readObject();
			Hostel.hostelarray=hostel.hostelarrayo.clone();
			ObjectInputStream objectInputStream_1 = new ObjectInputStream(new FileInputStream("Schedule.txt"));
			Schedule schedule = (Schedule) objectInputStream_1.readObject();
			Schedule.fullSchedule = schedule.fullScheduleo.clone();
			objectInputStream.close();
			objectInputStream_1.close();
		}
		
		else{
			for(int i = 0; i < 14; i++){
				if(i < 8)
					Hostel.hostelarray[i][0] = "ah" + Integer.toString(i + 1);
				else
					Hostel.hostelarray[i][0] = "ch" + Integer.toString(i - 7);
				
				Hostel.hostelarray[i][1] = "password";
				Hostel.hostelarray[i][3] =  "0";
			}
			for(int p=0; p<7;p++)
				for(int q=0;q<3;q++)
					for(int r=0;r<24;r++){
						Schedule.fullSchedule[p][q][r]="0";
					}
		}
		if(file2.exists()){
			Scanner s = new Scanner(file2);
			User.revenue=s.nextInt();
			s.close();
			}
	}
	
	public static void save() throws FileNotFoundException, IOException, ClassNotFoundException{
		
		Hostel hostel = new Hostel();
		hostel.hostelarrayo = Hostel.hostelarray.clone();
		outputstream("hostel.txt", hostel);
		Schedule schedule = new Schedule();
		schedule.fullScheduleo=Schedule.fullSchedule.clone();
		outputstream("Schedule.txt", schedule);

		File file = new File("revenue.txt");
		if(!file.exists())
		{
			file.createNewFile();
		}
		FileWriter fw = new FileWriter(file,false);
		fw.write(Integer.toString(User.revenue));
		fw.close();
	} 
	
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException{
	
	}
}

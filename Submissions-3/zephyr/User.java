package zephyr;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.io.File;

public class User {
	private String convenerpassword = "convenerpassword";
	
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
		@SuppressWarnings("resource")
		
		ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream(eventname.toLowerCase() + ".txt"));
        Events eve = (Events) objectInputStream2.readObject();
        if(eve.getpassword().equals(pwd))
        	return true;
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
		
		if(file.exists()){
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("hostel.txt"));
			Hostel hostel = (Hostel) objectInputStream.readObject();
			Hostel.hostelarray=hostel.hostelarrayo.clone();
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
		}
		
	}
	
	public static void save() throws FileNotFoundException, IOException, ClassNotFoundException{
		
		Hostel hostel = new Hostel();
		hostel.hostelarrayo = Hostel.hostelarray.clone();
		outputstream("hostel.txt", hostel);
	} 
	
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException{
		
		User.initialize();
		User.save();
	}
}

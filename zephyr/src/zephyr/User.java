package zephyr;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class User {
	private String convenerpassword;
	public boolean convenerLogin(String pwd){
		if(convenerpassword==pwd)
			return true;
		else
			return false;
	}
	public void setconvenerpassword(String s){
		this.convenerpassword=s;
	}
		public boolean emLogin(String pwd,String eventname) throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream(eventname.toLowerCase()+".txt"));
        Events eve = (Events) objectInputStream2.readObject();
        if(eve.getpassword()==pwd)
        	return true;
        else 
        	return false;
	}
	public boolean hrLogin(String pwd,String hostelname){
		for(int i=0;i<14;i++)
		{
			if(Hostel.hostelarray[i][0]==hostelname)//conditions for capital and small letters are not added.
				if(Hostel.hostelarray[i][1]==pwd)
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
}

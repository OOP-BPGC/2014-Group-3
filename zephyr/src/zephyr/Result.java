package zephyr;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Result implements Serializable {
	private int[] winners=new int[3];
	Result(int first,int second, int third){
		this.winners[0]=first;
		this.winners[1]=second;
		this.winners[2]=third;
	}
	static void viewfinalresults(String name){
		
	}
	public static void addEventResult(String eventname,int first,int second, int third) throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream(eventname.toLowerCase()+".txt"));
        Events event = (Events) objectInputStream2.readObject();
        event.result=new Result(first,second,third);
        User.outputstream(event.getname().toLowerCase()+"result.txt", event.result);
        User.outputstream(event.getname()+".txt", event);
        
	}
	public static int[] viewEventResult(String eventname) throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream(eventname+"result.txt"));
		Result result = (Result) objectInputStream2.readObject();
		return result.winners;
	}
	
}

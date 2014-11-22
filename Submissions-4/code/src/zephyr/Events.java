package zephyr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Events implements Serializable {
	
	private String name;
	private String des;
	private String passwd;
	private int expenditure = 0;
	
	public enum category{
		gold,silver,bronze
	}
	private category c;
	
	private boolean[] betting = {false,false,false,false,false,false,false,false,false,false,false,false,false,false};
	
	public enum venue{
		c401, c402, c403, lt1, lt2, audi, sac
	}
	venue v;
	
	private int[][] time = {{25,25},{25,25},{25,25}};
	Result result;
	
	public Events(String n){
		
		this.name = n;
	}
	public void setname(String n){
		
		name = n;
	}
	public void setbetting(int n) throws FileNotFoundException, ClassNotFoundException, IOException{
		/*for(int i =0;i<betting.length;i++)
			if(betting[i]==0)
				{
					betting[i]=n+1;
					return; 
				}*/
		betting[n] = true;
		Events.addEventFile(this);
		
	}
	
	public void setdes(String n){
		
		des = n;
	}
	public void setpasswd(String n){
		
		passwd = n;
	}
	public void setexpenditure(int n){
		
		expenditure=n;;
	}
	public void setcategory(category cat){
		
		c = cat;
	}
	public boolean setvenuetime(venue ven,int[][] t){
		
		if(!Schedule.isCheckClash(t, ven.ordinal(),this.name)){
			this.v = ven;
			this.time = t.clone();
			Schedule.addtoSchedule(t,ven.ordinal(),this.name);
			return true;	
		}
		else
			return false;
		
	}
	
	public String getname(){
		
		return(name);
	}
	public String getdescription(){
		
		return des;
	}
	public String getpassword(){
		
		return passwd;
	}
	public category getcategory(){
		
		return c;
	}
	public venue getvenue(){
		
		return v;
	}
	public int getexpenditure(){
		
		return expenditure;
	}
	public int[][] gettimings(){
		
		return this.time;
	}
	public boolean[] getbetting(){
		
		return this.betting;
	}
	public void addEvent(Events event){
		
	}
	public static void addEventFile(Events event) throws IOException{
		
		User.outputstream(event.name.toLowerCase() + ".txt",event);
	}
	/*check if event file exists in gui before calling method*/
	static public void addexpenditure(String eventname, int n) throws ClassNotFoundException, IOException{
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(eventname.toLowerCase() + ".txt"));
        Events event = (Events) objectInputStream.readObject();
		if(event.getexpenditure()!=0){
			User.revenue=User.revenue+event.getexpenditure();
		}
        event.setexpenditure(n);
		User.revenue=User.revenue-n;
		User.save();
		objectInputStream.close();
		User.outputstream(event.name.toLowerCase() + ".txt",event);
	}
	public void editEvent(String name, Events event) throws FileNotFoundException, ClassNotFoundException, IOException, CloneNotSupportedException{
		
	}
	static public boolean deleteEvent(String name) throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException{
		File file = new File(name+".txt");
		File filer = new File(name+"result.txt");
		System.out.println("File exists "+file.exists());
		System.out.println("result exists "+filer.exists());
		if(file.exists()){
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(name+".txt"));
			Events eve = (Events) objectInputStream.readObject();
			if(filer.exists()){
				ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream(name+"result.txt"));
				Result res = (Result) objectInputStream2.readObject();
				eve.result = (Result) res.clone();
				eve.result.removepoints(eve.betting, eve.c);
				objectInputStream2.close();
				System.out.println("res file del "+filer.delete());
			}
			Schedule.removeSchedule(eve.time, eve.v.ordinal());
			objectInputStream.close();
			objectInputStream = null;
			System.gc();
			
			System.out.println("eve file del "+file.delete());
			return true;
		}
		else{
			return false;
		}
	}
	/*public static void main(String[] args){
		File file = new File("abc"+".txt");
		File filer = new File("abc"+"result.txt");
		file.delete();
		filer.delete();
		
	}*/	
}

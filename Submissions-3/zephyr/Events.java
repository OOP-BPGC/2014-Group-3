package zephyr;

import java.io.IOException;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Events implements Serializable {
	
	private String name;
	private String des;
	private String passwd;
	
	public enum category{
		gold,silver,bronze
	}
	private category c;
	
	private boolean[] betting = new boolean[14];
	private float budget,expenditure;
	
	public enum venue{
		c401, c402, c403, lt1, lt2, audi, sac
	}
	venue v;
	
	private int[][] time = new int[3][2];
	Result result;
	
	public Events(String n){
		
		this.name = n;
	}
	public void setname(String n){
		
		name = n;
	}
	public void setbetting(int n){
		/*for(int i =0;i<betting.length;i++)
			if(betting[i]==0)
				{
					betting[i]=n+1;
					return; 
				}*/
		betting[n] = true;
		
	}
	
	public void setdes(String n){
		
		des = n;
	}
	public void setpasswd(String n){
		
		passwd = n;
	}
	public void setcategory(category cat){
		
		c = cat;
	}
	public boolean setvenuetime(venue ven,int[][] t){
		
		if(!Schedule.isCheckClash(t, ven.ordinal())){
			this.v = ven;
			this.time = t.clone();
			return true;	
		}
		
		else
			return false;
		
	}
	public void setbudget(float b){
		
		budget = b;
	}
	public void setexpenditure(float e){
		
		expenditure = e;
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
	public float getbudget(){
		
		return budget;
	}
	public float getexpenditure(){
		
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
	
	public void editEvent(String name){
	
	}
	public void deleteEvent(String name){
		
	}
}

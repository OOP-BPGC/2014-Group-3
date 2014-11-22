package zephyr;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Schedule implements Serializable {
	
	String[][][] fullScheduleo = new String[7][3][24];
	static String[][][] fullSchedule = new String[7][3][24];
	
	static public boolean isCheckClash(int[][] time, int v,String eve_name){
		int flag = 0;
		/*System.out.println("flag1"+flag);
		for(int i = 0; i < 3; i++){
			for(int j = time[i][0]; j <= time[i][1]; j++){
				System.out.println(v+" "+i+" "+j+" ");
				System.out.println(fullSchedule[v][i][j]);}
			}*/
		for(int i = 0; i < 3; i++){
			for(int j = time[i][0]; j < time[i][1]; j++){
					if(j!=25){
						if(fullSchedule[v][i][j].equals("0") )
							continue;
						else{
							System.out.println("flag2"+flag);
							System.out.println(fullSchedule[v][i][j]);
							System.out.println("taken");
							flag = 1;
							break;
						}
					}
			}
		}
		//System.out.println("flag3"+flag);
		if(flag == 1)
			return(true); //Returns true if clash is present
		else {
			addtoSchedule(time,v,eve_name);
			return(false);
		}
	}
	
	static public void addtoSchedule(int[][] time, int v,String name){
		for(int i = 0; i < 3; i++)
			for(int j = time[i][0]; j < time[i][1]; j++){
				if(j!=25)
				fullSchedule[v][i][j] = name ;
			}
	}
	static public void removeSchedule(int[][] time, int v) throws FileNotFoundException, ClassNotFoundException, IOException{
		for(int i = 0; i < 3; i++)
			for(int j = time[i][0]; j < time[i][1]; j++){
				if(j!=25)
				Schedule.fullSchedule[v][i][j] = "0";
			}
		User.save();
	}
		/*public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException{
			User.initialize();
					
			for(int i= 0;i<7;i++)
				for(int j= 0;j<3;j++)
					for(int k= 0;k<24;k++)
						System.out.println(Schedule.fullSchedule[i][j][k]);
			
		}*/
}

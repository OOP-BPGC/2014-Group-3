package zephyr;
public class Schedule {
	
	static boolean[][][] fullSchedule=new boolean[7][3][24];
	
	static public boolean isCheckClash(int[][] time,int v){
		int flag=0;
		for(int i=0;i<3;i++){
			for(int j=time[i][0];j<=time[i][1];j++){
					if(fullSchedule[v][i][j]==false)
					continue;
				else{
					flag=1;
					break;
				}
			}
		}
		if(flag==1)
			return(true); //Returns true if clash is present
		else {
			addtoSchedule(time,v);
			return(false);
		}
	}
	static public void addtoSchedule(int[][] time,int v){
		for(int i=0;i<3;i++)
			for(int j=time[i][0];j<=time[i][1];j++)
				fullSchedule[v][i][j]=true;
	}
}

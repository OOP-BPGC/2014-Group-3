package zephyr;

public class Hostel {
	static String[][] hostelarray = new String[14][4];
	public String getHostelDetails(int n,int m){//n-hostel,m-column
		return(hostelarray[n][m]);
	}
	void setpassword(int n,String passwd){
		hostelarray[n][1]=passwd;
	}
	static void setHostelname(int n,String name){
		hostelarray[n][0]=name;
	}
	static void setHostelDetails(String name){
		
	}
	static void setBettingDetails(String name){
		
	}
	static void updatepoints(){
		//code
		updatefile();
	}
	static void updatefile(){
		
	}
	
}
/*
hostelarray[][0] name
hostelarray[][1] password
hostelarray[][2] betting details
hostelarray[][3] points

*/
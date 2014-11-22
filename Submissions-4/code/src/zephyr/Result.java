package zephyr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

import zephyr.Events.category;
/*
 * if event result is added again points need to change accordingly
 */

@SuppressWarnings("serial")
public class Result implements Serializable,Cloneable {
	
	private int[] winners = new int[3];
	
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	Result(int first,int second,int third){
		
		this.winners[0] = first;
		this.winners[1] = second;
		this.winners[2] = third;
	}

	public static void addEventResult(String eventname,int first,int second, int third) throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException{
		
		File file = new File(eventname.toLowerCase() + "result.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(eventname.toLowerCase() + ".txt"));
        Events event = (Events) objectInputStream.readObject();
		
        if(file.exists()){
			ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream(eventname.toLowerCase() + "result.txt"));
	        Result resulttemp = (Result) objectInputStream2.readObject();
	        event.result = (Result) resulttemp.clone();
	        event.result.removepoints(event.getbetting(), event.getcategory());   
	        objectInputStream2.close();
		}
		event.result = new Result(first,second,third);
        event.result.addpoints(event.getbetting(),event.getcategory());
		User.outputstream(event.getname().toLowerCase() + "result.txt", event.result);
        User.outputstream(event.getname() + ".txt", event);
        objectInputStream.close();
	}
	
	public static int[] viewEventResult(String eventname) throws FileNotFoundException, IOException, ClassNotFoundException{
		
		ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream(eventname + "result.txt"));
		Result result = (Result) objectInputStream2.readObject();
		objectInputStream2.close();
		return result.winners;
		
	}
	
	public void addpoints(boolean[] betting, category c) throws NumberFormatException, FileNotFoundException, ClassNotFoundException, IOException{
		
		int i,j = 0;
		
		for(int pos = 0; pos < 3; pos++){
			switch(pos){
				
				case 0:{
					if(c == category.gold){
						if(betting[winners[pos]] == true){
							Hostel.setHostelpoints(winners[pos], 800);
							break;
						}
						else {
							Hostel.setHostelpoints(winners[pos], 500);
							break;
						}
					}
					
					if(c == category.silver){
						if(betting[winners[j]] == true){
							Hostel.setHostelpoints(winners[pos], 300);
							break;
						}
						else {
							Hostel.setHostelpoints(winners[pos], 200);
							break;
						}
					}
					
					if(c == category.bronze){
						if(betting[winners[pos]] == true){
							Hostel.setHostelpoints(winners[pos], 200);
							break;
						}
						else {
							Hostel.setHostelpoints(winners[pos], 150);
							break;
						}
					}
				}
		
				case 1:{
					
					if(c == category.gold){
						if(betting[winners[pos]] == true){
							Hostel.setHostelpoints(winners[pos], 150);
							break;
						}
						else {
							Hostel.setHostelpoints(winners[pos], 300);
							break;
						}
					}
					
					if(c == category.silver){
						if(betting[winners[j]] == true){
							Hostel.setHostelpoints(winners[pos], 100);
							break;
						}
						else {
							Hostel.setHostelpoints(winners[pos], 200);
							break;
						}
				
					}
					
					if(c == category.bronze){
						if(betting[winners[pos]] == true){
							Hostel.setHostelpoints(winners[pos], 50);
							break;
						}
						else {
							Hostel.setHostelpoints(winners[pos], 150);
							break;
						}
					}
				}		
		
				case 2:{
					if(c == category.gold){
						if(betting[winners[pos]] == true){
							Hostel.setHostelpoints(winners[pos], 50);
							break;
						}
						else{ 
							Hostel.setHostelpoints(winners[pos], 200);
							break;
						}
					}
			
					if(c == category.silver){
						if(betting[winners[j]] == true){
							Hostel.setHostelpoints(winners[pos], 50);
							break;
						}
						else {
							Hostel.setHostelpoints(winners[pos], 150);
							break;
						}
					}
			
					if(c == category.bronze){
						if(betting[winners[pos]] == true){
							Hostel.setHostelpoints(winners[pos], 50);
							break;
						}
						else {
							Hostel.setHostelpoints(winners[pos], 100);
							break;
						}
					}
				}
			}
		}
		
		int flag = 0;
		
		for(i = 0; i < 14; i++){
			if(betting[i] == true){
				for(j = 0; j < 3; j++){
					if(winners[j] == i){
						flag = 1;
						break;
					}	
				}
				
				if(flag == 0){
					switch(c){
					case gold:
						Hostel.setHostelpoints(i, -300);
						break;
					case silver:
						Hostel.setHostelpoints(i, -200);
						break;
					case bronze:
						Hostel.setHostelpoints(i, -150);	
						break;
					}
				}
			}
			flag = 0;
		}
		
	
}
	public void removepoints(boolean[] betting,category c) throws NumberFormatException, FileNotFoundException, ClassNotFoundException, IOException{
		int i,j = 0;
		for(int pos = 0; pos < 3; pos++){
		switch(pos){
		case 0:{
			if(c == category.gold){
				if(betting[winners[pos]] == true){
					Hostel.setHostelpoints(winners[pos], -800);
					break;}
				else {
					Hostel.setHostelpoints(winners[pos], -500);
					break;}
				}
			if(c == category.silver){
				if(betting[winners[j]] == true){
					Hostel.setHostelpoints(winners[pos], -300);
					break;}
				else {
					Hostel.setHostelpoints(winners[pos], -200);
					break;}
			}
			if(c == category.bronze){
				if(betting[winners[pos]] == true){
					Hostel.setHostelpoints(winners[pos], -200);
					break;}
				else {
					Hostel.setHostelpoints(winners[pos], -150);
					break;}
			}
		}
		
		case 1:{
			if(c == category.gold){
				if(betting[winners[pos]] == true){
					Hostel.setHostelpoints(winners[pos], -150);
					break;}
				else {
					Hostel.setHostelpoints(winners[pos], -300);
					break;}
			}
			if(c == category.silver){
				if(betting[winners[j]] == true){
					Hostel.setHostelpoints(winners[pos], -100);
					break;}
				else {
					Hostel.setHostelpoints(winners[pos], -200);
					break;}
			}
			if(c == category.bronze){
				if(betting[winners[pos]] == true){
					Hostel.setHostelpoints(winners[pos], -50);
					break;}
				else {
					Hostel.setHostelpoints(winners[pos], -150);
					break;}
			}
		}
		
		case 2:{
			if(c == category.gold){
				if(betting[winners[pos]] == true){
					Hostel.setHostelpoints(winners[pos], -50);
					break;}
				else {
					Hostel.setHostelpoints(winners[pos], -200);
					break;}
			}
			if(c == category.silver){
				if(betting[winners[j]] == true){
					Hostel.setHostelpoints(winners[pos], -50);
					break;}
				else {
					Hostel.setHostelpoints(winners[pos], -150);
					break;}
			}
			if(c == category.bronze){
				if(betting[winners[pos]]==true){
					Hostel.setHostelpoints(winners[pos], -50);
					break;}
				else {
					Hostel.setHostelpoints(winners[pos], -100);
					break;}
			}
		}
	}
}
		
		int flag = 0;
		
		for(i = 0; i < 14; i++){
			if(betting[i] == true){
				for(j = 0; j < 3; j++){
					if(winners[j] == i){
						flag = 1;
						break;
					}	
				}
				if(flag == 0){
					switch(c){
					case gold:{
						Hostel.setHostelpoints(i, +300);
						break;}
					case silver:{
						Hostel.setHostelpoints(i, +200);
						break;}
					case bronze:{
						Hostel.setHostelpoints(i, +150);	
						break;}
					}
				}
			}
			flag = 0;
		}
	} 
	/*public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException{
		
		User.initialize();
		Events obj_1 = new Events("Futsal");
		
		obj_1.setcategory(category.gold);
		obj_1.result = new Result(0, 3, 2);
	
		Hostel.setpassword(1, "abc");
		Hostel.setHostelname(1, "AH1");
		
		obj_1.result.addpoints(obj_1.getbetting(), obj_1.getcategory());
		
		System.out.println(Hostel.hostelarray[0][3]);
		System.out.println(Hostel.hostelarray[1][3]);
		System.out.println(Hostel.hostelarray[2][3]);
		System.out.println(Hostel.hostelarray[3][3]);
		User.save();
	
	} */
}

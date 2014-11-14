package zephyr;

import java.io.FileNotFoundException;
import java.io.IOException;

import zephyr.Events.category;
import junit.framework.TestCase;

public class HostelTest extends TestCase{
	Events obj_1;
	
	public void setUp() throws FileNotFoundException, ClassNotFoundException, IOException{
		
		User.initialize();
		
		obj_1 = new Events("Futsal");
		
		obj_1.setbetting(0);
		obj_1.setbetting(1);
		obj_1.setbetting(2);
		obj_1.setcategory(category.gold);
		obj_1.result = new Result(0, 3, 2);
	}
	
	public void testgethosteldetails() throws FileNotFoundException, ClassNotFoundException, IOException{
		
		Hostel.setpassword(1, "abc");
		Hostel.setHostelname(1, "AH1");
		assertEquals("abc", Hostel.getHostelDetails(1, 1));
	}
	
	public void testgethosteldetails_1() throws NumberFormatException, FileNotFoundException, ClassNotFoundException, IOException{
		obj_1.result.addpoints(obj_1.getbetting(), obj_1.getcategory());
		
		assertEquals(800,Integer.parseInt(Hostel.hostelarray[0][3]));
		assertEquals(-300,Integer.parseInt(Hostel.hostelarray[1][3]));
		assertEquals(50,Integer.parseInt(Hostel.hostelarray[2][3]));
	}
}

package zephyr;

import java.io.FileNotFoundException;
import java.io.IOException;

import junit.framework.TestCase;

public class UserTest extends TestCase{
	User obj;
	Events obj_1;
	
	public void setUp() throws IOException{
		
		obj = new User();
		obj_1 = new Events("futsal");
		
		Hostel.hostelarray[0][0] = "ah1";
		Hostel.hostelarray[0][1] = "ah-1";
		obj_1.setpasswd("event1");
		Events.addEventFile(obj_1);
		
		
	}
	public void testconvenerlogin(){
		
		obj.setconvenerpassword("abc");
		assertTrue(obj.convenerLogin("abc"));
	}
	public void testconvenerlogin2(){
		
		obj.setconvenerpassword("abcd");
		assertFalse(obj.convenerLogin("abc"));
	}
	
	public void testhrLogin() throws FileNotFoundException, ClassNotFoundException, IOException {
		
		assertTrue(obj.hrLogin("ah-1", "ah1"));
	}
	public void testemlogin() throws FileNotFoundException, ClassNotFoundException, IOException{
		
		assertTrue(obj.emLogin("event1", "futsal"));
	}
}

package zephyr;
import java.io.FileNotFoundException;
import java.io.IOException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import zephyr.Events.venue;
import zephyr.Events.category;
public class EventsTest extends TestCase {
	Events obj;
	Schedule obj1;

	public EventsTest(String n){
		
		super(n);
	}
	
	public void setUp() throws IOException, ClassNotFoundException{
		User.initialize();
		obj = new Events("futsal");
		obj1 = new Schedule();
		//Events.addEventFile(obj);
	}
	
	public void testgetname(){
		
		assertEquals("Futsal",obj.getname());
	}
	
	/*First the fullschedule array of Schedule class is initialised and then setvenuetime method 
	of event class is tested accordingly*/
	public void testsetvenuetime() throws FileNotFoundException, ClassNotFoundException, IOException{
		
		Schedule.fullSchedule[1][2][3] = "fdg";
		int[][] t = {{0,1},{1,2},{3,4}};
		
		assertFalse(obj.setvenuetime(venue.c402, t));
	}
	public void testsetvenuetime2() throws FileNotFoundException, ClassNotFoundException, IOException{
		int[][] t = {{0,1},{1,2},{5,6}};
		
		assertTrue(obj.setvenuetime(venue.c402, t));
		assertEquals(venue.c402,obj.getvenue());
	}
	public void testdeleteEvent() throws NumberFormatException, FileNotFoundException, ClassNotFoundException, IOException, CloneNotSupportedException{
		int time[][] = {{12,13},{13,15},{15,17}};
		obj.setbetting(0);
		obj.setbetting(1);
		obj.setbetting(3);
		obj.setcategory(category.gold);
		obj.setvenuetime(venue.c402,time);
		
		obj.result = new Result(0, 1, 3);
		obj.result.addpoints(obj.getbetting(), obj.getcategory());
		Events.addEventFile(obj);
		//assertEquals("futsal",Schedule.fullSchedule[1][1][14]);
		//assertEquals(obj.getname(),Schedule.fullSchedule[0][0][12]);
		Events.deleteEvent(obj.getname());
		//Schedule.removeSchedule(obj.gettimings(), obj.v.ordinal());
		//assertEquals(12,obj.gettimings()[0][0]);
		//assertEquals("0",Hostel.hostelarray[0][3]);
		assertEquals("0",Schedule.fullSchedule[1][1][14]);
		User.save();
	}
	public static Test Suite(){
		TestSuite suite = new TestSuite();
		suite.addTest(new EventsTest("testgetname"));
		suite.addTest(new EventsTest("testsetvenuetime"));
		suite.addTest(new EventsTest("testsetvenuetime2"));
		suite.addTest(new EventsTest("testdeleteEvent"));
		return(suite);
	}
}

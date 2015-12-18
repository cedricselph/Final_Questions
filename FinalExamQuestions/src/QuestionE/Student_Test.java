package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test{
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		HashMap hMap=new HashMap();
		
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");

		Student stu2 = new Student("a","B","C",dBirthDate,"here","302-222-2222","ajhfg@email.com","last");
		Student stu3 = new Student("d","e","f",dBirthDate,"here","302-222-2222","ajhfg@email.com","last");
		Student stu4 = new Student("g","h","i",dBirthDate,"here","302-222-2222","ajhfg@email.com","last");
		Student stu5 = new Student("j","k","l",dBirthDate,"here","302-222-2222","ajhfg@email.com","last");

		//Mind went blank on how to call their UUID.
		hMap.put(stu1,1);
		hMap.put(stu2,2);
		hMap.put(stu3,3);
		hMap.put(stu4,4);
		hMap.put(stu5,5);
		
		assertTrue(hMap.size()==5);
	}

}

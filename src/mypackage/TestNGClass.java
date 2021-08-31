package mypackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass {
   
		@AfterTest  
		   public  void test3()                     // Third test case.  
		  {  
		   System.out.println("after test2");  
		 }
			  
		@BeforeTest  
		    public void test1()                      // First test case.  
		  {  
		    System.out.println("before test2");   
		  }   
		   
		  @Test  
		   public  void test2()                     // Second test case.  
		  {  
		   System.out.println("test2-part1");  
		 }	
		  @Test
		   public  void test4()                     // Second test case.  
			  {  
			   System.out.println("test2-part2");  
			 }
}

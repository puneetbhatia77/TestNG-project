package mypackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass {
   
  @Test (priority=2)
  public void test2() {
	  System.out.println("Running test 2");
  }
  
  @Test (priority=4)
  public void test4() {
	  System.out.println("Running test 4");
  }
  @Test (priority=1)
  public void test1() {
	  System.out.println("Running test 1");
  }
  @Test (priority=3)
  public void test3() {
	  System.out.println("Running test 3");
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Running test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Running test");
  }

}

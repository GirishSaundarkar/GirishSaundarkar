package TEstNgbasic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsTest {
  @Test
  public void testng() {
	System.out.println("Test Method");  
  
  }
  @BeforeMethod
  public void beforeMethod(){
	  System.out.println("before method");
  }
  @AfterMethod
  public void AfterMethod(){
	  System.out.println("after method");
  }
  
  @BeforeClass
  public void Beforeclass() {
	  System.out.println("before class");
  }
}

package basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test(priority = 1)
  public void testLoginHeading() {
 Assert.assertEquals(3, 3);
  }
  
  @Test(priority = 2 )
  public void TestLoginUnameError() {
	  Assert.assertEquals(3,5);
  }
  
  @Test(priority = 3)
  public void testLoginPasswdError() {
	  Assert.assertEquals(7, 3);
  }
  } 

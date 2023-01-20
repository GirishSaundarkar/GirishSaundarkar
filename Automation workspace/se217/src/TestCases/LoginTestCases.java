package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestCases {
  @Test
  public void testLoginPageHeading() {
	  Assert.assertEquals(3, 3);
  }
  
	  @Test
	  public void testLoginUnameError() {
		  Assert.assertEquals(3, 5);
	  }
	  
		  @Test
		  public void testLoginPasswordError() {
			  Assert.assertEquals(7, 6);
  }
}

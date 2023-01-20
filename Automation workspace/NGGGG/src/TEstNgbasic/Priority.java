package TEstNgbasic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority {
 
	@Test(priority = 1)
	  public void testLoginPageHeading() {
	  Assert.assertEquals(3 , 3);
	  // whenever we set priority attribute of test annotation accordingly test cases will be executed 
	  
	  }
		@Test (priority = 2)
		public void testLoginUnameError() {
			Assert.assertEquals(3 , 5);
		}
		
		@Test (priority = 3)
		public void testLoginPassdError() {
			Assert.assertEquals(7 , 3);
		
  }
}

package testNGBasics;

import org.testng.annotations.Test;

public class NewTest {
  
	  @test
	  public void testLoginPageHeading() {
	  Assert.assertEquals(3 , 6);
	  }
		@Test
		public void testLoginUnameError() {
			Assert.assertEquals(3 , 5);
		}
		
		@Test
		public void testLoginPassdError() {
			Assert.assertEquals(7 , 3);
  }
}

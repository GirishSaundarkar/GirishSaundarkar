package TEstNgbasic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert {
  
	@Test(priority = 1)
	  public void testLoginPageHeading() {
		SoftAssert sa = new SoftAssert();
		
	  System.out.println(1);
	  sa.assertEquals(3 , 3);
	  
	  System.out.println(2);
	  sa.assertEquals(3 , 5);
			
	  System.out.println(3);
	  sa.assertEquals(7 , 3);
	  System.out.println(4);
	  
	  System.out.println(5);
	  sa.assertAll();
	  
  }

	public void assertEquals(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	public void assertAll() {
		// TODO Auto-generated method stub
		
	}
}

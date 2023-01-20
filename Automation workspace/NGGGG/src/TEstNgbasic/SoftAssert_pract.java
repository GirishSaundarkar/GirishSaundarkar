package TEstNgbasic;

import org.testng.annotations.Test;

public class SoftAssert_pract {
  @Test
  public void testLoginHeading() {
	  SoftAssert sa = new SoftAssert();
	  
	  System.out.println(1);
	  sa.assertEquals(3 , 5);
	  
	  System.out.println(2);
	  sa.assertEquals(3, 5);
	  
	  System.out.println(3);
	  sa.assertEquals(7 , 3);
	  
	  System.out.println(4);
	  sa.assertAll();
	   
  }
}

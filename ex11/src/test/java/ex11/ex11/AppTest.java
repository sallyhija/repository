package ex11.ex11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
/* Sally Hiajney 206189805
* 
*  Hiba  Akla    324006147
*/
public class AppTest {
	q4 tester = new q4();
	

    /**
     * Rigorous Test :-)
     */
    @Test
    public void Test_1() {
    	String Expected_result ="A";
    	int a=28, b=24;
    	String mod = "regular";
    	String actual_result = tester.compare(a, b, mod);
    	assertEquals(Expected_result,actual_result);
    }
    	
    @Test
    public void Test_2() {
    	String Expected_result ="A";
    	int a=2, b=2;
    	String mod = "regular";
    	String actual_result = tester.compare(a, b, mod);
    	assertEquals(Expected_result,actual_result);
    	}
    	
    @Test
    public void Test_3() {
    	String Expected_result ="A";
    	int a=28, b=-28;
    	String mod = "negatives";
    	String actual_result = tester.compare(a, b, mod);
    	assertEquals(Expected_result,actual_result);}
    
    @Test
  	public void Test_4() {
    	String Expected_result ="A";
	    int a=-12, b=-24;
	    String mod = "negatives";
	    String actual_result = tester.compare(a, b, mod);
	    assertEquals(Expected_result,actual_result);}	
  	  
    @Test  
    public void Test_5() {
  	    String Expected_result ="A";
  	    int a=1/5, b=10;
  	    String mod = "reciprocals";
  	    String actual_result = tester.compare(a, b, mod);
  	    assertEquals(Expected_result,actual_result);}
    
    @Test
    public void Test_6() {
    	String Expected_result ="A";
    	int a=1/2, b=1/5;
    	String mod = "reciprocals";
    	String actual_result = tester.compare(a, b, mod);
    	assertEquals(Expected_result,actual_result);}
    
    	  
    
    
 
}

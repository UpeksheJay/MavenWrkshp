package Marter.maven.sample;
import junit.framework.TestCase;

public class NicInterpretorTest extends TestCase{

    @Override
    
    protected void setUp() throws Exception {
        super.setUp();       
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    /*Check Year*/
    public void testGetYear()throws Exception {
        System.out.println("getYear");
        NicInterpretor instance = new NicInterpretor("900900600v");
        int expResult = 1990;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    /*Check Month*/
    public void testGetMonth()throws Exception {
        System.out.println("getMonth");
        NicInterpretor instance = new NicInterpretor("900900600v");
        int expResult = 3;
        int result = instance.getMonth();
        assertEquals(expResult, result);
    }

    /*Check Date*/
    public void testGetDate()throws Exception {
        System.out.println("getDate");
        NicInterpretor instance = new NicInterpretor("900900600v");;
        int expResult = 30;
        int result = instance.getDate();
        assertEquals(expResult, result);
    }

    /*Check Gender*/
    public void testGetGender()throws Exception {
        System.out.println("getGender");
        NicInterpretor instance = new NicInterpretor("900900600v");
        String expResult = "Male";
        String result = instance.getGender();
        assertEquals(expResult, result);

    }

   
   
      
    
}

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;


@RunWith(JUnit4.class)
public class CheckTheName {

    @Before
    public void setUp() throws Exception {
        FindTheName test= new FindTheName();
    }

    @After
    public void tearDown() throws Exception {
        findTheName=null;
    }

    FindTheName findTheName;


    @Test
    public void CheckIfNameSuccess(){

        FindTheName test= new FindTheName();

        String s="Is Harry here";

        assertEquals(true,test.findHarry(s));
    }

    @Test
    public void CheckIfNameFailure(){

        FindTheName test= new FindTheName();

        String s="Is Henry here";

        assertNotEquals(true,test.findHarry(s));
    }
}
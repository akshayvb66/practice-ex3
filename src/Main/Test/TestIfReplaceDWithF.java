import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class TestIfReplaceDWithF {

    @Before
    public void setUp() throws Exception {
        ReplaceDWithF test= new ReplaceDWithF();

    }

    @After
    public void tearDown() throws Exception {
        replaceDWithF = null;
    }

    ReplaceDWithF replaceDWithF;

    @Test
    public void ReplacedSuccess(){

        ReplaceDWithF test= new ReplaceDWithF();

        String s = "daily dry";
        assertEquals("faity fry",test.ReplaceDandL(s));

    }

    @Test
    public void ReplacedFailure(){

        ReplaceDWithF test= new ReplaceDWithF();

        String s = "daily dry";
        assertNotEquals("fairy fry",test.ReplaceDandL(s));

    }

}
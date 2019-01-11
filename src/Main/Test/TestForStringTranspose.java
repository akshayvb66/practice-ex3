import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class TestForStringTranspose {

    @Before
    public void setUp() throws Exception {
        StringTranspose test = new StringTranspose();
    }

    @After
    public void tearDown() throws Exception {
       stringTranspose= null;
    }

    StringTranspose stringTranspose;

    @Test
    public void TestforTransposeSuccess(){

        StringTranspose test = new StringTranspose();
        String s ="a quick brown fox jumps over the lazy dog";
        String s2= "a kciuq nworb xof spmuj revo eht yzal god ";

        assertEquals(s2,test.Transposed(s));

    }

    @Test
    public void TestforTransposeFailure(){

        StringTranspose test = new StringTranspose();
        String s ="a quick brown fox jumps over the lazy dog";

        assertNotEquals(null,test.Transposed(s));

    }
}
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class CountOccurenceTest {

    @Before
    public void setUp() throws Exception {
    CountOccurence test= new CountOccurence();

    }

    @After
    public void tearDown() throws Exception {
         countOccurence = null;
    }

    CountOccurence countOccurence;

    @Test
    public void OccurenceTestSuccess(){

        CountOccurence test= new CountOccurence();

        String s = "I am akshay badiger";

        assertEquals(4,test.CountNumberOfTimes(s,"a"));


    }

    @Test
    public void OccurenceTestFailure(){

        CountOccurence test1= new CountOccurence();

        String s = "We live in India";

        assertNotEquals(4,test1.CountNumberOfTimes(s,"a"));


    }

}
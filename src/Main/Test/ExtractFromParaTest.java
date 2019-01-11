import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;


@RunWith(JUnit4.class)
public class ExtractFromParaTest {

    @Before
    public void setUp() throws Exception {
      ExtractFromPara test = new ExtractFromPara();

    }

    @After
    public void tearDown() throws Exception {
        extractFromPara=null;
    }

    ExtractFromPara extractFromPara;

    @Test
    public void extractTextsuccess(){

        ExtractFromPara test = new ExtractFromPara();

        String s = "it could be a snippet of dialogue with narration";

        String s2="a be could dialogue it narration of snippet with ";

        assertEquals(s2,test.sortWords(s));


    }

    @Test
    public void extractTextfailure(){

        ExtractFromPara test = new ExtractFromPara();

        String s = "it could be a snippet of dialogue with narration";

        String s2="a be could it narration of snippet with ";

        assertNotEquals(s2,test.sortWords(s));


    }



}
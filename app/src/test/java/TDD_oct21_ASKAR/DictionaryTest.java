package TDD_oct21_ASKAR;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.*;

public class DictionaryTest {
    private Dictionary dict;
    @Before
    public void initialize () {
        dict = new Dictionary("Example");
    }

    // = new Dictionary("example");
    @Test
    public void testDictionaryName() {
        assertEquals(dict.getName(),"Example");
    }
    public void testDictionaryisEmpty()
    {
        assertEquals(dict.getTranslations().isEmpty(),true);
    }
    @Test public void testOneTranslation() {
        dict.addTranslation("contre", "against");
        assertThat(dict.getTranslation("contre"),containsInAnyOrder("against"));
    }
    /*@Test public void testOneTranslationWithOnlyOneMethod() {
        assertEquals(dict.getTranslation("contre"), "against");
        // en utilisant fake it on peut faire retourner against quel que soit le paramètre entré
    }*/
    @Test public void testSecondTranslation() {
        dict.addTranslation("manger", "eat");
        assertThat(dict.getTranslation("manger"),containsInAnyOrder("eat"));


    }
   @Test public void testTraductionInverse() {
        dict.addTranslation("manger","eat");
    }

}

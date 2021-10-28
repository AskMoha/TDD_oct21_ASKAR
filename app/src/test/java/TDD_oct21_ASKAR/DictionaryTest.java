package TDD_oct21_ASKAR;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
        assertEquals(dict.getTranslation("contre"), "against");
    }
    /*@Test public void testOneTranslationWithOnlyOneMethod() {
        assertEquals(dict.getTranslation("contre"), "against");
        // en utilisant fake it on peut faire retourner against quel que soit le paramètre entré
    }*/
    @Test public void testSecondTranslation() {
        dict.addTranslation("manger", "eat");
        assertEquals(dict.getTranslation("manger"), "eat");
    }
}

package TDD_oct21_ASKAR;

import org.junit.Test;

import static org.junit.Assert.*;

public class DictionaryTest {
    Dictionary dict = new Dictionary("example");
    @Test
    public void testDictionaryName() {
        assertEquals(dict.getName(),"example");
    }
    public void testDictionaryisEmpty()
    {
        assertEquals(dict.getName().isEmpty(),true);
    }
    @Test public void testOneTranslation() {
        dict.addTranslation("contre", "against");
        assertEquals(dict.getTranslation("contre"), "against");
    }
    @Test public void testOneTranslationWithOnlyOneMethod() {
        assertEquals(dict.getTranslation("contre"), "against"); // en utilisant fake it on peut faire retourner against quel que soit le paramètre entré
    }
    @Test public void testSecondTranslation() {
        dict.addTranslation("manger", "eat");
        assertEquals(dict.getTranslation("manger"), "eat");
    }
}

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
}

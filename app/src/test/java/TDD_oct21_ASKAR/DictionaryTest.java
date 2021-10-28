package TDD_oct21_ASKAR;

import org.junit.Test;

import static org.junit.Assert.*;

public class DictionaryTest {
    @Test
    public void testDictionaryName() {
        Dictionary dict = new Dictionary();
        assertEquals(dict.getName(),"example");
    }
}

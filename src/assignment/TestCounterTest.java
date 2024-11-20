package assignment;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestCounterTest {

    @Test
    public void testAddRowUpdatesRowCount() {
        TextCounter counter = new TextCounter();
        counter.addRow("Hejsan");
        counter.addRow("Staffan");
        assertEquals(2, counter.getRowCount(), "Antalet rader ska vara 2 efter två tillägg.");
    }

    @Test
    public void testAddRowUpdatesCharacterCount() {
        TextCounter counter = new TextCounter();
        counter.addRow("Hejsan");
        counter.addRow("Staffan");
        assertEquals(13, counter.getCharacterCount(), "Antalet tecken ska vara 13 efter att 'Hejsan' och 'Staffan' lagts till.");
    }

    @Test
    public void testEmptyRow() {
        TextCounter counter = new TextCounter();
        counter.addRow(""); // Lägg till en tom rad
        assertEquals(1, counter.getRowCount(), "Antalet rader ska vara 1 även om raden är tom.");
        assertEquals(0, counter.getCharacterCount(), "Antalet tecken ska vara 0 om raden är tom.");
    }

    @Test
    public void testLongestWord() {
        TextCounter counter = new TextCounter();
        counter.addRow("Det var kul att träffa dig i Malmö");
        assertEquals("träffa", counter.getLongestWord(), "Det längsta ordet ska vara 'träffa'.");
    }

    @Test
    public void testShouldStop() {
        TextCounter counter = new TextCounter();
        boolean result = counter.isStop("stop");
        assertTrue(result, "Metoden isStop ska returnera true för ordet 'stop'.");
    }
}
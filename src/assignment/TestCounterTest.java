package assignment;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
}
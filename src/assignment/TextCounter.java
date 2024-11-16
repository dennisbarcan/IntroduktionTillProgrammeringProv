package assignment;

public class TextCounter {

        private int rowCount = 0; // Räknar rader
        private int characterCount = 0; // Räknar tecken

        // Metod för att uppdatera statistik
        public void addRow(String row) {
            rowCount++; // Ökar radantalet med 1
            characterCount += row.length(); // Lägger till antalet tecken i raden
        }

        // Hämtar antalet rader
        public int getRowCount() {
            return rowCount;
        }

        // Hämtar antalet tecken
        public int getCharacterCount() {
            return characterCount;
        }
}

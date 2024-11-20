package assignment;

public class TextCounter {
    private int rowCount = 0;
    private int characterCount = 0;
    private int wordCount = 0;
    private String longestWord = "";

    // Metod för att uppdatera statistik
    public void addRow(String row) {
        rowCount++;
        characterCount += row.length();

        // Dela upp raden i ord baserat på mellanslag
        String[] words = row.split(" ");
        wordCount += words.length;

        // Uppdatera det längsta ordet
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
    }

    // Kontrollera om en rad är "stop"
    public boolean isStop(String row) {
        return row.equalsIgnoreCase("stop");
    }

    // Hämtar antalet rader
    public int getRowCount() {
        return rowCount;
    }

    // Hämtar antalet tecken
    public int getCharacterCount() {
        return characterCount;
    }

    // Hämtar antalet ord
    public int getWordCount() {
        return wordCount;
    }

    // Hämtar det längsta ordet
    public String getLongestWord() {
        return longestWord;
    }
}
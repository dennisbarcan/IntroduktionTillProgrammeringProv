package assignment;

import java.util.Scanner;

// Klass 1: Ansvarar för inläsning, kontroll och utskrift
public class TextAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextCounter counter = new TextCounter(); // Skapa ett TextCounter-objekt

        System.out.println("Skriv in text rad för rad, skriv 'stop' för att avsluta programmet.");

        while (true) {
            String input = scanner.nextLine(); // Läs in text

            if (counter.isStop(input)) { //Kontrollerar om användaren har skrivit stop i TextCounter.
                break; // Avslutar loopen
            }

            counter.addRow(input); // Uppdaterar statistik med den nya raden
            System.out.println("Du skrev: " + input); // Skriver ut vad användaren skrev
        }

        // Skriver ut statistik
        System.out.println("Du skrev totalt " + counter.getCharacterCount() + " tecken.");
        System.out.println("Du skrev totalt " + counter.getRowCount() + " rader.");
        System.out.println("Du skrev totalt " + counter.getWordCount() + " ord.");
        System.out.println("Det längsta ordet var: " + counter.getLongestWord());
        System.out.println("Programmet avslutas.");
        scanner.close();
    }

}
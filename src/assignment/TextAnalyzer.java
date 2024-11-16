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

            if (input.equalsIgnoreCase("stop")) { // Kontrollera om "stop" skrivs
                //Har använt IgnoreCase så att det inte spelar någon roll om man har stora eller små bokstäver.
                break; // Avslutar loopen
            }

            counter.addRow(input); // Uppdaterar statistik med den nya raden
            System.out.println("Du skrev: " + input); // Skriver ut vad användaren skrev
        }

        // Skriver ut statistik
        System.out.println("Du skrev totalt " + counter.getCharacterCount() + " tecken.");
        System.out.println("Du skrev totalt " + counter.getRowCount() + " rader.");
        System.out.println("Programmet avslutas.");
        scanner.close();
    }

}

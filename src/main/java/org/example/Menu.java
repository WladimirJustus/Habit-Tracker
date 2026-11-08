package org.example;

import java.util.Scanner;

public class Menu {
    private HabitManager habitManager;
    private Scanner scanner;

    // Konstruktor
    public Menu(HabitManager habitManager) {
        this.habitManager = habitManager;
        this.scanner = new Scanner(System.in);
    }

    // Startet die Konsolen-Schleife
    public void start() {
        boolean running = true;

        while (running) {
            System.out.println("\n=== HABIT TRACKER MENÜ ===");
            System.out.println("1. Neue Gewohnheit hinzufügen");
            System.out.println("2. Alle Gewohnheiten anzeigen");
            System.out.println("0. Beenden");
            System.out.print("Bitte wähle eine Option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addNewHabit();
                    break;
                case "2":
                    habitManager.listHabits();
                    break;
                case "0":
                    running = false;
                    System.out.println("Programm beendet. Bis zum nächsten Mal!");
                    break;
                default:
                    System.out.println("Ungültige Eingabe. Bitte wähle 0, 1 oder 2.");
            }
        }
    }

    // Hilfsmethode: Fragt nur noch Name und Beschreibung ab (ID macht der Manager)
    private void addNewHabit() {
        System.out.print("Name der Gewohnheit: ");
        String name = scanner.nextLine();

        System.out.print("Beschreibung: ");
        String description = scanner.nextLine();

        // Übergabe an den Manager
        habitManager.addHabit(name, description);
    }
}
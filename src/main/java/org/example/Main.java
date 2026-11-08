package org.example;

public class Main {
    public static void main(String[] args) {
        // 1. Den Manager (die Steuerzentrale) erstellen
        HabitManager manager = new HabitManager();

        // 2. Ein neues Habit-Objekt anlegen
        Habit running = new Habit(1, "Laufen gehen", "30 Minuten durch den Park joggen");

        // 3. Dem Manager übergeben
        manager.addHabit(running);

        // 4. Alle Gewohnheiten ausgeben lassen
        System.out.println("\n--- Status-Check ---");
        manager.listHabits();
    }
}
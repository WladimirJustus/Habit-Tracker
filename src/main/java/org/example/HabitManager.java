package org.example;

import java.util.ArrayList;
import java.util.List;

public class HabitManager {
    private List<Habit> habits;
    private int nextId = 1; // Der Zähler für die automatische ID-Vergabe

    // Konstruktor
    public HabitManager() {
        this.habits = new ArrayList<>();
    }

    // Methode: Erstellt das Habit selbst, vergibt die ID und erhöht den Zähler
    public void addHabit(String name, String description) {
        Habit newHabit = new Habit(nextId, name, description);
        habits.add(newHabit);

        System.out.println("Gewohnheit '" + name + "' erfolgreich hinzugefügt! (ID: " + nextId + ")");
        nextId++; // Zähler für die nächste Gewohnheit hochzählen
    }

    // Methode: Alle Gewohnheiten mit ihrer ID anzeigen
    public void listHabits() {
        if (habits.isEmpty()) {
            System.out.println("Noch keine Gewohnheiten vorhanden.");
            return;
        }
        System.out.println("\nDeine Gewohnheiten:");
        for (Habit h : habits) {
            System.out.println("- [" + h.getId() + "] " + h.getName() + ": " + h.getDescription());
        }
    }
}
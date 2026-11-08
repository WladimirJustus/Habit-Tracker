package org.example;

import java.util.ArrayList;
import java.util.List;

public class HabitManager {
    private List<Habit> habits;

    // Konstruktor
    public HabitManager() {
        this.habits = new ArrayList<>();
    }

    // Methode: Eine neue Gewohnheit hinzufügen
    public void addHabit(Habit habit) {
        habits.add(habit);
        System.out.println("Gewohnheit hinzugefügt: " + habit.getName());
    }

    // Methode: Alle Gewohnheiten anzeigen
    public void listHabits() {
        if (habits.isEmpty()) {
            System.out.println("Noch keine Gewohnheiten vorhanden.");
            return;
        }
        System.out.println("Deine Gewohnheiten:");
        for (Habit h : habits) {
            System.out.println("- " + h.getName() + ": " + h.getDescription());
        }
    }
}
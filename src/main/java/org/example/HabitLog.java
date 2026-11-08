package org.example;

import java.time.LocalDate;

 public class HabitLog {
    private LocalDate date;
    private boolean completed;

    // Konstruktor
    public HabitLog(LocalDate date, boolean completed) {
        this.date = date;
        this.completed = completed;
    }

    // Getter und Setter
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
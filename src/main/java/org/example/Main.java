package org.example;

public class Main {
    public static void main(String[] args) {
        HabitManager manager = new HabitManager();
        Menu menu = new Menu(manager);

        // Das Menü starten
        menu.start();
    }
}
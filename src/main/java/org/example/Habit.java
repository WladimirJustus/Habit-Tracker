package org.example;


    public class Habit {
        private int id;
        private String name;
        private String description;

        // Konstruktor
        public Habit(int id, String name, String description) {
            this.id = id;
            this.name = name;
            this.description = description;
        }

        // Getter und Setter
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }
    }

}

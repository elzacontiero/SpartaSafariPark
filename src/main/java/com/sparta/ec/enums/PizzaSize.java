package com.sparta.ec.enums;


    public enum PizzaSize {
        SMALL("Small pizza", 500),
        MEDIUM("Medium pizza", 620),
        LARGE("Large pizza", 900),
        EXTRALARGE("Extra large pizza", 1150);

        // Fields
        private final String pizzaSize;
        private final int pizzaCalories;

        // Private constructor needed to assign values to those fields
        private PizzaSize(String pizzaSize, int pizzaCalories) {
            this.pizzaSize = pizzaSize;
            this.pizzaCalories = pizzaCalories;
        }

        // Getters - can't have setters for constants
        public String getPizzaSize() {
            return pizzaSize;
        }

        public int getPizzaCalories() {
            return pizzaCalories;
        }
        // Custom method
        public int getEnergyInJoules() {
            return (int)(pizzaCalories * 4.184);
        }
    }



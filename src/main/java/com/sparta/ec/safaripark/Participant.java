package com.sparta.ec.safaripark;

class Participant {

    private int energyLevel = 0;

    private int funLevel = 0;

    Person person;

    Participant(Person person) {
        this.person = person;
    }

    public void feed(IEdible food) {
        energyLevel += food.calories();
        System.out.println("Participant " + person.getFullName() +
                " has been fed and now energy levels are at " + energyLevel);
    }

    public void participate(IActivity activity) {
        energyLevel -= activity.getCaloriesRequired();
        if (energyLevel <= 0) {
            throw new RuntimeException("This person " + person.getFullName()
                    + " has just died");
        }
        funLevel += activity.getFunPoints();
        System.out.println(person.getFullName() + " has just finished an activity.");
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public int getFunLevel() {
        return funLevel;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "\n  person=" + person.getFullName() +
                "\n  energyLevel=" + energyLevel +
                "\n  funLevel=" + funLevel +
                "\n}";
    }
}

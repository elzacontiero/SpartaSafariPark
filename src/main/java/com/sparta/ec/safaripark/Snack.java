package com.sparta.ec.safaripark;

public class Snack implements IEdible {

    private String snackName = "";
    private int snackCalories = 0;

    @Override
    public int calories(){
        return snackCalories;
    }

    public Snack(String snackName, int snackCalories){
        this.snackName = snackName;
        this.snackCalories = snackCalories;
    }

    public String getSnackName() {
        return snackName;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "snackName='" + snackName + '\'' +
                ", snackCalories=" + snackCalories +
                '}';
    }
}

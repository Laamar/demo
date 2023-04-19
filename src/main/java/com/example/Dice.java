package com.example;

public class Dice {
    //attributes
    private int sides;
    private int value;
    //constructor
    public Dice(int sides) {
        this.sides = sides;
        this.value = 1;
    }
    //methods
    public int roll() {
        this.value = (int)(Math.random() * this.sides) + 1;
        return this.value;
    }
    public int getValue() {
        return this.value;
    }
    public int getSides() {
        return this.sides;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void setSides(int sides) {
        this.sides = sides;
    }
    public String toString() {
        return "Dice: " + this.value + " sides: " + this.sides;
    }

    
    
}

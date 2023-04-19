package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        System.out.println( "Hello World!" );
    
    //instantiate three Dice objects
    Dice d1 = new Dice(8);
    Dice d2 = new Dice(8);
    Dice d3 = new Dice(8);
    //roll the dice
    d1.roll();
    d2.roll();
    d3.roll();
    //print the values of the dice
    System.out.println("The values of the dice are: " + d1.getValue() +" "+ d2.getValue() + " " + d3.getValue());
    //check if the dice are all the same
    }
}

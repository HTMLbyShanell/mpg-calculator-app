/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milespergallon;

import java.util.Scanner;

/**
 *
 * @author Shanell Spann
 */
public class mpg {
    
    int milesDriven;
    int gallonsUsed;
    int mpg;
    Scanner keyboard = new Scanner(System.in);
    
    public void userInput()
    {
        System.out.println("How many miles did you drive?");
        milesDriven = keyboard.nextInt(); 
        System.out.println("How many gallons of gas did you use?");
        gallonsUsed = keyboard.nextInt(); 
    }
    
    public void calculateMPG()
    {
        mpg = (milesDriven / gallonsUsed);
    }
    
    public void displayMPG()
    {
        System.out.println("Your vehicle's gas mileage = " + mpg + " MPG");
    }   
}

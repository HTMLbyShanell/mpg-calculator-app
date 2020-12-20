/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milespergallon;

/**
 *
 * @author Shanell A Spann
 * Course: IT-DEV 140  Programming with JAVA
 * Assignment 2
 * Date:  09/26/2020
 * 
 * Description:  This assignment is to complete programming challenges in the
 * Chapter #2 book of "Starting with JAVA, From Control Structures through Objects".
 * ISBN-13 # 978-0-13-480221-3. This program is Programming Challenge # 9: Miles Per Gallon. 
 * We are to calculate a car's MPG by asking a user the number of miles driven & gallons used. 
 *
 */
public class MilesPerGallon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\t ♥ Chapter 2 - Programming Challenge #9: Miles-per-Gallon ♥ \n");
        
        mpg m = new mpg();
        m.userInput();
        m.calculateMPG();
        m.displayMPG();
    }
    
}

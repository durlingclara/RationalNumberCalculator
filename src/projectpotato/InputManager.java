/*******************************************************************************
 * Input.java
 * Clara Durling
 * 
 * This class handles the input for this program
 ******************************************************************************/
package projectpotato;

import java.util.Scanner;

public class InputManager {
    
    private static final Scanner SCAN = new Scanner(System.in);
    
    public void input(){
        System.out.println("Please enter the first fraction:");
        String first = SCAN.next();
        boolean piN;
        boolean piD;
        Fraction fraction1 = InputManager.parse(first);
        
        System.out.println("Please enter the second fraction:");
        String second = SCAN.next();
        Fraction fraction2 = InputManager.parse(second);
        
        System.out.println("Would you like to add these fractions or multipy them?");
        String operation = SCAN.next();
        String determine = operation.toLowerCase();
        
        if(determine.contains("add")){
          FractionMath.add(fraction1, fraction2);  
        }else if(determine.contains("multiply")){
            FractionMath.multiply(fraction1, fraction2);
        }
    }
    
    private static Fraction parse(String fraction){
        String[] splitFraction = fraction.split("/");
        int numerator = Integer.parseInt(splitFraction[0]);
        int denominator = Integer.parseInt(splitFraction[1]);
        return new Fraction(numerator, denominator, false, false);
    }
    
    private static Fraction parseForPi(String fraction){
        int numerator;
        int denominator;
        boolean piN;
        boolean piD;
        
        String[] splitFraction = fraction.split("/");
        if(splitFraction[0].contains("pi")){
            piN = true;
            piD = false;
            int piMultiplier = Integer.parseInt(splitFraction[0].substring(0, splitFraction[0].length() - 2));
            numerator = piMultiplier;
            denominator = Integer.parseInt(splitFraction[1]);
        }else if(splitFraction[0].contains("pi")){
            piN = false;
            piD = true;
            int piMultiplier = Integer.parseInt(splitFraction[1].substring(0, splitFraction[1].length() - 2));
            denominator = piMultiplier;
            numerator = Integer.parseInt(splitFraction[0]);
        }else{
            piN = false;
            piD = false;
            numerator = Integer.parseInt(splitFraction[0]);
            denominator = Integer.parseInt(splitFraction[1]);
        }
        
        return new Fraction(numerator, denominator, piN, piD);
    }
}

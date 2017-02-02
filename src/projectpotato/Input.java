/*******************************************************************************
 * Input.java
 * Clara Durling
 * 
 * This class handles the input and the majority of the output for this program
 ******************************************************************************/
package projectpotato;

import java.util.Scanner;

public class Input {
    
    private static final Scanner SCAN = new Scanner(System.in);
    
    public void input(){
        System.out.println("Please enter the first fraction:");
        String first = SCAN.next();
        Fraction fraction1 = this.parse(first);
        
        System.out.println("Please enter the second fraction:");
        String second = SCAN.next();
        Fraction fraction2 = this.parse(second);
        
        FractionMath.add(fraction1, fraction2);
    }
    
    private static Fraction parse(String fraction){
        String[] numbersAsStrings = fraction.split("/");
        int numerator1 = Integer.parseInt(numbersAsStrings[0]);
        int denominator1 = Integer.parseInt(numbersAsStrings[1]);
        return new Fraction(numerator1, denominator1);
    }
}

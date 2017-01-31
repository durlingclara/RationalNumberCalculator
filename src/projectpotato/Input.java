/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpotato;

import java.util.Scanner;

/**
 *
 * @author clara.durling
 */
public class Input {
    
    private static final Scanner SCAN = new Scanner(System.in);
    
    public void input(){
        System.out.println("Please enter the first fraction.");
        String first = SCAN.next();
        Fraction fraction1 = this.parse(first);
        
        System.out.println("Please enter the second fraction.");
        String second = SCAN.next();
        Fraction fraction2 = this.parse(second);
        
        Fraction result = FractionMath.add(fraction1, fraction2);
        System.out.println("The answer is " + result.toString());
    }
    
    private static Fraction parse(String fraction){
        String[] numbersAsStrings = fraction.split("/");
        int numerator1 = Integer.parseInt(numbersAsStrings[0]);
        int denominator1 = Integer.parseInt(numbersAsStrings[1]);
        return new Fraction(numerator1, denominator1);
    }
}

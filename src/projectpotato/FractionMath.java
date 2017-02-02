/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpotato;

/**
 *
 * @author clara.durling
 */
public class FractionMath {
    public static void add(Fraction f1, Fraction f2){
        
        int commonDenominator = f1.getDenominator() * f2.getDenominator();
        
        Fraction addableFraction1;
        addableFraction1 = new Fraction((f1.getNumerator() * f2.getDenominator()), commonDenominator);
        Fraction addableFraction2;
        addableFraction2 = new Fraction((f2.getNumerator() * f1.getDenominator()), commonDenominator);
        
        Fraction addedFraction;
        addedFraction = new Fraction((addableFraction1.getNumerator() + addableFraction2.getNumerator()), commonDenominator);
        
        Output.answerAdd(f1, f2, Fraction.simplify(addedFraction));
        
    }
    
    public static void multiply(Fraction f1, Fraction f2){
        int multipliedNumerator = f1.getNumerator() * f2.getNumerator();
        int multipliedDenominator = f1.getDenominator() * f2.getDenominator();
        
        Fraction multipliedFraction = new Fraction(multipliedNumerator, multipliedDenominator);
        
        Output.answerMultiply(f1, f2, Fraction.simplify(multipliedFraction));
    }
}

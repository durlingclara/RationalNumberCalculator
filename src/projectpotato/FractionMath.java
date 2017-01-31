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
    public static Fraction add(Fraction f1, Fraction f2){
        
        int commonDenominator = f1.getDenominator() * f2.getDenominator();
        
        Fraction addableFraction1 = new Fraction((f1.getNumerator() * f2.getDenominator()), commonDenominator);
        Fraction addableFraction2 = new Fraction((f2.getNumerator() * f1.getDenominator()), commonDenominator);
        
        Fraction addedFraction = new Fraction((addableFraction1.getNumerator() + addableFraction2.getNumerator()), commonDenominator);
        return addedFraction;
    }
}

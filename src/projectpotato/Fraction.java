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
public class Fraction {
    private final int numerator;
    private final int denominator;
    
    public Fraction(int numerator, int denominator){
        this.denominator = denominator;
        this.numerator = numerator;
    }
    
    public Fraction(){
        this.denominator = 0;
        this.numerator = 0;
    }
    
    public int getNumerator(){
        return this.numerator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
    
    public int getDenominator(){
        return this.denominator;
    }
    
    public Fraction simplify(Fraction f){
        
        
        Fraction fSimple = new Fraction();
        return fSimple;
    }
    
}

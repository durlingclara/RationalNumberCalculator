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
        if(denominator == 1){
            return numerator + "";
        }else{
            return numerator + "/" + denominator;
        }
    }
    
    public int getDenominator(){
        return this.denominator;
    }
    
    public static Fraction simplify(Fraction f){
        int numerator = f.getNumerator();
        int denominator = f.getDenominator();
        int smaller;
        
        if(denominator > numerator){
            smaller = numerator;
        }else if(numerator > denominator){
            smaller = denominator;
        }else if(numerator == denominator){
            smaller = 0;
            numerator = 1;
            denominator = 1;       
        }else{
            smaller = 0;
        }
        
        int factor;
        for(factor = smaller; factor > 0; factor--){
            int remainderN = numerator % factor;
            int remainderD = denominator % factor;
            if(remainderN == 0 && remainderD == 0){
                numerator = numerator / factor;
                denominator = denominator / factor;
            }
        }
        
        Fraction fSimple = new Fraction(numerator, denominator);
        return fSimple;
    }
    
}

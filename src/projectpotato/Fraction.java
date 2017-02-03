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
public class Fraction {
    private final int numerator;
    private final int denominator;
    private final boolean piN;
    private final boolean piD;
    private final Scanner SCAN = new Scanner(System.in);
    
    public Fraction(int numerator, int denominator, boolean piN, boolean piD){
        if(denominator == 0){
            System.out.println("You cannot have a denominator of zero.");
            while(denominator == 0){
                System.out.println("Please enter the numerator of the corrected fraction:");
                numerator = SCAN.nextInt();
                System.out.println("Now, enter the denominator of the corrected fraction:");
                denominator = SCAN.nextInt();
            }
        }
        this.denominator = denominator;
        this.numerator = numerator;
        this.piN = piN;
        this.piD = piD;
    }
    
    public Fraction(){
        this.denominator = 0;
        this.numerator = 0;
        this.piN = false;
        this.piD = false;
    }
    
    public Boolean isZero(){
        return this.numerator == 0;
    }
    
    public Boolean getpiN(){
        return this.piN;
    }
    
    public Boolean getpiD(){
        return this.piD;
    }
    
    public int getNumerator(){
        return this.numerator;
    }
    
    public int getDenominator(){
        return this.denominator;
    }

    @Override
    public String toString() {
        if(this.isZero()){
            return "0";
        }else if(this.denominator == 1 && !this.piD){
            return this.numerator + OutputManager.piNumerator(piN) + "";
        }else if(this.denominator == 1 && this.piD){
            return this.numerator + OutputManager.piNumerator(piN) + "/" + "pi";
        }else{
            return this.numerator + OutputManager.piNumerator(piN) + "/" + this.denominator + OutputManager.piDenominator(piD);
        }
    }
    

    public static Fraction simplify(Fraction f){
        int numerator = f.getNumerator();
        int denominator = f.getDenominator();
        boolean piN = f.getpiN();
        boolean piD = f.getpiD();
        
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
        
        Fraction fSimple = new Fraction(numerator, denominator, piN, piD);
        return fSimple;
    }
    
}

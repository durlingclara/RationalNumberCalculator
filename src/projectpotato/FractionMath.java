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
        
        boolean piN1 = f1.getpiN();
        boolean piN2 = f2.getpiN();
        boolean piD1 = f1.getpiD();
        boolean piD2 = f2.getpiD();
        boolean piN;
        boolean piD;
        
        if(piD1 && piD2 && !piN1 && !piN2){
            piD = true;
            piN = false;
        }else if(!piD1 && !piD1 && piN1 && piN2){
            piD = false;
            piN = true;
        }else if(!piD1 && !piD1 && !piN1 && !piN2){
            piD = false;
            piN = false;
        }else{
            piD = false;
            piN = false;
            System.out.println("Sory, we haven't figured out how to work with pi for these numbers yet.");
        }
        
        int commonDenominator = f1.getDenominator() * f2.getDenominator();
        
        Fraction addableFraction1;
        addableFraction1 = new Fraction((f1.getNumerator() * f2.getDenominator()), commonDenominator, piN, piD);
        Fraction addableFraction2;
        addableFraction2 = new Fraction((f2.getNumerator() * f1.getDenominator()), commonDenominator, piN, piD);
        
        Fraction addedFraction;
        addedFraction = new Fraction((addableFraction1.getNumerator() + addableFraction2.getNumerator()), commonDenominator, piN, piD);
        
        OutputManager.answerAdd(f1, f2, addedFraction);
        
    }
    
    public static void multiply(Fraction f1, Fraction f2){
        boolean piN1 = f1.getpiN();
        boolean piN2 = f2.getpiN();
        boolean piD1 = f1.getpiD();
        boolean piD2 = f2.getpiD();
        boolean piN;
        boolean piD;
        
        if(!piN1 && !piN2 && !piD1 && !piD2){
            piN = false;
            piD = false;
        }else if(!piN1 && !piN2 && !piD1 && piD2){
            piN = false;
            piD = true;
        }else if(!piN1 && piN2 && !piD1 && !piD2){
            piN = true;
            piD = false;
        }else if(!piN1 && !piN2 && piD1 && !piD2){
            piN = false;
            piD = true;
        }else if(piN1 && !piN2 && !piD1 && !piD2){
            piN = true;
            piD = false;
        }else if(!piN1 && piN2 && piD1 && !piD2){
            piN = false;
            piD = false;
        }else if(piN1 && !piN2 && !piD1 && piD2){
            piN = false;
            piD = false;
        }else{
            piN = false;
            piD = false;
            System.out.println("Sorry, we haven't figured out pi^2 yet.");
        }
        
        int multipliedNumerator = f1.getNumerator() * f2.getNumerator();
        int multipliedDenominator = f1.getDenominator() * f2.getDenominator();
        
        Fraction multipliedFraction = new Fraction(multipliedNumerator, multipliedDenominator, piN, piD);
        
        OutputManager.answerMultiply(f1, f2, multipliedFraction);
    }
}

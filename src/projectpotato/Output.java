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
public class Output {
    public static void answerAdd(Fraction f1, Fraction f2, Fraction answer){
        System.out.println(f1.toString() + " + " + f2.toString() + " = " + answer.toString());
    }
    
    public static void answerMultiply(Fraction f1, Fraction f2, Fraction answer){
        System.out.println(f1.toString() + " x " + f2.toString() + " = " + answer.toString());
    }
}

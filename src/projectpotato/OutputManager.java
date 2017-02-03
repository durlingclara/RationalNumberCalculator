/*******************************************************************************
 * OutputManager.java
 * Clara Durling
 * 
 * This class handles the main bulk of the output for this program
 ******************************************************************************/
package projectpotato;

public class OutputManager {
    public static void formatInput(){
        System.out.println("Please format all fractions like the following fraction:");
        System.out.println("1/10");
        System.out.println("If you have a whole number, format it like the following:");
        System.out.println("10/1");
        System.out.println("If your fracion conatins pi, format your fraction in the following way:");
        System.out.println("1pi/5 OR 3pi/5 OR 3/1pi OR 3/5pi");
        System.out.println("(Note: there MUST be an integer immediately preceding pi)");
        System.out.println("");
    }
    public static void answerAdd(Fraction f1, Fraction f2, Fraction answer){
        answer = Fraction.simplify(answer);
        System.out.println(f1.toString() + " + " + f2.toString() + " = " + answer.toString());
    }
    
    public static void answerMultiply(Fraction f1, Fraction f2, Fraction answer){
        answer = Fraction.simplify(answer);
        System.out.println(f1.toString() + " x " + f2.toString() + " = " + answer.toString());
    }
}

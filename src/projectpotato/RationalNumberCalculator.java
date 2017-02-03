/*******************************************************************************
 * RationalNumberCalculator.java
 * Clara Durling
 * 
 * This class handles the answer output for this program
 ******************************************************************************/
package projectpotato;

/* TODO:
 * ** make capable of working with fractions with pi
 * ** mixed numbers
 * ** Add multiply method to fraction math
 * ** Allow user to choose whether they would like to add or multiply their fractions
 */
public class RationalNumberCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Rational Number calculator.");
        System.out.println("");
        OutputManager.formatInput();
        
        InputManager input = new InputManager();
        input.input();
        System.out.println("");
        System.out.println("Thank you for using the Rational Number calculator");
    }   
}

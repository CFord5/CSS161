import SpaceSmasher_FunctionalAPI.*;
import static SpaceSmasher_FunctionalAPI.KeysEnum.*;

/* TODO 6 - Use a single if/else statement with || to enable "WASD" input, for both upper and lowercase letters. 
 * Outcomes: Single if/else statements with ||
 * 
 * Functions to define:
 *          public void paddleMovementCheck()  
 *        
 * Functions to call:
 *          public boolean isKeyboardButtonDown(keys targetKey);    //returns true if the key indicated is being pressed, false otherwise 
 *          void paddleMoveLeft();
 *          void paddleMoveRight();
 *
 * Useful keyboard keys:
 *          public enum keys {LEFT, RIGHT, UP, DOWN, SPACE, ENTER, ESCAPE, SHIFT, ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE}; 
 * 
 * Hints and Tips:
 *         -Move the mouse out of the window to test paddle movement via the keyboard        
 *         -Remember to test both lowercase AND uppercase!
 */

public class TODO6 extends SpaceSmasherFunctionalAPI {
    
    //TODO: declare methods here from the list above 
    //pushing A,a,D,d will move the paddle
    public void paddleMovementCheck() {
         if ((isKeyboardButtonDown(A))||(isKeyboardButtonDown(a))) {
             paddleMoveLeft();
         } else if ((isKeyboardButtonDown(D))||(isKeyboardButtonDown(d))) {
             paddleMoveRight();
         }
    }
}
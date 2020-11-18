import SpaceSmasher_FunctionalAPI.*;
import static SpaceSmasher_FunctionalAPI.KeysEnum.*;

/* TODO 0 - Use a single if statement to change the paddle image if the user presses "P". 
 * Outcomes: Single if statement
 * 
 * Function to define:
 *          public void changePaddleImageCheck()    
 * 
 * Functions to call:
 *          boolean isKeyboardButtonDown(KeysEnum targetKey)
 *          void paddleSetImage(String fileName)                    
 *
 * Hints and Tips:
 *         -Sometimes the new paddle image disappears; just rerun your main and try again
 *         -The new paddle image will be replaced by a FIRE or ICE paddle when those blocks are hit
 */

public class TODO0 extends SpaceSmasherFunctionalAPI {
    
    //TODO: declare your one method here
    //If p pressed, set paddle image to P2
    public void changePaddleImageCheck() {
        if (isKeyboardButtonDown(P)){
            paddleSetImage("paddles/P2.png");
    }
  }
}


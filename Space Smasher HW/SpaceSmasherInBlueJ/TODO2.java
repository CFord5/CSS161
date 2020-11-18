import SpaceSmasher_FunctionalAPI.*;
import static SpaceSmasher_FunctionalAPI.KeysEnum.*;

/* TODO 2 - Use a multi-way if/else statement to spawn multiple balls when keys "1","2", or "3" are pressed.
 * Outcomes: Multi-Way If Statement
 * 
 * Function to define:
 *          public void multiBallCheck()
 * 
 * Functions to call:
 *           boolean isKeyboardButtonDown(KeysEnum targetKey)
 *           Ball createNewBall() 
 *           void addToBallSetAndSpawn(Ball b) 
 *
 * Hints and tips:
 *           -You can't spawn multi-balls until the first ball is on the screen by hitting space
 *           -The multi-balls will pass right through the blocks and walls, and this is expected.
 */

public class TODO2 extends SpaceSmasherFunctionalAPI {
    
    //TODO: declare your one method here
    //uses if/else if for keyboard numbers to determine number of balls created
     public void multiBallCheck() {
         if (isKeyboardButtonDown(ONE)) {
             addToBallSetAndSpawn(createNewBall());
         } else if (isKeyboardButtonDown(TWO)) {
             addToBallSetAndSpawn(createNewBall());
             addToBallSetAndSpawn(createNewBall());
         } else if (isKeyboardButtonDown(THREE)) {
             addToBallSetAndSpawn(createNewBall());
             addToBallSetAndSpawn(createNewBall());
             addToBallSetAndSpawn(createNewBall());
         }
    }
}
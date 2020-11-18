import SpaceSmasher_FunctionalAPI.*;
import static SpaceSmasher_FunctionalAPI.MouseClicksEnum.*;

/* TODO 4 - Use three nested if statements to spawn balls based on mouse left-clicks. 
 * Outcomes: Multiple nested if statements
 * 
 * Function to define:
 *          public void mouseSpawnBallCheck()
 * 
 * Functions to call:
 *          boolean isMouseOnScreen()
 *          boolean isMouseButtonDown(MouseClicksEnum targetButton)
 *          boolean ballGetVisibility()
 *          void ballSpawnNearPaddle()          
 *         
 * Extended functions to call: 
 *          boolean ballGetVisibility(int whichBall)
 *          void ballSpawnNearPaddle(int whichBall, int whichPaddle)
 *
 * Useful Mouse Enums:
 *          {LEFT, RIGHT, CENTER}
 * 
 */

public class TODO4 extends SpaceSmasherFunctionalAPI {
    
    //TODO: declare your one method here
    //if the mouse is visible, being left clicked, and not visible, the ball will respawn
    public void mouseSpawnBallCheck() {
        if (isMouseOnScreen()) {
            if (isMouseButtonDown(LEFT)){
                if (!ballGetVisibility()) {
                    ballSpawnNearPaddle();
                }
            }
        }
    }
}

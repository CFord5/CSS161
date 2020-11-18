import SpaceSmasher_FunctionalAPI.*;
import static SpaceSmasher_FunctionalAPI.KeysEnum.*;

/* TODO 1 - Use a single if statement detect block and ball collisions and handle them. 
 * Outcomes: Single if statement
 * 
 * Function to define:
 *          public void ballAndBlockCollisionCheck()
 * 
 * Functions to call: 
 *          boolean ballCollidedWithBlock()
 *          void handleBlockBallCollision()
 *        
 * Extended functions to call: 
 *          boolean ballCollidedWithBlock(int whichBall)
 *
 */

public class TODO1 extends SpaceSmasherFunctionalAPI {
    
    //TODO: declare your one method here
    //if ball collides with block, the block will break
    public void ballAndBlockCollisionCheck() {
        if (ballCollidedWithBlock()) {
         handleBlockBallCollision();   
    }
  }
}

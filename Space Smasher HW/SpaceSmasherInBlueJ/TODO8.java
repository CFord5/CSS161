import SpaceSmasher.Ball;
import SpaceSmasher_FunctionalAPI.*;
import static SpaceSmasher_FunctionalAPI.KeysEnum.*;
import static SpaceSmasher_FunctionalAPI.PaddleAndBallStatesEnum.*;

/* TODO 8 - Use a switch statement to detect and handle ball and wall collisions. 
 * Outcomes: Translate a multi-way if/else into a switch statement
 * 
 * Function to define:
 *          public void ballAndWallCollisionCheck()
 * 
 * Functions to call:
 *          WallsEnum getCollidedWall()
 *          void ballReflectOffTopWall()
 *          void ballReflectOffLeftWall()
 *          void ballReflectOffRightWall()
 *          void ballReflectOffBottomWall()
 *          void loseALife()
 *          void ballPlayBounceSound()
 *          
 * Extended functions to call:
 *         void ballReflectOffTopWall(int whichBall)
 *         void ballReflectOffLeftWall(int whichBall)
 *         void ballReflectOffRightWall(int whichBall)
 *         void ballReflectOffBottomWall(int whichBall)
 *         
 * Useful Walls Enums:    
 *         {LEFT, RIGHT, TOP, BOTTOM, NO_COLLISION}
 */

public class TODO8 extends SpaceSmasherFunctionalAPI {
	
	//TODO: declare your one method here
	//if the ball hits the top, left, right, or bottom wall, different outcomes occur
	 public void ballAndWallCollisionCheck() {
	     switch (getCollidedWall())
	     {
	         case TOP:
	          ballReflectOffTopWall();
	          ballPlayBounceSound();
	          break;
	         case LEFT:
	          ballReflectOffLeftWall();
	          ballPlayBounceSound();
	          break;
	         case RIGHT:
	          ballReflectOffRightWall();
	          ballPlayBounceSound();
	          break;
	         case BOTTOM:
	          loseALife();
	          ballSetToInvisible();
	          break;
	   }
    }
}

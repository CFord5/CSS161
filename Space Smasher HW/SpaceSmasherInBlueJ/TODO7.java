import SpaceSmasher.Ball;
import SpaceSmasher_FunctionalAPI.*;
import static SpaceSmasher_FunctionalAPI.WallsEnum.*;
import static SpaceSmasher_FunctionalAPI.PaddleAndBallStatesEnum.*;

/* TODO 7 - Use a multi-way if/else statement to detect and handle ball and wall collisions. 
 * Outcomes: Multi-way if/else statement
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

public class TODO7 extends SpaceSmasherFunctionalAPI {
    
    //TODO: declare your one method here
    //if the ball hits the top, left, right, or bottom wall, different outcomes occur
    public void ballAndWallCollisionCheck() {
        if (getCollidedWall()==TOP){
            ballReflectOffTopWall();
            ballPlayBounceSound();
        } else if (getCollidedWall()==LEFT){
            ballReflectOffLeftWall();
            ballPlayBounceSound();
        } else if (getCollidedWall()==RIGHT){
            ballReflectOffRightWall();
            ballPlayBounceSound();
        } else if (getCollidedWall()==BOTTOM){
            loseALife();
            ballSetToInvisible();
        }
    }
}

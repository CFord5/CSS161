/**
 * Diamonds.java program for CSS 161 B Homework
 * 
 * Chandler Ford
 * Feb. 15, 2016
 */
public class DiamondsPractice
{
 public static void main(String[] args){
        //My attempt to make an ASCII diamond
        drawTopTriangle(20);
        drawBottomTriangle(20);
        //Easier way to make diamond
        drawDiamond(20);
    }
 public static void drawDiamond(int sqr){
        int half = sqr/2;
        for (int row=0; row<sqr; row++)
        {
           for (int column=0; column<sqr; column++)
           {
            if ((column == Math.abs(row - half)) || (column == (row + half)) || (column == (sqr - row + half - 1)))
            {
                System.out.print("-");
            }
            else System.out.print(" ");
           }
           System.out.println();
        } 
 }
  public static void drawTopTriangle(int size){
        //Combined Top Triangle
        for (int y=0; y<size; y++){
            for(int x=0; x<size+1; x++){
            if ((x<size-(y))&&(x<(size/2))){
                System.out.print("*");
            } else if((x>y)&&(x>(size/2))){
                System.out.print("*");
            }else if (y<(size/2)){
                System.out.print("*");
            }else {
                System.out.print("-");
            }
           }
           System.out.println();
        }
 }
  public static void drawBottomTriangle(int size){
        //Combined Bottom Triangle
        for (int y=0; y<size; y++){
            for(int x=size; x>y; x--){
            if ((x>size-(y))&&(x>(size/2))){
                System.out.print("*");
            } else if((x<y)&&(x<(size/2))){
                System.out.print("*");
            }else if (y>(size/2)){
                System.out.print("*");
            }else {
                System.out.print("-");
            }
           }
           System.out.println();
        }
 } 
 public static void drawTopTriangle2(int size){
        //Left-Top Triangle
        for(int y=0; y<size; y++){
            for(int x=30; x>size; x--){
                if((x-16)<y){
                    System.out.print("-");
                } else{
                    System.out.print("*");
               }
            }
            System.out.println();
        }   
        //Right-Top Triangle 
        for(int y=0; y<size; y++){
            for(int x=0; x<size; x++){
                if(x<y){
                    System.out.print("-");
                } else{
                    System.out.print("*");
               }
            }
            System.out.println();
        }
    }
 public static void drawBottomTriangle2(int size){
        //Left-Bottom Triangle 
        for(int y=0; y<size; y++){
            for(int x=0; x<size; x++){
                if(x>y){
                    System.out.print("-");
                } else{
                    System.out.print("*");
               }
            }
            System.out.println();
        } 
        //Right-Bottom Triangle
        for(int y=0; y<size; y++){
            for(int x=30; x>size; x--){
                if((x-16)>y){
                    System.out.print("-");
                } else{
                    System.out.print("*");
               }
            }
            System.out.println();
        }
    }
}


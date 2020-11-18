
/**
 * Write a description of class Practice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Practice
{
   public static void anotherWay(String[] args){    
      for (int i = 0; i < 5; i++) {
        for (int j = i; j >= 0; i--) {

        System.out.print(j + " ");

       }
       System.out.println();
      }
   }   
    //Attempt to make top diamond
    public static void main(String[] args){
        int size=15;
        for(int y=0; y<size; y++){
            for(int x=0; x<size; x++){
                if((y<3)&&(x<3)){
                    System.out.print("-");
                }else{
                    System.out.print("");
               }
            }
            System.out.println();
        }    
    }
    //Half diamond Side 1
    public static void main0(String[] args){
        int size=15;
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
    //Half diamond Side 2
    public static void main1(String[] args){
        int size=15;
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
    }
    //basic triangle
    public static void main2(String[] args){
        int size=5;
        for(int y=0; y<size; y++){
            for(int x=0; x<y; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //box
    public static void main3(String[] args){
        int size=5;
        for(int y=0; y<size; y++){
            for(int x=0; x<size; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //box with triangles
    public static void main4(String[] args){
        int size=15;
        for(int y=0; y<size; y++){
            for(int x=0; x<size; x++){
                if(x-1<y){
                    System.out.print("-");
                } else{
                    System.out.print("*");
               }
            }
            System.out.println();
        }
    }
    //box with triangles flipped
    public static void main5(String[] args){
        int size=15;
        for(int y=0; y<size-1; y++){
            for(int x=0; x<size-1; x++){
                if(y<x){
                    System.out.print("-");
                } else{
                    System.out.print("*");
               }
            }
            System.out.println();
        }
    }
    //basic triangle flipped across y-axis
    public static void main6(String[] args){
        int size=5;
        for(int y=0; y<size; y++){
            for(int x=5; x>y; x--){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
}

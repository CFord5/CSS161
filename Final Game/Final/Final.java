//Imports
import java.util.*;
import java.io.*;
import javax.swing.*;

/**
Class: CSS 161 B
Assignment: Final Software Project: Text-Based Adventure Game
Objective: Create an interactive software application, simulation, or game.
   -Used function decomposition
   -Used looping with repetition control structures
   -Used nested loops
   -Used branching with selection control structures
   -Used file I/O
   -Used multi-dimensional arrays
   -Used exception handling with try/catch block
   -Used GUIs (JOptionPane)
Author: Chandler Ford 
Last Modified Date: 3/19/2016
 */
public class Final
{
    //Declare and initialize global static variables
    public static final int WIDTH=3;
    public static final int HEIGHT=2;
    
    //This is the main method
    //It controls the program by calling methods
    //Contains the main switch statement
    public static void main(String[] args) throws IOException {
        Scanner inputFile=null;  //Declare scanner to read from file
        try{  //Initialize scanner in a try/catch block
            inputFile=new Scanner(new File("userData.txt"));  //The scanner will read from userData.txt
        } catch (FileNotFoundException e){  //If the file is not found print out message
            System.out.println("This machine could not find the file specified!");  //Print message
            System.exit(0);  //Exit program
        }
        
        //Declare user data variables, setting the first one equal to the next String in userData.txt
        String nextString=inputFile.next();
        String userName=null;
        String userNationality=null;
        String userWeapon=null;
        String userAge=null;
        
        //Use a while loop to initialize user data variables
        while(inputFile.hasNext()){
            userName=nextString;
            userNationality=inputFile.next(); 
            userWeapon=inputFile.next();
            userAge=inputFile.next();
        }
        
        //Declare and intialize new scanner for user input
        Scanner keyboard=new Scanner(System.in);

        //Declare both of the multi-dimensional arrays that print later in the game        
        String[][] gameMap={{"(Entry-1","Key Room-2","Game Room-3"},  //New 2D String array
                           {"Tomb-4","Void-5","Inner Chamber-6"}};  
        char[][] board=new char[3][3];  //New 2D char array
        
        //Call the method that prints the game introduction, and then the method the runs room one
        introductionText(userName, userNationality, userWeapon,userAge);  //Calls method with parameters
        roomOneInitial(keyboard, gameMap);  //Calls method with parameters
        
        //Declare and initialize some variables the will help run the main game engine
        int userInput=1;  
        int i=0;  //Counting variable
        boolean gameRunning=true;

        //This while loop will constantly loop the switch statement inside so long as gameRunning remains true, or until the user quits
        while(gameRunning==true){
            i++;  //Will only prompt the user to enter a room number after the introduction/initial methods are called
            if(i>1){
                System.out.println();  //Space
                System.out.println("Enter a room number:");  //Prompts user to enter room number
            }
            
            userInput=keyboard.nextInt();  //userInput is set equal to the user's scanner input
            switch(userInput){  //userInput from scanner determines actions taken by switch statement
                case 1:
                    System.out.println();  //Space
                    System.out.println("This room contains the entryway. There are multiple paths leading further into"); //Print text
                    System.out.println("the temple. A sign is on the wall");  //Print text
                    roomOne(keyboard, gameMap);
                    break;  //Break statement
                case 2:
                    System.out.println();  //Space
                    System.out.println("This is the key room. Torches flicker ominously against the dark walls. A chest");  //Print text
                    System.out.println("lies in the middle of the floor. A large door stands at the end of the room.");  //Print text
                    System.out.println("You get the feeling that someone is watching you.");  //Print text
                    roomTwo(keyboard);  //Calls method with parameters
                    break;  //Break statement
                case 3:
                    System.out.println();  //Space
                    System.out.println("This is the game room. There is hardly any light.");  //Print text
                    System.out.println("As you approach the center of the room, the floor suddenly begins to glow");  //Print text
                    System.out.println("with an otherworldly light. A Tic-Tac-Toe board appears. A ghostly 'O' is");  //Print text
                    System.out.println("slowly scratched into the top-left quadrant.");  //Print text
                    System.out.println();
                    initializeBoard1(board);  //Calls to initialize 2D array
                    drawBoard(board);  //Calls method to print out 2D array
                    roomThree(keyboard, userWeapon, board);  //Calls method with parameters
                    break;  //Break statement
                case 4:
                    System.out.println();  //Space
                    System.out.println("This is a tomb. You gaze around the magnificent chamber. A large golden");  //Print text
                    System.out.println("coffin sits atop a pedestal. You approach the coffin. The lid is ajar.");  //Print text
                    System.out.println("Out of the corner of your eye you see something dissapear into a wall.");  //Print text
                    roomFour(keyboard);  //Calls method with parameters
                    break;  //Break statement
                case 5:
                    System.out.println();  //Space
                    System.out.println("You step into a void. The small amount of light coming from an unknown");  //Print text
                    System.out.println("source defracts off of your body. Ghostly figures are everywhere, but");  //Print text
                    System.out.println("they seem to pay no attention to you. You begin to panic.");  //Print text
                    roomFive(keyboard);  //Calls method with parameters
                    break;  //Break statement
                case 6:
                    System.out.println();  //Space
                    System.out.println("You find yourself in the inner chamber of the temple. A large table");  //Print text
                    System.out.println("lays before you. Food of the highest quality sits on the table.");  //Print text
                    System.out.println("Gold, silver, and all matter of gems are stacked throughout the room,");  //Print text
                    System.out.println("which goes on forever as far as you can tell. You stand, awestruck at");  //Print text
                    System.out.println("the wealth on display in front of you.");  //Print text
                    System.out.println("You suddenly notice that a skeleton has been sitting at the table.");  //Print text
                    System.out.println("The skeleton stares at you, taking notice of your hat and "+userWeapon+".");  //Print text
                    roomSix(keyboard, userName, userNationality, userWeapon, userAge);  //Calls method with parameters
                    break;  //Break statement
                case 7:
                    System.out.println("Exiting game...");  //Print text
                    System.exit(0);  //Exits programs
                    break;  //Break statement
                default:
                    System.out.println("Unrecognized command!");  //Print text
                    break;  //Break statement
            }
        }
    }
    
    //This method will draw the map array featured in room one
    //It does this by using a for loop
    public static void drawMap(String[][] input){  //Takes the 2D string array as input
        for(int y=0; y<HEIGHT; y++){  //While y is less than global static variable
            for(int x=0; x<WIDTH; x++){  //While x is less than global static variable
                System.out.print("|"+input[y][x]+"|");  //Print the array
            }
            System.out.println();  //Space
        }
    }    
    
    //This method prints out the text at the beginning of the game
    //Takes parameters from userData.txt
    public static void introductionText(String userName, String userNationality, String userWeapon, String userAge){  //Parameters
        System.out.println("\t"+"Welcome to Generic Text-Based Adventure Game I!");  //Print text
        System.out.println("\""+"A game of cunning! A game of suspense! A game for all of mankind!"+"\"");  //Print text
        System.out.println("\t"+"   Created by Chandler Ford | Copyright 2016");  //Print text
        System.out.println();  //Space
        System.out.println("Loading...");  //Print text
        System.out.println();  //Space
        System.out.println("You are "+userName+", a "+userAge+" year-old "+userNationality+" adventurer. Clutching your");  //Print text
        System.out.println(userWeapon+", you walk through the dilapidated entryway of an ancient temple, long");  //Print text
        System.out.println("abandoned. You enter a large chamber. Ghostly voices echo off the walls.");  //Print text
        System.out.println("You begin to feel uneasy. An important sign you should read is on the wall.");  //Print text
        System.out.println();  //Space
    }
    
    //This method controls user actions the first time they are in room 1
    //It does this by utilizing a switch statement
    public static void roomOneInitial(Scanner keyboard, String[][] input){  //Take a scanner and 2D String array as parameters
        System.out.println("Press (1) to read sign");  //Prompt user
        int userInput=keyboard.nextInt();  //Sets the int variable equal to the next user entered int
        switch(userInput){  //userInput from scanner determines actions taken by switch statement
            case 1:
                System.out.println();  //Space
                System.out.println("There is a map written here. Something else is carved in the surrounding stone.");  //Print text
                System.out.println("*The rumors are true, adventurer! Much wealth is hidden within this temple.*");  //Print text
                System.out.println();  //Space
                drawMap(input);  //Call method to print out the sign
                System.out.println();  //Space
                System.out.println("*You should probably go through the 6 rooms in order. Enter 7 to quit.*");  //Print text
                System.out.println("*You must enter a room number after every action.*");  //Print text
                System.out.println();  //Space
                System.out.println("Enter a room number:");  //Print text
                break;  //Break statement
            default:
                System.out.println("Unrecognized command!");  //Print text
                break;  //Break statement           
        }
    }
    
    //This method controls user actions whan they are in room one
    //It does this by utilizing a switch statement
    public static void roomOne(Scanner keyboard, String[][] input){  //Take a scanner and 2D String array as parameters
        System.out.println();  //Space
        System.out.println("Press (1) to read sign");  //Prompt user
        System.out.println("Press (2) to change rooms");  //Prompt user
        int userInput=keyboard.nextInt();  //Sets the int variable equal to the next user entered int
        switch(userInput){  //userInput from scanner determines actions taken by switch statement
            case 1:
                System.out.println();  //Space
                System.out.println("There is a map written here. Something else is carved in the surrounding stone.");  //Print text
                System.out.println("*The rumors are true, adventurer! Much wealth is hidden within this temple.*");  //Print text
                System.out.println();  //Space
                drawMap(input);  //Call method to print out the sign
                break;  //Break statement 
            case 2:
                break;  //Break statement 
            default:
                System.out.println("Unrecognized command!");  //Print text
                break;  //Break statement               
        }
    }
    
    //This method controls user actions whan they are in room two
    //It does this by utilizing a switch statement
    public static void roomTwo(Scanner keyboard){  //Takes a scanner as parameter
        System.out.println();  //Space
        System.out.println("Press (1) to open chest");  //Prompt user
        System.out.println("Press (2) to change rooms");  //Prompt user
        System.out.println("Press (3) to try and open the door without key");  //Prompt user
        int userInput=keyboard.nextInt();  //Sets the int variable equal to the next user entered int
        switch(userInput){  //userInput from scanner determines actions taken by switch statement
            case 1:
                System.out.println();  //Space
                System.out.println("There is a golden key lying at the bottom of the chest. You pick it up.");  //Print text
                System.out.println("The key unlocks the door. You hear hissing as smoke dramatically appears.");  //Print text
                break;  //Break statement  
            case 2:
                break;  //Break statement  
            case 3:
                System.out.println();  //Space
                System.out.println("The door won't move. Laughter echoes through the chamber.");  //Print text
                break;  //Break statement  
            default:
                System.out.println("Unrecognized command!");  //Print text
                break;  //Break statement           
        }  
    }
    
    //This method controls user actions whan they are in room three
    //It does this by utilizing a switch statement
    public static void roomThree(Scanner keyboard, String userWeapon, char[][] board){  //Takes a scanner, String, and 2D char array as parameters
        System.out.println();  //Space
        System.out.println("Press (1) to play Tic-Tac-Toe");  //Prompt user
        System.out.println("Press (2) to change rooms");  //Prompt user
        int userInput=keyboard.nextInt();  //Sets the int variable equal to the next user entered int
        switch(userInput){  //userInput from scanner determines actions taken by switch statement
            case 1:
                System.out.println();  //Space
                System.out.println("You use your "+userWeapon+" to mark an x in the middle of the board.");  //Print text
                System.out.println();  //Space
                initializeBoard2(board);  ///Call method to initialize out the board
                drawBoard(board);  //Call method to print out the board
                System.out.println();  //Space
                System.out.println("The entity that was playing against you realizes it's hopelessly outmatched.");  //Print text
                System.out.println("You hear a hiss as the board dissapears.");  //Print text
                break;  //Break statement  
            case 2:
                break;  //Break statement  
            default:
                System.out.println("Unrecognized command!");  //Print text
                break;  //Break statement  
        }
        
    }
    
    //This method intializes the Tic-Tac-Toe board the first time
    //It does this by using a nested for-loop
    public static void initializeBoard1(char[][] board){  //Takes a 2D char array as input
      for(int y=0; y<board.length; y++){  //While y is less than the board length, and...
          for(int x=0; x<board.length; x++){  //While x is less than the board length...
              board[y][x]='_';  //Print out a board with '_'
              board[0][0]='O';  //(0,0) on the boar will be an 'O'
          }      
      }
    }
    
    //This method intializes the Tic-Tac-Toe board the second time
    //It does this by using a nested for-loop 
    public static void initializeBoard2(char[][] board){  //Takes a 2D char array as input
      for(int y=0; y<board.length; y++){  //While y is less than the board length, and...
          for(int x=0; x<board.length; x++){  //While x is less than the board length...
              board[y][x]='_';  //Print out a board with '_'
              board[0][0]='O';  //(0,0) on the boar will be an 'O'
              board[1][1]='X';  //(1,1) on the boar will be a 'X'
          }      
      }
    }
    
    //This method prints out 2D char arrays
    //It does this by using a nested for-loop
    public static void drawBoard(char[][] board){  //Takes a 2D char array as input
        for(int y=0; y<board.length; y++){  //Takes a 2D char array as input
            for(int x=0; x<board.length; x++){  //While x is less than the board length...
                System.out.print("|"+board[y][x]+"|");  //Print the array
            }
            System.out.println();  //Space
        }
    }
    
    //This method controls user actions whan they are in room four
    //It does this by utilizing a switch statement
    public static void roomFour(Scanner keyboard){  //Takes a scanner as parameter
        System.out.println();  //Space
        System.out.println("Press (1) to move the lid");  //Prompt user
        System.out.println("Press (2) to change rooms");  //Prompt user
        System.out.println("Press (3) to stand around");  //Prompt user
        int userInput=keyboard.nextInt();  //Sets the int variable equal to the next user entered int
        switch(userInput){  //userInput from scanner determines actions taken by switch statement
            case 1:
                System.out.println();  //Space
                System.out.println("The lid falls off and crashes to the floor. You peer into the coffin. There");  //Print text
                System.out.println("is a red hat lying on the bottom. You take the hat.");  //Print text
                break;  //Break statement  
            case 2:
                break;  //Break statement  
            case 3: 
                System.out.println();  //Space
                System.out.println("If you listen closely enough, you can make out what sounds like someone humming");  //Print text
                System.out.println("\""+"Hail to the Chief"+"\".");  //Print text
                break;  //Break statement  
            default:
                System.out.println("Unrecognized command!");  //Print text
                break;  //Break statement  
        }
    }
    
    //This method controls user actions whan they are in room five
    //It does this by utilizing a switch statement
    public static void roomFive(Scanner keyboard){  //Takes a scanner as parameter
        System.out.println();  //Space
        System.out.println("Press (1) to put on the hat");  //Prompt user
        System.out.println("Press (2) to change rooms");  //Prompt user
        System.out.println("Press (3) to wait");  //Prompt user    
        int userInput=keyboard.nextInt();  //Sets the int variable equal to the next user entered int
        switch(userInput){  //userInput from scanner determines actions taken by switch statement
            case 1:
                System.out.println();  //Space
                System.out.println("The hat is pretty comfortable. Suddenly you lift off the ground. A demonic");  //Print text
                System.out.println("sounding voice can be heard laughing. You tumble through the void and phase");  //Print text
                System.out.println("into another dimension.");  //Print text
                break;  //Break statement  
            case 2:
                break;  //Break statement  
            case 3:
                System.out.println();  //Space
                System.out.println("You tumble endlessly through the void.");  //Print text
                break;  //Break statement  
            default:
                System.out.println("Unrecognized command!");  //Print text
                break;  //Break statement  
        }
    }
    
    //This method controls user actions whan they are in room six
    //It does this by utilizing a switch statement
    public static void roomSix(Scanner keyboard, String userName, String userNationality, String userWeapon, String userAge){  //Parameters
        System.out.println();  //Space
        System.out.println("Press (1) to observe the skeleton");  //Prompt user
        System.out.println("Press (2) to change rooms");  //Prompt user
        System.out.println("Press (3) to attack the skeleton");  //Prompt user    
        int userInput=keyboard.nextInt();  //Sets the int variable equal to the next user entered int
        switch(userInput){  //userInput from scanner determines actions taken by switch statement
            case 1:
                System.out.println();  //Space
                roomSixConversation(keyboard, userName, userNationality, userWeapon, userAge);  //Calls final conversation method
                break;  //Break statement  
            case 2:
                System.out.println();  //Space
                System.out.println("The skeleton's jaw unhinges and it screams. You are unable to move.");  //Print text
                System.out.println("\""+"THERE IS NO ESCAPING MY DIMENSION!"+"\"");  //Print text
                System.out.println("*You have died.*");  //Print text
                System.exit(0);  //Exit program
            case 3:
                System.out.println();  //Space
                System.out.println("You lunge at the skeleton with your "+userWeapon+". The skeleton vanishes.");  //Print text
                System.out.println("You suddenly feel an intense pain. You look down to see that the skeleton");  //Print text
                System.out.println("has stabbed through you with its scary skeleton hand. It laughs demonically.");  //Print text
                System.out.println("*You have died*");
                System.exit(0);  //Exit program
        }
    }
    
    //This method controls user actions when they enter the conversation with the skeleton in room six
    //A counter variable will keep track of your strength as you try to intimidate a skeleton by choosing the correct 
    //conversation options
    public static void roomSixConversation(Scanner keyboard, String userName, String userNationality, String userWeapon, String userAge){  //Parameters
        int strength=0;  //Declare and intialize the int variable strength
        System.out.println("This being appears to be too powerful to attack at the moment, try to get it off balance.");  //Print text
        System.out.println("The skeleton stares into your soul for a few seconds. It begins to speak to you.");  //Print text
        System.out.println("\""+"So you have made it to my inner chamber."+"\"");  //Print text
        System.out.println("\""+"You must be an adventurer of some talent, "+userName+" of the "+userNationality+"s."+"\"");  //Print text
        System.out.println("Its cold gaze shifts to your "+userWeapon+".");  //Print text
        System.out.println("\""+"Tell me, do all "+userNationality+"s carry such weapons?"+"\"");  //Print text
        System.out.println();  //Space
        System.out.println("Sounds like a yes or no question:");  //Prompt user
        String userInput=keyboard.next();  //User enters a string
        System.out.println();  //Space
        if(userInput.equalsIgnoreCase("yes")){  //If they answer yes
            System.out.println("The skeleton looks slightly intimidated.");  //Print text
            System.out.println("\""+"I'm impressed by the strength of your people."+"\"");  //Print text
            strength++;  //Add a point to the strength modifier
        } else {  //If they don't answer yes
            System.out.println("The skeleton looks unimpressed.");  //Print text
            System.out.println("\""+"Your people must be weak."+"\"");  //Print text
            strength--;  //Subtract a point to the strength modifier
        }
        System.out.println();  //Space
        System.out.println("\""+"But no matter. Surely you are not worthy of my treasure. It's worth over TEN billion dollars."+"\"");  //Print text
        System.out.println();  //Space
        System.out.println("Press (1) to mock the skeleton");  //Prompt user
        System.out.println("Press (2) to stay silent");  //Prompt user
        int userInput2=keyboard.nextInt();  //User enters an int
        System.out.println();  //Space
        if(userInput2==1){  //If user enters 1
            System.out.println("The skeleton looks rattled.");  //Print text
            System.out.println("\""+"What do you mean it's worthless?! I'm the richest skeleton in the world!"+"\"");  //Print text
            strength++;  //Add a point to the strength modifier
        } else if(userInput2==2){  //If user enters 2
            System.out.println("The skeleton looks at you with contempt and laughs.");  //Print text
            System.out.println("\""+"Surely you haven't seen this much wealth in all of the "+userAge+" years you've been alive!"+"\"");  //Print text
            strength--;  //Subtract a point to the strength modifier
        }
        System.out.println();  //Space
        System.out.println("\""+"Tell me, have you ever fought a skeleton before?"+"\"");  //Print text
        System.out.println();  //Space
        System.out.println("Press (1) to bluff");  //Prompt user
        System.out.println("Press (2) to to tell the truth");  //Prompt user
        int userInput3=keyboard.nextInt();  //User enters an int
        System.out.println();  //Space
        if(userInput3==1){  //If user enters 1
            System.out.println("The skeleton looks visibly shaken.");  //Print text
            System.out.println("\""+"Wha...what? How would you have defeated that many?!"+"\"");  //Print text
            strength++;  //Add a point to the strength modifier
        } else if(userInput3==2){  //If user enters 2
            System.out.println("The skeleton's eye sockets flash derisively as it cackles.");  //Print text
            System.out.println("\""+"You fool! Coming here with no skeleton fighting experience? You'll never leave here alive!"+"\"");  //Print text
            strength--;  //Subtract a point to the strength modifier
        }
        System.out.println();  //Space
        System.out.println("The skeleton finally recognizes the hat you have been wearing.");  //Print text
        System.out.println("\""+"My favorite hat! Give that back to me!"+"\"");  //Print text
        System.out.println();  //Space
        if(strength>=0){  //If the user's strength modifier is greater than or equal to zero
            System.out.println("The skeleton appears incredibly nervous. Now's your chance!");  //Print text
        } else if (strength<0){  //If the user's strength mod is less than zero
            System.out.println("The skeleton seems to have grown more powerful during the conversation.");  //Print text
            System.out.println("You would probably lose to it in a fight.");  //Print text
        }
        System.out.println();  //Space
        System.out.println("Press (1) to attack skeleton");  //Prompt user
        int userInput4=keyboard.nextInt();  //User enters an int
        System.out.println();  //Space
        if(userInput4==1){  //If user enters 1
            if(strength>=0){  //If the user's strength modifier is greater than or equal to zero
                System.out.println("You approach the skeleton. The skeleton panics. Your "+userWeapon+" makes short work of the abomination.");  //Print text
                System.out.println("A voice calls out to you across space and time.");  //Print text
                System.out.println("\""+"We will meet again! And I will get my hat back!"+"\"");  //Print text
                System.out.println("You did it! The treasure is yours!");  //Print text
                JOptionPane.showMessageDialog(null, "YOU WIN!");  //GUI popup JOptionPane
                System.exit(0);  //Exit program
            } else if(strength<0){  //If the user's strength mod is less than zero
                System.out.println("The skeleton charges towards you. It deflects your puny counterattack and breaks your "+userWeapon+".");  //Print text
                System.out.println("The creature grabs you, and throws you into another dimension.");  //Print text
                System.out.println("It mocks you as you hurl through the abyss.");  //Print text
                System.out.println("\""+"Better luck next time!"+"\"");  //Print text
                System.out.println("*You have died.*");  //Print text
                JOptionPane.showMessageDialog(null, "YOU LOSE");  //GUI popup JOptionPane
                System.exit(0);  //Exit program
            }
        }
    }
}

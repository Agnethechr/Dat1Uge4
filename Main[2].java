import java.util.ArrayList;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of actions
        ArrayList<String> actions = new ArrayList<String>();
        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");

        // Instantiate the GameMenu class with the actions ArrayList
        GameMenu gameMenu = new GameMenu(actions);
        
        // Call the getAction method to get user input and store it in 'userChoice'
        String userChoice = gameMenu.getAction();

        /* Test the displayMenu method
        gameMenu.displayMenu(); */

        System.out.println("You chose: " + userChoice);

        // Call the doAction method based on the user's choice
        doAction(userChoice);
    }
         
         public static void doAction(String userChoice) {
        // Convert the user's choice to an integer
            int choice = Integer.parseInt(userChoice);

            // Write a switch-case with a case for each of the 4 options
            switch (choice) {
            case 1:
                System.out.println("Starting the game now");
                break;
            case 2:
                System.out.println("Fetching previously saved game data");
                break;
            case 3:
                System.out.println("Game paused");
                break;
            case 4:
                System.out.println("Ending game");
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid action.");
                break;
        }
    }
}


    
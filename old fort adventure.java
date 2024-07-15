import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Old Fort Adventure!");
        System.out.println("You are standing in front of an old, abandoned fort.");
        System.out.println("Your goal is to find the hidden treasure inside.");
        startGame(scanner);
    }

    public static void startGame(Scanner scanner) {
        System.out.println("You see two entrances: one to the left and one to the right.");
        System.out.println("Do you want to go (left) or (right)?");
        String choice = scanner.nextLine();
        
        switch (choice.toLowerCase()) {
            case "left":
                goLeft(scanner);
                break;
            case "right":
                goRight(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please type 'left' or 'right'.");
                startGame(scanner);
                break;
        }
    }

    public static void goLeft(Scanner scanner) {
        System.out.println("You walk through the left entrance and find a dark corridor.");
        System.out.println("Do you want to (continue) down the corridor or (go back)?");
        String choice = scanner.nextLine();
        
        switch (choice.toLowerCase()) {
            case "continue":
                findTreasure(scanner);
                break;
            case "go back":
                startGame(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please type 'continue' or 'go back'.");
                goLeft(scanner);
                break;
        }
    }

    public static void goRight(Scanner scanner) {
        System.out.println("You walk through the right entrance and find a staircase going down.");
        System.out.println("Do you want to (descend) the stairs or (go back)?");
        String choice = scanner.nextLine();
        
        switch (choice.toLowerCase()) {
            case "descend":
                encounterGhost(scanner);
                break;
            case "go back":
                startGame(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please type 'descend' or 'go back'.");
                goRight(scanner);
                break;
        }
    }

    public static void findTreasure(Scanner scanner) {
        System.out.println("You find a room filled with treasure! Congratulations, you win!");
        endGame(scanner);
    }

    public static void encounterGhost(Scanner scanner) {
        System.out.println("You encounter a ghost guarding the treasure.");
        System.out.println("Do you want to (fight) the ghost or (run away)?");
        String choice = scanner.nextLine();
        
        switch (choice.toLowerCase()) {
            case "fight":
                System.out.println("You bravely fight the ghost and win! You find the hidden treasure. Congratulations, you win!");
                endGame(scanner);
                break;
            case "run away":
                System.out.println("You run back to the entrance of the fort.");
                startGame(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please type 'fight' or 'run away'.");
                encounterGhost(scanner);
                break;
        }
    }

    public static void endGame(Scanner scanner) {
        System.out.println("Game over. Do you want to play again? (yes/no)");
        String choice = scanner.nextLine();
        
        if (choice.equalsIgnoreCase("yes")) {
            startGame(scanner);
        } else {
            System.out.println("Thank you for playing! Goodbye!");
            scanner.close();
        }
    }
}

import java.util.Scanner;

/**
 * This program that determines what animal it is(Nested statements).
 * @author Austin Kavelman
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create scanner for user input
    Scanner input = new Scanner(System.in);

    //switch case example
    //get the user choice between 1 and 5
    System.out.println("Please make a selection (1-3)");
    int choice = input.nextInt();
    input.nextLine();
    
    //determines what candy you dropped
    //the same thing but as a switch case statement
    switch(choice){
      case 1:
    System.out.println("here is your chocolate bar");
    break;
      case 2:
    System.out.println("here are your skittles");
    break;
      case 3:
    System.out.println("here are your M&Ms");
    break;
    default:
    System.out.println("Invalid choice");
    }

    //Nested loop example
    //aks the user if the animal has feathers
    System.out.println("does the animal have feathers? (yes/no)");
    String featherAnswer = input.nextLine();

    //check to see the feath status
    if(featherAnswer.equals("yes")){
    //get the feather colour
    System.out.println("what colour are the feathers? (red/blue)");
    String featherColour = input.nextLine();

    //determines the type of bird
    if(featherColour.equals("blue")){
    System.out.println("That is a blue jay");
    } else if(featherColour.equals("red")){
    System.out.println("That is a cardinal");
    }
    
    


    //if the user answered no
    
    
    }

  }
}

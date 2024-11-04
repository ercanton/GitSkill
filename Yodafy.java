import java.util.Scanner;
public class Yodafy {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert your phrase: ");
        String input = in.nextLine();

        // we will add a function that will search the input 
        // for certain phrases like I am, You are, etc. and 
        // move them to yodafy the phrase!

        System.out.println("Here is the yodafied phrase: ");
        System.out.print(input);
    }
}
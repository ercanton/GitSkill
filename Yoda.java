import java.util.Scanner;
public class Yoda {

    private static String[] yodaPhrases = {"i am", "i was", "i will", "you are", "you were", "you will",
                                            "she is", "she was", "she will", "he is", "he was", "he will",
                                            "we are", "we were", "we will", "they are", "they were", 
                                            "they will", "it is", "it was", "it will"};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert your phrase with a period at the end of each sentence: ");
        String input = in.nextLine();

        // we will add a function that will search the input 
        // for certain phrases like I am, You are, etc. and 
        // move them to yodafy the phrase!
        input = yodafy(input);

        System.out.println("Here is the yodafied phrase: ");
        System.out.print(input);
        in.close();
    }

    public static String yodafy(String input)
    {
        input = input.toLowerCase();
        String newInput = "";
        while (input.indexOf(".") != -1)
        {
            int periodLocation = input.indexOf(".");
            String inputPart = input.substring(0, periodLocation);
            System.out.println("InputPart: " + inputPart);
            input = input.substring(periodLocation + 1, input.length());
            System.out.println("Input: " + input);
            String yodafied = inputPart;
            for (String phrase : yodaPhrases)
            {
                if (inputPart.indexOf(phrase) != -1)
                {
                    int phraseLength = phrase.length();
                    System.out.println("found a phrase!");
                    System.out.println(inputPart.substring(phraseLength + 1, inputPart.length()));
                    yodafied = inputPart.substring(phraseLength + 1, inputPart.length()) + " " + phrase + ".";
                    yodafied = yodafied.substring(0, 1).toUpperCase() + yodafied.substring(1);
                }
            }
            newInput += yodafied;
        }
        return newInput;
    }
}
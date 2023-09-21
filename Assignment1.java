import java.util.Scanner;


public class Assignment1 {
  //-------------------------------------------
  //  Prints out initials in big block letters.
  //-------------------------------------------
  public static void main(String[] args) {

    String character;
    String result;
    String reverse;
    double fahrenheit;
    double celsius;
    int min;
    int max;
    int random_int;

    // Placing space before printing to look cleaner in terminal.
    System.out.println("                       ");

      System.out.println("HHHHH    HHHHH   LLLLLL");

      System.out.println("HHHHH    HHHHH   LLLLLL");

      System.out.println("HHHHH    HHHHH   LLLLLL");

      System.out.println("HHHHHHHHHHHHHH   LLLLLL");

      System.out.println("HHHHHHHHHHHHHH   LLLLLL");

      System.out.println("HHHHH    HHHHH   LLLLLL");

      System.out.println("HHHHH    HHHHH   LLLLLLLLLLLL");

      System.out.println("HHHHH    HHHHH   LLLLLLLLLLLL");

    // Placing space after printing to look cleaner in terminal.
    System.out.println("                       ");

    // -----------------------------------------
    //  Code that coverts Fahrenheit to Celcius.
    // -----------------------------------------

    Scanner input = new Scanner(System.in);

      // This line is asking for the user to input a number.
      System.out.println("Please input a degree in Fahrenheit to convert to Celsius: ");

      fahrenheit = input.nextDouble();

      // Equation for converting F to C.
      celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);

    System.out.println("                       ");

    // ---------------------------------------------------------------------------
    //  Code that allows the user to input a 5-character string, then reverses it.
    // ---------------------------------------------------------------------------

    //Prompts user for 5 characters.
    System.out.println("Next, please input a 5-character string:");

      character = input.next();

      // Removes first and last character in the string.
      result = character.substring(1,4);

      // Reverses string.
      reverse = new StringBuilder(result).reverse().toString();

      System.out.println("                       ");

      input.close();

    // ------------------------------------------------------
    //  Code that generates a random number from 32 - 16,384.
    // ------------------------------------------------------

    System.out.println("Generating random number...");

      // Minimum value
      min = 32;

      // Maximum value
      max = 16384;

      // Generates random int value from min to max.
      random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);

    // --------------------------------------------------------------------------------------
    //  Finally, this code takes everything and creates a unique string based on user inputs.
    // --------------------------------------------------------------------------------------

    // Gives the user their new string.
    System.out.println("Your new string is: " + celsius + reverse + random_int);

input.close();

 }
}














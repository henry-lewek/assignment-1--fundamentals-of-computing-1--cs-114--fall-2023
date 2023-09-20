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




    System.out.println("                       "); // Placing space before printing to look cleaner in terminal.

    System.out.println("HHHHH    HHHHH   LLLLLL");
    System.out.println("HHHHH    HHHHH   LLLLLL");
    System.out.println("HHHHH    HHHHH   LLLLLL");
    System.out.println("HHHHHHHHHHHHHH   LLLLLL");
    System.out.println("HHHHHHHHHHHHHH   LLLLLL");
    System.out.println("HHHHH    HHHHH   LLLLLL");
    System.out.println("HHHHH    HHHHH   LLLLLLLLLLLL");
    System.out.println("HHHHH    HHHHH   LLLLLLLLLLLL");

    System.out.println("                       "); // Placing space after printing to look cleaner in terminal.

    // -----------------------------------------
    //  Code that coverts Fahrenheit to Celcius.
    // -----------------------------------------

    Scanner input = new Scanner(System.in);

      System.out.println("Please input a degree in Fahrenheit to convert to Celsius: "); // This line is asking for the user to input a number.

      fahrenheit = input.nextDouble();

      celsius =(( 5 *(fahrenheit - 32.0)) / 9.0); // Equation for converting F to C.

    System.out.println("                       ");

    // ---------------------------------------------------------------------------
    //  Code that allows the user to input a 5-character string, then reverses it.
    // ---------------------------------------------------------------------------

    System.out.println("Next, please input a 5-character string:"); //Prompts user for 5 characters.

      character = input.next();

      result = character.substring(1,4); // Removes first and last character in the string.

      reverse = new StringBuilder(result).reverse().toString(); // Reverses string.

      System.out.println("                       ");

      input.close();

    // ------------------------------------------------------
    //  Code that generates a random number from 32 - 16,384.
    // ------------------------------------------------------

    System.out.println("Generating random number...");

      min = 32; // Minimum value

      max = 16384; // Maximum value

      random_int = (int)Math.floor(Math.random() * (max - min + 1) + min); // Generates random int value from min to max.

    // --------------------------------------------------------------------------------------
    //  Finally, this code takes everything and creates a unique string based on user inputs.
    // --------------------------------------------------------------------------------------

    System.out.println("Your new string is: " + celsius + reverse + random_int); // Gives the user their new string.

input.close();

 }
}














import java.util.Scanner;
import Math.Random;

public class Assignment1 {
  //----------------------------------------------
  //  Prints out initials in big block letters, converts F to C, generates random number, creates new string.
  //----------------------------------------------
  public static void main(String[] args) {
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

    Scanner input = new Scanner(System.in);

    System.out.println("Please input a degree in Fahrenheit to convert to Celsius: "); // This line is asking for the user to input a number.
    double fahrenheit = input.nextDouble();


    double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0); // Equation for converting F to C.

    System.out.println("                       ");

    Scanner string = new Scanner(System.in);

    System.out.println("Next, please input a 5-character string:"); //Prompts user for 5 characters.
    String character = string.nextLine();

    String result = character.substring(1,4); // Removes first and last character in the string.
    String reverse = new StringBuilder(result).reverse().toString(); // Reverses string.

    System.out.println("Generating random number...");

    int min = 32; // Minimum value of range
    int max = 16384; // Maximum value of range
    int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min); // Generates random int value from min to max.

    System.out.println("Your new string is:" + celsius + reverse + random_int); // Gives the user their new string.
string.close();
input.close();






    }
}



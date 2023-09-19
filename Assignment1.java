import java.util.Scanner;
import java.util.Random;

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


    double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0); // Equation for converting F to C

    System.out.println("Good job"); // Filler for now; will delete at the end
    System.out.println("                       ");

    Scanner string = new Scanner(System.in);

    System.out.println("Next, please input a 5-character string:"); //Prompts user for 5 characters
    String character = string.nextLine();

    String result = character.substring(1,4); // Removes first and last character in the string

    System.out.println("Generating random number...");






    }
}



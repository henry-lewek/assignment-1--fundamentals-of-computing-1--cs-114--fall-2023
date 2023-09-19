import java.util.Scanner;

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

    System.out.println("Please input a degree in Fahrenheit to convert to Celsius: ");
    double fahrenheit = input.nextDouble();

    double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
    System.out.println(fahrenheit + " degrees in Fahrenheit is equivalent to " + celsius + " in Celsius.");
    }
}



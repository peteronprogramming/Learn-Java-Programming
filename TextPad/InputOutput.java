import java.util.*;

public class InputOutput
{
    public static void main(String[] args)
    {   // to read input from console, create an object of Scanner that is attached to standard input stream
        // since JDK 5.0
		Scanner input = new Scanner(System.in);

		// get first input
		System.out.print("What is your name ? ");
		String name = input.nextLine(); // reads a line of input

		// get second input
		System.out.print("How old are you ? ");
		int age = input.nextInt(); // read next integer value

		// display output on console
		System.out.println("Hi, " + name + " ! " + "Next year you'll be " + (age + 1) + " years old");
    }
}

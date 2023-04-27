import java.util.*;

public class Retirement
{
   public static void main(String[] args)
   {
	   Scanner input = new Scanner(System.in);

	   // read inputs
	   System.out.print("How much money do you need to retire ? ");
	   double goal = input.nextDouble();

	   System.out.print("How much money will you contribute every year ? ");
	   double payment = input.nextDouble();

	   System.out.print("Interest rate in % ? ");
	   double interestRate = input.nextDouble();

	   double balance = 0;
	   int years = 0;

	   // while goal isn't reached keep updating balance
	   while (balance < goal){
		   // add this year contribution + interest
		   balance += payment;
		   double interest = interestRate * balance / 100;

		   /*
		   // the code below show the implementation of 'break' statement to immediately
		   // jump out of loop if a condition met
		   if (balance >= goal){
		      System.out.println(balance);
		      break;
		   }

		   // the code below show the implementation of 'continue' statement to
		   // immediately jump to the header part of the nearest loop
		   if (interest >= 80000000) continue;
		   */

		   balance += interest;

		   years++;
	   }

	   System.out.printf("You can retire in %d%s%n", years, " years");
   }
}

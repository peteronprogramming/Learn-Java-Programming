import java.util.*;

public class Retirement2
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      System.out.print("How much money will you contribute each year ? ");
      double payment = input.nextDouble();

      System.out.print("Interest rate in % ? ");
      double interestRate = input.nextDouble();

      double balance = 0;
      int years = 0;

      String answer;

      // keep updating account balance while user isn't ready to retire
      do{
		      // add this year payment and interest
		      balance += payment;
		      double interest = interestRate * balance / 100;
		      balance += interest;

		      years++;

		      // print this year balance
		      System.out.printf("After year %d, your balance is %,.2f%n", years, balance);

          // ask if ready to retire
		      System.out.print("Are you ready to retire ? (Y/N) ");
		      answer = input.next();
	    }
	    while (answer.equals("N"));
   }
}

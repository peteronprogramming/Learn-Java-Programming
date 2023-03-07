import java.util.*;
import javax.swing.*;

public class OutputFormatting
{
   public static void main(String[] args)
   {
      String name = "Donald";
      int age = 17;

      // since JDK 5.0 Java has printf method to print console output according to some specified formats
      // format specifiers that start with % character is replaced with corresponding argument, s a string, d a decimal integer, n a line separator
      System.out.printf("Hello, %s! Next year you will be %d years old%n", name, (age + 1));

      double d = 10000.0 / 3.0;
      // the code below will print d with a field of 8 characters and precision of 2 characters, this format will add a leading space
      System.out.printf("%8.2f%n", d);
      // this code will print d with a group separator format and precision of 2 characters
      System.out.printf("%,.2f%n", d);
      // this code will print d without formatting
      System.out.println(d);

      // create a formatted string
      String message = String.format("Hello, %s ! Next year you'll be %d years old.%n", name, (age + 1));
      System.out.print(message);
      JOptionPane.showMessageDialog(null, message);

      // date and time formatting, the code below will display current date in complete date and time format
      String date = String.format("%tc%n", new Date());
      System.out.print(date);

      // we can give index to each of format pattern to avoid supplying the same data multiple times to format each part of it
      // the index must placed right after '%' sign and terminate by '$' sign
      // the code below is indicating that we format the second argument (date) with multiple different format
      System.out.printf("%1$s %2$tB %2$te, %2$tY %n", "Due date: ", new Date());

      // we can use the < flag as an alternative of using index. The < flag is indicating that the same argument as in the preceding format will be used again
      System.out.printf("%s %tB %<te, %<tY %n", "Due date: ", new Date());
      System.exit(0);
   }
}

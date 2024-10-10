import PackageTest.*;
/*
	the Employee class is defined in that package
	imported package is case-sensitive, should be
	written exactly as the name of the directory
*/

import static java.lang.System.*;

public class PackageTest
{
   public static void main(String[] args)
   {
      /*
        because of the import statement, we don't have to
        use PackageTest.Employee in here
      */
      Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);

      // raise salary by 5%
      harry.raiseSalary(5);

      // print out information about harry
      out.println("Name: " + harry.getName() + ", salary: " + harry.getSalary());
   }
}

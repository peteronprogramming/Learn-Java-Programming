public class StringImplementationExample2
{
   public static void main(String[] args)
   {
	   String greeting = "Hello";
	   System.out.println("greeting is: " + greeting);

	   String s = greeting.substring(0, 3); //create a string consisting of "Hel"
	   System.out.println("s is: " + s);

       /*
          Java gives no methods that let us to change characters in a string like what C++ gives
          here are some methods we can use to manipulate String
       */
	   String cProgramming = "This is C++ programming";

       /*
          object of String class in Java is immutable it's mean that we can't change its value directly
          what we can do is refer it to another string object (variable)
          the example below is to change "C++" with "Java" using substring method
          Java use + sign to join two or more strings
       */
	   String javaProgramming1 = cProgramming.substring(0, 8) + "Java" + cProgramming.substring(11);
	   System.out.println("javaProgramming1 is: " + javaProgramming1);

       /*
          the example below is to change "C++" with "Java" using method Replace of String class
          method Replace will replace all occurrences of target characters (ie. "C++") with replacement characters (ie. "Java")
       */
	   String javaProgramming2 = cProgramming.replace("C++", "Java");
	   System.out.println("javaProgramming2 is: " + javaProgramming2);

	   // create new String variable whose value is 3 times repeated of another variable
	   String Hello3x = greeting.repeat(3);
	   System.out.println("Hello3x is: " + Hello3x);

	   String javaProgrammingWhiteSpace = " This is Java programming ";
	   System.out.println("javaProgrammingWhiteSpace is: " + javaProgrammingWhiteSpace);

	   /*
	      use strip() method to remove all leading and trailing white space
	      trim() method is used when we want to remove all leading and trailing space
	      space is any character whose code point is less than or equal U+0020
	   */
	   String javaProgramming3 = javaProgrammingWhiteSpace.strip();
	   System.out.println("javaProgramming3 is: " + javaProgramming3);

	   /*
	      use split() method to splits String variable into array of strings around matches of the given regular expression
	      use split(regex, limit) method to splits String variable into 'limit' number of times pattern is applied
	      split(regex, 0) have the same results as split(regex)
	   */
	   String[] javaProgrammings = javaProgramming1.split(" ");
	   for (int i = 0; i < javaProgrammings.length; i++){
		   System.out.println("javaProgrammings[" + i + "] is: " + javaProgrammings[i]);
	   }
   }
}
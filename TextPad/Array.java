public class Array
{
   public static void main(String[] args)
   {
	  int[] smallPrimes;
   	  smallPrimes = new int[] {17, 19, 23, 29, 31, 37};
   	  System.out.println(smallPrimes[5]);

	  // array in Java is like a pointer in C++
	  // luckyNumbers point to the same location as smallPrimes, its size will be
	  // adjusted and same as smallPrimes
	  int[] luckyNumbers = new int[5];
   	  luckyNumbers = smallPrimes;
   	  luckyNumbers[5] = 33;
   	  System.out.println("luckyNumbers[5] = " + luckyNumbers[5]);
   	  System.out.println("smallPrimes[5] = " + smallPrimes[5]);

	  // it is possible to redefine array in Java, array size will be adjusted
   	  smallPrimes = new int[] {2, 3, 5, 7, 11, 13};
   	  luckyNumbers = new int[] {1001, 1002, 1003, 1004, 1005, 1006, 1007};

   	  // method arraycopy is used to actually copy values of one array into another
	  // target array must have sufficient space to hold copied elements
	  // System.arraycopy(source, sourceIndex, target, targetIndex, count);
	  System.arraycopy(smallPrimes, 2, luckyNumbers, 3, 4);

	  // similar to foreach in VB, since JDK 5.0
	  for (int a : luckyNumbers)
	  	System.out.println(a);

	  // displaying command-line parameters
	  if (args[0].equals("-h"))
	  	System.out.print("Hello, ");
	  else if (args[0].equals("-g"))
	  	System.out.print("Goodbye, ");

	  for (int i = 1; i < args.length; i++)
	  	System.out.print(args[i] + " ");

	  System.out.println("!");
   }
}

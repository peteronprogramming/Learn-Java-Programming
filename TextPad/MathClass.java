import static java.lang.Math.*;  // since JDK 5.0

public class MathClass
{
   public static void main(String[] args)
   {
		// square root
		double a = 16;
		double b = sqrt(a);
		System.out.println(b);

		// power
		double c = 3;
		double d = pow(b, c);
		System.out.println(d);

		// trigonometric functions
		System.out.println("Sin of " + d + " = " + sin(d));
		System.out.println("Cos of " + d + " = " + cos(d));
		System.out.println("Tan of " + d + " = " + tan(d));
		System.out.println("Asin of " + d + " = " + asin(d));
		System.out.println("Acos of " + d + " = " + acos(d));
		System.out.println("Atan of " + d + " = " + atan(d));

		System.out.println(abs(b)); // absolute value of any value
		System.out.println(cbrt(b)); // cube root
		System.out.println(max(b, d)); // greater of two values
		System.out.println(min(b, d)); // smaller of two values
		// random number between 0 and 99
		System.out.println(round(random() * 100));
		// PI and E are constants of Math class
		// class constant declared using keywords static final
		System.out.println(PI); // PI number
		System.out.println(E); // Euler's number
   }
}

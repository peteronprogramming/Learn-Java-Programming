public class BitwiseOperator
{
	public static void main(String[] args)
	{
		int n = 8;
		int fourthBitFromRight = (n & 8) / 8;
		System.out.println(fourthBitFromRight);

		int m = 16;
		fourthBitFromRight = (m & 8) / 8;
		System.out.println(fourthBitFromRight);

		/* Bitwise Operator cannot working with String type
		String varSaya = "Saya";
		String varKamu = "Kamu";
		String varStringBit = (varSaya & varKamu); //compilation error
		System.out.println(varStringBit);
		*/

		boolean varFalse = false;
		boolean varTrue = true;
		boolean varBooleanBit = (varFalse & true);
		System.out.println(varBooleanBit);
		varBooleanBit = (varTrue | false);
		System.out.println(varBooleanBit);

		// (1 << 3) --> (0001 << 3) --> 1000
		// 1000 & 1000 --> 1000
		// 1000 --> 0001
		fourthBitFromRight = (n & (1 << 3)) >> 3;
		System.out.println(fourthBitFromRight);

		// 35 % 32 = 3 --> (1 << 3) --> (0001 << 3) --> 1000
		fourthBitFromRight = (n & (1 << 35)) >> 35;
		System.out.println(fourthBitFromRight);
	}
}

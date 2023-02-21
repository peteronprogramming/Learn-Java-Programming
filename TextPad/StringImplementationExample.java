public class StringImplementationExample
{
   public static void main(String[] args)
   {       // String in Java is implemented as sequences of char
	   String greeting = "Hello\uD835\uDD6b";
	   System.out.println(greeting);

	   // get the number of Unicode characters in a String
	   int n = greeting.length();
	   System.out.println("Number of code units in greeting is " + n);

	   /*
	     Java represent character using UTF-16 representation (U+0000 to U+FFFF). Supplementary characters (code points > U+FFFF) are represented as a pair
	     of char values or code units (known as paired surrogates), used the method below to get the true length of a String
	   */int cpCount = greeting.codePointCount(0, greeting.length());
	   System.out.println("Number of code point in greeting is " + cpCount);

	   int idx = 0;

	   // getting character (code unit) at position idx, idx must between 0 and length() - 1
	   System.out.println(greeting.charAt(idx));

           /*
             if code point at position idx + offset is an unpaired surrogates then index will be idx + offset
             if code point at position idx + offset is a paired surrogates then index will be idx + offset + 1
             getting a code point at position index - 1 (considering that index of a String started from 0)
             in Unicode a character may be represented by more than one character (paired surrogates)
             Java compiler automatically know if a code point at position index - 1 is an unpaired or paired surrogates
           */
           int offset = 6;
	   int index = greeting.offsetByCodePoints(idx, offset);
	   System.out.println("Index is " + index);
	   int cp = greeting.codePointAt(index - 1);
	   System.out.println("cp = " + (char) cp);

           /*
             traverse a String, code point by code point, check if a code point at position i is the first or second half of supplementary character
             if code point at position i is part of supplementary character then move to the next two code point positions
           */
	   String HelloWorld = "Hello \uD835\uDD6b World";

	   for (int i = 0; i < HelloWorld.length(); i++){
	      cp = HelloWorld.codePointAt(i);
              if (Character.isSupplementaryCodePoint(cp)) i++;
              System.out.print((char) cp + " ");
	   }
	   System.out.println("");
   }
}

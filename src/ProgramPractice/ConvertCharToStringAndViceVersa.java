package ProgramPractice;

import java.util.Arrays;

public class ConvertCharToStringAndViceVersa {

	public static void main(String[] args) {
		
		//char array to string //Autoboxing - Primitive data type to its corresponding wrapper class
		char[] a = {'R', 'a', 'm'};
		String res = String.valueOf(a);
		System.out.println(res);
		
		//char to string
		char c = 's';
		String res1 = Character.toString(c);
		System.out.println(res1);
		
		//string to char array
		String b = "Baba Ji ko pranam";
		char ch[] = b.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		//Primitive data type into its corresponding wrapper class -- Autoboxing
		//Eg: byte - Byte, char - Character, int to Integer, long to Long, 
		//float to Float, boolean to Boolean, double to Double, and short to Short.
		
		//int to integer
		int d = 20;
		Integer ew = Integer.valueOf(d);
		Integer j = d;
		System.out.println(d + " "+ ew + " " + j);
		
		
		//Wrapper type into its corresponding primitive type -- Unboxing
		
		//Java program to convert object into primitives  
		//Unboxing example of Integer to int 
		
		//Converting Integer to int
		Integer tr = new Integer(3);
		int ewr = tr.intValue();
		System.out.println(ewr);
		
		String s = "100";
		//string to integer
		int yt = Integer.parseInt(s);
		System.out.println(yt+20);
		
		
		
		
		
		
		
		
		
		
		

	}

}

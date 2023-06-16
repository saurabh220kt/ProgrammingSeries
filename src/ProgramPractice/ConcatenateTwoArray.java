package ProgramPractice;

public class ConcatenateTwoArray {

	public static void main(String[] args) {
		int[] a = {10,20,30};
		int[] b = {40,50,60};
		
		int[] c = new int[a.length + b.length];
		System.arraycopy(a, 0, c, 0, b.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		
		System.out.println(c);
		
	}
}

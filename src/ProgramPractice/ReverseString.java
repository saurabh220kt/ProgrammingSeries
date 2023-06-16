package ProgramPractice;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Saurabh is good boy";
//		String rev = " ";
//		int l=s.length();
//		
//		for(int i=l-1; i>=0; i--) {
//			rev=rev + s.charAt(i);
//		}
//		System.out.println(rev);
//
//	}
//

		StringBuffer res = new StringBuffer(s);
		System.out.println(res.reverse());
	}
}

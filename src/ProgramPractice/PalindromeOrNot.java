package ProgramPractice;

public class PalindromeOrNot {

	public static void main(String[] args) {
		String s = "1221";
		int i=0;
		int j = s.length()-1;
		
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				System.out.println("Entered value is not Palindrome");
				System.exit(0);
			}
			i++;
			j--;
			}
			System.out.println("Entered value is Palindrome");
		}
	}


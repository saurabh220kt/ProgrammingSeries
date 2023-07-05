package ProgramPractice;

public class CheckArrayContainsGivenValueOrNot {

	public static void main(String[] args) {
		
		int[] a = {10,20,30,50};
		int num = 10;
		
		boolean b = false;
		for(int res:a) {
			if(res==num) {
				b=true;
				break;
			}
		}
		
		if(b) {
			System.out.println("contains");
		}else {
			System.out.println("doesn't contains");
		}
		

	}

}

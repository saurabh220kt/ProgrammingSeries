package ProgramPractice;

public class FindMissingNumberinArray {

	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6,7,8,9,10,12};
		
		int N = arr.length+1;
		int sumOfNo;
		int sumOfAllEleminArr=0;
		int MissNo;
		
		sumOfNo = N * (N+1)/2;
		System.out.println("Sum of number in the range [1,N]: " + sumOfNo);
		
		for(int i=0; i<arr.length; i++) 
		{
			sumOfAllEleminArr = sumOfAllEleminArr + arr[i];
		}
		System.out.println("Sum of all elements in the given array: " + sumOfAllEleminArr);
		
		MissNo = sumOfNo - sumOfAllEleminArr;
		System.out.println("Missing number in the given array:" + MissNo);

	}

}

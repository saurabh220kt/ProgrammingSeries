package ProgramPractice;

public class CalculateAvgUsingArrays {

	public static void main(String[] args) {
		double[] a = {20,30,15,30};
		double res=0;
		
		for(double b : a) 
		{
			res = res+b;
		}
		double avg = res/a.length;
		System.out.format("The avg of String is:  %.2f", avg);

	}

}

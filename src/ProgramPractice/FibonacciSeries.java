package ProgramPractice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		//Fibonacci series = 1 1 2 3 5 8 13...
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number till you want to print fibonacci series");
		int num = sc.nextInt();
		int a = 1, b=1, c=0;
		System.out.print(a+ " ");
		System.out.print(b+ " ");
		
		for(int i=3; i<=num; i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
		}
	}

}

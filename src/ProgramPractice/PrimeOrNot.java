package ProgramPractice;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number which you want to check for prime or not");
		int res = sc.nextInt();
		int num=0;
		
		for(int i=1; i<=res; i++) {
			if(res%i==0) {
				num++;
			}
		}if(num==2) {
			System.out.println("Number is Prime");
		}else {
			System.out.println("Number is not Prime");
		}

	}

}

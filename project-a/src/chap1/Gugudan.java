package chap1;

import java.util.Scanner;

public class Gugudan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int i = 2;
		//int j = 1;
		//System.out.println(i + "*" + j +"="+ i*j);
		

		//printDan();
		
		System.out.println("gugudanfrom:");

		Scanner sc = new Scanner(System.in);

		int i= sc.nextInt();

		printDan(i);
	
	}

	private static void printDan(int i) {

		for (int j = 1; j <=9; j++) {
			int k = i * j;
			System.out.println(i + " * " + j + " = " + k);
		}
	}
}
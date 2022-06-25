package logicalProg;
import java.util.Scanner; //Imported Scanner package

public class Fibonacci {
	/**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * In Fibonacci Series the series will be sum of the previous 2 Numbers
		 * Take Scanner Input for first 2 numbers
		 * Taken For Loop upto 10 Values
		 * upcoming number will be sum of first two.
		 * Lets Change secondnd number as first and nextnumber as Second.
		 * it'll print 10 values in fibonacci series
		 */
		int firstNumber,secondNumber,nextNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter firstNumber");
		firstNumber = sc.nextInt();
		System.out.println("Enter secondNumber");
		secondNumber = sc.nextInt();
		for (int i=1;i<=10;i++) {
			nextNumber = firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=nextNumber;
			System.out.println(nextNumber);
		}
		
	}

}

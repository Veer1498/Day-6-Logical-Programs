package logicalProg;
import java.util.Scanner;
/**
 * 
 * @author singa
 *
 */
public class StopWatch {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Taken starttime and stoptime as long and timeGap as double.
		 * Use function - currentTimeMillis to get the actual current time in system.
		 * Taken 2 Numbers from Input as 1,2 to Start and Stop Timer.
		 * if Number 1 = 1, It prints Start Time
		 * if Number 2 =2,It prints StopTime
		 * Time Gap will also be Recorded by subtraction
		 * We need to divide the timegap by 1000 to convert millisec to seconds.
		 *Next print the time gap. 
		 */
		long startTime =0;
		long stopTime =0;
		double timeGap;
		int number1,number2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number 1 to Start ");
		number1 = sc.nextInt();
		
		if (number1 == 1) {
			startTime = System.currentTimeMillis();
			System.out.println("Started Timer");
			System.out.println("");
		}
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter The Number 2 to Stop ");
		number2 = sc2.nextInt();
		if (number2 == 2) {
			stopTime = System.currentTimeMillis();
			System.out.println("Stoped Timer");
			System.out.println("");
		}
		timeGap = stopTime-startTime;
		timeGap = timeGap/1000;
		System.out.println("The Recorded Time is :"+timeGap+" seconds");
	}

}

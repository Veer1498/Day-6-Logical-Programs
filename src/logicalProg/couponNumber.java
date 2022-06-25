package logicalProg;
import java.util.Scanner;
public class couponNumber {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Welcoming the User
		 * Taken Variables number,numbers,count
		 * Taken a FOR Loop for Scanning the N numbers of user 
		 * Added a WHILE Loop to check the Input Numbers by Random Numbers
		 * By Using Count, We can check the number of Iterations
		 * Taken If Condition to check if (Number = Random Number) or not
		 * if YES, It will break and Print the Guessed Number
		 * At last, We will get the count value and print How many Random Numbers taken to guess Input Nmber
		 */
		System.out.println("WELCOME TO COUPON NUMBER CHECKER");
		System.out.println("");
		int number,numbers=0,count=1;
		System.out.println("Enter How Many Numbers You Want");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		for(int i =1 ; i<=number;i++) {
			System.out.println("Enter the Number");
			Scanner sc2 = new Scanner(System.in);
			numbers = sc2.nextInt();
			while(number!=0){
				//	Random random =new Random();
				//int random =  (random.nextInt(999)+100);
					count=count+1;
					int random =(int) Math.floor(Math.random()*(999)+100);
					//System.out.println("The Number is "+random);
					if(random == numbers) {
						System.out.println("Number you Entered is "+random);
						break;
					}
			}
	
		}		
		System.out.println("Random Numbers Generated to find Input Numbers is "+count);
	}

}

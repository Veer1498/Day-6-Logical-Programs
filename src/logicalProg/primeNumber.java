package logicalProg;
import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		boolean value=false;
		System.out.println("Enter The Number");
		int Num = s.nextInt();
		System.out.println("The Number is"+Num);
		for (int i=2;i<=Num/2;i++) {
			if ( Num%i==0) {
				value = true;
				break;
				}
		}
		if (value == false) {
		System.out.println("The Number  is Prime");
		}
		else
		System.out.println("The Number is Not Prime");

	}
}

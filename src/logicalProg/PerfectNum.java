package logicalProg;
import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter The Number");
		int Num = s.nextInt();
		int Sum=0;
		System.out.println("The Number is"+Num);
		for (int i=1;i<=Num/2;i++) {
			if (Num%i==0) {
				System.out.println("Divisible by "+i);
				Sum=Sum+i;
			}
		}
		if(Sum==Num) {
			System.out.println("This is Perfect Numer");
			}
		else
			System.out.println("This is Not PerfecT Number");
	}

}

package logicalProg;
import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter The Number");
		int Num = s.nextInt(),reverse=0;
		while (Num!=0) {
			
			int rem = Num % 10;
			reverse = reverse*10+rem;
			Num=Num/10;
		}
		System.out.println("The Reverse Number is "+reverse);
	}

}

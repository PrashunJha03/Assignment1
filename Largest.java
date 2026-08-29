package Day1;
import java.util.*;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First no. ");
		int a = sc.nextInt();
		System.out.println("Enter Second no. ");
		int b = sc.nextInt();
		if(a>b)
			System.out.println("Largest no. is "+a);
		else
			System.out.println("Largest no. is "+b);
	}

}

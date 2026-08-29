package Day1;
import java.util.*;
public class VotingEligible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Age :");
		int age = sc.nextInt();
		if (age >= 18)
			System.out.println("Eligible for Voting");
		else 
			System.out.println("Not Eligible for Voting");
	}

}

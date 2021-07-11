import java.util.Scanner;

public class Greater_Three_Numbers {

	public static void main(String[] args) {
		int First_No, Second_No, Third_No;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the First Number :");
		First_No = s.nextInt();
		System.out.print("Enter the Second Number :");
		Second_No = s.nextInt();
		System.out.print("Enter the Third Number :");
		Third_No = s.nextInt();
		if(First_No > Second_No && First_No > Third_No)
		{
			System.out.println("Greatest of Three Numbers is :"+First_No);
		}
		else if(Second_No > Third_No)
		{
			System.out.println("Greatest of Three Number is :"+Second_No);
		}
		else{
			System.out.println("Greatest of Three Number is :"+Third_No);
		}

	}

}

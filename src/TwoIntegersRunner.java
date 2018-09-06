import java.util.Scanner;

public class TwoIntegersRunner
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int num = input.nextInt();
		System.out.println("Enter an integer : ");
		int value = input.nextInt();
		TwoIntegers twoInt = new TwoIntegers(num, value);
		System.out.println(twoInt.arithmetic());
		System.out.println(twoInt.larger() + " is larger.");
		System.out.println("The sum of " + num + " and " + value + " is even : " + twoInt.isEven() );
		System.out.println(value + " is a multiple of " + num + " : " + twoInt.multiple() );
		input.close();
	}
}

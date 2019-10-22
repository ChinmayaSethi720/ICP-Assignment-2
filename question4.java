import java.util.Scanner;
public class question4 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("type any integer between 0 to 1000");
		
		int number= sc.nextInt();
		int first= number%10;
		int firstleft= number/10;
		int second= firstleft%10;
		int third= firstleft/10;
		
		int sum= first + second + third;
		
		System.out.println("the sum of the digits is "+sum);

	}

}

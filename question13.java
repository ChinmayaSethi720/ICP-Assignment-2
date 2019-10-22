import java.util.Scanner;
public class question13 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter minutes");
		int m= sc.nextInt();
		
		int y= m/(60*24*365);
		int mleft= m%(60*24*365);
		int d=mleft/(60*24);
		
		System.out.println(m+" minutes is approximately " +y+ " years and "+d+ "days" );
	}

}

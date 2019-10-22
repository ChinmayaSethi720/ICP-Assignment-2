import java.util.Scanner;
public class question11
{
	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	
	double i= sc.nextDouble();
	double r= sc.nextDouble();
	int t= sc.nextInt();
	
	double v= i* (Math.pow((1+(r/1200)),(12*t)));
	
	System.out.println(v);
	}
}
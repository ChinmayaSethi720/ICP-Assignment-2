import java.util.Scanner;

public class question6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println("enter weight in pounds");
		double p= sc.nextDouble();
		double kg= 0.45359237*p;
		
		System.out.println("enter height in inches");
		double i= sc.nextDouble();
		double m= 0.0254*i;
		
		double BMI= kg/(Math.pow(m,2));
		
		System.out.println("the BMI is "+BMI);

	}

}

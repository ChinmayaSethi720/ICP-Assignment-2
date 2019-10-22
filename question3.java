import java.util.Scanner;
public class question3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println("value in feet");
		
		double feet= sc.nextDouble();
		double meter= feet*0.305;
		
		System.out.println("the value in meter is " + meter);

	}

}

import java.util.Scanner;
public class question5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println("type the initial velocity");
		double vi= sc.nextDouble();
		
		System.out.println("type the final veloccity" );
		double vf= sc.nextDouble();
		
		System.out.println("type the time elapsed");
		double t= sc.nextDouble();
		
		double a= (vf-vi)/t;
		
		System.out.println("the average acceleration is "+a);
		

	}

}

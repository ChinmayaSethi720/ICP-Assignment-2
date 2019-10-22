import java.util.Scanner;
public class question9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter first point");
		double x1= sc.nextDouble();
		double y1= sc.nextDouble();
		
		System.out.println("Enter second point");
		double x2= sc.nextDouble();
		double y2= sc.nextDouble();

		double d= Math.sqrt((    ( Math.pow(x2-x1,2) )+ (  Math.pow(y2-y1,2)  )    ));
		System.out.println("the distance between the two points is "+d);
	}

}

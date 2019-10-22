import java.util.Scanner;

public class question7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the side of the hexagon");
		double x= sc.nextDouble();
		
		double a=(    (3*(Math.sqrt(3))*Math.pow(x,2))/2    );
		System.out.println("the area of the hexagon is "+a);
		
	}

}

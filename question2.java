import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println("radius of the cylinder= ");
		double radius= sc.nextDouble();
		double area= radius*radius*Math.PI;
		
		System.out.println("area of the cylinder is "+area);
		
		System.out.println("length of the cylinder= ");
		double length= sc.nextDouble();
		
		double volume= area*length;
		
		System.out.println("volume of the cylinder is"+volume);
	}

}

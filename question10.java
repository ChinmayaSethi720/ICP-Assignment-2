import java.util.Scanner;
public class question10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		double x1 =sc.nextDouble();
		double y1=sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2=sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		
		double s1= Math.sqrt( Math.pow ((x2-x1),2) + Math.pow ((y2-y1),2) );
		double s2= Math.sqrt( Math.pow((x3-x2), 2) + Math.pow(y3-y2, 2) );
		double s3= Math.sqrt((Math.pow(x1-x3, 2)) + Math.pow(y1-y3, 2));
		
		double s= (s1+s2+s3)/2;
		
		double a= Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		
		System.out.println("The area of the triangle is " +a);
		
	}

}
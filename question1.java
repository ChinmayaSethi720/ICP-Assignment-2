import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("celcius=43");
		double celcius= sc.nextDouble();
		double farenheit= ( ((9.0/5)*celcius)+32);
		
		System.out.println(farenheit);


	}

}

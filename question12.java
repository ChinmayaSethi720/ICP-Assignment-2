import java.util.Scanner;
public class question12 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	int n= sc.nextInt();
	
	int g= n/144;
	int fl= n%144;
	
	int d= fl/12;
	int sl=fl%12;
	
	System.out.println("your number of eggs is "+g+" gross "+d+" dozens and "+sl);
	
	

	}

}
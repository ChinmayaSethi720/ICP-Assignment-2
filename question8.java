import java.util.Scanner;
public class question8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the value of a ");
		int a=sc.nextInt();
		int b=2;
		int c= (int)Math.pow(a, b);
		
		System.out.println("a	b	Math.pow(a, b)");
		System.out.println(a+"	"+b+"	"+c);
		a++;b++;
		
		c= (int)Math.pow(a, b);
		System.out.println(a+"	"+b+"	"+c);
		a++;b++;
		
		c= (int)Math.pow(a, b);
		System.out.println(a+"	"+b+"	"+c);
		a++;b++;
		
		c= (int)Math.pow(a, b);
		System.out.println(a+"	"+b+"	"+c);
		a++;b++;
		
		c= (int)Math.pow(a, b);
		System.out.println(a+"	"+b+"	"+c);
		a++;b++;
		
	}

}

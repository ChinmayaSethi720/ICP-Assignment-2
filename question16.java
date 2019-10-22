
public class question16
{

	
  public static void main(String[] args) 
{
		
  int a=Integer.parseInt(args[0]);
		
  int b=Integer.parseInt(args[1]);
		
  int n1=a+(int)(Math.random()*(b-a));
		
  int n2=a+(int)(Math.random()*(b-a));
		
  System.out.println(n1);
		
  System.out.println(n2);
		
  int sum=n1+n2;
		
  System.out.println("SUM="+sum);
		

	
}


}
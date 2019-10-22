
public class question20 {

	public static void main(String[] args) {
		int m=Integer.parseInt(args[0]);
		int d=Integer.parseInt(args[1]);
boolean result =(((d>=20)&&(d<=30))||(m==3))||(((d>=1)&&(d<=31))||(m==4))||(((d>=1)&&(d<=31))||(m==5)||(((d>=1)&&(d<=20))||(m==6)));
System.out.println(result);
		
	}

}
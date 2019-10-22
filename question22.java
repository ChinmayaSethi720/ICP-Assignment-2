
public class question22 {

	public static void main(String[] args) {
		int y=Integer.parseInt(args[0]);
		double p=Double.parseDouble(args[1]);
		double i=Double.parseDouble(args[2]);
		double m=p*Math.exp(i*(y*12));
		System.out.println(m);
	}

}
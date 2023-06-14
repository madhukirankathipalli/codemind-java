import java.util.Scanner;
public class avg
{
	public static void main(String args[])
	{
		int a,b;
		double av;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		av=(((double)(a+b))/2);
		System.out.format("%.4f",av);	
		sc.close();
	}
}
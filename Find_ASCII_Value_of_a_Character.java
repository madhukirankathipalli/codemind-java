import java.util.Scanner;
public class xyz
{
	public static void main(String args[])
	{
		char c;
		Scanner sc=new Scanner(System.in);
		c=sc.nextLine().charAt(0);
		
		System.out.println((int)c);	
		sc.close();
	}
}
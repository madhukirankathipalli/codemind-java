import java.util.Scanner;
public class xyz
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
        sc.close();
    }
}
import java.util.*;
public class airport
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        int c=0;
        for (int i=0;i<n;i++)
        {
            if (arr[i]<=t)
            {
                c+=1;
            }
            else
            {
                c+=2;
            }
        }
        System.out.println(c);
    }
}
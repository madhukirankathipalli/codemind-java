import java.util.Scanner;
public class main1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();

        double area =calculateTriangleArea(a,b,c);
    
        System.out.printf("%.2f",area);
    }

private static double calculateTriangleArea(int a,int b, int c){
double s=(a+b+c)/2.0;
double area =Math.sqrt(s*(s-a)*(s-b)*(s-c));
return area;
}


}
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int gcd = gcd(n1,n2);
        System.out.println("GCD of "+n1+" & "+n2+" = "+gcd);

    }
    public static int gcd(int a,int b){
        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }
        if(a == b){
            return a;
        }
        if(a > b){
            return gcd(a-b,b);
        }
        return gcd(a,b-a);
    }
}

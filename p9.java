import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //quadratic equation
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double r1 = (-b)/(2*a) + (Math.sqrt(b*b)-(4*a*c))/(2*a);
        double r2 = (-b)/(2*a) - (Math.sqrt(b*b)-(4*a*c))/(2*a);
        System.out.println(r1);
        System.out.println(r2);
    }
}

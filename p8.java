import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float s = (a+b+c)/2f;
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c)) ;
        System.out.println(s);
        System.out.println(area);


    }
}

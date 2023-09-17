import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int vol = l*b*h;
        int area = 2*(l*b + b*h + h*l);
        System.out.println(vol);
        System.out.println(area);
    }
}

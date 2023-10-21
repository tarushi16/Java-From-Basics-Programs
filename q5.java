import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter length");
        int len = sc.nextInt();

        System.out.println("enter width");
        int wid =sc.nextInt();

        int ar = len * wid;
        int peri = 2*(len+wid);
        System.out.println("area is = "+ ar);
        System.out.println("peri is= ");
    }
}

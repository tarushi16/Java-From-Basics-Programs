import java.util.Scanner;

public class q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // using 3rd variable
        int a = sc.nextInt();
        int b = sc.nextInt();
//
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a);
//        System.out.println(b);

        //without using 3rd variable
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a);
        System.out.println(b);
    }
}

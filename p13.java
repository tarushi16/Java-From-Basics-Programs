import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<18)
            System.out.println("young");
        else System.out.println("not young");
    }
}

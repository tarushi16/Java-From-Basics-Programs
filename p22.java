import java.util.Scanner;

public class p22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // check a no. uis palindrome or not
        int n = sc.nextInt();
        int rev =0;
        int r = 0 ;
        int m = n;
        while(n>0){
            r = n%10;
            rev = rev * 10 + r;
            n = n/10;
        }
        if(rev == m)
            System.out.println("its is a palindrome");
        else
            System.out.println("not a palindrome");
    }
}

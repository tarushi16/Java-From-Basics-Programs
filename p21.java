import java.util.Scanner;

public class p21 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        //reverse a number
        int n = sc.nextInt();
        int rev =0;
        int r = 0 ;
        int m = n;
        while(n>0){
            r = n%10;
            rev = rev * 10 + r;
            n = n/10;
        }
        System.out.println(rev);
    }
}

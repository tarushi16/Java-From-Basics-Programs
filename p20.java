import java.util.Scanner;

public class p20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //the no. is armstrong or not
        int n = sc.nextInt();
        int m = n;
        int sum = 0;
        while(n>0){
            int r = n%10;
            sum = sum + r*r*r;
            n = n/10;
        }
        if(m==sum){
            System.out.println("it is armstrong no.");
        } else
            System.out.println("not armstrong");
    }
}

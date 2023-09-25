import java.util.Scanner;

public class p19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //count the no. of digits
        int n  = sc.nextInt();
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        System.out.println(count);
    }
}

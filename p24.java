import java.util.Scanner;

public class p24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Display AP series
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int term = a;
        for(int i = 0; i<n; i++){
            System.out.print(term + ",");
            term = term + d;

        }

    }
}

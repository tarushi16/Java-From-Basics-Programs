import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        //find radix of a no. given a string

        if(a.matches("[01]+"))
            System.out.println("Binary radix 2");
        else if (a.matches("[0-7]+")) {
            System.out.println("octal radix 8");
        } else if (a.matches("[10-9A-F]+")) {
            System.out.println("Hexadecimal radix 16");
        } else if (a.matches("[0-9]+")) {
            System.out.println("decimal radix 10");
        }
        else
            System.out.println("not a no.");
    }
}

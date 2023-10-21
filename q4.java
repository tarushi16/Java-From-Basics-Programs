import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = sc.nextLine();

        System.out.println("what is your age?");
        int age = sc.nextInt();

        System.out.println("what is your gender");
        String gen = sc.next();

        System.out.println("hello "+ name + " you are "+ gen + " and " + age + " yrs old.");

    }
}

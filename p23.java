import java.util.Scanner;

public class p23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Display a no.in words even with tailing zero
        int n = sc.nextInt();
        String str = "";
        int r = 0;
        int m = n;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            str = str+r;
        }
//        System.out.println(str);
        char c;
        for(int i = str.length()-1; i>=0 ; i--){
            c= str.charAt(i);
            switch(c)
            {
                case '0' :
                    System.out.print("zero ");
                         break;
                case '1' :
                    System.out.print("one ");
                    break;
                case '2' :
                    System.out.print("two ");
                    break;
                case '3' :
                    System.out.print("three ");
                    break;
                case '4' :
                    System.out.print("four ");
                    break;
                case '5' :
                    System.out.print("five ");
                    break;
                case '6' :
                    System.out.print("six ");
                    break;
                case '7' :
                    System.out.print("seven ");
                    break;
                case '8' :
                    System.out.print("eight ");
                    break;
                case '9' :
                    System.out.print("nine ");
                    break;
            }
        }
    }
}

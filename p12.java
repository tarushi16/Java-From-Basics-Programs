import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        //finding out whether gmail or not, also storing gmail account
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
        int i = str.indexOf("@");
        String uname  = str.substring(0,i);
        String domain = str.substring(i+1, str.length());

        System.out.println(uname);
        System.out.println(domain);

        int j = domain.indexOf(".");
        String name = domain.substring(0,j);
       // System.out.println(name.equals("gmail"));
    }
}

public class p11 {
    public static void main(String[] args) {
        //swapping 2 nos.
        int a = 10, b = 5;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a + " " + b);
    }
}

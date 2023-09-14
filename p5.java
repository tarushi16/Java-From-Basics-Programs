public class p5 {
    public static void main(String[] args) {
        byte b = 10; //for decimal
        byte c = 0b1010; //for binary
        byte d = 012; //octal
        byte e = 0XA; //hexadecimal
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        long l = 999999999999L; //this no. is beyond int range but still it works because we added an exra 'L' which is a literal.
        System.out.println(l);


    }
}

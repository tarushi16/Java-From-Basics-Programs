public class p6 {
    public static void main(String[] args) {
        byte b = -5;
        //value of +5 is 101 in binary.
        // so here in this the 5 is first converted to 1's complement and then to 2's compliment hence the value is 11111011
        System.out.println(Integer.toBinaryString(b));
    }

}

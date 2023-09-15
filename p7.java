public class p7 {
    public static void main(String[] args) {
        char b = 0x0370; //this is a unicode of a greek symbol |-
        System.out.println(b);

        //lets print for our language devnagri;
        for(char z = 0x0900; z<=0x0970; z++)
            System.out.println(z);
    }
}

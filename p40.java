public class p40 {
    public static void main(String[] args) {
         //increase size of array
        int a[] = {4,5,8,7,6};
        System.out.println("length of a=" + a.length);
        int b[] = new int[10];
        for(int i=0;i<a.length;i++)
            b[i]=a[i];
        a=b;
        System.out.println("length of a =" + a.length);
    }
}

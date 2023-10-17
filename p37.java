public class p37 {
    //insert an element
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 8;
        arr[3] = 7;
        arr[4] = 10;
        arr[5] = 2;

        int n = 6;
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+",");
        System.out.println("");

        int x = 20;
        int index=2;

        for(int i=n;i>index;i--)
            arr[i] = arr[i-1];
        arr[index] = x;

        for(int i = 0; i<n; i++)
            System.out.print(arr[i]+",");
        System.out.println("");
    }
}

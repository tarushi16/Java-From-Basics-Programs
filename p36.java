public class p36 {
    public static void main(String[] args) {
        //rotation of array

        int arr[] = {1,2,3,4,5,8,3,4,14,52,13,21,9};
        for(int x:arr)
            System.out.print(x+",");
        System.out.println(" ");

        int temp = arr[0];
        for(int i=0; i<arr.length; i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1] = temp;
        for(int x:arr)
            System.out.print(x+",");
        System.out.println(" ");
    }
}

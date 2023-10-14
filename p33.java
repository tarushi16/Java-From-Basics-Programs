public class p33 {
    //sum of array
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int sum = 0;
//        for(int i = 0; i<arr.length; i++){
//            sum = sum + arr[i];
//        }
        //or
        for(int x:arr)
            sum = sum+x;
        System.out.println(sum);
    }
}

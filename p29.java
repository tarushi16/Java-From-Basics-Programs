public class p29 {
    public static void main(String[] args) {
        //finding second largest element
        int arr[] = {2,54,67,23,8,107,4};
        int max1, max2;
        max1 = max2 = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i]>max2) {
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }
}

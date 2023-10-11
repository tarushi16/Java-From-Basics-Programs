public class p28 {
    public static void main(String[] args) {
        int[] arr = {2,54,67,23,8,107,4};
        int max = arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println(max);
    }
}



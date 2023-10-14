import java.util.Arrays;
//second largest element.bmi calculator


public class p32 {
    public static int SecondLargest(int arr[]) {
        Arrays.sort(arr);
        int a = arr.length-2;
        return arr[a];
    }

    public static void main(String[] args) {
        int arr[] = {3,9,7,8,12,6,15,5,4};
        System.out.println(SecondLargest(arr));

    }
}

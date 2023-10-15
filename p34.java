import java.util.Arrays;
import java.util.Scanner;

public class p34 {
    public static void main(String[] args) {
        //searching an element
        int arr[] = {3,9,7,8,12,6,15,5,4,10};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
//        Arrays.sort(arr);
//        System.out.println(Arrays.binarySearch(arr,x));
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==x){
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println("not found");
    }
}

public class p27 {
    public static void main(String[] args) {
        //searching an element
        int[] arr = {4,3,6,45,67,90};
        int key = 6;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==key) {
                System.out.println("element found at " + i);
                System.exit(0);
            }
        }
        System.out.println("not found");
    }
}

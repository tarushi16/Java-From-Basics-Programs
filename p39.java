public class p39 {
    //reverse copy an array
    public static void main(String[] args) {
        int arr[] = {4,7,8,2,3,41,52,13,94};
        int b[] = new int[10];

        for(int i = arr.length-1,j=0;i>=0;i--,j++)
        {
            b[j]=arr[i];
        }
        for(int x:b){
            System.out.print(x+",");
        }
    }
}

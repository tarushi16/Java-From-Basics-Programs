public class p41 {
    public static void main(String[] args) {
        // 2 D array
        int A [] [] = new int [5][5];
        int B [] [] = {{1,2,3},{2,4,6},{1,3,5}};
        int C [] [];
        C = new int [5][5];
        int []D[] = new int [5] [5];
        int[] E, F[];
        E = new int[5];
        F = new int [5][5];

        for(int i=0; i<B.length;i++){
            for(int j=0;j<B[0].length;j++){
                System.out.println(B[i] [j]+" ");
            }
            System.out.println("");
        }

        for(int x[] : B){
            for(int y:x){
                System.out.println(y);
            }
        }
        //jagged array
        int G[][];
        G = new int[3][];
        G[0] = new int[5];
        G[1] = new int[3];
        G[2] = new int[8];
        for(int i=0;i<G.length; i++){
            for(int j=0; j<G[i].length;j++){
                System.out.println((G[i][j] + " "));
            }
            System.out.println("");
        }
    }
}

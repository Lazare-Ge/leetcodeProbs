public class Main {
    public static void printArr(int[][] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println();
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                {-1,-1,-1},
                {-1,-1,-1},
                {-1,-1,-1},
        };
        printArr(arr);
    }
}
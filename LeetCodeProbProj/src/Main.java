
public class Main {
    public static void main(String[] args) {
        int[][] testMatrix1 = {
                {1, 2, 3 ,4 ,5 ,6 ,7 ,8 },
                {9, 10,11,12,13,14,15,16},
                {17,18,19,20,21,22,23,24},
                {25,26,27,28,29,30,31,32},
                {33,34,35,36,37,38,39,40},
                {41,42,43,44,45,46,47,48},
                {49,50,51,52,53,54,55,56},
                //{57,58,59,60,61,62,63,64}
        };
        int [][] testMatrix2 = {
                {1 ,2 ,3 },
                {5 ,6 ,7 },
                {8 ,9 ,10},
                {11,12,13},
        };
        int [][] testMatrix3 = {
                {1 ,2, 3},
        };

        int [][] testMatrix4 = {
                {1, 2},
        };
        int [][] testMatrix5 = {
                {1, 2, 3, 4, 5, 6, 7},
                //{8, 9,10,11,12,13,14},
        };
        int [][] testMatrix6 = {
                {1},
                {2},
                {3},
                {4},
        };
        System.out.println(SpiralMatrix.spiralOrder(testMatrix6).toString());
    }
}
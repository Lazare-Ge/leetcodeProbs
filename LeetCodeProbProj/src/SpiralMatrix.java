import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> res = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        while(true){
            for(int i = left; i<=right; i++) res.add(matrix[top][i]);
            top++;
            if(top > bottom || left > right) break;

            for(int i = top; i <= bottom; i++) res.add(matrix[i][right]);
            right--;
            if(top > bottom || left > right) break;

            for(int i = right; i >= left; i--) res.add(matrix[bottom][i]);
            bottom--;
            if(top > bottom || left > right) break;

            for(int i = bottom; i >= top; i--) res.add(matrix[i][left]);
            left++;
            if(top > bottom || left > right) break;
        }
        return res;
    }
}
// Test Code for main
// int[][] testMatrix1 = {
//         {1, 2, 3 ,4 ,5 ,6 ,7 ,8 },
//         {9, 10,11,12,13,14,15,16},
//         {17,18,19,20,21,22,23,24},
//         {25,26,27,28,29,30,31,32},
//         {33,34,35,36,37,38,39,40},
//         {41,42,43,44,45,46,47,48},
//         {49,50,51,52,53,54,55,56},
//         //{57,58,59,60,61,62,63,64}
// };
// int [][] testMatrix2 = {
//         {1 ,2 ,3 },
//         {5 ,6 ,7 },
//         {8 ,9 ,10},
//         {11,12,13},
// };
// int [][] testMatrix3 = {
//         {1 ,2, 3},
// };
//
// int [][] testMatrix4 = {
//         {1, 2},
// };
// int [][] testMatrix5 = {
//         {1, 2, 3, 4, 5, 6, 7},
//         //{8, 9,10,11,12,13,14},
// };
// int [][] testMatrix6 = {
//         {1},
//         {2},
//         {3},
//         {4},
// };
// int [][] testMatrix7 = {
//         {1,2,3},
//         {4,5,6},
//         {7,8,9},
// };
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

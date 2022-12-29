import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static boolean checkValidity(int r, int c, int startRows, int endRows, int startCols, int endCols){
        return startRows < endRows && startCols < endCols;
    }
    public static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> res = new ArrayList<>();
        int endRows = matrix.length;
        int endCols = matrix[0].length;
        int startRows = 0;
        int startCols = 0;
        int r = startRows;
        int c = startCols;
        while(checkValidity(r,c, startRows, endRows, startCols, endCols)){
            // Start cycle
            while(c < endCols){
                res.add(matrix[r][c]);
                c++;
            }
            c--;
            r++;
            while(r < endRows){
                res.add(matrix[r][c]);
                r++;
            }
            r--;
            c--;
            while(c >= startCols){
                res.add(matrix[r][c]);
                c--;
            }
            c++;
            r--;
            while(r >= startRows+1){
                res.add(matrix[r][c]);
                r--;
            }
            r++;
            c++;
            startRows++;
            startCols++;
            endRows--;
            endCols--;
            System.out.println("startRows - " + startRows);
            System.out.println("startCols - " + startCols);
            System.out.println("endRows - " + endRows);
            System.out.println("endCols - " + endCols);
        }
        return res;
    }
}

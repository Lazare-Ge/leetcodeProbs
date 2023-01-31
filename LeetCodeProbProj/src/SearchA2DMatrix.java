import javax.naming.directory.SearchControls;

public class SearchA2DMatrix {
    static class Loc{
        int r;
        int c;
        Loc(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
    public static Loc getLoc(int numRows, int numCols, int index){
        assert(numRows * numCols > index);
        int r = index / numCols;
        int c = index % numCols;
        return new Loc(r,c);
    }

    public static boolean searchMatrix(int[][] matrix, int target){
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int len = numRows * numCols;
        int l = 0;
        int r = len - 1;
        while(l <= r){
            int m = l + (r - l)/2;
            Loc curLoc = getLoc(numRows, numCols, m);
            int curNum = matrix[curLoc.r][curLoc.c];
            System.out.println(curNum);
            if(curNum == target) return true;
            if(curNum < target) l = m+1;
            if(curNum > target) r = m-1;
        }
        return false;
    }
}

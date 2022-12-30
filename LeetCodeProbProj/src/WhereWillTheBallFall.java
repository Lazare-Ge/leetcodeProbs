import java.util.Arrays;

public class WhereWillTheBallFall {
    public static int[] findBall(int[][] grid){
        int[] res = new int[grid[0].length];
        Arrays.fill(res, -1);
        for(int i=0; i<grid[0].length; i++){
            System.out.println("---- " + i);
            int r = 0;
            int c = i;
            boolean ballStuck = false;
            while(r < grid.length){
                if(grid[r][c] == 1){
                    if(c+1 >= grid[0].length || grid[r][c+1] == -1){
                        ballStuck = true;
                        break;
                    }else{
                        // Current ball is at [r+1][c+1]
                        c++;
                    }
                }else{
                    if(c-1 < 0 || grid[r][c-1] == 1){
                        ballStuck = true;
                        break;
                    }else{
                        // Current ball is at [r-1][c-1]
                        c--;
                    }
                }
                r++;
                System.out.println("[" + r + "][" + c + "]");
            }
            if(!ballStuck) res[i] = c;
        }
        return res;
    }
}
//    int[][] testGrid1 = {
//            { 1, 1, 1,-1,-1},
//            { 1, 1, 1,-1,-1},
//            {-1,-1,-1, 1, 1},
//            { 1, 1, 1, 1,-1},
//            {-1,-1,-1,-1,-1},
//    };
//    int[][] testGrid2 = {
//            {-1},
//    };
//        System.out.println(Arrays.toString(WhereWillTheBallFall.findBall(testGrid1)));
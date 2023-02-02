import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlanticWaterFlow {
    static boolean flowsToPacific;
    static boolean flowsToAtlantic;
    static int[][] cellHeights;
    static boolean[][] visited;
    public static void flow(int x, int y, int lastCellHeight) {
        if (x < 0 || x >= cellHeights.length || y < 0 || y >= cellHeights[0].length) return;
        if(visited[x][y]) return;
        if(lastCellHeight < cellHeights[x][y]) return;
        if (flowsToAtlantic && flowsToPacific) return;
        if (x == 0 || y == 0) flowsToPacific = true;
        if (x == cellHeights.length - 1 || y == cellHeights[0].length - 1) flowsToAtlantic = true;
        visited[x][y] = true;
        flow(x-1, y, cellHeights[x][y]);
        flow(x+1, y, cellHeights[x][y]);
        flow(x, y-1, cellHeights[x][y]);
        flow(x, y+1, cellHeights[x][y]);
    }

    public static List<List<Integer>> pacificAtlantic(int[][] heights){
        List<List<Integer>> res = new ArrayList<>();
        cellHeights = heights;
        for(int i=0; i<cellHeights.length; i++){
            for(int j=0; j<cellHeights[0].length; j++){
                flowsToAtlantic = false;
                flowsToPacific = false;
                visited = new boolean[cellHeights.length][cellHeights[0].length];
                flow(i, j, Integer.MAX_VALUE);
                if(flowsToAtlantic && flowsToPacific) res.add(new ArrayList<>(Arrays.asList(i,j)));
            }
        }
        for(List<Integer> loc : res){
            System.out.println(loc);
        }
        return res;
    }
}

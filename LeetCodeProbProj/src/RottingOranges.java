import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RottingOranges {
    static class Pair implements Comparable{
        int x;
        int y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "orange(" + x + "," + y + ")";
        }

        @Override
        public int compareTo(Object o) {
            Pair pair = (Pair) o;
            if(x == pair.x && y == pair.y) return 0;
            if(x == pair.x) return y - pair.y;
            return x - pair.x;
        }
    }

    public static void getOranges(Set<Pair> fresh, Set<Pair> rotten, int[][] grid) {
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                int cond = grid[i][j];
                Pair orange = new Pair(i,j);
                if(cond == 1) fresh.add(orange);
                if(cond == 2) rotten.add(orange);
            }
        }
    }
    public static Set<Pair> getFreshOrangesToRot(int[][] grid, int x, int y){
        Set<Pair> res = new HashSet<>();
        if(x-1 >= 0 && grid[x-1][y] == 1) res.add(new Pair(x-1, y));
        if(x+1 < grid.length && grid[x+1][y] == 1) res.add(new Pair(x+1, y));
        if(y-1 >= 0 && grid[x][y-1] == 1) res.add(new Pair(x, y-1));
        if(y+1 < grid[0].length && grid[x][y+1] == 1) res.add(new Pair(x, y+1));
        return res;
    }
    public static int orangesRotting(int[][] grid){
        Set<Pair> rotten = new TreeSet<>();
        Set<Pair> fresh = new TreeSet<>();
        getOranges(fresh, rotten, grid);
        System.out.println("Fresh Oranges: " + fresh);
        System.out.println("Rotten Oranges: " + rotten);
        int counter = 0;
        while(true){
            Set<Pair> nextToRot = new TreeSet<>();
            for(Pair rottenOrange : rotten){
                Set<Pair> nextAdjacent = getFreshOrangesToRot(grid, rottenOrange.x, rottenOrange.y);
                nextToRot.addAll(nextAdjacent);
            }
            if(nextToRot.isEmpty()) break;
            System.out.println("----- Next To Rot: " + nextToRot);
            for(Pair orange : nextToRot){
                grid[orange.x][orange.y] = 2;
                fresh.remove(orange);
            }
            rotten.addAll(nextToRot);
            counter++;
        }
        if(fresh.isEmpty()) return counter;
        return -1;
    }
}

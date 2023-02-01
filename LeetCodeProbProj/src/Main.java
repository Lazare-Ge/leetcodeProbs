import javax.naming.directory.SearchControls;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[][] grid = {
                {2,1,1},
                {1,1,0},
                {0,1,1},
        };
        System.out.println(RottingOranges.orangesRotting(grid));
    }
}
import java.util.*;

public class CourseScheduleII {
    Map<Integer, ArrayList<Integer>> graph;
    Map<Integer, Integer> state; // 0 -> White 2 -> Gray 3 -> Black
    Stack<Integer> path;
    boolean isCircle;
    public void init(int[][] prereqs, int numCourses){
        graph = new HashMap<>();
        for (int[] ints : prereqs) {
            int course = ints[0];
            int prereq = ints[1];
            if (graph.containsKey(prereq)) {
                graph.get(prereq).add(course);
            } else {
                graph.put(prereq, new ArrayList<>(Arrays.asList(course)));
            }
        }
        state = new HashMap<>();
        for(int i=0; i<numCourses; i++){
            state.put(i, 0);
        }
        path = new Stack<>();
        isCircle = false;
    }
    public void dfs(int prereq){
        if(isCircle) return;
        if(state.get(prereq) == 1){
            isCircle = true;
            return;
        }
        if(state.get(prereq) == 2) return;
        state.put(prereq, 1);
        if(graph.containsKey(prereq)) {
            for (int course : graph.get(prereq)) {
                dfs(course);
                if (isCircle) return;
            }
        }
        state.put(prereq, 2);
        path.add(prereq);
    }
    public int[] findOrder(int numCourses, int[][] prerequisites){
        init(prerequisites, numCourses);
        for(int i=0; i<numCourses; i++){
            dfs(i);
        }
        if(isCircle){
            return new int[0];
        }else {
            int[] ans = new int[numCourses];
            for (int i = 0; i < numCourses; i++) {
                ans[i] = path.remove(path.size() - 1);
            }
            return ans;
        }
    }
}

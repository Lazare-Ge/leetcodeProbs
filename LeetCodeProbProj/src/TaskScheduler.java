import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TaskScheduler {
    public static int leastInterval(char[] tasks, int n){
        int[] occs = new int[26];
        int maxVal = 1;
        int maxCount = 0;
        for (char task : tasks) {
            int index = task - 'A';
            if (occs[index] > 0) {
                occs[index]++;
                if(occs[index] > maxVal){
                    maxCount = 1;
                    maxVal = occs[index];
                }else if(occs[index] == maxVal){
                    maxVal = occs[index];
                    maxCount++;
                }
            } else {
                occs[index] = 1;
            }
        }
        int len = (maxVal-1)  * (n+1) + 1;
        len += maxCount-1;
        return Math.max(tasks.length, len);
    }
}

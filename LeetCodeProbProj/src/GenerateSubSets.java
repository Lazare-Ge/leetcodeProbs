import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class GenerateSubSets {
    public static void setRec(ArrayList<Integer> curSet, ArrayList<Integer> remSet){
        if(remSet.isEmpty()){
            System.out.println(curSet);
            return;
        }
        int curNum = remSet.remove(remSet.size()-1);
        setRec(curSet, remSet);
        curSet.add(curNum);
        setRec(curSet, remSet);
        remSet.add(curNum);
        curSet.remove(curSet.size()-1);
    }
    public static void generateSubSets(int[] arr){
        ArrayList<Integer> remSet = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> curSet = new ArrayList<>();
        setRec(curSet, remSet);
    }
}

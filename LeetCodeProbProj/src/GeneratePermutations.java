import java.util.ArrayList;

public class GeneratePermutations {
    public static boolean permHelper(ArrayList<Integer> first, ArrayList<Integer> second){
        if(second.isEmpty()){ return false; }
        int sumFirst = 0;
        int sumSecond = 0;
        for(int i=0; i<first.size(); i++) sumFirst += first.get(i);
        for(int i=0; i<second.size(); i++) sumSecond += second.get(i);
        if(sumFirst == sumSecond){
            System.out.println(first + "  " + second);
            return true;
        }
        for(int i=0; i<second.size(); i++){
            int removed = second.remove(i);
            first.add(removed);
            if(permHelper(first, second)) return true;
            first.remove(first.size()-1);
            second.add(i, removed);
        }
        return false;
    }
    public static void generatePermutations(ArrayList<Integer> arr){
        ArrayList<Integer> first = new ArrayList<>();
        permHelper(first, arr);
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CharacterReplacement424 {
    public static int characterReplacement(String s, int k){
        HashMap<Character, ArrayList<Integer>> mp = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!mp.containsKey(c)) mp.put(c, new ArrayList<>());
            mp.get(c).add(i);
        }
        if(mp.size() == 1) return s.length();
        int maxLength = Integer.MIN_VALUE;
        for(char c : mp.keySet()){
            ArrayList<Integer> indexes = mp.get(c);
            System.out.println(indexes);
            int startIndex = indexes.get(0) >= k ? indexes.get(0) - k : 0;
            int lastIndex = indexes.get(indexes.size()-1);
            lastIndex = (lastIndex < s.length() - k) ? lastIndex + k : s.length()-1;
            System.out.println("startIndex - " + startIndex + " lastIndex - " + lastIndex);
            int l = startIndex;
            int replaced = 0;
            Set<Integer> st = new HashSet<>();
            boolean changed = false;
            for(int i=startIndex; i<=lastIndex; i++){
                if(!indexes.contains(i)){
                    st.add(i);
                    replaced++;
                }
                if(replaced == k){
                    System.out.println("i - " + i);
                    changed = true;
                    int p = l;
                    int counter = 0;
                    //char firstChar = s.charAt(p);
                    System.out.println("firstChar - " + c);
                    System.out.println("set - " + st);
                    while(p < s.length() && (st.contains(p) || c == s.charAt(p))){
                        System.out.print(p);
                        p++;
                        counter++;
                    }
                    System.out.println();
                    System.out.println("start - " + l + " end - " + (l+counter));
                    if(counter > maxLength) maxLength = counter;
                    while(indexes.contains(l)) l++;
                    st.remove(l);
                    replaced--;
                    l++;
                }
            }
            if(!changed) return s.length();
        }
        return maxLength;
    }
}

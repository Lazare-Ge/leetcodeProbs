import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CharacterReplacement424 {
    public static int characterReplacement(String s, int k){
        Set<Character> uniqueChars = new HashSet<Character>();
        for(int i=0; i<s.length(); i++) uniqueChars.add(s.charAt(i));
        int maxWindowSize = 0;
        for(char c : uniqueChars){
            int start = 0;
            int charCount = 0;
            for(int end = 0; end < s.length(); end++){
                if(s.charAt(end) == c) charCount++;
                while(end + 1 - start - charCount > k){
                    if(s.charAt(start) == c) charCount--;
                    start++;
                }
                maxWindowSize = Integer.max(end+1-start, maxWindowSize);
            }
        }
        return maxWindowSize;
    }
}

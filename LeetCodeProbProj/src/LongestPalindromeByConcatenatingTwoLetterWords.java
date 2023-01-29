import java.util.HashMap;

public class LongestPalindromeByConcatenatingTwoLetterWords {
    public static int longestPalindrome(String[] words){
        HashMap<String, Integer> mp = new HashMap<>();
        int counter = 0;
        for(int i=0; i<words.length; i++){
            StringBuilder currWord = new StringBuilder(words[i]);
            if(words[i].charAt(0) == words[i].charAt(1)){
                if(mp.containsKey(currWord.toString())) {
                    mp.put(currWord.toString(), mp.get(currWord.toString()) + 1);
                }else{
                    mp.put(currWord.toString(), 1);
                }
                continue;
            }
            if(mp.containsKey(currWord.toString())){
                mp.put(currWord.toString(), mp.get(currWord.toString()) + 1);
            }
            else if(mp.containsKey(currWord.reverse().toString())) {
                counter += 4;
                mp.put(currWord.toString(), mp.get(currWord.toString()) - 1);
                if(mp.get(currWord.toString()) == 0) mp.remove(currWord.toString());
            }
            else{
                mp.put(currWord.reverse().toString(), 1);
            }
        }
        boolean sampleUsed = false;
        for(String key : mp.keySet()){
            if(key.charAt(0) == key.charAt(1)){
                if(mp.get(key)%2 == 0) {
                    counter += mp.get(key) * 2;
                } else{
                    if(!sampleUsed) {
                        counter += 2;
                        sampleUsed = true;
                    }
                    counter += (mp.get(key) - 1) * 2;
                }
            }
        }
        return counter;
    }
}

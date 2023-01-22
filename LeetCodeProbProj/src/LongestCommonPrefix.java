public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs){
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];

        int maxLength = Integer.MIN_VALUE;
        for(int i=0; i<strs.length; i++)
            if(strs[i].length() > maxLength) maxLength = strs[i].length();

        String res = "";
        for(int i=0; i<maxLength; i++){
            if(strs[0].length() > 0) {
                if(i >= strs[0].length()) return res;
                char currChar = strs[0].charAt(i);
                for (int j = 1; j < strs.length; j++) {
                    if (strs[j].length() <= i || currChar != strs[j].charAt(i)) return res;
                }
                res += currChar;
            }
        }
        return res;
    }
}
//    String[] test1 = {"flower", "flow", "flight"};
//    String[] test2 = {"dog", "racecar", "car"};
//    String[] test3 = {"flower", "flower", "flower", "flower"};
//    String[] test4 = {"a", "ac"};
//        System.out.println(LongestCommonPrefix.longestCommonPrefix(test4));
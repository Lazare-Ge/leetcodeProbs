import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s){
        String res = "";
        Stack<Integer> numStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                int count = c - '0';
                i++;
                while(Character.isDigit(s.charAt(i))){
                    count = (s.charAt(i) - '0') + count * 10;
                    i++;
                }
                i--;
                numStack.add(c - '0');
            }else if(Character.isLetter(c)){
                res = res + c;
            }else if(c == '['){
                resStack.add(res);
                res = "";
            }else{
                StringBuilder temp = new StringBuilder(resStack.pop());
                int repeatNum = numStack.pop();
                temp.append(res.repeat(repeatNum));
                res = temp.toString();
            }
        }
        return res;
    }
}

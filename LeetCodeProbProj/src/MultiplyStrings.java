import java.util.ArrayList;

public class MultiplyStrings {
    public static String multiply(String num1, String num2){
        String bigNum, smallNum;
        if(num1.length() > num2.length()){
            bigNum = num1;
            smallNum = num2;
        }else{
            bigNum = num2;
            smallNum = num1;
        }
        // Multiply
        int sI = smallNum.length()-1;
        String finalRes = "0";
        while(sI >= 0){
            String currNum = "";
            int remain = 0;
            int bI = bigNum.length()-1;
            while(bI >= 0){
                int prod = (bigNum.charAt(bI) - '0') * (smallNum.charAt(sI) - '0') + remain;
                int digit = prod % 10;
                remain = prod / 10;
                currNum = (char)(digit + '0') + currNum;
                bI--;
            }
            if(remain != 0) currNum = (char)(remain + '0') + currNum;
            // Add zeros to currNum
            for(int i=0; i < smallNum.length()-1 - sI; i++){ currNum = currNum + '0'; }
            System.out.println(currNum);
            // Add currNum to finalRes
            String bigMem, smallMem;
            if(finalRes.length() > currNum.length()){
                bigMem = finalRes;
                smallMem = currNum;
            }else{
                bigMem = currNum;
                smallMem = finalRes;
            }
            System.out.println("bigMem = " + bigMem);
            System.out.println("smallMem = " + smallMem);
            int idxB = bigMem.length()-1;
            int idxS = smallMem.length()-1;
            int sumRemain = 0;
            String sumRes = "";
            while(idxS >= 0){
                int sum = (smallMem.charAt(idxS) - '0') + (bigMem.charAt(idxB) - '0') + sumRemain;
                int digit = sum % 10;
                sumRemain = sum / 10;
                sumRes = (char)(digit + '0') + sumRes;
                System.out.println("current sumRes is " + sumRes);
                idxS--;
                idxB--;
            }
            while(idxB >= 0){
                int sum = (bigMem.charAt(idxB) - '0') + sumRemain;
                int digit = sum % 10;
                sumRemain = sum / 10;
                sumRes = (char)(digit + '0') + sumRes;
                idxB--;
            }
            if(sumRemain != 0) sumRes = (char)(sumRemain + '0') + sumRes;
            finalRes = sumRes;
            System.out.println("finalRes = " + finalRes);
            sI--;
        }
        for(int i=0; i<finalRes.length(); i++){ if(finalRes.charAt(i) != '0') return finalRes.substring(i); }
        return "0";
    }
}

import java.util.HashSet;

public class HappyNumber {
    public static boolean isHappy(int n){
        HashSet<Integer> usedNums = new HashSet<>();
        while(true) {
            int res = 0;
            while (n != 0) {
                res += (n % 10) * (n % 10);
                System.out.println(res);
                n = n / 10;
            }
            if (usedNums.contains(res)) {
                return false;
            }
            if (res == 1) return true;
            usedNums.add(res);
            n = res;
        }
    }
}

import java.util.Scanner;

public class J01021 {
    public static long powMod(long a, long b) {
        long res = 1;
        while(b != 0){
            if(b % 2 == 1){
                res *= a;
                res %= (int)(1e9+7);
            }
            a *= a;
            a %= (int)(1000000007);
            b /= 2;
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong(), b = sc.nextLong();
            if(a == 0 && b == 0){
                return;
            }
            System.out.println(powMod(a,b));
        }
        
    }
}

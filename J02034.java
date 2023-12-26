import java.util.Scanner;

public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dd = new int[205];
        int max = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            max = Math.max(max, x);
            dd[x] = 1;
        }
        boolean excellent = true;
        for (int i = 1; i <= max; i++) {
            if (dd[i] == 0) {
                System.out.println(i);
                excellent = false;
            }
        }
        if (excellent) {
            System.out.println("Excellent!");
        }
        sc.close();
    }
}

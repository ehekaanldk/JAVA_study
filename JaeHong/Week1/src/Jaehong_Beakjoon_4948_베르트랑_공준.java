import java.util.Arrays;
import java.util.Scanner;

public class Jaehong_Beakjoon_4948_베르트랑_공준 {
    public static void main(String[] args) {
        boolean[] isPrime = new boolean[246_913];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        int limit = (int) Math.sqrt(246_912);
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 246_912; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        Scanner sc = new Scanner(System.in);
        int n;
        while ( (n = sc.nextInt()) != 0) {
            int cnt = 0;
            for (int i = n +1; i <= 2 * n; i++) {
                if (isPrime[i]) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}

import java.util.Scanner;

public class janhyuk_swea_1959_두개의숫자열 {

    public class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt(); // 테스트 케이스 수 입력

            for (int test_case = 1; test_case <= T; test_case++) {
                int n = sc.nextInt();
                int m = sc.nextInt();

                int[] a = new int[n];
                int[] b = new int[m];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                for (int i = 0; i < m; i++) {
                    b[i] = sc.nextInt();
                }

                int max = 0;

                if (n > m) {
                    for (int i = 0; i <= n - m; i++) {
                        int temp = 0;
                        for (int j = 0; j < m; j++) {
                            temp += a[i + j] * b[j];
                        }
                        max = Math.max(max, temp);
                    }
                } else {
                    for (int i = 0; i <= m - n; i++) {
                        int temp = 0;
                        for (int j = 0; j < n; j++) {
                            temp += a[j] * b[i + j];
                        }
                        max = Math.max(max, temp);
                    }
                }

                System.out.println("#" + test_case + " " + max);
            }
            sc.close();
        }
    }

}


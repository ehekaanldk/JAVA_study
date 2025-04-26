import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Scanner;

public class janghyuk_swea_1208_Flatten {

    public class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = 10;

            for (int test_case = 1; test_case <= T; test_case++) {
                PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // 최대 힙
                PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 최소 힙

                int dump = sc.nextInt();
                int answer = 0;

                // 최대 100개의 상자 높이 입력받기
                for (int i = 0; i < 100; i++) {
                    int n = sc.nextInt();
                    maxHeap.offer(n);
                    minHeap.offer(n);
                }
                // 덤프 수행
                for (int i = 0; i < dump; i++) {
                    int max = maxHeap.peek(); // max값 꺼내오기
                    int min = minHeap.peek(); // min값 꺼내오기

                    // Flatten 수행
                    max--;
                    min++;

                    // 수정된 값을 다시 힙에 넣기
                    maxHeap.offer(max);
                    minHeap.offer(min);
                }

                // 마지막 최대값과 최소값 차이 계산
                int max = maxHeap.peek();
                int min = minHeap.peek();
                answer = max - min;

                System.out.println("#" + test_case + " " + answer);
            }
            sc.close();
        }
    }


}

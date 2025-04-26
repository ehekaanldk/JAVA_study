import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Jaehong_Beakjoon_13335_트럭 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //  n (1 ≤ n ≤ 1,000) 트럭 대 수
        int w = sc.nextInt(); // w (1 ≤ w ≤ 100) 다리길이
        int L = sc.nextInt(); // L (10 ≤ L ≤ 1,000) 최대 하중
        sc.nextLine();
        Queue<Integer> wait = new ArrayDeque<>();
        Queue<Integer> bridge = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            wait.add(sc.nextInt());
        }
        sc.close();
        int curWeight = 0;
        int time = 0;
        while (!wait.isEmpty()) {
            if (bridge.size() == w) {
                Integer polled = bridge.poll();
                curWeight -= polled;
            }
            if (curWeight + wait.peek() > L) { // 최대 하중 넘어가면 못 들어감
                bridge.add(0);
            } else {
                Integer poll = wait.poll();
                bridge.add(poll); // 다리 위에 올라옴
                curWeight += poll;
            }
            time++;
        }
        time += w;
        System.out.println(time);
    }
}

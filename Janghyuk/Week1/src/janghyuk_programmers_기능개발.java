import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int cnt = 0;

        for (int i = 0; i < speeds.length; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {

            // progresses 의 첫번째 인덱스 부터 작업진도 100이 넘으면 queue에서 빼낸다
            while (!queue.isEmpty() && progresses[queue.peek()] >= 100) {
                cnt++;
                queue.poll();
            }

            // 하루 작업(speeds) 진행
            for (int i = 0; i < speeds.length; i++) {
                progresses[i] += speeds[i];
            }

            // 배포가 발생하면 결과 리스트에 배포한 갯수 추가
            if (cnt > 0) {
                answer.add(cnt);
                cnt = 0;
            }
        }

        return answer;
    }
}
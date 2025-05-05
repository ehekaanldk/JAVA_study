// 프로그래머스는 main, scanner를 사용하지 않음
// solution을 사용해야 한다.

// public boolean solution(String[] phone_book)
// 반환값을 boolean타입으로
// 인풋값은 string타입의 배열인 phone_book으로

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean solution(String[] phone_book) {
            Set<String> set = new HashSet<>();

            // 모든 전화번호를 set에 저장
            for (String number : phone_book) {
                set.add(number);
            }

            // 각 번호에 대해 접두사 검사
            for (String number : phone_book) {
                // stringbuilder 사용
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < number.length() - 1; i++) { // 자기자신과는 비교하지 않기 위해 -1
                    sb.append(number.charAt(i));
                    if (set.contains(sb.toString())) {
                        return false;  // 접두사 있음
                    }
                }
            }

            return true;  // 접두사 없음

    }
}
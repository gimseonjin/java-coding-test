/*
1. input -> n, output -> "수박" or "수박수"
2. n은 10000이하의 자연수
3. 0은??? 선형대수나 이런 곳에선 0을 자연수로 치지만 여기선 아니다.
4. 결국 n은 1 ~ 10000 중 하나인 자연수
5. 홀수면 "수", 짝수면 "박" <- 홀짝을 구분하는 문제!
6. for문을 사용해서 문제 해결
7. divid 2해서 0이면 박, 1이면 수를 출력

==============================================
1. String buffer answer 선언 <- 그냥 string 사용 시, 더하기 할 때 메모리 낭비 발생
2. subak list 선언!
3. for 문 돌면서 divid 2 진행
4. divid 2의 나머지 값으로 subak 참조 후, append 진행
5. answer를 String 객체로 변환하여 반환
*/
import java.util.*;

class Solution {
    public String solution(int n) {
        
        // 1. String buffer answer 선언
        StringBuffer answer = new StringBuffer();
        
        // 2. subak list 선언!
        List<String> subak = Arrays.asList("수", "박");
        
        // 3. for 문 돌면서 divid 2 진행
        for(int i = 0; i < n; i++){
            int subak_index = i % 2;
            // 4. divid 2의 나머지 값으로 subak 참조 후, append 진행
            answer.append(subak.get(subak_index));
        }
        
        // 5. answer를 String 객체로 변환하여 반환
        return answer.toString();
    }
}
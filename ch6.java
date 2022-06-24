/*
1. 자리수의 총 합을 구한다.
2. input - int / output - int
3. 문제를 구현할 때, 성능을 고려해야하는가?? -> 지금은 no
4. 그럼 가장 쉬운 방법인 int -> string, string -> int

==============================================

1. n을 문자열로 변환 후, 나눈다.
2. 문자열을 탐색하면서 int로 변환 후 더한다.
*/

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1. n을 문자열로 변환 후, 나눈다.
        String[] splited_s = Integer.toString(n).split("");
                           
        // 2. 문자열을 탐색하면서 int로 변환 후 더한다.
        for(String s : splited_s){
            answer += Integer.parseInt(s);
        }

        return answer;
    }
}
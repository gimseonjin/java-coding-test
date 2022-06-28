/*
input -> int, output -> List<integer>
n = 0? -> []
=======================================
1. n이 0이 될 때까지 무한 루프를 돕니다.
    1-1. n % 10해서 1의 자리, 즉 맨 뒤의 자리 숫자를 가져옵니다.
        1-1-1. 나누기를 수행하면 long 타입이 되기 때문에 int로의 형변환이 필요합니다.
    1-2. n을 /10 해줍니다.
2. Array로 변환합니다.
*/
import java.util.*;
import java.util.Collections.*;
import java.util.stream.*;
import java.util.stream.Collectors.*;

class Solution {
    public int[] solution(long n) {
        List<Integer> answer = new ArrayList<Integer>();
        // 1. n이 0이 될 때까지 무한 루프를 돕니다.
        while(n>0){
            // 1-1. n % 10해서 1의 자리, 즉 맨 뒤의 자리 숫자를 가져옵니다.
            //1-1-1. 나누기를 수행하면 long 타입이 되기 때문에 int로의 형변환이 필요합니다.
            int target = (int)(n%10);
            answer.add(target);
            // 1-2. n을 /10 해줍니다.
            n = (n / 10);
        }
        //2. Array로 변환합니다.
        return answer.stream().mapToInt(i -> (int)i).toArray();
    }
}
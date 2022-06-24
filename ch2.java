/*
1. input -> integer array, output -> integer array
2. 모두 나눠떨어지지 않는다면, 나눠떨어지는 케이스가 없다면 [-1] 반환
3. 나누는 값은 모두 자연수
4. 배열 길이는 최소 1
5. 배열 내부의 중복은 없다

==============================================

1. result_list를 선언한다.
2. for문을 돌면서 divisor를 돌린다.
3. 그리고 나눠지면 그 인덱스 값을 result_list에 담는다.
4. result_list를 정렬한다.
5. 만약 result_list의 길이가 0이면 -1을 담아준다.
6. List<Integer>를 int array로 변환한다.
*/

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        // 1. result_list를 선언한다.
        List<Integer> result_list = new ArrayList<Integer>();
        
        // 2. for문을 돌면서 divisor를 돌린다.
        for(int a : arr){
            
            // 3. 그리고 나눠지면 그 인덱스 값을 result_list에 담는다.
            int divisor_result = a % divisor;
            if(divisor_result == 0){
                result_list.add(a);
            }
        }
        
        // 4. result_list를 정렬한다.
        Collections.sort(result_list);
        
        // 5. 만약 result_list의 길이가 0이면 -1을 담아준다.
        if(result_list.size() == 0){
            result_list.add(-1);
        }
        
        // 6. List<Integer>를 int array로 변환한다.
        return result_list.stream()
                          .mapToInt(Integer::intValue)
                          .toArray();
    }
}
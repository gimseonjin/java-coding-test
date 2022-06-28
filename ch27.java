/*
1. 전체 예산이 정해져 있다.
2. 사줄 경우에는 모두 사준다.
3. input - 1 < array < 100, 1 < budget < 10000000 / output - 1 < int < 100

input : [1,3,2,5,4], 9
output : 3
Explanation : 1,3,2 -> 6 / 3 개

이 문제 풀이의 핵심은 가장 많이 사주기 위해선 작은 금액부터 채워나가야 한다.
따라서 정렬 후, 한 개씩 증가해 나가면서 budget보다 커지면 이전까지의 i 값을 반환한다.
============================================================================
1. Arrays.sort로 정렬하겠습니다.
2. 정렬된 리스트를 탐색합니다.
    2-1. count가 budget보다 큰 지, 판단합니다.
    2-2. count가 budget보다 커지면, 이전 인덱스 + 1, 즉 현재 인덱스를 반환합니다.
        (왜냐면 배열은 0부터 시작하니까)
3. 만약 모든 금액을 다 사줄 수 있는 경우, 위 조건에서 필터링 되지 않기 때문에 순환이 끝나면 return d.length합니다.
============================================================================
이 문제의 시간 복잡도를 계산해보면 아래와 같다.

1. Arrays.sort는 O(N logN)이다. (최악의 경우에는 N^2)
2. list 탐색은 O(N)이다.

=> 따라서 O(N logN + N) -> O(N logN)에 수렴한다.
    (단 Arrays.sort가 최악인 경우에는 O(N^2)에 수렴한다.)
*/

import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        // 1. Arrays.sort로 정렬하겠습니다.
        Arrays.sort(d);
        
        int count = 0;
        // 2. 정렬된 리스트를 탐색합니다.
        for(int i = 0; i < d.length; i++){
            count += d[i];
            // 2-1. count가 budget보다 큰 지, 판단합니다.
            if(count > budget){
                // 2-2. count가 budget보다 커지면, 이전 인덱스 + 1, 즉 현재 인덱스를 반환합니다.
                return i;
            }
        }
        // 3. 만약 모든 금액을 다 사줄 수 있는 경우, 위 조건에서 필터링 되지 않기 때문에 순환이 끝나면 return d.length합니다.
        return d.length;
    }
}
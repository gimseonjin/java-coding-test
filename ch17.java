/*
input -> lentgh 6 array, 0 < array < 45, No duplicate except 0
      -> win_nums length 6 array, 1 < win_nums < 45, No duplicate
      
      lottos와 win_nums의 일치 여부를 판단! <- 순서는 상관이 없다!
      
output -> High_grade, Lower_grade < array
       -> 1 <= grade <= 6
       -> 0, 1개 일치하면 6등, 2개 일치하면 5등 ... 6개 일치하면 1등! < grade_list로 두자!
       
strategy : win_nums를 해시함수에 넣고, lottos를 돌면서 키에 존재 여부 판단!
           이때, 0이 들어오는 경우, max_count에 더해준다.
           return grade_list[max_count], grade_list[min_count]

===============================================================
0. grade_list를 만듭니다.
1. hashmap을 만듭니다.
2. 이때, win_nums는 중복값이 없으니 체크하지 않고 바로 hashmap에 넣습니다.
3. lottos를 탐색합니다.
    3-1. 0이 탐색되면 max_count+1,
    3-2. hashmap에 키가 있으면 max_count, min_count 각각 +1,
    3-3. 아무것도 없으면 패스
4. return grade_list[max_count], grade_list[min_count]
*/

import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        // 0. grade_list를 만듭니다.
        int[] grade_list = {6,6,5,4,3,2,1};
        
        int max_count = 0;
        int min_count = 0;
        
        // 1. hashmap을 만듭니다.
        HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
        
        // 2. 이때, win_nums는 중복값이 없으니 체크하지 않고 바로 hashmap에 넣습니다.
        for(int n : win_nums){
            map.put(n,true);
        }
        
        // 3. lottos를 탐색합니다.
        for(int l : lottos ){
            
            // 3-1. 0이 탐색되면 max_count+1,
            if(l == 0){
                max_count++;
                
            // 3-2. hashmap에 키가 있으면 max_count, min_count 각각 +1,
            }else if(map.containsKey(l)){
                max_count++;
                min_count++;
            }
            
            // 3-3. 아무것도 없으면 패스
        }
        
        // 4. return grade_list[max_count], grade_list[min_count]
        int[] answer = {grade_list[max_count], grade_list[min_count]};
        return answer;
    }
}
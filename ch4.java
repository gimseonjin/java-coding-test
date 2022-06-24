/*
1. 이 문제는 participant와 completion의 매칭 문제.
2. participant를 탐색하면서 completion의 없는 사람을 찾으면 된다.
3. participant에는 중복값이 있을 수 있다.
4. completion 명단에도 중복값이 있을 수 있다.
4. 완주하지 못한 선수는 단 한명이다.
5. completion 명단을 hashmap에 넣어두고 participant를 탐색해서 -1 한다, 탐색값이 없거나 값이 0인 경우에는 그 선수를 return

==============================================

1. completionMap을 선언한다.
2. completion을 hash map으로 매핑한다.
    2-1. 이때 hash map에 존재하면 기존 값 +1,
    2-2. 존재하지 않으면 1로 초기화 한다.
3. participant를 탐색한다.
    3-1. completionMap에 존재하지 않거나 value가 0이면 return
    3-2. 그렇지 않으면 기존 값 -1
*/

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        // 1. completionMap을 선언한다.
        HashMap<String,Integer> completionMap = new HashMap<String,Integer>();
        
        // 2. completion을 hash map으로 매핑한다.
        for(String c : completion){
            // 2-1. 이때 hash map에 존재하면 기존 값 +1,
            if(completionMap.containsKey(c)){
                Integer count = completionMap.get(c);
                completionMap.put(c,count+1);
            // 2-2. 존재하지 않으면 1로 초기화 한다.
            }else{
                completionMap.put(c,1);
            }
        }
        
        // 3. participant를 탐색한다.
        for(String p : participant){
            // 3-1. completionMap에 존재하지 않거나 value가 0이면 return
            if(!completionMap.containsKey(p) || completionMap.get(p) == 0){
                return p;
            // 3-2. 그렇지 않으면 기존 값 -1
            }else{
                Integer count = completionMap.get(p);
                completionMap.put(p,count-1);
            }
        }
        
        return "";
    }
}
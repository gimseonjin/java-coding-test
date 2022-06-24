/*
1. 윤년이기 때문에 2월 29일이 있다.
2. input -> int a, int b, output -> string ""
3. 별도의 input 필터링이 필요없다. 

==============================================

1. week_list = [] <- 인덱스로 찾아가게끔, 중요한 점은 1월 1일이 금요일이기 때문에 금요일부터 시작해야한다.
2. month_list = [] < 1~12월까지의 날짜를 넣을 것이다.
3. a월을 받아오면 1월부터 ~ a-1월까지의 날짜 합을 계산한다.
4. 3번에서 계산한 날짜의 합에 b를 더한다.
5. 4번 계산 값에 1을 빼고(1월 1일 제외) 나누기 7을 한다.
6. 그 나머지 값의 해당하는 week_list 값을 가져온다.
*/
import java.util.*;

class Solution {
    public String solution(int a, int b) {
        // 1. week_list = [] <- 인덱스로 찾아가게끔
        List<String> week_list = Arrays.asList("FRI","SAT","SUN","MON","TUE","WED","THU");
        
        // 2. month_list = [] < 1~12월까지의 날짜를 넣을 것이다.
        List<Integer> month_list = Arrays.asList(0,31,29,31,30,31,30,31,31,30,31,30,31);
        
        // 3. a월을 받아오면 1월부터 ~ a-1월까지의 날짜 합을 계산한다.
        int dates = 0;
        for(int i = 1; i < a; i++){
            dates+=month_list.get(i);
        }
        
        // 4. 3번에서 계산한 날짜의 합에 b를 더한다.
        dates += b;
        
        // 5. 4번 계산 값에 1을 빼고(1월 1일 제외) 나누기 7을 한다.
        dates -= 1;
        
        // 6. 그 나머지 값의 해당하는 week_list 값을 가져온다.
        String week = week_list.get(dates % 7);
        
        return week;
    }
}
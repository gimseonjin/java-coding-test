/*
input -> int > 0, output -> boolean
한자리 수의 경우, 1 -> 1 / 1 = 1 -> 하사드!!
별 다른 예외는 보이지 않음
========================================
1. 각 자리 수의 합을 구하는 함수 구현 <- 가독성을 위해 별도의 함수로 분리
    1-1. 합을 저장하는 s 변수 선언
    1-2. while, x > 0
    1-3. x%10 을 s에 더한다.
    1-4. x = x/ 10
    1-5. return s
2. n % 각 자리수의 합 == 0 결과 반환
*/
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        // 1. 각 자리 수의 합을 구하는 함수 구현 <- 가독성을 위해 별도의 함수로 분리
        int s = sum(x);
        
        // 2. n % 각 자리수의 합 == 0 결과 반환
        return x % s == 0;
    }
    
    public static int sum(int x){
        
        // 1-1. 합을 저장하는 s 변수 선언
        int s = 0;
        
        // 1-2. while, x > 0
        while(x>0){
            
            // 1-3. x%10 을 s에 더한다.
            s += (int)(x % 10);

            // 1-4. x = x/ 10
            x = x / 10;
        }
        
        // 1-5. return s
        return s;
    }
}
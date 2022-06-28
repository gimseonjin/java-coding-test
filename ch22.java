/*
input -> String -> mixed with (String)number Or All (String)numbers
example -> "one4seveneight" or "12341234"

output -> "1478" or "12341234"

strategy : 우선 각 영단어를 hash map에 담고, 각 문자열을 읽어서, 숫자면 바로 입력, 
           문자면 임시 저장했다가 영단어가 완성되면 hash map에서 해당하는 값 가져오기
=====================================================================
1. Hash map을 만듭니다.
2. 임시 저장할 String buffer를 만듭니다.
3. 문자열을 탐색합니다. < 숫자 구분을 위해서 ascii 코드로 변환합니다.(Char)
    3-1. 96 < target < 123보다 작은 경우, 
        3-1-1. 문자열이기 때문에 임시 저장합니다.
        3-1-2. 임시 저장한 문자열이 hash map에 존재할 경우, 값을 가져옵니다.
            3-1-2-1. 임시 저장용 String buffer를 초기화 합니다.
    3-2. target이 숫자인 경우,(위에서 걸러지지 않았기 때문에)
        3-2-1. 그대로 가져옵니다.
4. Int형으로 변환 후 Return!
*/
import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder("");
        int len = s.length();
        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i<10; i++){
            s = s.replaceAll(alphabets[i],digits[i]);
        }

        return Integer.parseInt(s);
    }
}
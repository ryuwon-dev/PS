import java.util.*;
import java.lang.Math;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        int[] score = {0, 0, 0};
        
        int[] hater1 = {1,2,3,4,5};
        int[] hater2 = {2,1,2,3,2,4,2,5};
        int[] hater3 = {3,3,1,1,2,2,4,4,5,5};
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == hater1[i % hater1.length])
                score[0]++;
            if(answers[i] == hater2[i % hater2.length])
                score[1]++;
            if(answers[i] == hater3[i % hater3.length])
                score[2]++;
        }
        
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));

        if (score[0] == maxScore) answer.add(1);
        if (score[1] == maxScore) answer.add(2);
        if (score[2] == maxScore) answer.add(3);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

// 1번 - 순차 1씩 증가
// 2번 - 2는 고정. 2 다음 순차
// 3번 - 3 1 2 4 5 반복 2번씩

// 가장 높은 점수 받은 사람 return (동점이면 여럿 리턴)
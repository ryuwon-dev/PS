class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n / 2; i++)
            if(n % i == 1)
                return i;
        
        return n - 1;
    }
}
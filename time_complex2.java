class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int s=1,dist=0;
        while(Y>=dist)
        {
            dist=X+D*s;
            s++;
        }
        return s-1;
    }
}
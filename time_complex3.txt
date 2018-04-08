class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
       int s=1;
        for(int i=0;i<A.length;i++)
        {
            int temp=0;
            for(int j=0;j<A.length;j++)
            {
                if(s==A[j])
                {
                    temp=1;
                    break;
                }
                
            }
            if(temp!=1)
            {
                break;
            }
            s++;
        }
        return s;
    }
}
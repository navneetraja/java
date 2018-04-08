import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        
            int current, before = A[0];
            int countdif = 1;
            for (int i=1;i<A.length;i++)
            {
                current = A[i];
                if (current != before)
                {
                    before = current;
                    countdif++;
                }
            }
            return countdif;

             
       
    }
}
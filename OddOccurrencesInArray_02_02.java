// OddOccurrencesInArray
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

        int temp=0;
        Arrays.sort(A);
        for(int i=0;i<A.length;i=i+2)
        {
            if(A[i]!=A[i+1])
            {
                temp=A[i];
                break;
            }
        }
        return temp;
    }
}




//////////////////
 for number in A:
        result ^= number
 
    return result
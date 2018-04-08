//1. CyclicRotation
//Rotate an array to the right by a given number of steps.

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        for(int i=0;i<K;i++)
        {
            
            int j=0;
			int val=A[0];
           for(;j<A.length-1;j++)                                     
           {
				
				int temp=A[j+1];
				A[j+1]=val;
				val=temp;
		   }
		   A[0]=val;
		}  
		return A;
    }
}
//Missing Element
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int missingNumber = 0;
       int previousNum = 0;
       Arrays.sort(A);	
    for(int i =0; i<A.length; i++)
    {
        /*="" actualsum="" +="i;"*/ 
        if(A[i] /*=""*/> 0){
        if (A[i] - previousNum > 1){
        missingNumber = previousNum + 1;
        return missingNumber;
        }
    previousNum = A[i];
    if( i + 1 == A.length && missingNumber == 0) {
    missingNumber = A[i]+1;
    return missingNumber;
    }
    }
}
if (missingNumber == 0){
missingNumber = 1;
} 
return missingNumber;
    }
}
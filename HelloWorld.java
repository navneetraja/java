public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        int A []={3, 8, 9, 7, 6};int K=3;
        int size=A.length;
        System.out.println(size);
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
		   
		   for(int p=0;p<A.length;p++)
		   {  
           System.out.println(A[p]);
		   }
		   
          /* A[0]=A[j];
           for(int z=0;z<A.length;z++)
           {
               System.out.print(" "+A[z]);
           }*/
           
        
     }
	 
}
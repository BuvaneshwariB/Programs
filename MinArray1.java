 public class MinArray1
   {
      public static void main(String[] args)
      {
   	 double[] a = { 2.3, 3.4 , 4.5, 5.6, 1.2, 7.8, 8.9 }; // 7 elements   
    
   	 int i;              // array index
	 double min;         // Current min value
        
         min = a[0];         // Initial min. value

   	 for ( i = 1 ; i < a.length ; i++ )
   	 {
   	    if ( a[i] < min )
   	    {
   	      min = a[i];  // Found a smaller min. value
   	    }
   	 }
    
   	 System.out.println( min );   
      }
   }
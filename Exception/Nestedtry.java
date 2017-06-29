class Nestedtry{  
 public static void main(String args[]){  
  try
  {  
    try
    {  
     System.out.println("going to divide");  
     int b =39/0;  
    }
    catch(ArithmeticException e)
    {
        System.out.println(e);
    }
     finally{
         System.out.println( " Final block1");
     }

  try
   {  
    int a[]=new int[5];  
    a[5]=4;  
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println(e);
    } 
    
    finally
    {
        System.out.println("other statement123"); 
    }

     
    System.out.println("other statement");  
    int a=20/0;
  }
  catch(Exception e)
  {
      System.out.println("handeled");
  }  
  
  System.out.println("normal flow..");  
 }  
}  
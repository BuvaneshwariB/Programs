public class catchExecution{
  public static void main(String args[]){
   try{
    //int a[]=new int[5];
    //a[5]=30;
    int i=0;
    //System.out.println(a[1]);

    int c=10/i;
    
    /*String s="str";
    //String s="123";
    int i=Integer.parseInt(s);
    System.out.println(s);*/
   }
   
   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed"+e);
  }
catch(ArithmeticException e){
  int i=1;
  int c=10/i;
  
   System.out.println(c);
  System.out.println("task1 is completed"+e);
}
   catch(Exception e){System.out.println("common task completed"+e);}

   System.out.println("rest of the code...");
 }
}

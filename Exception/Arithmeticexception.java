import java.util.*;
class Arithmeticexception{
  public static void main(String args[]){
      int i;
      
      Scanner sc=new Scanner(System.in);
      i=sc.nextInt();
      try{
      int data=50/i;
      System.out.println(data);
      }
      catch(Exception e){
      System.out.println("exception occured :" +e);
      }
     // i=1;
      System.out.println("rest of code");
}
}

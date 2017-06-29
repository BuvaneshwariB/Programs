import java.io.IOException;  
public class ThrowsException
{  
  void m(){
      int a=10/0;
     }  
  void n(){
      System.out.println("hello");  
    m();  
  }  
  void p(){  
   //try{  
    n();

   //}catch(Exception e){System.out.println("exception handled"+e);}  
  }  
  public static void main(String args[]){  
   ThrowsException obj=new ThrowsException();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  
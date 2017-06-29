class A{  
public void msg(){System.out.println("Hello java");}  
}  
  
public class Simple1 extends A{  
public void msg(){System.out.println("Hello");}//C.T.Error  
 public static void main(String args[]){  
   Simple1 obj=new Simple1();  
   obj.msg();  
   }  
}  
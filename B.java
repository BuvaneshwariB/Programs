//package pack2;  
class Att
{  
protected void show()
{
System.out.println("Hello Java");
}  
}   
 class B extends Att
{  
 public static void main(String args[])
 {  
  Att obj = new B(); 
  obj.show();   //Compile Time Error, can't access outside the package  
 }  
}  
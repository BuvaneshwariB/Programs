class localInner1{
 private int data=30;//instance variable
 void display(){
  class Local{
   void msg(){System.out.println(data);}
  }
  Local l=new Local();
  l.msg();
 }
}
class LocalInner2 {//extends localInner1{
 public static void main(String args[]){
  localInner1 obj=new localInner1();
  obj.display();
 }
}
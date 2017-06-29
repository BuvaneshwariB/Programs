interface Showable{ //extends Message{
 void show1();
 void msg();
}
 /* interface Message{
   void msg();
  // void show1();
  }*/


 public class checkInterface {
 
// public void show1(){System.out.println("Hello nested interface123");}

 public static void main(String args[]){
  Showable message=new Showable(){
     public void show1(){System.out.println("Hello nested interface123");}
     public void msg(){System.out.println("Hello nested interface");}

  };//upcasting here
  message.show1();
  message.msg();
 }
}

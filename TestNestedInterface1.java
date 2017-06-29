interface Showable{
  void show1();
  interface Message{
   void msg();
  // void show1();
  }
}

class TestNestedInterface1 implements Showable.Message{
 public void msg(){System.out.println("Hello nested interface");}
 //public void show1(){System.out.println("Hello nested interface123");}

 public static void main(String args[]){
  Showable.Message message=new TestNestedInterface1();//upcasting here
  //message.show1();
  message.msg();
 }
}

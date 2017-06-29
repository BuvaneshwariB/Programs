class Static{
 static int num=10;
    static String mystr="hello";
   
    /*static{
      System.out.println("Static Block 2");
      num = 98;
      mystr = "Block2";
  }
  static{package com.java2novice.wrapper.integer;
 
public class MyBasicInteger {
 
    public static void main(String a[]){
        int i = 10;
        Integer intg = new Integer(i);
        System.out.println(intg);
        String no = "223";
        Integer num = new Integer(no);
        System.out.println(num);
    }
}
       System.out.println("hello");
      num = 97;
      mystr = "Static keyword in Java";
   }*/
   public static void main(String args[])
   { 
       int num=15;
       Static a=new Static();
      System.out.println("Value of num="+a.num);
      System.out.println("Value of mystr="+mystr);
   }
}
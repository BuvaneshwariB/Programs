public class Test1 { 

   public static void main(String args[]) {
       int i=100;
      Integer x =Integer.valueOf(i);
      //byte y =x.byteValue((byte)i);
      Double c = Double.valueOf(i);
      Float a = Float.valueOf(i);               
      Integer b = Integer.valueOf("100",16);

      System.out.println(x); 
      System.out.println(c);
      System.out.println(a);
      System.out.println(b);
   }
}
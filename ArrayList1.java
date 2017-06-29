import java.util.*;
import java.util.ArrayList;
class ArrayList1
{
    public static void main(String args[])
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("xxx");
        al.add("yyy");
        //al.add("zzz");
      al.forEach(A -> System.out.println(A)); 

      //   al.forEach(System.out::println);
        //for(String i:al)
        //System.out.println(i);
    }
}
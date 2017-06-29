import java.util.*;  
class TestCollection2{  
 public static void main(String args[]){  
  ArrayList<String> al=new ArrayList<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay"); 
  al.remove("Vijay"); 
  Iterator it=al.iterator();
  while(it.hasNext())
  {
      System.out.println(it.next());
  }

  //for(String obj : al)  {

  
    //System.out.println(obj);
 //
// }
    al.remove("Vijay");  
     System.out.println(al);
 }  
}  
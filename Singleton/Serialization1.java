import java.io.Serializable; 
import java.io.*; 
class Serialization implements Serializable{  
 int id;  
 String name;  
 public Serialization(int id, String name) {  
  this.id = id;  
  this.name = name;  
 }  
}  
  
class Serialization1{  
 public static void main(String args[])throws Exception{  
  Serialization s1 =new Serialization(211,"ravi");  
  
  FileOutputStream fout=new FileOutputStream("f.txt");  
  ObjectOutputStream out=new ObjectOutputStream(fout);  
  
  out.writeObject(s1);  
  out.flush();  
  System.out.println("success");  
 }  
}  
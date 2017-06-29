interface A{  
void a();//bydefault, public and abstract  
void b();  
void c();  
void d();
void e();  
}  
  
//Creating abstract class that provides the implementation of one method of A interface  
abstract class B implements A{  
public void c(){System.out.println("I am C");} 

}  
  
//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods  
class M extends B{  
public void a(){System.out.println("I am a");}  
public void b(){System.out.println("I am b");}  
public void d(){System.out.println("I am d");}  
public void e(){System.out.println("i agb");}
}  
class Ab extends B{
public void a(){System.out.println("I am a");}  
public void b(){System.out.println("I am b");} 
public void d()
{
    System.out.println("hiii");
}
public void e(){System.out.println("i agb");}

} 
//Creating a test class that calls the methods of A interface  
class Test5{  
public static void main(String args[]){  
A a=new A(){ 
    public void e(){System.out.println("i agb");}

} ;
A abc=new M();
a.a();  
a.b();  
a.c();  
a.d();  
a.e();
abc.a();  
abc.b();  
abc.c();  
abc.d();  
abc.e();
}}  
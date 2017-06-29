//import java.util.*;
interface A{
    public void something();
}
abstract class AbstractClass  {
    abstract void someMethod1(); 
    public void someMethod(){
        System.out.println("abstract class");
    }

}
class AbstractClass1 extends AbstractClass  {

    public void someMethod1(){
        System.out.println("abstract class");
    }

}
public class TestClass extends AbstractClass1{

    public static void main(String[] args) {

        AbstractClass abstractClass = new AbstractClass() {};
          /*  public void someMethod() {
                System.out.println("concrete class method");
            }*/
        abstractClass.someMethod();
        abstractClass.someMethod1();
    }
}
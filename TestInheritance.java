class Animal{  
void bark(){System.out.println("eating...");} 
 /*Animal()
 {
     System.out.println("Base Class");
 } */
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}
/*Dog()
{
    System.out.println("Derived Class1");
}  */
}  
class TestInheritance1 extends Dog{  
    void bark(){
        //super.bark();
        System.out.println("barking1...");
    }
    }
class TestInheritance //extends TestInheritance1
    {
        
       // System.out.println("Derived Class2");
public static void main(String args[]){ 
   //Dog a=new TestInheritance();
 //  TestInheritance1 a=new TestInheritance1();
   Dog d=new Dog();
   d.bark();
    //Animal a=new Animal();
   // a.TestInheritance();
   //a.eat();

//Dog d=new Dog();  
//a.bark();  
//a.eat();  
}
}  
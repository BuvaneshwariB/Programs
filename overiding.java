class Animal1{  
    int a=2;
void eat(){System.out.println("eating...");}  
}  
/*class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  */
class TestInheritance extends Animal1{ 
    int a=1;
void eat(){System.out.println("eating...123");}  
}  
class overiding{
public static void main(String args[]){  
//Dog d=new Dog();  
Animal1 a=new TestInheritance();
 a.eat();
 System.out.println(a.a);
//d.eat(); 
//d.bark();  
}}  
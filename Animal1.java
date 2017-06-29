class Animal1{  
void eat(){System.out.println("eating...");}  
}  
/*class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  */
class TestInheritance extends Animal1{  
public static void main(String args[]){  
//Dog d=new Dog();  
TestInheritance a=new TestInheritance();
 super.eat();
//d.eat(); 
//d.bark();  
}}  
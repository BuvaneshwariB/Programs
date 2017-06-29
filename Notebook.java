import      java.util.*;
class NoteBook{
  
        NoteBook()
        {
      System.out.println("Default constructor");
        }
   public void NoteBook ()
   {
      System.out.println("Void method of the class");
   }
   public static void main(String args[])
   {
	
	NoteBook obj = new NoteBook();
	obj.mymethod();
   }
}
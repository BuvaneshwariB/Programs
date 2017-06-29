public class JaggedArray
{
 public static void main(String args[])
 {
  
  // student[0] = new int[4];	
 // student[1] = new int[1];
  // student[2] = new int[2];
   //student[3] = new int[3];
 
  // System.out.println("Row count: " + student.length);      
 // System.out.println("Third row size: : " + student[3].length); 
                             // 1st row
  /*student[0][0] = 44;
   student[0][1] = 55;
   student[0][2] = 66;
   student[0][3] = 77;*/
 int student1 []={44,55,66,77};
		             // 2nd row
   int student2 [] ={36};
		             // 3rd row
    int student3 [] = {87,97};
  // student[2][1] = 97;
		             // 4th row
  int student4 []= {68,78,88};
   //student[3][1] = 78;
   //student[3][2] = 88;
    int student[][] = {student1,student2,student3,student4} ;   
			 		

  // System.out.println("student[3][1] marks: " + student[3][1]);  
 
   System.out.println("\nMatrix Form");
           
   for(int i = 0; i < student.length; i++)     
   {
     for(int j = 0; j < student[i].length; j++)
     {
       System.out.print(student[i][j] + "\t");
     }
     System.out.println();        
   }
 }
}
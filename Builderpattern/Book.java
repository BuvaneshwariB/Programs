public class Book
{
int b_id;
String b_name;
public Book(int id,String name)
{
b_id=id;
b_name=name;
}
//Book b1=new Book(1);
@Override
public String toString() {
return "b_id"+b_id+"\nb_name "+b_name;
}

}






public class Library
{
public static void main(String[] args)
{
Book b=new BookBuilder().setId(10).getBook();
System.out.println(b);
}
}
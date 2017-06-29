
class BookBuilder
{
public int b_id;
public String b_name;
public BookBuilder setId(int id)
{
b_id=id;
return this;
}
public BookBuilder setName(String name)
{
b_name=name;
return this;
}
public Book getBook()
{
return new Book(b_id, b_name);
}
}
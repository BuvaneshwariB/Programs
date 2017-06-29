
class Students 
{
String name;
int rollno;
int age;

public int getrollno() {
        return rollno;
    }

    public void setrollno(int rollno) {
        this.rollno = rollno;
    }

public void displayrollno(){
System.out.println(getrollno());
}

public boolean toString(){
    return "Students [name=" + name + ", rollno=" + rollno + ", age=" + age + "]";
}
}

class StudentsTest{
public static void main(String args[]){
Students std=new Students();
std.rollno=10;
std.displayrollno();

Students std1=new Students();
std1.rollno=23;
std1.displayrollno();


System.out.println(std);

}
}




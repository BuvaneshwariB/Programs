import java.io.PrintStream;  
class Outer$Inner  
{  
    final Outer this$0;  
    Outer$Inner()  
    {   super();  
        this$0 = Outer.this;  
    }  
    void msg()  
    {  
        System.out.println((new StringBuilder()).append("data is ")  
                    .append(Outer.access$000(Outer.this)).toString());  
    }  
}  

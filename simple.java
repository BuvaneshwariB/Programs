import java.util.*;     
public class simple
{
    public void callByValue(int x)
    {
        x=100;
    }
    public static void main(String[] args)
    {
       //int x=50;
        simple t = new simple();
        t.callByValue(x);	//function call
        System.out.println(x);
    }
    
}
class Temp
{
   Temp()
    {
        this(1000);
        System.out.println("The Default constructor");
    }
    Temp(int x)
    {
      this(150 ,199);
        System.out.println(x);
    }
    Temp(int x, int y)
    {
        System.out.println(x * y);
    }
 
    public static void main(String args[])
    {
        
        new Temp();
    }
}
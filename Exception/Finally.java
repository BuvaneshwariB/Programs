class Finally
{
   public   int myMethod()
   {
       try {
            //try block 
           int i=12/0;
            System.out.println(i);
          return 10;

        //
       }
       catch(Exception e){System.out.println("hii"+e);    }
       finally {
            //finally
           System.out.println("Inside Finally block");
            return 6;
       }
      // return 5;
  }
  public static void main(String args[])
  {
      Finally f=new Finally();
       System.out.println(f.myMethod());
  }
}
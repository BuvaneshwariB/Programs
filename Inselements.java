import java.util.Scanner;
class Inselements
{
    public static void main(Stirng args[])
    {
        //int n,p,x;
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            System.out.println(a[i]);
        }
        a[n]=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        

    }
}
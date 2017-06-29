
import java.util.Scanner;
import java.io.InputStreamReader;
class SystemIn {
    public void main(String s[]) {
//Scanner sc = new Scanner(System.in);
System.out.println("Enter number 1");
        //int x = sc.nextInt();
        int x = System.in.read();
 System.out.println("Enter number 2");
        int y = System.in.read();
        int z=x+y;
        System.out.println(z);
    }
}


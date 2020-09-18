import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i=1,sum,t1=0,t2=1;
        System.out.println("Enter the no. of terms");
        n = sc.nextInt();
        while(i<=n)
        {
            System.out.print(t1+" ");
            sum = t1 + t2;
            t1=t2;
            t2=sum;
            i++;
        }
    }
}

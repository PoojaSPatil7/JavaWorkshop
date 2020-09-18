import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,m;
        System.out.println("Enter a number of your choice ");
        n = sc.nextInt();
        if(n%2!=0)
        {
            System.out.println("Weird");
        }
        else if(n>=2 && n<=5)
        {
            System.out.println("Not Weird");
        }
        else if(n>=6 && n<=20)
        {
            System.out.println("Weird");
        }
        else if(n>20)
        {
            System.out.println("Not Weird");
            System.out.println();
        }
    }
}

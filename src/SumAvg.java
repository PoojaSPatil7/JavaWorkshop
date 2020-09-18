import java.util.Scanner;
public class SumAvg {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int [] Array;
        Array = new int[50];
        int i,n,sum=0;
        float avg;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        for(i=0;i<n;i++)
        {
            Array[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+Array[i];
        }
        avg = (float) sum /n;
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+avg);
    }
}

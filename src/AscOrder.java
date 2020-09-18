import java.util.Scanner;
public class AscOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Array;
        Array = new int[50];
        int i, n, temp;

        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        for (i = 0; i < n; i++)
        {
            Array[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (Array[i] > Array[j])
                {
                    temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
                }
            }
        }
        System.out.println("The sorted array in ascending order is : ");
        for (i = 0; i < n-1; i++)
        {
            System.out.print(Array[i] + " ");
        }
        System.out.print(Array[n-1]);
    }
}

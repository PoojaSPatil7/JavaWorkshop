import java.util.Scanner;
public class Add2D {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rows = 2, columns = 3;
        int[][] M1 = { {0, 1, 2}, {3, 4, 5} };
        int[][] M2 = { {0, 1, 2}, {3, 4,5} };

        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                sum[i][j] = M1[i][j] + M2[i][j];
            }
        }
        System.out.println("Sum of two matrices is: ");
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + "    ");
            }
            System.out.println();
        }

    }
}

import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, ans;
        char op;
        System.out.println("Enter the expression");
        a = sc.nextFloat();
        op = sc.next().charAt(0);
        b = sc.nextFloat();
        switch (op) {
            case '+':
                ans = a + b;
                System.out.println("The sum of the two numbers is : " + ans + " ");
                break;
            case '-':
                ans = a - b;
                System.out.println("The difference of the two numbers is : " + ans + " ");
                break;
            case '*':
                ans = a * b;
                System.out.println("The product of the two numbers is : " + ans + " ");
                break;
            case '/':
                if (b == 0) {
                    System.out.println("The operation cannot be performed");
                    break;
                }
                ans = a / b;
                System.out.println("The quotient of the two numbers is : " + ans + " ");
                break;
            default:
                System.out.println("Invalid Operator");

        }
    }
}

import java.util.Scanner;
public class Student {

    Student(int roll)
    {
        System.out.println("Name: Unknown");
        System.out.println("Roll number: " + roll);
    }

    Student(String Name, int roll)
    {
        System.out.println("Name: " + Name);
        System.out.println("Roll number: " + roll);
    }

    public static void main(String[] args)
    {
        int roll_number;
        String Name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name and roll number: ");
        Name = sc.nextLine();
        roll_number = sc.nextInt();
        Student S1 = new Student(Name,roll_number);
        Student S2 = new Student(roll_number);



        }
    }




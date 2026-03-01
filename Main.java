import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[10];
        int count = 0;

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter marks: ");
                int marks = sc.nextInt();
                students[count++] = new Student(name, marks);
                System.out.println("Student Added!");
            } 
            else if (choice == 2) {
                for (int i = 0; i < count; i++) {
                    students[i].display();
                }
            } 
            else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } 
            else {
                System.out.println("Invalid option");
            }
        }
    }
}
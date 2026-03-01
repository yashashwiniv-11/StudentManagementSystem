import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[10];
        int count = 0;

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.println("6. Exit");
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
            else if (choice==3){
                System.out.print("Enter name to search:");
                String searchName = sc.next();
                boolean found = false;

                for (Student s : students) {
                    if (s.getName().equalsIgnoreCase(searchName)) {
                        System.out.println("Found: " + s);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student Not Found!");
                }
                break;
            }
            else if (choice==4){
                System.out.print("Enter name to delete: ");
                String deleteName = sc.next();
                students.removeIf(s -> s.getName().equalsIgnoreCase(deleteName));
                System.out.println("Student deleted (if existed).");
                break;
            }
            else if (choice==5){
                System.out.print("Enter name to update: ");
                String updateName = sc.next();
                for (Student s : students) {
                    if (s.getName().equalsIgnoreCase(updateName)) {
                        System.out.print("Enter new marks: ");
                        int newMarks = sc.nextInt();
                        s.setMarks(newMarks);
                        System.out.println("Marks updated!");
                    }
                }
            break;
            }
            else if (choice == 6) {
                System.out.println("Exiting...");
                break;
            } 
            else {
                System.out.println("Invalid option");
            }
        }
    }
}
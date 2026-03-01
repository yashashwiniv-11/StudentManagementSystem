import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {

            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Marks");
            System.out.println("6. Show Topper");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            // ADD
            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter marks: ");
                int marks = sc.nextInt();

                students.add(new Student(name, marks));
                System.out.println("Student Added!");
            }

            // DISPLAY
            else if (choice == 2) {
                if (students.isEmpty()) {
                    System.out.println("No students available!");
                } else {
                    for (Student s : students) {
                        System.out.println(s + " | Grade: " + s.getGrade());
                    }
                }
            }

            // SEARCH
            else if (choice == 3) {
                System.out.print("Enter name to search: ");
                String searchName = sc.nextLine();
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
            }

            // DELETE
            else if (choice == 4) {
                System.out.print("Enter name to delete: ");
                String deleteName = sc.nextLine();
                boolean deleted = false;

                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getName().equalsIgnoreCase(deleteName)) {
                        students.remove(i);
                        deleted = true;
                        System.out.println("Student Deleted!");
                        break;
                    }
                }

                if (!deleted) {
                    System.out.println("Student Not Found!");
                }
            }

            // UPDATE
            else if (choice == 5) {
                System.out.print("Enter name to update: ");
                String updateName = sc.nextLine();
                boolean updated = false;

                for (Student s : students) {
                    if (s.getName().equalsIgnoreCase(updateName)) {
                        System.out.print("Enter new marks: ");
                        int newMarks = sc.nextInt();
                        s.setMarks(newMarks);
                        updated = true;
                        System.out.println("Marks Updated!");
                        break;
                    }
                }

                if (!updated) {
                    System.out.println("Student Not Found!");
                }
            }

            // TOPPER
            else if (choice == 6) {
                if (students.isEmpty()) {
                    System.out.println("No students available!");
                } else {
                    Student topper = students.get(0);

                    for (Student s : students) {
                        if (s.getMarks() > topper.getMarks()) {
                            topper = s;
                        }
                    }

                    System.out.println("Topper: " + topper + " | Grade: " + topper.getGrade());
                }
            }

            // EXIT
            else if (choice == 7) {
                System.out.println("Exiting...");
                break;
            }

            else {
                System.out.println("Invalid option!");
            }
        }

        sc.close();
    }
}
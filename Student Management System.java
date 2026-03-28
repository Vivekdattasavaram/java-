import java.util.*;
class Student {
    int studentId;
    String name;
    int age;
    String course;
    double marks;
    void inputDetails(Scanner sc) {
        System.out.print("Enter ID: ");
        studentId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Course: ");
        course = sc.nextLine();
        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
    }
    void displayDetails() {
        System.out.println(studentId + " " + name + " " + age + " " + course + " " + marks);
    }
}
public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        int choice;
        do {
            System.out.println("\n1.Add 2.Display 3.Search 4.Filter 5.Average 6.Sort 7.Update 8.Delete 9.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Student s = new Student();
                    s.inputDetails(sc);
                    list.add(s);
                    break;
                case 2:
                    for (Student st : list)
                        st.displayDetails();
                    break;
                case 3:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    boolean found = false;
                    for (Student st : list) {
                        if (st.studentId == id) {
                            st.displayDetails();
                            found = true;
                        }
                    }
                    if (!found) System.out.println("Not Found");
                    break;
                case 4:
                    System.out.print("Enter Marks: ");
                    double m = sc.nextDouble();
                    for (Student st : list) {
                        if (st.marks > m)
                            st.displayDetails();
                    }
                    break;
                case 5:
                    double sum = 0;
                    for (Student st : list)
                        sum += st.marks;

                    if (list.size() > 0)
                        System.out.println("Average = " + (sum / list.size()));
                    break;
                case 6:
                    list.sort((a, b) -> Double.compare(b.marks, a.marks));
                    System.out.println("Sorted by Marks");
                    break;
                case 7:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    for (Student st : list) {
                        if (st.studentId == uid) {
                            st.inputDetails(sc);
                        }
                    }
                    break;
                case 8:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    list.removeIf(st -> st.studentId == did);
                    break;
                case 9:
                    System.out.println("Exit");
                    break;
            }
        } while (choice != 9);
    }
}
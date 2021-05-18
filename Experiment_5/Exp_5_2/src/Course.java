import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    private final String courseName;
    private final ArrayList<String> students = new ArrayList<>();
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        this.students.add(student);
        numberOfStudents++;
    }

    public String[] getStudents() {
        String[] arr = new String[numberOfStudents];
        students.toArray(arr);
        return arr;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < getNumberOfStudents(); i++) {
            if (student.equals(this.students.get(i))) {
                this.students.remove(i);
                this.numberOfStudents--;
                break;
            }
        }
    }
}

class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Introduce to Java");

        course1.addStudent("Tim");
        course1.addStudent("Halliday");
        course1.addStudent("Steven");
        course1.addStudent("Trump");
        course1.addStudent("Obama");

        course2.addStudent("Clementine");
        course2.addStudent("Elizabeth");
        course2.addStudent("Maryland");
        course2.addStudent("Magritte");

        String[] array_1 = course1.getStudents();
        String[] array_2 = course2.getStudents();

        System.out.println("Number of students in " + course1.getCourseName() + ": " + course1.getNumberOfStudents());
        System.out.println("Students in " + course1.getCourseName() + ":");
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.println(array_1[i]);
        }

        System.out.println();

        System.out.println("Number of students in " + course2.getCourseName() + ": " + course2.getNumberOfStudents());
        System.out.println("Students in " + course2.getCourseName() + ":");
        for (int i = 0; i < course2.getNumberOfStudents(); i++) {
            System.out.println(array_2[i]);
        }

        System.out.println();

        //remove test
        Scanner input = new Scanner(System.in);
        String dropName;

        System.out.print("请输入"+ course1.getCourseName()+ "中要删除的学生姓名：");
        dropName = input.nextLine();
        course1.dropStudent(dropName);
        array_1 = course1.getStudents();
        System.out.println(dropName + " is removed!");
        System.out.println("---------------------------------------------------");
        System.out.println("Number of students in " + course1.getCourseName() + ": " + course1.getNumberOfStudents());
        System.out.println("Students in " + course1.getCourseName() + ":");
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.println(array_1[i]);
        }
        System.out.println("---------------------------------------------------");

        System.out.print("请输入"+ course2.getCourseName()+ "中要删除的学生姓名：");
        dropName = input.nextLine();
        course2.dropStudent(dropName);
        array_2 = course2.getStudents();
        System.out.println(dropName + " is removed!");
        System.out.println("Number of students in " + course2.getCourseName() + ": " + course2.getNumberOfStudents());
        System.out.println("Students in " + course2.getCourseName() + ":");
        for (int i = 0; i < course2.getNumberOfStudents(); i++) {
            System.out.println(array_2[i]);
        }
    }
}
public class Person {
    protected String name;
    protected String tel;

    Person(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Person类：" +
                "姓名为" + name + " " +
                ", 电话为" + tel + " ";
    }
}

class MyDate {
    private final int yy;
    private final int mm;
    private final int dd;

    MyDate(int yy, int mm, int dd) {
        this.yy = yy;
        this.mm = mm;
        this.dd = dd;
    }
}

class Student extends Person {
    public static final String FRESHMAN = "大一";
    public static final String SOPHOMORE = "大二";
    public static final String JUNIOR = "大三";
    public static final String SENIOR = "大四";

    private final String grade;

    Student(String name, String tel, String grade) {
        super(name, tel);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student类：" +
                "姓名为" + name + " " +
                ", 电话为" + tel + " " +
                ", 年级为" + grade;
    }

    public void displayObject() {
        System.out.println("to " + this.name + "：请按时交实验报告");
    }
}

class Employee extends Person {
    private final MyDate employTime;

    Employee(String name, String tel, int yy, int mm, int dd) {
        super(name, tel);
        this.employTime = new MyDate(yy, mm, dd);
    }

    @Override
    public String toString() {
        return "Employee类：" +
                "名字为" + name + " " +
                ", 电话为" + tel + " " +
                ", 受聘日期" + employTime;
    }

    public void displayObject() {
        System.out.println("to " + this.name + "：请按时上班");
    }
}

class Test {
    public static void m1(Person p) {
        System.out.println("p的姓名为：" + p.name);
    }

    public static void m2(Person p) {
        System.out.println(p.toString());
    }

    public static void m3(Person p) {
        if (p instanceof Student) {
            ((Student) p).displayObject();
        }
        if (p instanceof Employee) {
            ((Employee) p).displayObject();
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("张三", "+86 123-4567-8910");
        Person p2 = new Student("李四", "+25 17-8910", Student.FRESHMAN);
        Person p3 = new Employee("王五", "+11 167-89-10", 2021, 5, 18);
        m1(p1);
        m2(p2);
        m3(p3);
    }
}

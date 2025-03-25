
class Student {
    String name;
    int age;
    int roll;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.roll);
    }

    Student(Student s2) {   //copy constructs
        this.name = s2.name;
        this.age = s2.age;
        this.roll = s2.roll;
    }

    Student() {
    }
}

public class constructs {

    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name ="Chunchun";
        s1.age = 32;
        s1.roll = 11;

        Student s2 = new Student(s1);
        s2.printInfo();

    }
}
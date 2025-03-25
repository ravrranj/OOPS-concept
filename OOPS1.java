
class Student {

    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
 
// understanding constructors
 
Student() {   // non Parameterized constructors
    System.out.println("constructor called");

}
}

  public class OOPS1 {
        public static void main(String args[]) {
            Student s1 = new Student();  // Constructor is called
            s1.name = "shradha";
            s1.age = 22;

            s1.printInfo();
        }
    }

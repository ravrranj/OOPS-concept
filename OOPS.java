

class Pen {
    String color;
    String type;
    public void write(){
        System.out.println("writing something");   // function method (block of code that performs a task)
    }

    public void printColor(){
        System.out.println(this.color);
    }
}


public class OOPS {
    public static void main(String args[]) {
     Pen pen1 = new Pen();    // class
     pen1.color = "blue";
     pen1.type = "gel";

     Pen pen2 = new Pen();   //class
     pen2.color = "black";
     pen2.type = "ballpoint";

     pen2.write();            // call methods
     pen2.printColor();      // call methods
     pen1.write();
     pen1.printColor();  // call methods
    }
}
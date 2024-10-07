// pen class 
class Pen{
    String color;
    String type;

    // Methods
    public void write() {
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println(this.color);
        System.out.println(this.type);
    }

}

// student class
 class Student {
     String name;
     int age;
     int intake;
     
     public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.intake);
     }
    
}


public class OOPS{
    public static void main(String args[]) {
        // Object creation (pen1 and pen2 are instances of the Pen class)
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel-pen";

        Pen pen2 = new Pen();
        pen2.color="Black";
        pen2.type = "ballpoint";

        // Calling methods on objects
        pen1.printColor();
        pen2.printColor();
    }
}



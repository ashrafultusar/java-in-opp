
// students class 
class Students {
    String name;
    int age;
    int intake;

    Students() {
        // You can optionally initialize default values here if needed
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.intake);
    }

    // non parameterize constructor
    // Students(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    // }

    // copy constructor
    Students(Students s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

}

public class OOP {

    public static void main(String args[]) {
        Students s1 = new Students();
        s1.name = "Tusar";
        s1.age = 24;
        s1.intake = 50;
        s1.printInfo();
    }
}

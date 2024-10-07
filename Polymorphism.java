class StudentIn {
    String name;
    int age;

    // Overloaded methods
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class Polymorphism {  // Class name changed to Pascal case
    public static void main(String args[]) {
        StudentIn s1 = new StudentIn();
        s1.name = "Tusar";
        s1.age = 24;

        s1.printInfo(s1.name,s1.age);  // Calls printInfo(int age)
    }
}

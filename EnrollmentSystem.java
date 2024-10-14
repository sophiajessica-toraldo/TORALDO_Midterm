//SIMPLE UNIVERSITY ENROLLMENT SYSTEM

//Base class
class Person {
    //Fields
    String name;
    int age;

    //Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Method to print out the name and age of the person
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

//Subclass of Person
class Student extends Person {
    //Fields
    String studentID;
    String course;
    int units;
    final int feePerUnit = 1000; //Constant number per unit

    //Constructor
    Student(String name, int age, String studentID, String course, int units) {
        super(name, age);
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }

    //Method to calculate the total fee for the student
    double calculateFees() {
        return units * feePerUnit;
    }

    //Method to print the student's details
    @Override
    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Total Fee: " + calculateFees() + "\n");
    }
}

//Subclass of Person
class Instructor extends Person {
    //Fields
    String employeeID;
    String department;
    double salary;

    //Constructor
    Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    //Method to print the intructor's details
    @Override
    void displayInfo() {
        System.out.println("Instructor Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary + "\n");
    }
}

public class EnrollmentSystem {
    static void printDetails(Person p) {
        p.displayInfo();
    }

    public static void main(String[] args) {
        //Two student objects and two instructor objects
        Student Student1 = new Student("Sophia Jessica Toraldo", 20, "231002299", "Computer Engineering", 8);
        Student Student2 = new Student("Shane Mae Belmonte", 20, "231000318", "Computer Engineering", 9);
        Instructor Instructor1 = new Instructor("Engr. Tanya Carmela Jovillano", 22, "9824-0001", "College of Engineering and Architecture", 20000);
        Instructor Instructor2 = new Instructor("Engr. Sarahlyn Catimbang", 40, "6789-0002", "College of Engineering and Architecture", 50000);

        //Print information for each person (student and instructor)
        printDetails(Student1);
        printDetails(Student2);
        printDetails(Instructor1);
        printDetails(Instructor2);
    }
}
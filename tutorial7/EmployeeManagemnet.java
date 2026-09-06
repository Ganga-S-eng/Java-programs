package tutorial7;
import java.util.Scanner;

class Employee {

    String name, address;
    int age, mob;
    float sal;

    Employee(String name, String address, int age, int mob, float sal) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.mob = mob;
        this.sal = sal;
    }

    void print_Salary() {
        System.out.println("Salary: " + sal);
    }
}

class Officer extends Employee {

    String spl;

    Officer(String name, String address, int age, int mob, float sal, String spl) {
        super(name, address, age, mob, sal);
        this.spl = spl;
    }

    void print_Specialization() {
        System.out.println("Specialization: " + spl);
    }

    void display() {
        System.out.println("\n--- Officer Details ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Mobile: " + mob);
        print_Salary();
        print_Specialization();
    }
}

class Manager extends Employee {

    String dep;

    Manager(String name, String address, int age, int mob, float sal, String dep) {
        super(name, address, age, mob, sal);
        this.dep = dep;
    }

    void print_Dept() {
        System.out.println("Department: " + dep);
    }

    void display() {
        System.out.println("\n--- Manager Details ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Mobile: " + mob);
        print_Salary();
        print_Dept();
    }
}

public class EmployeeManagemnet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Officer's Name:");
        String officerName = sc.nextLine();

        System.out.println("Enter Address:");
        String officerAddress = sc.nextLine();

        System.out.println("Enter Age:");
        int officerAge = sc.nextInt();

        System.out.println("Enter Mobile:");
        int officerMob = sc.nextInt();

        System.out.println("Enter Salary:");
        float officerSal = sc.nextFloat();
        sc.nextLine();

        System.out.println("Enter Specialization:");
        String specialization = sc.nextLine();

        Officer officer = new Officer(
                officerName, officerAddress, officerAge,
                officerMob, officerSal, specialization
        );

        System.out.println("\nEnter Manager's Name:");
        String managerName = sc.nextLine();

        System.out.println("Enter Address:");
        String managerAddress = sc.nextLine();

        System.out.println("Enter Age:");
        int managerAge = sc.nextInt();

        System.out.println("Enter Mobile:");
        int managerMob = sc.nextInt();

        System.out.println("Enter Salary:");
        float managerSal = sc.nextFloat();
        sc.nextLine();

        System.out.println("Enter Department:");
        String department = sc.nextLine();

        Manager manager = new Manager(
                managerName, managerAddress, managerAge,
                managerMob, managerSal, department
        );

        officer.display();
        manager.display();

       
    }
}
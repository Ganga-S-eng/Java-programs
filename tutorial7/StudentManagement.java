package tutorial7;

import java.util.Scanner;

class Students {

    String name;
    int rollNo;
    String course;

    void setDetails(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

class StudentAccount extends Students {

    double collegeFee;

    void setCollegeFee(double collegeFee) {
        this.collegeFee = collegeFee;
    }

    void displayCollegeFee() {
        System.out.println("College Fee: " + collegeFee);
    }
}

class Hosteller extends StudentAccount {

    double hostelFee;
    double messFee;

    void setHostelDetails(double hostelFee, double messFee) {
        this.hostelFee = hostelFee;
        this.messFee = messFee;
    }

    void displayAllDetails() {

        System.out.println("\n--- HOSTELLER DETAILS ---");

        displayDetails();
        displayCollegeFee();

        System.out.println("Hostel Fee: " + hostelFee);
        System.out.println("Mess Fee: " + messFee);

        double totalFee = collegeFee + hostelFee + messFee;

        System.out.println("Total Fee: " + totalFee);
    }
}

class DayScholar extends StudentAccount {

    double busFee;

    void setBusFee(double busFee) {
        this.busFee = busFee;
    }

    void displayAllDetails() {

        System.out.println("\n--- DAY SCHOLAR DETAILS ---");

        displayDetails();
        displayCollegeFee();

        System.out.println("Bus Fee: " + busFee);

        double totalFee = collegeFee + busFee;

        System.out.println("Total Fee: " + totalFee);
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Hosteller's Name:");
        String hostellerName = sc.nextLine();

        System.out.println("Enter Roll No:");
        int hostellerRollNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Course:");
        String hostellerCourse = sc.nextLine();

        System.out.println("Enter College Fee:");
        double collegeFee1 = sc.nextDouble();

        System.out.println("Enter Hostel Fee:");
        double hostelFee = sc.nextDouble();

        System.out.println("Enter Mess Fee:");
        double messFee = sc.nextDouble();
        sc.nextLine();

        Hosteller hosteller = new Hosteller();

        hosteller.setDetails(
                hostellerName,
                hostellerRollNo,
                hostellerCourse
        );

        hosteller.setCollegeFee(collegeFee1);
        hosteller.setHostelDetails(hostelFee, messFee);


        System.out.println("\nEnter Day Scholar's Name:");
        String dayScholarName = sc.nextLine();

        System.out.println("Enter Roll No:");
        int dayScholarRollNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Course:");
        String dayScholarCourse = sc.nextLine();

        System.out.println("Enter College Fee:");
        double collegeFee2 = sc.nextDouble();

        System.out.println("Enter Bus Fee:");
        double busFee = sc.nextDouble();

        DayScholar dayScholar = new DayScholar();

        dayScholar.setDetails(
                dayScholarName,
                dayScholarRollNo,
                dayScholarCourse
        );

        dayScholar.setCollegeFee(collegeFee2);
        dayScholar.setBusFee(busFee);


       
        hosteller.displayAllDetails();
        dayScholar.displayAllDetails();

       
    }
}
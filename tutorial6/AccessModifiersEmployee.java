package tutorial6;

class Employee
{
    protected int salary;

    Employee(int salary)
    {
        this.salary = salary;
    }

    protected void showSalary()
    {
        System.out.println("Salary: " + salary);
    }
}

class Manager1 extends Employee
{
    Manager1(int salary)
    {
        super(salary);
    }

    void display()
    {
        System.out.println("Salary from variable: " + salary);

        showSalary();
    }
}

public class AccessModifiersEmployee
{
    public static void main(String[] args)
    {
        Manager1 m = new Manager1(50000);

        m.display();
    }
}
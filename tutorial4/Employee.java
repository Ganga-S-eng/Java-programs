package tutorial4;
import java.util.Scanner;
public class Employee {
	int empid;
	String empname;
	double salary;
Employee(int id,String name,double sal)	{
	empid=id;
	empname=name;
	salary=sal;	
}
void displayEmployee() {
	System.out.println("ID:"+empid);
	System.out.println("Name:"+empname);
	System.out.println("Salary:"+salary);
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee[] e=new Employee[2];
		for(int i=0;i<2;i++) {
			System.out.println("Enter details of employee"+(i+1));
			System.out.println("Enter id:");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name:");
			String name=sc.nextLine();
			System.out.println("Enter salary:");
			double sal=sc.nextDouble();
			e[i]=new Employee(id,name,sal);
		}
		for(Employee emp:e) {
			emp.displayEmployee();
		}

	}

}

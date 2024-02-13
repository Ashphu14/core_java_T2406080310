
public class Employee {
	
	private int empId;
	private String empName;
	private double empSalary;
	
	public Employee() {
		System.out.println("Default constructor Called");
		empId = 111;
		empName ="Ashish";
		empSalary = 210000.67d;
		
	}
	public String toString() {
		return "Employee = "+empId+" "+empName+" "+" "+empSalary;
	}
	public Employee(int i, String s,double d) {
		empId = i;
		empName =s;
		empSalary = d;}
	
	public static void main (String[]args) {
		Employee e = new Employee ();
		Employee el = new Employee(333,"Ashish",53467.88);
		System.out.println(el);
		System.out.println(e);
	}
	
	

}

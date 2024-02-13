
public class Student {
	private int rollNo;
	private String name;
	
	
	public Student() {
		this(30,"Ashish");
		System.out.println("default running");
	}
	 public Student(int rollno, String name) {
		 System.out.println("parameter called");
		 this.rollNo = rollno;
		 this.name = name;
		 
	 }
	
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	 
	 
	 public static void main (String args[]) {
		 Student s = new Student();
		 System.out.println(s);
	 }

}

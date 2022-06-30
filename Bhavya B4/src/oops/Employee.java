package oops;

public class Employee {
	private int empid;
	private String empname;
	private long salary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		System.out.println(e1.empid);
	
	}

}

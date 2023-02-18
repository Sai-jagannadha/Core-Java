package oops;

public class EmployeTest {
	public static void main(String[] args) {
	Employee emp=new Employee();
	emp.setEmpid(123);
	emp.setEmpname("RAMYA");
	emp.setSalary(75000);
	System.out.println(emp.getEmpid());
	System.out.println(emp.getEmpname());
	System.out.println(emp.getSalary());
	}

}

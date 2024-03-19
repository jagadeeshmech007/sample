package org.emp;

public class Employee {
private void empid() {
System.out.println("EMP1");
}
private void empname() {
System.out.println("emp name is Jagadeesh");
}
private void empdob() {
	System.out.println("emp dob is 1/1/2000");
}
private void phno() {
	System.out.println(" emp ph no is 123456789");

}
private void empmail() {
System.out.println("jaga12345@gmail.com");
}

public static void main(String[] args) {
	Employee a = new Employee();
			a.empname();
	        a.empdob();
	        a.empid();
	        a.empmail();
}}

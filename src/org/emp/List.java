package org.emp;

public class List {

	private int test(int empId) {
		int res=0;
	
		if (empId==10) {
			
			System.out.println("1");
			res=100;
		}
	
		if (empId==20) {
			
			System.out.println("2");
			res=200;
		}
		
	
		if (empId==30) {
			res=300;
			System.out.println("3");
		}
	

		if (empId==40) {
			res=400;
			System.out.println("4");
		}
		
		if (empId==50) {
			res=500;
			
		}
	
		return res;
	
	}


	public static void main(String[] args) {
		List l =new List ();
		int test = l.test(20);
		System.out.println(test);
		
	}

	
}

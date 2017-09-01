package com;

public class Main {
	public static void main(String[] args) {
		Employee e0= new Employee(0, "0", "0", "0", "0", "0", "0");
		Employee e1= new Employee(1, "0", "0", "0", "0", "0", "0");
		Employee e2= new Employee(2, "0", "0", "0", "0", "0", "0");
		Employee e3= new Employee(3, "0", "0", "0", "0", "0", "0");
		Employee e4= new Employee(4, "0", "0", "0", "0", "0", "0");
		Employee e5= new Employee(5, "0", "0", "0", "0", "0", "0");
		Employee e6= new Employee(6, "0", "0", "0", "0", "0", "0");
		Employee e7= new Employee(7, "0", "0", "0", "0", "0", "0");
		Employee e8= new Employee(8, "0", "0", "0", "0", "0", "0");
		Employee e9= new Employee(9, "0", "0", "0", "0", "0", "0");
		
		e1.setSupervisor(e0);
		e2.setSupervisor(e0);
		e3.setSupervisor(e1);
		e4.setSupervisor(e1);
		e5.setSupervisor(e2);
		e6.setSupervisor(e2);
		e7.setSupervisor(e3);
		e8.setSupervisor(e3);
		e9.setSupervisor(e4);
		
		e0.setStaff(new Employee[]{e1,e2});
		e1.setStaff(new Employee[]{e3,e4});
		e2.setStaff(new Employee[]{e5,e6});
		e3.setStaff(new Employee[]{e7,e8});
		e4.setStaff(new Employee[]{e9});
	
//test for staff[]		
		Employee eClone = (Employee) e0.clone();
		System.out.println("e0, " + e0.hashCode() + " e1:" + e0.getStaff()[0].hashCode() + "e2:" +  e0.getStaff()[1].hashCode());
		System.out.println("eClonee0, " + eClone.hashCode() + " eClonee1:" + eClone.getStaff()[0].hashCode() + "eClonee2:" +  eClone.getStaff()[1].hashCode());

//test for supervisor		
		Employee eCloneTest = (Employee) e7.clone();
		System.out.println("e7, " + e7.hashCode() + " e3:" + e3.getSupervisor().hashCode());
		System.out.println("eCloneTest, " + eCloneTest.hashCode() + " eClonee3:" + eCloneTest.getSupervisor().hashCode());
	}
}

package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Employee emp1 = new Employee();
		
		emp1.Name = "Sachin";
		emp1.EmployeeId = 242423;
		emp1.Salary = 1000;
		
		Employee emp2 = new Employee();
		
		emp2.Name = "Mahesh";
		emp2.EmployeeId = 543456;
		emp2.Salary = 1200; */
		
		//Employee emp1 = new Employee("Sachin",242423,1000);
		//Employee emp2 = new Employee("Mahesh",543456,1200);
		
		//emp1.PrintName();
		//emp2.PrintName();

		Employee emp3 = new Employee("Rahul",456785);
		
		Employee.ChangeCompanyName();
		
		
		Person per1 = new Person();
		ChildClass child1 = new ChildClass("Rahul",30,"Actor"); 
		
		child1.display();
		child1.print();
		
		MethodoverloadingExample obj= new MethodoverloadingExample();
		obj.sum(4, 5);
		obj.sum(4, 5,6);
		
		//BankExample bank = new Bankexample(); 
		
		ICICIbank bank1 = new ICICIbank();
		
		EncapsulationExample obj1 = new EncapsulationExample();
		
		obj1.setName("Deepika");
		System.out.println(obj1.getName());
		
		
	}

}







		
	




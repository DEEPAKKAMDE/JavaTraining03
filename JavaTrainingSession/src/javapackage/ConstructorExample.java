package javapackage;

// Constructor Overloading Program
public class ConstructorExample {
	int id;
	String name;
	float salary;

	// Default Constructor
	ConstructorExample() {
		System.out.println("This is Default Constructor");
	}

	// Parameterized Constructor
	ConstructorExample(int id) {
		this.id = id;
		System.out.println(id);
	}
	
	// Parameterized Constructor
	ConstructorExample(String name, float salary){
		this.name=name;
		this.salary=salary;
		System.out.println(name);
		System.out.println(salary);
		
	}

	public static void main(String[] args) {
		
		ConstructorExample obj=new ConstructorExample();
		ConstructorExample obj1 = new ConstructorExample(101);
		ConstructorExample obj2=new ConstructorExample("Vinay",90000.00f);

	}

}

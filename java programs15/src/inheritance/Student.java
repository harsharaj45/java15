package inheritance;

public class Student extends Department {
	public void printStd()
	{
		System.out.println("Student details");
		System.out.println("departmebt id "+deptId);
		
	}

	public static void main(String[] args) {
		Student obj=new Student();
		obj.printDept(1001);
		obj.printStd();
		//
		//Department obj1=new Department();
		//obj1.printDept();
	
	
	}

}

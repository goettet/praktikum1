package student;

public class App {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.name = "Tom";
		s1.age = 24;
		
		s2.name = "Susi";
		s2.age = 23;
		
		s3.name = "Max";
		s3.age = 25;
		
		System.out.println("Student's Name: "+ s1.getName());
		System.out.println("Student's Age: "+ s1.getAge());
		
		System.out.println("++++++++++++++");
		
		System.out.println("Student's Name: "+ s2.getName());
		System.out.println("Student's Age: "+ s2.getAge());

		System.out.println("++++++++++++++");
		
		System.out.println("Student's Name: "+ s3.getName());
		System.out.println("Student's Age: "+ s3.getAge());
	}

}





	
	
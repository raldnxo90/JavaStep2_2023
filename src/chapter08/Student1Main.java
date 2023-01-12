package chapter08;

public class Student1Main {

	public static void main(String[] args) {

		Student1 studentLee = new Student1();
		studentLee.setStudentName("이재민");
		studentLee.studentID = Student1.serialNum;
		System.out.println(studentLee.StudentName);
		//System.out.println(studentLee.getSerialNum());
		System.out.println(Student1.serialNum);
		
		Student1.serialNum++;
		
		System.out.println("------------------------");
		
		Student1 studentKim = new Student1();
		studentKim.setStudentName("김창우");
		studentKim.studentID = Student1.serialNum;
		System.out.println(studentKim.StudentName);
		//System.out.println(studentKim.getSerialNum());
		System.out.println(Student1.serialNum);
		
		Student1.serialNum++;
		
		System.out.println("------------------------");
		
		Student1 studentPark = new Student1();
		studentPark.setStudentName("박창훈");
		studentPark.studentID = Student1.serialNum;
		System.out.println(studentPark.StudentName);
		//System.out.println(studentKim.getSerialNum());
		System.out.println(Student1.serialNum);
	}

}

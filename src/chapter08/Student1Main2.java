package chapter08;

public class Student1Main2 {

	public static void main(String[] args) {

		Student2 studentLee = new Student2();
		studentLee.setStudentName("이재민");
		System.out.println("이름 :"+ studentLee.StudentName + "\nID : "+studentLee.studentID);
		
		
		System.out.println("------------------------");
		
		Student2 studentKim = new Student2();
		studentKim.setStudentName("김창우");
		studentKim.studentID = Student2.serialNum;
		System.out.println("이름 :"+ studentKim.StudentName + "\nID : "+studentKim.studentID);
		
		
		System.out.println("------------------------");
		
		Student2 studentPark = new Student2();
		studentPark.setStudentName("박창훈");
		studentPark.studentID = Student2.serialNum;
		System.out.println("이름 :"+ studentPark.StudentName + "\nID : "+studentPark.studentID);
	}

}

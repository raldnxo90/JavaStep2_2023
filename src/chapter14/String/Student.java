package chapter14.String;

public class Student {

	int studentId;
	String studentName;

	// 생성자
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {

		return studentId + ", " + studentName;

	}

	// 물리적 주소 - 실제 메모리의 주소
	@Override
	public int hashCode() {
		return studentId;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (studentId == std.studentId)// 비교판단
				return true;
			else
				return false;
		}

		return false;
	}

}

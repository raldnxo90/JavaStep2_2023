package chapter14.String;

public class EqualsTest {
	
	public static void main(String[] args) {
		
		//String 클래스는 이미 toString으로 재정의 되어있음
		String str1 = new String("test");
		String str2 = new String("test");
		
		Student studentLee = new Student(100, "이상우");
		Student studentLee2 = studentLee; //String str = "자바";
		Student studentSang = new Student(100, "이상우");
		
		//동일한 주소의 두 인스턴스 비교(물리적 논리적 값이 동일)
		System.out.println("----동일한 주소의 두 인스턴스 비교----");
		if(studentLee == studentLee2) {
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		}else 
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
	
		
		
		if(studentLee.equals(studentLee2)) {
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		}else 
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		System.out.println("--------------------------------------------");
		//물리적 주소는 다르지만 논리적 값이 동일
		System.out.println("----물리적 주소(==)는 다르지만 논리적 값이 동일(equals)----");
		if(studentLee == studentSang) {
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		}else 
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
		
		
		if(studentLee.equals(studentSang)) {
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		}else 
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		
		System.out.println("--------------------------------------------");
		System.out.println("-----데이터 값 출력------");
		System.out.println("studentLee의 hashCode : "+ studentLee.hashCode());
		System.out.println("studentLee의 hashCode : "+ studentSang.hashCode());
		System.out.println("-----데이터 값은 같으나 hash 값이 다르므로 재정의가 필요------");
		System.out.println("studentLee의 실제 주소 값 : "+ System.identityHashCode(studentLee));
		System.out.println("studentLee의 실제 주소 값 : "+ System.identityHashCode(studentSang));
		
		//HashCode가 재정의 되어 있음
		System.out.println("------String 클래스의 실제 값-------");
		System.out.println("str1의 hashcode : "+str1.hashCode());
		System.out.println("str2의 hashcode : "+str2.hashCode());
	}

}

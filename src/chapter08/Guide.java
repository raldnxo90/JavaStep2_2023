package chapter08;

public class Guide {

	Guest[] guest;

	// 생성자 초기화
	public Guide(int n) {
		guest = new Guest[n];// 관광객 수만큼 메모리 확보

		// 객체 생성
		for (int i = 0; i < guest.length; i++) {
			guest[i] = new Guest();
		}
	}

	public void TourlistList(String name, String gender) {
		for (int i = 0; i < guest.length; i++) {
			guest[i].setGender(gender);
			guest[i].setName(name);
		}

	}
	
	public void Tourlist(int i) {
		for(i=0;i<guest.length;i++) {
		System.out.println(guest[i].getName());
		System.out.println(guest[i].getGender());
		
		
	}

}
}
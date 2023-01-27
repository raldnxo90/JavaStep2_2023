package chapter09;

public class CustomerMain {

	public static void main(String[] args) {
		//VIP고객
		System.out.println("--------------VIP----------------");
		int price = 10000;
		VipCustomer vipcs = new VipCustomer(1004, "홍길동", 900);
		
		int vipprice = vipcs.calcprice(price);
		System.out.println(vipcs.getCustomerName()+"님이 "+vipprice+"원을 지불 완료하였습니다.");
		System.out.println(vipcs.showCustomer());

		System.out.println("--------------일반고객----------------");
		price = 10000;
		
		Customer cs = new Customer();
		int csprice = cs.calcprice(price);
		cs.setCustomerName("홍길은");
		System.out.println(cs.getCustomerName()+"님이 "+csprice+"원을 지불 완료하였습니다.");
		System.out.println(cs.showCustomer());
		
		
	}


}

package chapter10;

import chapter09.Customer;
import chapter09.VipCustomer;

public class OverridingTest2 {

	public static void main(String[] args) {
		
		Customer vc = new VipCustomer(10003, "김치", 20000); //부모 = 자식 (자동형변환)

		System.out.println(vc.showCustomer());
	}

}

			
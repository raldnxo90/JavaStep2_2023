package chapter12.MultiInterface;

public class CustomerMain {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		System.out.println("---------Buy----------");
		Buy buyer = customer;
		buyer.order();
		buyer.buy();
		
		System.out.println("---------Sell----------");
		Sell seller = customer;
		seller.sellorder();
		seller.sell();
		
		//seller 부모 / Customer 자식
		if(seller instanceof Customer) {
			Customer customer2 = (Customer)seller;
			System.out.println("--Down Chasting--");
			customer2.buy();
			customer2.sell();
			customer2.sellorder();
			System.out.println("---------------------");
		}
		
		customer.order();
	}

}

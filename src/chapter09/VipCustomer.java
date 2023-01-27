package chapter09;

public class VipCustomer extends Customer {
	
	private int agentID;
	double saleRatio;
	
	public VipCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		//this.customerID=customerID;
		//this.customerName=customerName;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		this.agentID = agentID;//전문 상담원
		this.saleRatio=0.1;
	}
	//포인트 적립 & 물건가격
	@Override
	public int calcprice(int price) {
		bonusPoint=(price-(int)(price*saleRatio))*bonusRatio;
		return price-(int)(price*saleRatio); //물건가격
	}

	@Override
	public String showCustomer() {
		
		return super.showCustomer()+"\n전문상담원은 "+agentID+"입니다.";
	}

	public int getAgentID() {
		return agentID;
	}
	
	
	

}
package chapter09;

import javax.swing.JOptionPane;

public class DmbcellPhoneMain {

	public static void main(String[] args) {
		
		DmbcellPhone dmbCellPhone = new DmbcellPhone("Java폰","검정" , 10);
		
		//CellPhone으로부터 상속받은 필드
		//DmbCellPhone의 필드
		//Cellphone의 메소드를 사용하여 전화통화 구현
		//DmbCellphone의 메소드를 사용하여 채널을 바꾸기
		
		System.out.println("CellPhone으로부터 상속받은 필드 : 모델("+dmbCellPhone.model+")| 색상("+dmbCellPhone.color+")");
		System.out.println("DmbCellPhone의 필드"+ dmbCellPhone.channel);
		System.out.println("-----------------------");
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여");
			
		dmbCellPhone.receiveVoice("어");
		dmbCellPhone.powerOff();
	
		dmbCellPhone.powerOff();
		System.out.println("-----------------------");
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(Integer.parseInt(JOptionPane.showInputDialog("변경할 채널을 입력하시오")));
		dmbCellPhone.turnOffDmb();
		
		
	}

}

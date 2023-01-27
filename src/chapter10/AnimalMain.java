package chapter10;

public class AnimalMain {

	public static void main(String[] args) {
		
		System.out.println("----곰----");
		Bear bear = new Bear();
		System.out.println("곰의 눈은 "+bear.getEye()+"개이고 곰의 다리는 "+bear.getLeg()+"를 가지고 있다");
		System.out.println("곰은 " + bear.woong+"을 가지고 있다");
		
		System.out.println("----사자----");
		Lion lion = new Lion();
		System.out.println("사자의의 눈은 "+lion.getEye()+"개이고 사자의 다리는 "+lion.getLeg()+"를 가지고 있다");
		System.out.println("사자는 " + lion.galgi+"를 가지고 있다");
		
		
		System.out.println("----거미----");
		Spider spider = new Spider();
		System.out.println("거미의 눈은 "+spider.getEye()+"개이고 거미의 다리는 "+spider.getLeg()+"를 가지고 있다");
		System.out.println("거미는 " + spider.web+"을 가지고 있다");
		
		
	}

}

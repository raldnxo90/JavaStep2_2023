package chapter16.generic2;

public class Water extends Material {

	@Override
	public String toString() {
		return "재료는 물입니다.";
	}

	@Override
	public void doprinting() {
		System.out.println("물 넣으면 망합니다.");
	}

}

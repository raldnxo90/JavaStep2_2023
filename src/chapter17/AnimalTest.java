package chapter17;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람은 두발로 걷습니다.");
	}// 오버라이딩

	public void readBook() {
		System.out.println("사람은 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이는 네발로 걷습니다.");
	}// 오버라이딩

	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}// 오버라이딩

	public void flying() {
		System.out.println("독수리는 날개를 펴고 날아 다닙니다");
	}
}

public class AnimalTest {

	ArrayList<Animal> aniList = new ArrayList<Animal>();

	// addAnimal -> 업캐스팅
	// testCasting -> 다운캐스팅

	public void addAnimal() {
		aniList.add(new Human());// Animal 형으로 자동형변환
		aniList.add(new Tiger());
		aniList.add(new Eagle());

		for (Animal a : aniList) {
			a.move();
		}
	}

	public void testCasting() {
		for (int i = 0; i < aniList.size(); i++) {
			Animal ani = aniList.get(i);//부모 ArrayList의 객체를 ani 객체에 저장

			if (ani instanceof Human) {
				Human h = (Human) ani;
				h.readBook();
			} else if (ani instanceof Tiger) {
				Tiger t = (Tiger) ani;
				t.hunting();
			} else if (ani instanceof Eagle) {
				Eagle e = (Eagle) ani;
				e.flying();
			} else {
				System.out.println("지원하지 않는 동물입니다.");
			}
		}
	}

	public static void main(String[] args) {

		AnimalTest ani = new AnimalTest();
		System.out.println();
		System.out.println("---- 업캐스팅 ----");
		ani.addAnimal(); // Shape sc = new Circle
		System.out.println("---- 다운캐스팅 ----");
		ani.testCasting(); // Shape sc = new Circle

	}

}

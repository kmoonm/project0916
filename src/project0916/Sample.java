package project0916;

// 인터페이스는 껍데기 메소드만 가질수 있다.
// 변수, 접근제어자를 가지는것이 불가능
abstract class Predator extends Animal {
	abstract String getBarking();
	
	void printBark() {
		System.out.printf("내 울음소리는 %s\n", getBarking());
	}
	
	// 추상 클래스의 상수 선언은 static이 필요하다
	static int leg_count = 4;
	
	static int Speed() {
		return leg_count * 30;
	}
}

class Animal {
	String bark;
	
	void setBark(String bark) {
		this.bark=bark;
	}
}

class Tiger extends Predator {
	public String getBarking() {
		return "호랑호랑";
	}
}

class Lion extends Predator {
	public String getBarking() {
		return "사자사자";
	}
}

class Zookeeper {
	public void barking(Predator predator) {
		System.out.println("bark" + predator.getBarking());
	}
}

public class Sample {
	
	public static void main(String[] args) {
		Zookeeper zookeeper = new Zookeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zookeeper.barking(tiger);
		zookeeper.barking(lion);
		tiger.printBark();
		lion.printBark();
		}

	}


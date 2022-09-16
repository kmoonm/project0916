package project0916;
// 인터페이스 연습
interface carCheck {
	int upSpeed(int value);
	int downSpeed(int value);
	void checkFuel(int value); 
}

// 상속 연습
class Car implements carCheck {
	int speed;
	int fuel;
	String color;
	String carNumber;
	String chairSeat;
	
	public int upSpeed(int value) {
		if(speed > 200) {
			System.out.println("속도를 올릴수 없습니다.");
		} else {
			System.out.println("속도를 올립니다.");			
		}
		return speed;
	}
	
	public int downSpeed(int value) {
		if(speed > 200) {
			System.out.println("속도를 도로에 맞게 내립니다.");
			this.speed -= value;
		} else {
			System.out.println("속도를 올립니다.");
		}
		return speed;
	}
	
	
	public void checkFuel(int value) {
		if(this.fuel == 100) {
			System.out.println("연료가 충분합니다.");
		} else if (this.fuel > 70 && this.fuel < 100){
			System.out.println("연료에 주의가 필요합니다.");
		} else if (this.fuel > 30 && this.fuel < 69) {
			System.out.println("가까운 주유소에 가서 연료를 채워주십시오");
		} else {
			System.out.println("연료가 부족합니다.");
		} 
	}
	
}

public class practice07 {

	public static void main(String[] args) {
		Car ramborghini = new Car();
		ramborghini.carNumber = "20머 4897";
		ramborghini.speed = 100;
		ramborghini.fuel = 65;
		ramborghini.checkFuel(ramborghini.fuel);
		ramborghini.upSpeed(ramborghini.speed);
		

	}

}

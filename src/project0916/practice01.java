package project0916;

class UpgradeCalculator extends Calculator {

	void minus(int value) {
		this.value -= value;
	}
}

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
}

public class practice01 {

	public static void main(String[] args) {
		UpgradeCalculator cal = new UpgradeCalculator();
        cal.add(10);
        cal.minus(3);
        System.out.println(cal.getValue());
	}

}

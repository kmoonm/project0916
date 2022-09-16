package project0916;

class maxLimitCalculator extends Calculator1 {
	
	int getValue() {
		if(this.value > 100) {
			value = 100;	
		}
		return value;
	}
}

class Calculator1 {
    int value;

    Calculator1() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
}

public class practice02 {

	public static void main(String[] args) {
		maxLimitCalculator max = new maxLimitCalculator();
		max.add(50);
		max.add(60);
		System.out.println(max.getValue());
	}
}

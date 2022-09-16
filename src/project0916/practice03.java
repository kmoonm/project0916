package project0916;

class Calculator2 {
	double value;
	
	Calculator2() {
		this.value = 0;
	}
	
	void add(double val) {
		value += val;
	}
	
    double getValue() {
        return value;
    }
    
    public boolean isOdd() {
    	if(this.value == (int)value) {
    		System.out.println("정수 입니다.");
    	} else {
    		System.out.println("정수가 아닙니다");
    	}
    	return false;
    }
}

public class practice03 {

	public static void main(String[] args) {
		Calculator2 cal2 = new Calculator2();
		cal2.add(50);
		cal2.isOdd();

	}

}

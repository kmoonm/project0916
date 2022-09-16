package project0916;

class Calculator4 {
    Integer value= 0;
    
    void add(int val) {  	
        this.value += val;
    }

    public Integer getValue() {
        return this.value;
    }
}

public class practice05 {

	public static void main(String[] args) {
		Calculator4 cal = new Calculator4();
        cal.add(3);  // 
        System.out.println(cal.getValue());
	}

}

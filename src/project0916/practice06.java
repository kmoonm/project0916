package project0916;

interface Jewel {
	int ValueOfJewel();
}

class Gold implements Jewel {
	public int ValueOfJewel() {
		return 100;
	}
}

class Silver implements Jewel {
	public int ValueOfJewel() {
		return 80;
	}
}

class Bronze implements Jewel {
	public int ValueOfJewel() {
		return 60;
	}
}

class MineralCalculator {
    int value = 0;
    
    public void add(Jewel jewel) {
    	this.value += jewel.ValueOfJewel();
    }

    public int getValue() {
        return this.value;
    }
}

public class practice06 {

	public static void main(String[] args) {
		MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.getValue());
	}

}

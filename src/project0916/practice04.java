package project0916;

import java.util.ArrayList;
import java.util.Arrays;

class Calculator3 {
    int value;

    Calculator3() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
    
    void avg(int[] data) {
    	int avg_result = 0;
    	for(int i=0; i<data.length; i++) {
    		avg_result += data[i];
    	}
    	this.value=avg_result / data.length;
    	System.out.println("평균은" + value + "입니다.");
    }
    
}

public class practice04 {

	public static void main(String[] args) {
		int[] abcd = {1,3,5,7,9,11};
		Calculator3 cal3 = new Calculator3();
		cal3.avg(abcd);
		
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> b = new ArrayList<>(a);
        a.add(4);
        b.add(6);
        System.out.println(b.size());      
		}
	}

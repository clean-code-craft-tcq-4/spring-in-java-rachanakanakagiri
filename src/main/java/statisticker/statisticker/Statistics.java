//package statisticker;

import java.util.List;

public class Statistics 
{
	
	public class Stats {

		public Object average;
		public Stats s;
	}

	public static void main(String[] args) {
		System.out.println("Hi");
	}
    public static Stats getStatistics(List<float> numbers) {
        //implement the computation of statistics here
    	//System.out.println("Hi");
		if(numbers.length==0) {
			return NaN;
		}
    	Stats s = new Stats();
		float s.max = -99999f;
		float s.min = 99999f;
		float sum = 0f;
		for(float num : numbers){
			if(num < min){
				s.min = num;
			}
			if(num > max){
				s.max = num;
			}
			sum+ = num;
		}
		s.average = sum/numbers.length;
		
		return s;
    }
}


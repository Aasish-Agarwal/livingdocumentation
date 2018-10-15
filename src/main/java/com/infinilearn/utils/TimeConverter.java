package com.infinilearn.utils;

public class TimeConverter {

	private String numberMap[] = {
			"zero",
			"one",
			"two",
			"three",
			"four",
			"five",
			"six",
			"seven",
			"eight",
			"nine",
			"ten",
			"eleven",
			"twelve",
			"thirteen",
			"fourteen",
			"fifteen",
			"sixteen",
			"seventeen",
			"eighteen",
			"nineteen",
			"twenty",
			"twenty-one",
			"twenty-two",
			"twenty-three",
			"twenty-four",
			"twenty-five",
			"twenty-six",
			"twenty-seven",
			"twenty-eight",
			"twenty-nine",
			"thirty",
			"thirty-one",
			"thirty-two",
			"thirty-three",
			"thirty-four",
			"thirty-five",
			"thirty-six",
			"thirty-seven",
			"thirty-eight",
			"thirty-nine",
			"forty",
			"forty-one",
			"forty-two",
			"forty-three",
			"forty-four",
			"forty-five",
			"forty-six",
			"forty-seven",
			"forty-eight",
			"forty-nine",
			"fifty",
			"fifty-one",
			"fifty-two",
			"fifty-three",
			"fifty-four",
			"fifty-five",
			"fifty-six",
			"fifty-seven",
			"fifty-eight",
			"fifty-nine",
			"sixty"
	};

	public String GetTimeInText(int hour, int minute) {
		// TODO Auto-generated method stub
		String retval = "";
		if( minute == 0 ) {
			retval = numberMap[hour] + " o clock";
		}
		
		if( minute == 15 ) {
			retval = "quarter past " + numberMap[hour];
		}
		if( minute == 45 ) {
			
			retval = "quarter to " + numberMap[hour+1];
		}
		return retval;
	}

}

package com.infinilearn.lottery;

public class WinningNumberCalculator {
	public int calcWinningAmount(int seed) {
		int winningamount = seed * seed ;
		if( seed < 5 ) 
		{
			winningamount = (seed * 3 - 7) > 0 ? (seed * 3 - 7) : 10;
		} 
		return winningamount;
	}
}

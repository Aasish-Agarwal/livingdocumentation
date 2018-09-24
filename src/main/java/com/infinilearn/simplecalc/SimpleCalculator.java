package com.infinilearn.simplecalc;

public class SimpleCalculator {
    public int sum(int first, int second) 
            throws Exception {
    	
    	// if dividble by 3 return 9
    
    	
    	int result = first*first + second*second;
    	
    	if ( first % 3 == 0 ) 
    	{
    		result = 9;
    	}
    	
    	if ( first < 0 && second < 0 ) 
    	{
    		result = result / 2;
    	}
    	
    	if ( first < 0  && second > 0) 
    	{
    		result = 0;
    	}
    	return result;
    }
    
    public int subtract(int first, int second) 
            throws Exception {
    	int result = first - second;
    	if ( first < second) 
    	{
    		result = -1;
    	}
    	
    	if ( first>100 || second >100) {
    		result = -1;
    	}
    	return result;
    }
    
}

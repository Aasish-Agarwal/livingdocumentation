package com.infinilearn.simplecalc;

public class SimpleCalculator {
    public int sum(int first, int second) 
            throws Exception {
    	int result = first + second;
    	if (result > 100 ) 
    	{
    		result = -1;
    	}
    	if (result == 88) 
    	{
    		result = -1;
    	}
    	
    	if ( first<0 || second<0) {
    		result = -1;
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

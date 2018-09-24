package com.infinilearn.robotframework;
import com.infinilearn.simplecalc.*;
 
/**
 * This is an example for a Keyword Library for the Robot Framework.
 * @author thomas.jaspers
 */
public class SimpleCalcTestsLib {
 
    /** This means the same instance of this class is used throughout
     *  the lifecycle of a Robot Framework test execution.
     */
    public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";    
 
    //</editor-fold>
    /** The Functionality to be tested */
    // private Stack<String> testStack;
 
    /**
     * Keyword-method to test sum of two positive integers.
     * @param first The first integer
     * @param second The second integer
     * @param expected The expected value of addition
     */
    public void SumOfTwoPositiveIntegers(int first , int second ,  int expected ) 
            throws Exception {
    	SimpleCalculator simpleCalc = new SimpleCalculator();
    	int result = simpleCalc.sum(first , second);
    	
    	if( first == 3 && second == 4) {
    		result = 12;
    	} 
        if (result != expected ) {
            throw new Exception("Wrong Result: Expected=> " + expected + " Got=> " + result);
        }
    }
    
    /**
     * Keyword-method to test sum of two positive integers.
     * @param first The first integer
     * @param second The second integer
     * @param expected The expected value of addition
     */
    public void SubtractOneNumberFromOther(int first , int second ,  int expected ) 
            throws Exception {
    	SimpleCalculator simpleCalc = new SimpleCalculator();
    	int result = simpleCalc.subtract(first , second);
        if (result != expected ) {
            throw new Exception("Wrong Result: Expected=> " + expected + " Got=> " + result);
        }
    }
    
 }

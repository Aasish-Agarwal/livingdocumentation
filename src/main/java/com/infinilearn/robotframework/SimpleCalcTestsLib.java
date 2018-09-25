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
 
    /**
     * Keyword-method to test sum of two positive integers.
     * @param first The first integer
     * @param second The second integer
     * @param expected The expected value of addition
     */
    public void SumAndValidateTwoIntegers(int first , int second ,  int expected ) 
            throws Exception {
    	SimpleCalculator calc = new SimpleCalculator();
    	int result = calc.sum(first , second);
    	
        if (result != expected ) {
            throw new Exception("Wrong Result: Expected=> " + expected + " Got=> " + result);
        }
    }
 }

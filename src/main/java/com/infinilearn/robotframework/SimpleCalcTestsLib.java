package com.infinilearn.robotframework;
import com.infinilearn.lottery.*;
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
     * Blank Keyword From Demo Purposes.
     * @param first parameter
     * @param first parameter
     */
    public void GetWinningNumber(int seed, int expectedResult ) 
            throws Exception {
    	WinningNumberCalculator calc = new WinningNumberCalculator();
    	int result = calc.calcWinningAmount(seed);
    	if ( result != expectedResult ) {
    		throw new Exception ("Expected: "+ expectedResult + ", Actual: " + result);
    	}
    }
 }

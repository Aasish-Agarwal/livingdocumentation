package com.infinilearn.rfkeywords;
import com.infinilearn.utils.*;


public class TimeConversionLib {
    /** This means the same instance of this class is used throughout
     *  the lifecycle of a Robot Framework test execution.
     */
    public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";    
 
    /** The Functionality to be tested */
    public String GetTimeInText (int hour, int minute) 
    		throws Exception {
    	TimeConverter tc = new TimeConverter();
    	return tc.GetTimeInText(hour,minute);
    }
}


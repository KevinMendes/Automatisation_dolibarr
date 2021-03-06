package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile global : login for superuser
Profile prod : login for superuser</p>
     */
    public static Object Login
     
    /**
     * <p>Profile global : Password for global user
Profile prod : Password for global user</p>
     */
    public static Object Password
     
    /**
     * <p></p>
     */
    public static Object URL
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            Login = selectedVariables['Login']
            Password = selectedVariables['Password']
            URL = selectedVariables['URL']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}

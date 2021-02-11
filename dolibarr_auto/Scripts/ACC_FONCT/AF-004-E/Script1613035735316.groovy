import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Special/Connexion'), [('Login') : 'admin', ('Password') : 'pass', ('URL') : 'http://localhost:3000/dolibarr\n'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('AF-004-N/Page_Configuration/a_Configuration'), 1)

WebUI.click(findTestObject('AF-004-N/Page_Configuration/a_Configuration'))

WebUI.verifyElementPresent(findTestObject('AF-004-N/Page_Configuration/a_SocitOrganisation'), 1)

WebUI.click(findTestObject('AF-004-N/Page_Configuration/a_SocitOrganisation'))

WebUI.click(findTestObject('AF-004-N/Page_Configuration/input_NomEnseigneRaison sociale_nom'))

WebUI.click(findTestObject('AF-004-N/Page_Configuration/tr_NomEnseigneRaison sociale'))

WebUI.setText(findTestObject('AF-004-N/Page_Configuration/input_NomEnseigneRaison sociale_nom'), "")

WebUI.verifyElementPresent(findTestObject('AF-004-N/Page_Configuration/span_Etats-Unis (US)'), 1)

WebUI.click(findTestObject('AF-004-N/Page_Configuration/span_Etats-Unis (US)'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('AF-004-N/Page_Configuration/span_(FR)'), 1)

WebUI.click(findTestObject('AF-004-N/Page_Configuration/span_(FR)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('AF-004-N/Page_Configuration/span_France (FR)'), 1)

WebUI.verifyElementPresent(findTestObject('AF-004-N/Page_Configuration/input_Description_save'), 1)

WebUI.scrollToElement(findTestObject('AF-004-N/Page_Configuration/input_Description_save'), 1)

WebUI.click(findTestObject('AF-004-N/Page_Configuration/input_Description_save'))

WebUI.comment('présence d\'un triangle jaune')

WebUI.verifyElementPresent(findTestObject('AF-004-N/Page_Configuration/span_SocitOrganisation_fas fa-exclamation-triangle pictowarning pictowarning'), 
    1)


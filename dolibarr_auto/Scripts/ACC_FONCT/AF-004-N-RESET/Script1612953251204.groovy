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

WebUI.verifyElementPresent(findTestObject('AF-004-N/Page_Accueil - Dolibarr 1300/span_Accueil'), 1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('AF-004-N/Page_Accueil - Dolibarr 1300/span_Accueil'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('AF-004-N/Page_Configuration/a_Configuration'), 1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('AF-004-N/Page_Configuration/a_Configuration'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('AF-004-N/Page_Configuration/a_SocitOrganisation'), 1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('AF-004-N/Page_Configuration/a_SocitOrganisation'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('AF-004-N/Page_Configuration/input_NomEnseigneRaison sociale_nom'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('AF-004-N/Page_Configuration/tr_NomEnseigneRaison sociale'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('AF-004-N/Page_Configuration/input_NomEnseigneRaison sociale_nom'), 'Renseignez votre société', 
    FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('AF-004-N/Page_Configuration/span_France (FR)'), 1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('AF-004-N/Page_Configuration/span_France (FR)'), FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('AF-004-N/Page_Configuration/span_(US)'), 1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('AF-004-N/Page_Configuration/span_(US)'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('AF-004-N/Page_Configuration/span_Etats-Unis (US)'), 1, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('AF-004-N/Page_Configuration/input_Description_save'), 1, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('AF-004-N/Page_Configuration/input_Description_save'), 1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('AF-004-N/Page_Configuration/input_Description_save'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('AF-004-N/Page_Configuration/input_NomEnseigneRaison sociale_nom'), 1, FailureHandling.OPTIONAL)


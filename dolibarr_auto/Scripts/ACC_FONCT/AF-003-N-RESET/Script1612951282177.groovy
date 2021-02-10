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

WebUI.callTestCase(findTestCase('Special/Connexion'), [('Login') : 'admin', ('Password') : 'pass'], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('AF-003-N/Page_Configuration/a_Configuration'), 0)

WebUI.click(findTestObject('AF-003-N/Page_Configuration/a_Configuration'))

WebUI.verifyElementPresent(findTestObject('AF-003-N/Page_Configuration/a_ModulesApplications'), 0)

WebUI.click(findTestObject('AF-003-N/Page_Configuration/a_ModulesApplications'))

WebUI.verifyElementPresent(findTestObject('AF-003-N/Page_Configuration/span_Gestion des tiers (TIERS)'), 0)

WebUI.click(findTestObject('AF-003-N/Page_Configuration/span_Gestion des tiers (TIERS)'))

WebUI.verifyElementPresent(findTestObject('AF-003-N/Page_Configuration/span_Gestion des tiers (FACTURATION)'), 0)

WebUI.click(findTestObject('AF-003-N/Page_Configuration/span_Gestion des tiers (FACTURATION)'))

WebUI.verifyElementPresent(findTestObject('AF-003-N/Page_Configuration/span_Gestion des tiers (SERVICE)'), 0)

WebUI.click(findTestObject('AF-003-N/Page_Configuration/span_Gestion des tiers (SERVICE)'))

WebUI.verifyElementPresent(findTestObject('AF-003-N/Page_Configuration/span_Gestion des tiers (PROJET)'), 0)

WebUI.click(findTestObject('AF-003-N/Page_Configuration/span_Gestion des tiers (PROJET)'))

WebUI.closeBrowser()


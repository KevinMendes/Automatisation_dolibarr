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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://testing.bzh/dolibarr_Recette/')

WebUI.verifyElementPresent(findTestObject('Connexion/Page_Identifiant  1300/img_Dolibarr 1300_img_logo'), 0)

WebUI.setText(findTestObject('Connexion/Page_Identifiant  1300/input_Dolibarr 1300_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Connexion/Page_Identifiant  1300/input_Dolibarr 1300_password'), 'NOZHw6sL/1I=')

WebUI.verifyElementPresent(findTestObject('Connexion/Page_Identifiant  1300/input_Dolibarr 1300_button'), 0)

WebUI.click(findTestObject('Connexion/Page_Identifiant  1300/input_Dolibarr 1300_button'))

WebUI.verifyElementPresent(findTestObject('Connexion/Page_Configuration/a_Mon tableau de bord'), 0)

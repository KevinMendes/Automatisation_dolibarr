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

WebUI.verifyElementPresent(findTestObject('Object Repository/T-001-A2-HELENE/Page_Accueil - Dolibarr 1300/span_Tiers'), 
    0)

WebUI.click(findTestObject('Object Repository/T-001-A2-HELENE/Page_Accueil - Dolibarr 1300/span_Tiers'))

WebUI.verifyElementPresent(findTestObject('Object Repository/T-001-A2-HELENE/Page_Tiers/a_Liste'), 0)

WebUI.click(findTestObject('Object Repository/T-001-A2-HELENE/Page_Tiers/a_Liste'))

WebUI.verifyElementPresent(findTestObject('Object Repository/T-001-A2-HELENE/Page_Tiers/span_April_fas fa-building paddingright cla_fed5f6'), 
    0)

WebUI.click(findTestObject('Object Repository/T-001-A2-HELENE/Page_Tiers/span_April_fas fa-building paddingright cla_fed5f6'))

WebUI.verifyElementPresent(findTestObject('Object Repository/T-001-A2-HELENE/Page_April - Fiche/a_Modifier'), 0)

WebUI.click(findTestObject('Object Repository/T-001-A2-HELENE/Page_April - Fiche/a_Modifier'))

WebUI.verifyElementPresent(findTestObject('Object Repository/T-001-A2-HELENE/Page_April - Fiche/input_Nom du tiers_name'), 
    0)

WebUI.setText(findTestObject('Object Repository/T-001-A2-HELENE/Page_April - Fiche/input_Nom du tiers_name'), 'Aprol')

WebUI.verifyElementPresent(findTestObject('Object Repository/T-001-A2-HELENE/Page_April - Fiche/input_Affecter un commercial_save'), 
    0)

WebUI.click(findTestObject('Object Repository/T-001-A2-HELENE/Page_April - Fiche/input_Affecter un commercial_save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/T-001-A2-HELENE/Page_Aprol - Fiche/div_Aprol Etats-Unis'), 
    0)


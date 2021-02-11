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

WebUI.click(findTestObject('Object Repository/T-001-N/Page_Accueil - Dolibarr 1300/span_Tiers'))

WebUI.verifyElementPresent(findTestObject('T-001-N/Page_Tiers/div_Tiers  Contacts'), 5)

WebUI.click(findTestObject('Object Repository/T-001-N/Page_Tiers/a_Nouveau tiers'))

WebUI.verifyElementPresent(findTestObject('T-001-N/Page_Tiers/div_Nouveau tiers (prospect client fournisseur)'), 5)

WebUI.verifyElementPresent(findTestObject('T-001-N/Page_Tiers/input_Logo_create'), 5)

'nom du tiers'
WebUI.setText(findTestObject('Object Repository/T-001-N/Page_Tiers/input_Nom du tiers_name'), nomTiers)

WebUI.click(findTestObject('T-001-N/Page_Tiers/span_'))

WebUI.setText(findTestObject('T-001-N/Page_Tiers/input_Logo_select2-search__field'), clientProspect)

WebUI.sendKeys(findTestObject('T-001-N/Page_Tiers/input_Logo_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/T-001-N/Page_Tiers/input_Logo_create'))

WebUI.verifyElementPresent(findTestObject('T-001-N/Page_April/div_April Etats-Unis'), 5)

WebUI.verifyElementPresent(findTestObject('T-001-N/Page_April/td_Prospect  Client'), 5)


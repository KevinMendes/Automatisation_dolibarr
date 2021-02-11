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

WebUI.click(findTestObject('Object Repository/FP-001-N-b/Page_Facture client - Fiche/input_Services prdfinis en vente_prod_entry_mode'))

WebUI.click(findTestObject('FP-001-N-b/Page_Facture client - Fiche/span_Services prdfinis en vente_select2-selection__arrow'))

WebUI.waitForElementVisible(findTestObject('FP-001-N-b/Page_Facture client - Fiche/input_Dolibarr 1300_select2-search__field'), 
    0)

WebUI.click(findTestObject('FP-001-N-b/Page_Facture client - Fiche/input_Dolibarr 1300_select2-search__field'))

WebUI.setText(findTestObject('FP-001-N-b/Page_Facture client - Fiche/input_Dolibarr 1300_select2-search__field'), selectionService)

WebUI.sendKeys(findTestObject('FP-001-N-b/Page_Facture client - Fiche/input_Dolibarr 1300_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('FP-001-N-b/Page_Facture client - Fiche/span_ref - lib - 1 Jour - 900  HT'), 0)

WebUI.waitForElementPresent(findTestObject('FP-001-N-b/Page_Facture client - Fiche/input__addline'), 0)

WebUI.click(findTestObject('FP-001-N-b/Page_Facture client - Fiche/input__addline'))

WebUI.verifyElementPresent(findTestObject('FP-001-N-b/Page_Facture client - Fiche/span_Brouillon ( valider)'), 0)

WebUI.verifyElementPresent(findTestObject('FP-001-N-b/Page_Facture client - Fiche/a_Valider'), 0)

WebUI.click(findTestObject('FP-001-N-b/Page_Facture client - Fiche/a_Valider'))

WebUI.waitForElementVisible(findTestObject('FP-001-N-b/Page_Facture client - Fiche/span_Valider facture'), 0)

WebUI.verifyElementPresent(findTestObject('FP-001-N-b/Page_Facture client - Fiche/span_Valider facture'), 0)

WebUI.click(findTestObject('FP-001-N-b/Page_Facture client - Fiche/button_Oui'))

WebUI.verifyElementPresent(findTestObject('FP-001-N-b/Page_Facture client - Fiche/span_Impaye'), 0)


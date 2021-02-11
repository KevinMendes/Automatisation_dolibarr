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


WebUI.comment('Selection Onglet Service')

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-002-N/Page_Accueil - Dolibarr 1300/span_Services'), 0)

WebUI.click(findTestObject('Object Repository/PS-002-N/Page_Accueil - Dolibarr 1300/span_Services'))

WebUI.navigateToUrl('http://localhost:3000/dolibarr/product/index.php?mainmenu=products&leftmenu=')

WebUI.comment('Selection nouveau service')

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-002-N/Page_Produits et Services/a_Nouveau service'), 0)

WebUI.click(findTestObject('Object Repository/PS-002-N/Page_Produits et Services/a_Nouveau service'))

WebUI.comment('Ajout data Ref, Lib, Durée et Prix ainsi que les selections  Vente Achat Durée HTTTC')

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/input_Rf_ref'), 0)

WebUI.click(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/input_Rf_ref'))

WebUI.setText(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/input_Rf_ref'), 'ref')

WebUI.getText(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/input_Rf_ref'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/input_Libell_label'), 0)

WebUI.click(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/input_Libell_label'))

WebUI.setText(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/input_Libell_label'), 'lib')

WebUI.getText(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/input_Libell_label'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/select_En venteHors vente'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/select_En venteHors vente'), '1', 
    true)

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/select_En achatHors achat'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/select_En achatHors achat'), '0', 
    true)

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/input_Dure_duration_value'), 
    0)

WebUI.setText(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/input_Dure_duration_value'), '1')

WebUI.getText(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/input_Dure_duration_value'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/select_SecondeMinuteHeureJourSemaineMoisAnne'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/select_SecondeMinuteHeureJourSemaineMoisAnne'), 
    'd', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/input_Prix de vente_price'), 
    0)

WebUI.setText(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/input_Prix de vente_price'), '900')

WebUI.getText(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/input_Prix de vente_price'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/select_HTTTC'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/select_HTTTC'), 'HT', true)

WebUI.comment('Validation bouton créer et vérification')

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/input_Code comptable (achat import)_button'), 
    0)

WebUI.click(findTestObject('Object Repository/PS-002-N/Page_Service - Fiche/input_Code comptable (achat import)_button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-002-N/Page_Service lib - Fiche/a_Service'), 0)


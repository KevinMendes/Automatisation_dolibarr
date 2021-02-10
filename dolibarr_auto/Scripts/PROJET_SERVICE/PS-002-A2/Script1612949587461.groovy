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

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-002-A2/Page_Accueil - Dolibarr 1300/span_Services'), 0)

WebUI.click(findTestObject('Object Repository/PS-002-A2/Page_Accueil - Dolibarr 1300/span_Services'))

WebUI.navigateToUrl('http://localhost:3000/dolibarr/product/index.php?mainmenu=products&leftmenu=')

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-002-A2/Page_Produits et Services/a_Liste'), 0)

WebUI.click(findTestObject('Object Repository/PS-002-A2/Page_Produits et Services/a_Liste'))

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-002-A2/Page_Produits et Services/a_ref'), 0)

WebUI.click(findTestObject('Object Repository/PS-002-A2/Page_Produits et Services/a_ref'))

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-002-A2/Page_Service lib - Fiche/a_Modifier'), 0)

WebUI.click(findTestObject('Object Repository/PS-002-A2/Page_Service lib - Fiche/a_Modifier'))

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-002-A2/Page_Service lib - Fiche/input_Libell_label'), 0)

WebUI.click(findTestObject('Object Repository/PS-002-A2/Page_Service lib - Fiche/input_Libell_label'))

WebUI.setText(findTestObject('Object Repository/PS-002-A2/Page_Service lib - Fiche/input_Libell_label'), 'libmodif')

WebUI.getText(findTestObject('Object Repository/PS-002-A2/Page_Service lib - Fiche/input_Libell_label'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-002-A2/Page_Service lib - Fiche/input_Code comptable (achat import)_button _8dbbd4'), 
    0)

WebUI.click(findTestObject('Object Repository/PS-002-A2/Page_Service lib - Fiche/input_Code comptable (achat import)_button _8dbbd4'))

WebUI.rightClick(findTestObject('Object Repository/PS-002-A2/Page_Service libmodif - Fiche/a_Service'))


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

WebUI.verifyElementPresent(findTestObject('PS-001-N/Page_Accueil - Dolibarr 1300/span_Projets'), 0)

WebUI.click(findTestObject('PS-001-A1-HELENE/Page_Accueil - Dolibarr 1300/span_Projets'))

WebUI.verifyElementPresent(findTestObject('PS-001-A1-HELENE/Page_Projets/a_Liste'), 0)

WebUI.click(findTestObject('PS-001-A1-HELENE/Page_Projets/a_Liste'))

WebUI.verifyElementPresent(findTestObject('PS-001-A1-HELENE/Page_Projets/span_PJ2102-0001_fas fa-sitemap infobox-pro_024f19'), 
    0)

WebUI.click(findTestObject('PS-001-A1-HELENE/Page_Projets/span_PJ2102-0001_fas fa-sitemap infobox-pro_024f19'))

WebUI.verifyElementPresent(findTestObject('PS-001-A1-HELENE/Page_PJ2102-0001 - Test cration projet/a_Supprimer'), 0)

WebUI.click(findTestObject('PS-001-A1-HELENE/Page_PJ2102-0001 - Test cration projet/a_Supprimer'))

WebUI.verifyElementPresent(findTestObject('PS-001-A1-HELENE/Page_PJ2102-0001 - Test cration projet/div_tes-vous sr de vouloir supprimer ce projet'), 
    0)

WebUI.verifyElementPresent(findTestObject('PS-001-A1-HELENE/Page_PJ2102-0001 - Test cration projet/button_Oui'), 0)

WebUI.click(findTestObject('PS-001-A1-HELENE/Page_PJ2102-0001 - Test cration projet/button_Oui'))

WebUI.verifyElementPresent(findTestObject('PS-001-A1-HELENE/Page_Projets/span_(0)'), 0)

WebUI.closeBrowser()


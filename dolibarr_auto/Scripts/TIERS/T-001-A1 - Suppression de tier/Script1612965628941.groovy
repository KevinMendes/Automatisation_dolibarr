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

WebUI.verifyElementPresent(findTestObject('T-001-A1/Page_Accueil - Dolibarr 1300/span_Tiers'), 1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('T-001-A1/Page_Accueil - Dolibarr 1300/span_Tiers'), FailureHandling.OPTIONAL)

WebUI.verifyTextPresent('PremierTiers', false, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('T-001-A1/Page_Tiers/a_PremierTiers'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('T-001-A1/Page_PremierTiers - Fiche/span_Supprimer'), 1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('T-001-A1/Page_PremierTiers - Fiche/span_Supprimer'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('T-001-A1/Page_PremierTiers - Fiche/button_Oui'), 1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('T-001-A1/Page_PremierTiers - Fiche/button_Oui'), FailureHandling.OPTIONAL)

WebUI.verifyTextNotPresent('PremierTiers', false, FailureHandling.OPTIONAL)


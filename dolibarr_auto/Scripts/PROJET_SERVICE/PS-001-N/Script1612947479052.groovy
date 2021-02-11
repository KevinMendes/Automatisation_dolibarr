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

WebUI.comment('Selection Onglet Projet')

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-001-N/Page_Accueil - Dolibarr 1300/span_Projets'), 0)

WebUI.click(findTestObject('Object Repository/PS-001-N/Page_Accueil - Dolibarr 1300/span_Projets'))

WebUI.navigateToUrl('http://localhost:3000/dolibarr/projet/index.php?mainmenu=project&leftmenu=')

WebUI.comment('Selection créer nouveau service')

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-001-N/Page_Projets/a_Nouvelle opp ou projet'), 0)

WebUI.click(findTestObject('Object Repository/PS-001-N/Page_Projets/a_Nouvelle opp ou projet'))

WebUI.comment('Ajout Nom, DateFin ')

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-001-N/Page_Dolibarr/input_Libell projet_title'), 0)

WebUI.setText(findTestObject('Object Repository/PS-001-N/Page_Dolibarr/input_Libell projet_title'), 'Test création projet')

WebUI.getText(findTestObject('Object Repository/PS-001-N/Page_Dolibarr/input_Libell projet_title'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-001-N/Page_Dolibarr/input_Date fin_projectend'), 0)

WebUI.setText(findTestObject('Object Repository/PS-001-N/Page_Dolibarr/input_Date fin_projectend'), '10/03/2021')

WebUI.getText(findTestObject('Object Repository/PS-001-N/Page_Dolibarr/input_Date fin_projectend'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-001-N/Page_Dolibarr/input_Description_button'), 0)

WebUI.click(findTestObject('Object Repository/PS-001-N/Page_Dolibarr/input_Description_button'))

WebUI.comment('Validation')

WebUI.verifyElementPresent(findTestObject('PS-001-N/Page_PJ2102-0001 - Test cration projet/a_Valider'), 0)

WebUI.click(findTestObject('PS-001-N/Page_PJ2102-0001 - Test cration projet/a_Valider'))

WebUI.comment('vérification, apparition pop-up et validation')

WebUI.waitForElementPresent(findTestObject('Object Repository/PS-001-N/Page_PJ2102-0001 - Test cration projet/span_Valider projet'), 
    5)

WebUI.verifyElementPresent(findTestObject('PS-001-N/Page_PJ2102-0001 - Test cration projet/button_Oui'), 0)

WebUI.click(findTestObject('PS-001-N/Page_PJ2102-0001 - Test cration projet/button_Oui'))

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-001-N/Page_PJ2102-0001 - Test cration projet/span_Ouvert'), 
    0)


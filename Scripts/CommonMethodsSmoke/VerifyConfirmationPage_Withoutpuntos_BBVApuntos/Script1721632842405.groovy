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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.verifyElementText(findTestObject('SmokeSuitObjects/ConfirmationPage/Pagaste_un_total_de_header_confirmPage'), 'Pagaste un total de:')

WebUI.verifyElementPresent(findTestObject('SmokeSuitObjects/ConfirmationPage/Card_Img_CP'), 0)

WebUI.verifyElementPresent(findTestObject('SmokeSuitObjects/ConfirmationPage/BBVAputos_IMG_CP'), 0)

WebUI.verifyElementPresent(findTestObject('SmokeSuitObjects/ConfirmationPage/BBVAputos_IMG_CP'), 0)

WebUI.verifyElementText(findTestObject('SmokeSuitObjects/ConfirmationPage/Detalle_de_puntos_BBVA_confirmPage'), 'Detalle de puntos BBVA')

WebUI.verifyElementPresent(findTestObject('SmokeSuitObjects/ConfirmationPage/Saldo_anterior_title_CP'), 0)

WebUI.verifyElementPresent(findTestObject('SmokeSuitObjects/ConfirmationPage/Monto_utilizado_title_CP'), 0)

WebUI.verifyElementPresent(findTestObject('SmokeSuitObjects/ConfirmationPage/Saldo_actual_CP'), 0)

WebUI.verifyElementPresent(findTestObject('SmokeSuitObjects/ConfirmationPage/Total_(IVA incluido)_CP'), 0)

WebUI.verifyElementPresent(findTestObject('SmokeSuitObjects/ConfirmationPage/puntos_before_purchase_CP'), 0)

WebUI.verifyElementPresent(findTestObject('SmokeSuitObjects/ConfirmationPage/puntos_Remaining_CP'), 0)

WebUI.verifyElementPresent(findTestObject('SmokeSuitObjects/ConfirmationPage/puntos_Used_CP'), 0)


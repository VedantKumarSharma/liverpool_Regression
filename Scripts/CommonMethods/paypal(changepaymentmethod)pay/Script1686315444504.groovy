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

WebUI.click(findTestObject('HomePage/paypalpayment'))

WebUI.click(findTestObject('OPCPage/button_Continuar_payment_opc (3)'))

not_run: WebUI.switchToWindowTitle('Log in to your PayPal account')

not_run: WebUI.click(findTestObject('OPCPage/paypal_inputID_checkout'))

not_run: WebUI.setText(findTestObject('OPCPage/paypal_inputID_checkout'), 'liverpool@paypal.com')

not_run: WebUI.click(findTestObject('OPCPage/paypal_next_button_popup'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('OPCPage/paypal-password'), FailureHandling.OPTIONAL)

not_run: WebUI.setText(findTestObject('OPCPage/paypal-password'), 'cordoba213VKY', FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('OPCPage/loginbutton_paypal_cop'))

not_run: WebUI.click(findTestObject('OPCPage/acceptAndContinue'))

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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://odtaqab.liverpool.com.mx/tienda/pdp/adventure-time:-finn-&-jake-investigations-playstation-3/1041990381?skuid=1041990381')

WebUI.click(findTestObject('Object Repository/PLPPage/Page_Adventure Time Finn  Jake Investigatio_af8108/span_Iniciar sesin'))

WebUI.setText(findTestObject('Object Repository/PLPPage/Page_Iniciar sesin  Liverpool/input_Correo electrnico_username'), 
    'hcheruvu29@digisprint.com')

WebUI.setEncryptedText(findTestObject('Object Repository/PLPPage/Page_Iniciar sesin  Liverpool/input_Contrasea_password'), 
    'NMsRWW6A81KzLYo1BoEVYMMai0e5+i3T')

WebUI.click(findTestObject('Object Repository/PLPPage/Page_Iniciar sesin  Liverpool/button_Mostrar contrasea                   _897db4'))

WebUI.click(findTestObject('Object Repository/PLPPage/Page_Iniciar sesin  Liverpool/div_Iniciar sesin                          _b38142'))

WebUI.setText(findTestObject('Object Repository/PLPPage/Page_Iniciar sesin  Liverpool/input_Contrasea_password_1'), 'Test@12345')

WebUI.click(findTestObject('Object Repository/PLPPage/Page_Iniciar sesin  Liverpool/button_Iniciar sesin'))

WebUI.click(findTestObject('Object Repository/PLPPage/Page_Adventure Time Finn  Jake Investigatio_af8108/span_19'))

WebUI.click(findTestObject('Object Repository/PLPPage/Page_Liverpool Mxico/button_Comprar'))

WebUI.click(findTestObject('Object Repository/PLPPage/Page_/label_Cambiar'))

WebUI.click(findTestObject('Object Repository/PLPPage/Page_/img_Tarjetas  Monedero_paypalImage'))

WebUI.click(findTestObject('Object Repository/PLPPage/Page_/button_Continuar'))

WebUI.switchToWindowTitle('Log in to your PayPal account')

WebUI.setText(findTestObject('Object Repository/PLPPage/Page_Log in to your PayPal account/input_IN_login_email'), 'liverpool@paypal.com')

WebUI.click(findTestObject('Object Repository/PLPPage/Page_Log in to your PayPal account/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/PLPPage/Page_Log in to your PayPal account/input_Next_login_password'), 
    '7rU2e9f2MqeA2Bn72e5zhg==')

WebUI.click(findTestObject('Object Repository/PLPPage/Page_Log in to your PayPal account/button_Log In'))

WebUI.click(findTestObject('Object Repository/PLPPage/Page_PayPal Checkout - Review your payment/button_Agree and continue'))

WebUI.switchToWindowTitle('')

WebUI.click(findTestObject('Object Repository/PLPPage/Page_/label_Cambiar'))

WebUI.click(findTestObject('Object Repository/PLPPage/Page_/img_Tarjetas  Monedero_paypalImage'))

WebUI.click(findTestObject('Object Repository/PLPPage/Page_/button_Continuar'))

WebUI.switchToWindowTitle('PayPal Checkout - Review your payment')

WebUI.click(findTestObject('Object Repository/PLPPage/Page_PayPal Checkout - Review your payment/button_Agree and continue'))

WebUI.openBrowser('')

WebUI.closeBrowser()


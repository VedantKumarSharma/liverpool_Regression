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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.callTestCase(findTestCase('CommonMethods/clickIniciarSession_Header'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : GlobalVariable.username, ('password') : GlobalVariable.password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.gwpSLwithSingleGift], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

<<<<<<< Updated upstream:Scripts/BrowserAndShopLiverpool/TC_BS_154/Script1686540295991.groovy
WebUI.verifyElementPresent(findTestObject('PDPPage/ITRLink_pdp'), 0)
=======
WebUI.click(findTestObject('PDPPage/Bag_PDP'))

WebUI.click(findTestObject('CartPage/comprar'))

WebUI.click(findTestObject('OPCPage/paymentMethod_change_OPC'))

WebUI.callTestCase(findTestCase('CommonMethods/paypal(changepaymentmethod)pay'), [:], FailureHandling.STOP_ON_FAILURE)

'verify selection of paypal\r\n'
WebUI.verifyElementPresent(findTestObject('Checkout/paypal_image_checkout'), 0)

WebUI.click(findTestObject('OPCPage/final_confirm_order_button_OPC'))

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/PayPal_img_confirm_page'), 0)

WebUI.closeBrowser()
>>>>>>> Stashed changes:Scripts/payment paypal and card/paypal_payment_end_to_end/Script1686325282273.groovy


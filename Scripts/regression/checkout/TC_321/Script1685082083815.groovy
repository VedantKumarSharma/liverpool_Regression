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

WebUI.navigateToUrl(GlobalVariable.URL2)

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('CommonMethods/login_odtaqab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/EmptyCart_RunAt_HP'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('CartPage/home_button_(header_liverpool)'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'nat'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/product3_PLP'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('PDPPage/Bag_PDP'), '0')

WebUI.click(findTestObject('PDPPage/AddToCart_PDP'))

WebUI.verifyElementText(findTestObject('PDPPage/Bag_PDP'), '1')

WebUI.click(findTestObject('PDPPage/Bag_PDP'))

WebUI.click(findTestObject('CartPage/comprar'))

WebUI.click(findTestObject('OPCPage/paymentMethod_change_OPC'), FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('OPCPage/card3_Option_OPC'))

'to set card as default card\r\n'
WebUI.enhancedClick(findTestObject('OPCPage/option2DropDown_editos_card_OPC'))

'section present to edit is address'
WebUI.verifyElementPresent(findTestObject('OPCPage/AddressSection_card_popup_OPC'), 0)

'section present to edit is address'
WebUI.verifyElementPresent(findTestObject('OPCPage/AddressSection_card_popup_enterPINCODE_OPC'), 0)

'section present to edit is address'
WebUI.setText(findTestObject('OPCPage/AddressSection_card_popup_enterPINCODE_OPC'), '33454')

WebUI.closeBrowser()


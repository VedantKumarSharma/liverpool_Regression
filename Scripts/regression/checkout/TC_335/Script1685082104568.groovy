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

WebUI.callTestCase(findTestCase('CommonMethods/login_odtaqab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/EmptyCart_RunAt_HP'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('CartPage/home_button_(header_liverpool)'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'nat'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/product2_PLP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PDPPage/Colour1_PDP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PDPPage/Size1_PDP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PDPPage/AddToCart_PDP'))

WebUI.click(findTestObject('PDPPage/Bag_PDP'))

WebUI.click(findTestObject('CartPage/comprar'))

WebUI.click(findTestObject('OPCPage/shop_For_Event_product1_OPC'))

WebUI.setText(findTestObject('OPCPage/Enter_Event_Number_Eventpopup_OPC'), '56076579')

WebUI.click(findTestObject('OPCPage/Find_Gift_by_Code_Event_POPUP'))

WebUI.click(findTestObject('OPCPage/event_select_ceremony_event_popUP_OPC'))

WebUI.click(findTestObject('OPCPage/select_Whom_To_Address_Event_popup'))

WebUI.click(findTestObject('OPCPage/Event_whom_to_Address_Accept_button_Eventpopup_OPC'))

WebUI.verifyElementPresent(findTestObject('OPCPage/Event_number_Product1_OPC'), 0)

WebUI.closeBrowser()


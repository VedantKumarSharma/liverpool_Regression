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

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : GlobalVariable.username, ('password') : GlobalVariable.password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'vaso'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SRP page/firstProductImage_srp'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'vaso'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SRP page/secondProductImage_srp'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'vaso'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SRP page/thirdProductImage_srp'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'vaso'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SRP page/fourthProductImage_srp'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'vaso'], FailureHandling.STOP_ON_FAILURE)

productName_plp = WebUI.getText(findTestObject('SRP page/fifthproductName'))

WebUI.click(findTestObject('SRP page/fifthProductImage_srp'))

productNameActual_pdp = WebUI.getText(findTestObject('PDPPage/productName_pdp (2)'))

productNameActual_pdp == productName_plp

WebUI.click(findTestObject('HomePage/Liverpool Logo2'))

WebUI.scrollToElement(findTestObject('HomePage/catridgeAImage_hp'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/catridgeAImage_hp'), 0)

WebUI.verifyTextPresent(productNameActual_pdp, false)

not_run: WebUI.verifyElementAttributeValue(findTestObject('HomePage/productInRecentlyViewed_hp'), productNameActual_pdp, 
    productName_plp, 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePage/productInRecentlyViewed_hp'), 0)

not_run: WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : productNameActual_pdp], 
    FailureHandling.STOP_ON_FAILURE)


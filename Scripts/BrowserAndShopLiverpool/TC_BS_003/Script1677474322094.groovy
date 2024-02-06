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

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'nat'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/product1_PLP'))

'cart/bag present at top right corner'
WebUI.verifyElementText(findTestObject('PDPPage/shopCart_HP'), '0')

'first present colour of radio button'
WebUI.click(findTestObject('PDPPage/Colour1_PDP'), FailureHandling.OPTIONAL)

'first present size of box'
WebUI.click(findTestObject('PDPPage/Size1_PDP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PDPPage/AddToCart_PDP'))

'cart/bag present at top right cornern after order 1 item'
WebUI.verifyElementText(findTestObject('PDPPage/shopCart_HP'), '1')

'second present colour of radio button'
WebUI.click(findTestObject('PDPPage/Colour2_PDP'), FailureHandling.OPTIONAL)

'second present size of box'
WebUI.click(findTestObject('PDPPage/Size2_PDP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PDPPage/AddToCart_PDP'))

'cart/bag present at top right corner after order 2 items'
WebUI.verifyElementText(findTestObject('PDPPage/shopCart_HP'), '2')

WebUI.closeBrowser()


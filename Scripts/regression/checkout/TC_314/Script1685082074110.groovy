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

WebUI.callTestCase(findTestCase('CommonMethods/login_newUser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/EmptyCart_RunAt_HP'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('CartPage/home_button_(header_liverpool)'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'bus'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/product1_PLP'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('PDPPage/Bag_PDP'), '0')

WebUI.click(findTestObject('PDPPage/AddToCart_PDP'))

WebUI.verifyElementText(findTestObject('PDPPage/Bag_PDP'), '1')

WebUI.click(findTestObject('PDPPage/Bag_PDP'))

WebUI.click(findTestObject('CartPage/comprar'))

WebUI.verifyElementPresent(findTestObject('OPCPage/paymentCard_aliasName_OPC'), 0)

aliasfontweight = WebUI.getCSSValue(findTestObject('OPCPage/paymentCard_aliasName_OPC'), 'font-weight')

afw = aliasfontweight.toBigInteger()

if (afw >= 200) {
    System.out.println('bold font')
}

'paypal\r\n'
WebUI.verifyElementPresent(findTestObject('OPCPage/paymentCard_aliasName_OPC'), 0)

'Efectivo y Transferencias'
WebUI.verifyElementPresent(findTestObject('OPCPage/paymentCard_CVV_OPC'), 0)

'verify best promotion'
WebUI.verifyElementPresent(findTestObject('OPCPage/BestpromotionScrolldown_OPC'), 0)

WebUI.closeBrowser()


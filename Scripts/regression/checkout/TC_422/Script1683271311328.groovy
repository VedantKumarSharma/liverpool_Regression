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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.testng.Assert as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL2)

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('CommonMethods/clickIniciarSession_Header'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : GlobalVariable.Username, ('password') : GlobalVariable.Password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.SLSearchTerm], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/SecondProduct_plp'))

WebUI.click(findTestObject('PDPPage/Comprar_pdp'))

not_run: WebUI.click(findTestObject('CartPage/BuyButton_Cart'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.verifyElementPresent(findTestObject('Object Repository/DemoObjects/OPC/Page_/subTotalWithProductCount_opc'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/DemoObjects/OPC/Page_/discountLabel_opc'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/DemoObjects/OPC/Page_/shippingCostLabel_opc'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OPCPage/Page_/totalPriceLabel_opc'), 0)

actualFont = WebUI.getCSSValue(findTestObject('OPCPage/Page_/totalPriceLabel_opc'), 'font')

def expectedFont = '1rem robotoBold'

if (actualFont == expectedFont) {
    KeywordUtil.markPassed('total is in bold')
} else {
    KeywordUtil.markFailed('total is not in bold')
}

subTotalPrice = WebUI.getText(findTestObject('Object Repository/DemoObjects/OPC/Page_/subTotalPrice_opc'), FailureHandling.STOP_ON_FAILURE)

def subTotalPrice1 = CustomKeywords.'customkeywords.myKeywords.removeDollar'(subTotalPrice)

KeywordUtil.logInfo(subTotalPrice1)

DiscountPrice = WebUI.getText(findTestObject('Object Repository/DemoObjects/OPC/Page_/DiscountPrice_opc'), FailureHandling.STOP_ON_FAILURE)

def DiscountPrice1 = CustomKeywords.'customkeywords.myKeywords.removeDollar'(DiscountPrice)

KeywordUtil.logInfo(DiscountPrice1)

TotalPrice = WebUI.getText(findTestObject('Object Repository/OPCPage/Page_/TotalPrice_opc'), FailureHandling.STOP_ON_FAILURE)

def TotalPrice1 = CustomKeywords.'customkeywords.myKeywords.removeDollar'(TotalPrice)

KeywordUtil.logInfo(TotalPrice1)

def TotalPrice2 = subTotalPrice1 - DiscountPrice1

KeywordUtil.logInfo(TotalPrice2)

if (TotalPrice1 == TotalPrice2) {
    KeywordUtil.markPassed('price calculated')
} else {
    KeywordUtil.markFailed('price not calculated')
}

WebUI.verifyElementPresent(findTestObject('Object Repository/DemoObjects/OPC/Page_/button_Finalizar compra'), 
    0)

if (TotalPrice1 == TotalPrice2) {
    KeywordUtil.markPassed('price calculated')
} else {
    KeywordUtil.markFailed('price not calculated')
}


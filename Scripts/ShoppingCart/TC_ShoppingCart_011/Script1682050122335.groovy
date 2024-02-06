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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.Softline], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PDPPage/AddToCart_PDP'))

not_run: WebUI.click(findTestObject('CartPage/ClosePopupButton_Cart'))

WebUI.click(findTestObject('PDPPage/Bag_PDP'))

WebUI.verifyElementPresent(findTestObject('CartPage/Product1_quantity1_cart'), 0)

total1 = WebUI.getText(findTestObject('CartPage/product1_Subtotal_cart'), FailureHandling.STOP_ON_FAILURE)

totala = total1.replace('$', '')

KeywordUtil.logInfo(totala)

grandtotal1 = WebUI.getText(findTestObject('CartPage/Cart_total_cart'), FailureHandling.STOP_ON_FAILURE)

grandtotala = grandtotal1.replace('$', '')

KeywordUtil.logInfo(grandtotal1)

WebUI.click(findTestObject('CartPage/product1_quantity_Add_cart'))

WebUI.verifyElementPresent(findTestObject('CartPage/Product1_quantity2_cart'), 0)

total2 = WebUI.getText(findTestObject('CartPage/product1_Subtotal_cart'), FailureHandling.STOP_ON_FAILURE)

totalb = total2.replace('$', '')

KeywordUtil.logInfo(total2)

grandtotal2 = WebUI.getText(findTestObject('CartPage/Cart_total_cart'), FailureHandling.STOP_ON_FAILURE)

grandtotalb = grandtotal2.replace('$', '')

KeywordUtil.logInfo(grandtotal2)

if (totala != totalb) {
    System.out.println('checked')
}

if (grandtotala != grandtotalb) {
    System.out.println('checked')
}

WebUI.closeBrowser()


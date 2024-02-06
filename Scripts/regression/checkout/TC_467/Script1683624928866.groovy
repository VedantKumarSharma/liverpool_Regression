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

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'sofa'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/product4_PLP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PDPPage/AddToCart_PDP'))

WebUI.refresh()

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'bat'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/product3_PLP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PDPPage/AddToCart_PDP'))

WebUI.click(findTestObject('PDPPage/Bag_PDP'))

boolean a = WebUI.verifyElementClickable(findTestObject('CartPage/SaveForLater_product1_CART(BAG)'))

if (a == true) {
    WebUI.click(findTestObject('CartPage/SaveForLater_product1_CART(BAG)'))

    WebUI.click(findTestObject('OPCPage/add_to_wishlist1_OPC1'))

    System.out.println('can be added to whishlist')
} else {
    System.out.println('save for later product 1 not present')
}

boolean b = WebUI.verifyElementClickable(findTestObject('CartPage/SaveForLater_product2_CART(BAG)'))

if (b == true) {
    WebUI.click(findTestObject('CartPage/SaveForLater_product2_CART(BAG)'))

    WebUI.click(findTestObject('OPCPage/add_to_wishlist1_OPC1'))

    System.out.println('can be added to whishlist')
} else {
    System.out.println('save for later product 2 not present')
}

WebUI.closeBrowser()


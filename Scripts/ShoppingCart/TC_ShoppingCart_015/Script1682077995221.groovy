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

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.Softline], FailureHandling.STOP_ON_FAILURE)

productName = WebUI.getText(findTestObject('PDPPage/ProductName_PDP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PDPPage/Colour1_PDP'))

WebUI.click(findTestObject('PDPPage/AddToCart_PDP'))

not_run: WebUI.click(findTestObject('CartPage/ClosePopupButton_Cart'))

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.softline3], 
    FailureHandling.STOP_ON_FAILURE)

productName2 = WebUI.getText(findTestObject('PDPPage/ProductName_PDP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PDPPage/AddToCart_PDP'))

not_run: WebUI.click(findTestObject('CartPage/ClosePopupButton_Cart'))

WebUI.click(findTestObject('PDPPage/Bag_PDP'))

WebUI.verifyElementText(findTestObject('CartPage/product1_Name_Mybag_cart'), productName)

WebUI.verifyElementPresent(findTestObject('CartPage/Product1_quantity1_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/product1_Name_Mybag_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/product1_pricePerProduct_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/product1_Subtotal_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/Product1_quantity1_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/Product1_remove_cart'), 0)

WebUI.verifyElementText(findTestObject('CartPage/product2_Name_Mybag_cart'), productName2)

WebUI.verifyElementPresent(findTestObject('CartPage/Product2_quantity1_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/product2_Name_Mybag_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/product2_pricePerProduct_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/product2_Subtotal_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/Product2_quantity1_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/Product2_remove_cart'), 0)

WebUI.closeBrowser()


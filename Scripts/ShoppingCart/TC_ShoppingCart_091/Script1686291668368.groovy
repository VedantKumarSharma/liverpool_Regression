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

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.GWPProduct], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('HomePage/FirstProduct_plp'))

not_run: WebUI.click(findTestObject('PDPPage/Colour1_PDP'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('PDPPage/Size2_PDP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PDPPage/gift_dropDown_PDP'))

WebUI.click(findTestObject('PDPPage/gift_option2_giftdropdown_PDP'))

WebUI.click(findTestObject('PDPPage/gift_popup_submitButton_PDP'))

WebUI.click(findTestObject('PDPPage/AddToCart_PDP'))

not_run: WebUI.click(findTestObject('CartPage/ClosePopupButton_Cart'))

WebUI.click(findTestObject('PDPPage/Bag_PDP'))

WebUI.verifyElementPresent(findTestObject('CartPage/Product1_quantity1_cart'), 0)

WebUI.verifyElementClickable(findTestObject('CartPage/product1_img_cart'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('CartPage/product1_quantity_Add_cart'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('CartPage/product2_quantity_Add_cart'), 0)

WebUI.verifyElementNotPresent(findTestObject('CartPage/Product2_remove_cart'), 0)

WebUI.verifyElementText(findTestObject('CartPage/giftPrice1_cart'), '$001')

WebUI.verifyElementPresent(findTestObject('CartPage/product1_name_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('CartPage/giftWrapper_product1_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('CartPage/giftWrapper_product2_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/product2_Name_Mybag_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/Gift_quantity_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/product2_pricePerProduct_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/product2_Subtotal_cart'), 0)

WebUI.verifyElementNotPresent(findTestObject('CartPage/Product2_remove_cart'), 0)

WebUI.closeBrowser()


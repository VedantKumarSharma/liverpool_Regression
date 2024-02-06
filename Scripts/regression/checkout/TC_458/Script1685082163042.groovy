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

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : '1024277440'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PDPPage/Colour1_PDP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PDPPage/Size1_PDP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PDPPage/AddToCart_PDP'))

WebUI.click(findTestObject('PDPPage/Bag_PDP'))

WebUI.click(findTestObject('CartPage/comprar'))

def price = WebUI.getText(findTestObject('OPCPage/discountPriceP1_OPC'), '')

def a = price.replaceAll('[^0-9]', '')

def p = a.toInteger()

WebUI.verifyElementPresent(findTestObject('OPCPage/product1_promotionDropDown_OPC'), 0)

WebUI.click(findTestObject('OPCPage/product1_promotionDropDown_OPC'))

int i

if (WebUI.verifyElementClickable(findTestObject('OPCPage/promoCombo1_popup_OPC'), FailureHandling.OPTIONAL) == 
true) {
    i++

    price = WebUI.getText(findTestObject('OPCPage/discountPriceP1_OPC'), '')

    a1 = price.replaceAll('[^0-9]', '')

    def p1 = a1.toInteger()

    if (p != p1) {
        System.out.println('price changed')
    }
}

if (WebUI.verifyElementClickable(findTestObject('OPCPage/promoCombo2_popup_OPC'), FailureHandling.OPTIONAL)) {
    i++

    price = WebUI.getText(findTestObject('OPCPage/discountPriceP1_OPC'), '')

    a2 = price.replaceAll('[^0-9]', '')

    def p1 = a2.toInteger()

    if (p != p1) {
        System.out.println('price changed')
    }
}

if (WebUI.verifyElementClickable(findTestObject('OPCPage/promoCombo3_popup_OPC'), FailureHandling.OPTIONAL)) {
    i++

    price = WebUI.getText(findTestObject('OPCPage/discountPriceP1_OPC'), '')

    a3 = price.replaceAll('[^0-9]', '')

    def p1 = a3.toInteger()

    if (p != p1) {
        System.out.println('price changed')
    }
}

System.out.println('number of promo combo are' + i)

WebUI.closeBrowser()


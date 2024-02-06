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

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'bt'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/product1_PLP'))

WebUI.click(findTestObject('PDPPage/Colour1_PDP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PDPPage/Size1_PDP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PDPPage/AddToCart_PDP'))

WebUI.click(findTestObject('PDPPage/Bag_PDP'))

WebUI.click(findTestObject('CartPage/comprar'))

WebUI.enhancedClick(findTestObject('OPCPage/paymentMethod_change_OPC'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('1vedant/Page_/select_vedaCARD_cardPopup'))

WebUI.setText(findTestObject('1vedant/Page_/card_expireDate_cardpopup'), '12/24')

WebUI.setText(findTestObject('1vedant/Page_/card_cvv_cardpopup'), '123')

WebUI.click(findTestObject('1vedant/Page_/continueButton_cardPOPup_CO1'))

WebUI.verifyElementPresent(findTestObject('OPCPage/product1_promotionDropDown_OPC'), 0)

WebUI.click(findTestObject('OPCPage/product1_promotionDropDown_OPC'))

int i = 0

def notchanged

if (WebUI.verifyElementPresent(findTestObject('OPCPage/promoCombo1_popup_OPC'), FailureHandling.OPTIONAL) == 
true) {
    i++

    notchanged = WebUI.getText(findTestObject('OPCPage/promoCombo1_popup_OPC'), FailureHandling.OPTIONAL)

    def a = notchanged.replaceAll('[^0-9]', '')

    def a1 = a.toInteger()

    System.out.println('number of promo combo for external card ' + a1)
}

if (WebUI.verifyElementPresent(findTestObject('OPCPage/promoCombo2_popup_OPC'), FailureHandling.OPTIONAL) == 
true) {
    i++
} else {
    notchanged = WebUI.getText(findTestObject('OPCPage/promoCombo1_popup_OPC'), FailureHandling.OPTIONAL)

    def a = notchanged.replaceAll('[^0-9]', '')

    def a1 = a.toInteger()

    System.out.println('number of promo combo for external card ' + a1)
}

if (WebUI.verifyElementPresent(findTestObject('OPCPage/promoCombo3_popup_OPC'), FailureHandling.OPTIONAL) == 
true) {
    i++
} else {
    WebUI.enhancedClick(findTestObject('OPCPage/promoCombo2_popup_OPC'))

    notchanged = WebUI.getText(findTestObject('OPCPage/promoCombo2_popup_OPC'), FailureHandling.OPTIONAL)

    def a = notchanged.replaceAll('[^0-9]', '')

    def a2 = a.toInteger()

    System.out.println('number of promo combo for external card ' + a2)
}

if (WebUI.verifyElementPresent(findTestObject('OPCPage/promoCombo4_popup_OPC'), FailureHandling.OPTIONAL) == 
true) {
    i++
} else {
    WebUI.enhancedClick(findTestObject('OPCPage/promoCombo3_popup_OPC'))

    notchanged = WebUI.getText(findTestObject('OPCPage/promoCombo2_popup_OPC'), FailureHandling.OPTIONAL)

    def a = notchanged.replaceAll('[^0-9]', '')

    def a3 = a.toInteger()

    System.out.println('number of promo combo for external card ' + a3)
}

System.out.println('number of promo combo for external card ' + i)

WebUI.click(findTestObject('OPCPage/paymentMethod_change_OPC'))

WebUI.delay(3)

'liverpool'
WebUI.enhancedClick(findTestObject('OPCPage/card1_OPC'))

WebUI.setText(findTestObject('1vedant/Page_/card_cvv_cardpopup'), '123')

WebUI.click(findTestObject('1vedant/Page_/continueButton_cardPOPup_CO1'))

WebUI.closeBrowser()


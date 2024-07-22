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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('CommonMethodsSmoke/login_odtaqab'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('CommonMethodsSmoke/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.SLSearchTerm], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('SmokeSuitObjects/PLPPage/product1_PLP'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('SmokeSuitObjects/PDPPage/AddToCart_PDP'))

WebUI.click(findTestObject('SmokeSuitObjects/HomePage/bag_header_HP'))

WebUI.click(findTestObject('SmokeSuitObjects/CartPage/BuyButton_Cart'))

WebUI.click(findTestObject('SmokeSuitObjects/OPCPage/paymentMethod_change_OPC'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('SmokeSuitObjects/OPCPage/paymentMethod_button1_OPC'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('SmokeSuitObjects/OPCPage/enterCardCVV_OPC'), '413', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('SmokeSuitObjects/OPCPage/enterCardExpire_OPC'), '1225', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('SmokeSuitObjects/OPCPage/cardContinue_checkout_popUP'), FailureHandling.OPTIONAL)

j = WebUI.getText(findTestObject('SmokeSuitObjects/OPCPage/Page_/TotalPrice_opc'))

String j1 = j.replace('$', '').replace(',', '')

a = WebUI.getText(findTestObject('SmokeSuitObjects/OPCPage/coupon_pricevalue_OPC'))

String a1 = a.replace('$', '').replace(',', '')

WebUI.click(findTestObject('SmokeSuitObjects/OPCPage/coupon_button_OPC'))

WebUI.click(findTestObject('SmokeSuitObjects/OPCPage/couon1_utilize_OPC'))

b = WebUI.getText(findTestObject('SmokeSuitObjects/OPCPage/coupon_pricevalue_OPC'))

String b1 = b.replace('$', '').replace(',', '')

System.out.println(a1)

System.out.println(b1)

if (a1 != b1) {
    System.out.println('coupon applied')
} else {
    KeywordUtil.markFailed('failed condition')
}

k = WebUI.getText(findTestObject('SmokeSuitObjects/OPCPage/Page_/TotalPrice_opc'))

String k1 = k.replace('$', '').replace(',', '')

System.out.println(j1)

System.out.println(k1)

if (j1 >= k1) {
    System.out.println('coupon applied')
} else {
    KeywordUtil.markFailed('failed condition')
}

WebUI.click(findTestObject('SmokeSuitObjects/OPCPage/Final_comparar_OPC'))

WebUI.delay(15)

WebUI.click(findTestObject('SmokeSuitObjects/HomePage/logo_confirmPage'))

def removeDollar(String withDollarprice) {
    String priceWithoutDollar = withDollarprice.replace('$', '').replace(',', '')

    KeywordUtil.logInfo(priceWithoutDollar)

    return priceWithoutDollar
}


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

WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://www.liverpool.com.mx/tienda/home')

WebUI.navigateToUrl(GlobalVariable.LiverPoolURL)

WebUI.callTestCase(findTestCase('null'), [('searchTerm') : 'laptop'], FailureHandling.STOP_ON_FAILURE)

String discountpricePLP = WebUI.getText(findTestObject('PLPPage/product-2-DiscountPrice_PLP'), FailureHandling.CONTINUE_ON_FAILURE)

def discountpricePLP1 = removeDollar(discountpricePLP)

String cardpricePLP = WebUI.getText(findTestObject('PLPPage/product2_cardPrice_PLP'), FailureHandling.CONTINUE_ON_FAILURE)

def cardpricePLP1 = removeDollar(cardpricePLP)

WebUI.click(findTestObject('PLPPage/product2_PLP'))

String discountpricePDP = WebUI.getText(findTestObject('PDPPage/discountPrice_PDP'), FailureHandling.CONTINUE_ON_FAILURE)

def discountpricePDP1 = removeDollar(discountpricePDP)

String cardpricePDP = WebUI.getText(findTestObject('PDPPage/cardPrice_PDP'), FailureHandling.CONTINUE_ON_FAILURE)

def cardpricePDP1 = removeDollar(cardpricePDP)

WebUI.click(findTestObject('PDPPage/Colour1_PDP'))

WebUI.click(findTestObject('PDPPage/AddToCart_PDP'))

WebUI.click(findTestObject('PDPPage/shopCart_HP'))

String discountpricecart = WebUI.getText(findTestObject('PDPPage/DiscountPriceInCart_PDP'), FailureHandling.STOP_ON_FAILURE)

def discountpricecart1 = removeDollar(discountpricecart)

String cardpricecart = WebUI.getText(findTestObject('PDPPage/cardPriceInCart_PDP'), FailureHandling.STOP_ON_FAILURE)

def cardpricecart1 = removeDollar(cardpricecart)

'compare dicount price of PLP and PDP'
if (discountpricePLP1 == discountpricePDP1) {
    println('correct discount price')
}

'compare card price of PLP and PDP'
if (cardpricePLP1 == cardpricePDP1) {
    println('correct card price')
}

'compare dicount price of cart and PDP'
if (discountpricecart1 == discountpricePDP1) {
    println('correct discount price')
}

'compare card price of cart and PDP'
if (cardpricecart1 == cardpricePDP1) {
    println('correct cart price')
}

def removeDollar(String withDollarprice) {
    String priceWithoutDollar = withDollarprice.replace('$', '').replace(',', '').replace(' ', '')

    return priceWithoutDollar
}


import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'vaso'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/Sortby_PLP'))

WebUI.click(findTestObject('PLPPage/HighToLowPriceSortby_PLP'))

firstProductPrice = WebUI.getText(findTestObject('SRP page/firstProductPrice_srp'))

firstProductPriceNew = firstProductPrice.replace('$', '').replace(',', '').replace('0', '').toInteger()

println('This is the output after price replacement = ' + firstProductPriceNew)

secondProductPrice = WebUI.getText(findTestObject('SRP page/secondProductPrice_srp'))

secondProductPriceNew = secondProductPrice.replace('$', '').replace(',', '').replace('0', '').toInteger()

not_run: Integer a = firstProductPrice.substring(0, 4)

not_run: Integer b = secondProductPrice.valueOf(secondProductPrice.substring(1, 4))

not_run: secondProductPrice = WebUI.getText(findTestObject('SRP page/secondProductPrice_srp'))

not_run: secondProductPrice = secondProductPrice.substring(1, 4)

not_run: WebUI.scrollToElement(findTestObject(null), 0)

WebUI.verifyGreaterThanOrEqual(firstProductPriceNew, secondProductPriceNew)

WebUI.closeBrowser()


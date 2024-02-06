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

not_run: WebUI.navigateToUrl('https://www.liverpool.com.mx/tienda/home')

WebUI.navigateToUrl(GlobalVariable.LiverPoolURL)

WebUI.callTestCase(findTestCase('null'), [('searchTerm') : 'tenis'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/product_Link_plp'))

JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

for (int i = 0; i < 1000; i += 7) {
    js.executeScript(('window.scrollTo(0, ' + i) + ')')
}

WebUI.verifyElementPresent(findTestObject('Object Repository/PDPPage/StickyProductImg_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PDPPage/StickyProductName_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PDPPage/StickyProductPrice_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PDPPage/StickyProductColour_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PDPPage/StickyProductPieces_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PDPPage/StickyProductQuantity_pdp'), 0)

WebUI.closeBrowser()


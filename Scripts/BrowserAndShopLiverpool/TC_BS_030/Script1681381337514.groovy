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

WebUI.callTestCase(findTestCase('null'), [('searchTerm') : 'vestidos'], FailureHandling.STOP_ON_FAILURE)

'check of clickablity of colour swatch'
WebUI.click(findTestObject('PLPPage/product-1-colour2_PLP'))

'check of clickablity of colour swatch'
WebUI.click(findTestObject('PLPPage/product-1-colour1_PLP'))

WebUI.click(findTestObject('PLPPage/product1_PLP'))

WebUI.click(findTestObject('PDPPage/Colour1_PDP'), FailureHandling.STOP_ON_FAILURE)

'this object is only for a perticular product because it use src'
colour1 = WebUI.getAttribute(findTestObject('PDPPage/imagePresent'), '')

WebUI.enhancedClick(findTestObject('PDPPage/Colour2_PDP'), FailureHandling.STOP_ON_FAILURE)

'this object is only for a perticular product because it use src'
colour2 = WebUI.getAttribute(findTestObject('PDPPage/imagePresent'), '')

if (colour1 == colour2) {
    System.out.println('image changed')
}

WebUI.closeBrowser()


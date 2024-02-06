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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://www.liverpool.com.mx/tienda/home')

WebUI.navigateToUrl(GlobalVariable.LiverPoolURL)

WebUI.callTestCase(findTestCase('null'), [('searchTerm') : 'MAC'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('HomePage/MainSearchbar_hp (1)'))

not_run: WebUI.setText(findTestObject('HomePage/MainSearchbar_hp (1)'), 'MAC')

not_run: WebUI.click(findTestObject('HomePage/SearchButton_hp'))

JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

for (int i = 0; i < 3500; i += 7) {
    js.executeScript(('window.scrollTo(0, ' + i) + ')')
}

WebUI.verifyElementPresent(findTestObject('PLPPage/Swatche_colour1_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/Swatche_colour2_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/Swatche_colour3_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/Swatche_colour4_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/Swatche_colour5_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/Swatche_colour6_plp'), 0)

WebUI.closeBrowser()


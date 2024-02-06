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

WebUI.click(findTestObject('HomePage/CategorasDropDown_HP'))

L1_category = WebUI.getText(findTestObject('HomePage/L1Category_HP (1)'))

WebUI.click(findTestObject('HomePage/L1Category_HP (1)'))

'this is only name of category we chose'
FooterName = WebUI.getText(findTestObject('CLPPage/footer_name_not.com_CLP'), FailureHandling.STOP_ON_FAILURE)

'this is complete text of footer '
WebUI.verifyElementText(findTestObject('CLPPage/footer_.com_CLP(odtqab)'), 'MUJER EN LIVERPOOL.COM.MX')

if (L1_category == FooterName) {
    System.out.print('correct page')
}

WebUI.closeBrowser()


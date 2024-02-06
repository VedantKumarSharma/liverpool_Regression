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

WebUI.click(findTestObject('HomePage/Categoras_hp'))

WebUI.click(findTestObject('HomePage/L1_Category1_HP'))

'sub category left level menu (perfume) no L3 category \r\n'
WebUI.click(findTestObject('CLPPage/SubCategory6_leftmenu_CLP'))

'top left bread crumb'
WebUI.click(findTestObject('PLPPage/BreadCrumb2Page_PLP'))

breadcrumb_PLP = WebUI.getText(findTestObject('PLPPage/BreadCrumbCurrentPage_PLP'), FailureHandling.STOP_ON_FAILURE)

'current page verification'
WebUI.verifyElementText(findTestObject('PLPPage/BreadCrumbCurrentPage_PLP'), breadcrumb_PLP)

WebUI.verifyElementClickable(findTestObject('PLPPage/BreadCrumbCurrentPage_PLP'))

WebUI.closeBrowser()


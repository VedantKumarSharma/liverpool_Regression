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

WebUI.mouseOver(findTestObject('HomePage/CategorasDropDown_HP'))

WebUI.click(findTestObject('HomePage/L1_Category1_HP'))

WebUI.click(findTestObject('CLPPage/SubCategory1_leftmenu_CLP'))

WebUI.click(findTestObject('CLPPage/SubCategory1_leftmenu_CLP'))

WebUI.scrollToElement(findTestObject('PLPPage/footer_PLP'), 0)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('PLPPage/mostviewed_recommendsection_PLP'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/MostViewed_title_PLP'), 0)

productName1 = WebUI.getText(findTestObject('PLPPage/MostViewed_Product_1_Title'), FailureHandling.STOP_ON_FAILURE)

System.out.println(productName1)

WebUI.click(findTestObject('PLPPage/MostViewed_visible_product1_image_PLP'))

productName2 = WebUI.getUrl()

productName10 = productName1.toLowerCase()

productName20 = productName2.toLowerCase()

def substringToRemove = '-'

def a2 = productName20.replace(substringToRemove, ' ')

if (a2.contains(productName10)) {
    System.out.println('checked')
}

System.out.println(a2)

System.out.println(productName1)

WebUI.closeBrowser()


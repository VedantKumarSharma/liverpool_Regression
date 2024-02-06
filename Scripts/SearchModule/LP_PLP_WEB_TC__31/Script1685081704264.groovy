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

'need to go to footer to load most viewed\r\n'
WebUI.scrollToElement(findTestObject('PLPPage/footer_PLP'), 0)

'load time\r\n'
WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('PLPPage/mostviewed_recommendsection_PLP'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/MostViewed_title_PLP'), 0)

'visible tags \r\n'
a1 = WebUI.getText(findTestObject('PLPPage/MostViewed_Product_1_Title'))

'visible tags \r\n'
b1 = WebUI.getText(findTestObject('PLPPage/MostViewed_Product_2_Title'))

'visible tags \r\n'
c1 = WebUI.getText(findTestObject('PLPPage/MostViewed_Product_3_Title'))

WebUI.click(findTestObject('PLPPage/MostViewed_rightArrow'))

WebUI.click(findTestObject('PLPPage/MostViewed_rightArrow'))

'visible tags \r\n'
a2 = WebUI.getText(findTestObject('PLPPage/MostViewed_Product_1_Title'))

'visible tags \r\n'
b2 = WebUI.getText(findTestObject('PLPPage/MostViewed_Product_2_Title'))

'visible tags \r\n'
c2 = WebUI.getText(findTestObject('PLPPage/MostViewed_Product_3_Title'))

if (a1 != a2) {
    System.out.print('checked not same')
}

if (b1 != b2) {
    System.out.print('checked not same')
}

if (c1 != c2) {
    System.out.print('checked not same')
}

WebUI.click(findTestObject('PLPPage/MostViewed_LeftArrow'))

'visible tags \r\n'
a3 = WebUI.getText(findTestObject('PLPPage/MostViewed_Product_1_Title'))

'visible tags \r\n'
b3 = WebUI.getText(findTestObject('PLPPage/MostViewed_Product_2_Title'))

'visible tags \r\n'
c3 = WebUI.getText(findTestObject('PLPPage/MostViewed_Product_3_Title'))

if (a2 != a3) {
    System.out.print('checked not same')
}

if (b2 != b3) {
    System.out.print('checked not same')
}

if (c2 != c3) {
    System.out.print('checked not same')
}

WebUI.closeBrowser()


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

WebUI.mouseOver(findTestObject('HomePage/L1_Category1_HP'))

WebUI.click(findTestObject('HomePage/L1_Category1_HP'))

'L2 category page'
WebUI.click(findTestObject('CLPPage/SubCategory2_leftmenu_CLP'))

'use of sub category 2 for 1 because first is ver dos (all)'
left1 = WebUI.getText(findTestObject('CLPPage/SubCategory2_leftmenu_CLP'), FailureHandling.STOP_ON_FAILURE)

left2 = WebUI.getText(findTestObject('CLPPage/SubCategory3_leftmenu_CLP'), FailureHandling.STOP_ON_FAILURE)

left3 = WebUI.getText(findTestObject('CLPPage/SubCategory4_leftmenu_CLP'), FailureHandling.STOP_ON_FAILURE)

banner1 = WebUI.getText(findTestObject('CLPPage/L2_CLP/Category_img1_L2_CLP'), FailureHandling.STOP_ON_FAILURE)

banner2 = WebUI.getText(findTestObject('CLPPage/L2_CLP/Category_img2_L2_CLP'), FailureHandling.STOP_ON_FAILURE)

banner3 = WebUI.getText(findTestObject('CLPPage/L2_CLP/Category_img3_L2_CLP'), FailureHandling.STOP_ON_FAILURE)

if (left1 == banner1) {
    System.out.println('Checked 1')
}

if (left2 == banner2) {
    System.out.println('Checked 2')
}

if (left3 == banner3) {
    System.out.println('Checked 3')
}

WebUI.closeBrowser()


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

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'vaso'], FailureHandling.STOP_ON_FAILURE)

buttonvalue1 = WebUI.getText(findTestObject('PLPPage/Discount_Button1_PLP'))

b1 = (buttonvalue2 = WebUI.getText(findTestObject('PLPPage/Discount_Button2_PLP')))

buttonvalue3 = WebUI.getText(findTestObject('PLPPage/Discount_Button3_PLP)'))

if (buttonvalue1.contains('(')) {
    println('checked1')
} else {
    FailureHandling.STOP_ON_FAILURE
}

if (buttonvalue2.contains('(')) {
    println('checked1')
} else {
    FailureHandling.STOP_ON_FAILURE
}

if (buttonvalue3.contains('(')) {
    println('checked1')
} else {
    FailureHandling.STOP_ON_FAILURE
}

WebUI.closeBrowser()


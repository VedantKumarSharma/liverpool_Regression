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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('CommonMethodsSmoke/SearchForAProduct_search'), [('searchTerm') : 'mac'], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.scrollToElement(findTestObject('SmokeSuitObjects/PLPPage/pagenation_1_PLP'), 0)

WebUI.scrollToPosition(450, 0)

WebUI.click(findTestObject('SmokeSuitObjects/PLPPage/pagenation_2_PLP'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

a1 = WebUI.getUrl()

System.out.println(a1)

boolean a = a1.contains('page-2')

System.out.println(a)

WebUI.scrollToElement(findTestObject('SmokeSuitObjects/PLPPage/pagenation_1_PLP'), 0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('SmokeSuitObjects/PLPPage/pagenation_1_PLP'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

if (a == true) {
    System.out.println('pagenation clicked page 2')
} else {
    KeywordUtil.markFailed('failed pagenation clicked page 2')
}

b1 = WebUI.getUrl()

boolean b = b1.contains('page-1')

System.out.println(b1)

if (b == true) {
    System.out.println('pagenation clicked page 1')
} else {
    KeywordUtil.markFailed('failed pagenation clicked page 1')
}


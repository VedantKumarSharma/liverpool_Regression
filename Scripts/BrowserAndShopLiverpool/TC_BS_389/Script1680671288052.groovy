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

not_run: WebUI.click(findTestObject('HomePage/MainSearchbar_hp (1)'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'MAC'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('HomePage/MainSearchbar_hp (1)'), 'MAC')

not_run: WebUI.click(findTestObject('HomePage/SearchButton_hp'))

WebUI.click(findTestObject('PLPPage/Price_Filter_min_plp'))

WebUI.setText(findTestObject('PLPPage/Price_Filter_min_plp'), '200')

WebUI.click(findTestObject('PLPPage/Price_Filter_max_plp'))

WebUI.setText(findTestObject('PLPPage/Price_Filter_max_plp'), '500')

WebUI.click(findTestObject('PLPPage/FilterButton_plp'))

WebUI.verifyElementPresent(findTestObject('PLPPage/Verify_Price_Filter_plp'), 0)

WebUI.closeBrowser()


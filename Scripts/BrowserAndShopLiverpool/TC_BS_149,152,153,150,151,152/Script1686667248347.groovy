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

WebUI.navigateToUrl(GlobalVariable.URL)

'TC_BS_152,To verify the  Real time inventory check link is not displayed for the Pre order products in PDP'
WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.PreorderItem], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('PDPPage/ITRLink_pdp'), 0)

'TC_BS_153,To verify the display of “preorder” product flag for preorder products'
WebUI.verifyElementPresent(findTestObject('PDPPage/preOrderFlag_pdp'), 0)

'TC_BS_149,To verify the  Real time inventory check link is not displayed for the Online Exclusive products in PDP'
WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.exclusiveProductId], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('PDPPage/ITRLink_pdp'), 0)

'TC_BS_150,To verify the display of “Exclusivo” product flag for Online Exclusive products'
WebUI.verifyElementPresent(findTestObject('PDPPage/exclusiveProductFlag'), 0)

'TC_BS_151,To verify the  Real time inventory check link is not displayed for the Bundle products in PDP'
WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.bundleItem], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('PDPPage/ITRLink_pdp'), 0)


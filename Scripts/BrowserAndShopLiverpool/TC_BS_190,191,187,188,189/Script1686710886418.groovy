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

'TC_BS_190,To verify the  Real time inventory check link is not displayed for the Pre order products in PDP'
WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.PreorderItem], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('PDPPage/ITRLink_pdp'), 0)

'TC_BS_191,To verify the display of “Pre-order”  flag for  Pre order products'
WebUI.verifyElementPresent(findTestObject('PDPPage/preOrderFlag_pdp'), 0)

'TC_BS_187,To verify the  Real time inventory check link is not displayed for the Online Exclusive products in PDP'
WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.exclusiveProductId], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('PDPPage/ITRLink_pdp'), 0)

'TC_BS_188,To verify the display of “Exclusivo” product flag for Online Exclusive products'
WebUI.verifyElementPresent(findTestObject('PDPPage/exclusiveProductFlag'), 0)

<<<<<<<< Updated upstream:Scripts/BrowserAndShopLiverpool/TC_BS_190,191,187,188,189/Script1686710886418.groovy
'TC_BS_189,To verify the  Real time inventory check link is not displayed for the Bundle products in PDP'
WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.bundleItem], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('PDPPage/ITRLink_pdp'), 0)
========
WebUI.click(findTestObject('OPCPage/final_confirm_order_button_OPC'))

WebUI.closeBrowser()
>>>>>>>> Stashed changes:Scripts/payment paypal and card/payment_card_end_to_end/Script1686327594271.groovy


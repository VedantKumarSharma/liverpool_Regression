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

WebUI.callTestCase(findTestCase('CommonMethodsSmoke/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.colour], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SmokeSuitObjects/PLPPage/Sortby_PLP'))

WebUI.enhancedClick(findTestObject('SmokeSuitObjects/PLPPage/HighToLowPriceSortby_PLP'))

WebUI.enhancedClick(findTestObject('SmokeSuitObjects/PLPPage/product-1-DiscountPrice_PLP'))

WebUI.verifyElementClickable(findTestObject('SmokeSuitObjects/PDPPage/discountPrice_PDP'))

'\r\n'
WebUI.verifyElementClickable(findTestObject('SmokeSuitObjects/PDPPage/breadCrumb_pdp'))

WebUI.verifyElementClickable(findTestObject('SmokeSuitObjects/PDPPage/Colour1_PDP'))

WebUI.verifyElementClickable(findTestObject('SmokeSuitObjects/PDPPage/Colour2_PDP'))

WebUI.verifyElementClickable(findTestObject('SmokeSuitObjects/PDPPage/AddToCart_PDP'))

WebUI.verifyElementClickable(findTestObject('SmokeSuitObjects/PDPPage/Alternate_Img_pdp'))

'\r\n'
WebUI.verifyElementClickable(findTestObject('SmokeSuitObjects/PDPPage/Detail_PDP'))

'verify pdp price\r\n\r\n'
WebUI.verifyElementClickable(findTestObject('SmokeSuitObjects/PDPPage/ProductName_PDP'))

'verify pdp price\r\n\r\n'
WebUI.verifyElementClickable(findTestObject('SmokeSuitObjects/PDPPage/ProductID_pdp'))

'verify pdp price\r\n\r\n'
WebUI.verifyElementClickable(findTestObject('SmokeSuitObjects/PDPPage/Detail_PDP'))


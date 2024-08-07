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

WebUI.callTestCase(findTestCase('CommonMethodsSmoke/close any pop up'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('CommonMethodsSmoke/logout'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('CommonMethodsSmoke/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.jeans], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SmokeSuitObjects/PLPPage/product-1-DiscountPrice_PLP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('SmokeSuitObjects/PDPPage/Size1_PDP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('SmokeSuitObjects/OPCPage/close_popup_OPC'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PDPPage/AddToCart_pdp'))

WebUI.click(findTestObject('SmokeSuitObjects/HomePage/Cart_header'))

WebUI.click(findTestObject('SmokeSuitObjects/CartPage/Iniciar_Cart'))

WebUI.verifyElementPresent(findTestObject('SmokeSuitObjects/HomePage/LoginPage_hp'), 0)

WebUI.verifyElementPresent(findTestObject('SmokeSuitObjects/AccountManagement/CreateNewAccount_Login'), 0)


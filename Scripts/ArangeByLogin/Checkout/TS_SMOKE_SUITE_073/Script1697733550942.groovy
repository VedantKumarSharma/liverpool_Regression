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

WebUI.openBrowser(GlobalVariable.URL)

WebUI.callTestCase(findTestCase('CommonMethodsSmoke/login_odtaqab'), [:], FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('SmokeSuitObjects/HomePage/Logo_hp'))

WebUI.callTestCase(findTestCase('CommonMethodsSmoke/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.Single_SKU_PDP], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SmokeSuitObjects/PDPPage/AddToCart_PDP'))

WebUI.click(findTestObject('SmokeSuitObjects/HomePage/bag_header_HP'))

WebUI.click(findTestObject('SmokeSuitObjects/CartPage/BuyButton_Cart'))

WebUI.click(findTestObject('SmokeSuitObjects/OPCPage/ChangeAddress_Checkout'))

WebUI.click(findTestObject('SmokeSuitObjects/OPCPage/3DotButton2_Checkout'))

WebUI.click(findTestObject('SmokeSuitObjects/OPCPage/EditAddress_Checkout'))

WebUI.setText(findTestObject('SmokeSuitObjects/OPCPage/shortName_addAddress_opc'), GlobalVariable.ShortName)

WebUI.waitForPageLoad(0)

WebUI.enhancedClick(findTestObject('SmokeSuitObjects/OPCPage/ContinueButtonAddAddress_Checkout'))

WebUI.enhancedClick(findTestObject('SmokeSuitObjects/OPCPage/ContinueButtonAddAddress_Checkout'), FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.click(findTestObject('SmokeSuitObjects/HomePage/Logo_hp'), FailureHandling.STOP_ON_FAILURE)

//WebUI.mouseOver(findTestObject('SmokeSuitObjects/HomePage/span_HolaUser_hp'))
//while (WebUI.click(findTestObject('SmokeSuitObjects/HomePage/myAccount_hp')) == false) {
//  WebUI.refresh()
//}
WebUI.click(findTestObject('SmokeSuitObjects/HomePage/MIsCompras_loginUser_HP'))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/deliveryAddress_MyAccount'))

addressBlockContainer = WebUI.getText(findTestObject('SmokeSuitObjects/AccountManagement/addressBlockContainer_Account'))

if (addressBlockContainer == GlobalVariable.ShortName) {
    println('Checked')
}


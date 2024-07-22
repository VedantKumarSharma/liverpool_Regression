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

WebUI.callTestCase(findTestCase('CommonMethodsSmoke/login_odtaqab'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('SmokeSuitObjects/HomePage/MIsCompras_loginUser_HP'))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/DeliveryAddress_Account'))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/ClickAndCollectStores_accounts'))

WebUI.click(findTestObject('SmokeSuitObjects/OPCPage/3DotButton_Checkout'))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/ClickNCollectionDefault_Account'))

TitleAddress = WebUI.getText(findTestObject('SmokeSuitObjects/AccountManagement/ClickNCollectionAddressTitle_Account'))

WebUI.click(findTestObject('SmokeSuitObjects/HomePage/Logo_hp'))

WebUI.callTestCase(findTestCase('CommonMethodsSmoke/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.Single_SKU_PDP], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SmokeSuitObjects/PLPPage/product-1-DiscountPrice_PLP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('SmokeSuitObjects/PDPPage/AddToCart_PDP'))

WebUI.click(findTestObject('SmokeSuitObjects/HomePage/bag_header_HP'))

WebUI.click(findTestObject('SmokeSuitObjects/CartPage/BuyButton_Cart'))

DefaultAddress = WebUI.getText(findTestObject('SmokeSuitObjects/OPCPage/DefaultAddress_Checkout'))

if (TitleAddress == DefaultAddress) {
    Println('Checked')
}

WebUI.click(findTestObject('SmokeSuitObjects/OPCPage/ChangeAddress_Checkout'))

WebUI.click(findTestObject('SmokeSuitObjects/OPCPage/AddressPopupCLickNCollect_Checkout'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('SmokeSuitObjects/OPCPage/CheckAddressDefault_Checkout'), 0)

WebUI.verifyElementPresent(findTestObject('SmokeSuitObjects/OPCPage/ClickNCollectionRadioButton_Checkout'), 0)

WebUI.click(findTestObject('SmokeSuitObjects/OPCPage/Address_PopUP_option1_opc'))

WebUI.click(findTestObject('SmokeSuitObjects/OPCPage/radiobtn1_addressPopup_OPC'))

WebUI.click(findTestObject('SmokeSuitObjects/OPCPage/ContinueButtonAddAddress_Checkout'))


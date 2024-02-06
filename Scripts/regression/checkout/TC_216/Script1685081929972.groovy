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

WebUI.maximizeWindow()

WebUI.click(findTestObject('HomePage/Iniciarsesión_hp'))

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : GlobalVariable.Username, ('password') : GlobalVariable.Password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/clickMyAccountFromHeader'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OPCPage/deliveryAddressHeading_address_opc'))

WebUI.callTestCase(findTestCase('CommonMethods/ClickDelivery_MyAccount'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AccountManagement/ClickAndCollectStores_accounts'))

WebUI.click(findTestObject('OPCPage/3DotButton_Checkout'))

WebUI.click(findTestObject('AccountManagement/ClickNCollectionDefault_Account'))

TitleAddress = WebUI.getText(findTestObject('AccountManagement/ClickNCollectionAddressTitle_Account'))

WebUI.click(findTestObject('CartPage/home_button_(header_liverpool)'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.SLProduct], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePage/FirstProduct_plp'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PDPPage/AddToCart_pdp (1)'))

WebUI.click(findTestObject('HomePage/Cart_header'))

WebUI.click(findTestObject('CartPage/BuyButton_Cart'))

DefaultAddress = WebUI.getText(findTestObject('OPCPage/DefaultAddress_Checkout (1)'))

if (TitleAddress == DefaultAddress) {
    Println('Checked')
}

WebUI.click(findTestObject('OPCPage/changeADDRESS_OPC'))

WebUI.click(findTestObject('OPCPage/AddAddressButtonPopup_checkout'))

WebUI.click(findTestObject('OPCPage/AddressPopupCLickNCollect_Checkout'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('OPCPage/CheckAddressDefault_Checkout'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/ClickNCollectionRadioButton_Checkout'), 0)

WebUI.closeBrowser()


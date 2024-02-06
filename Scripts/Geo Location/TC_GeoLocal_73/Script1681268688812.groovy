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

WebUI.navigateToUrl(GlobalVariable.LiverPoolURL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('HomePage/Iniciarsesión_hp'))

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : GlobalVariable.Username, ('password') : GlobalVariable.Password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('HomePage/Categoras_hp'))

WebUI.mouseOver(findTestObject('HomePage/L1Odtaqab_hp'))

WebUI.click(findTestObject('HomePage/L2_hp'))

WebUI.click(findTestObject('HomePage/FirstProduct_plp'))

WebUI.click(findTestObject('PDPPage/AddToCart_pdp (1)'))

WebUI.click(findTestObject('HomePage/Cart_header'))

WebUI.click(findTestObject('CLPPage/CheckoutButton_Cart'))

WebUI.click(findTestObject('OPCPage/ChangeAddress_Checkout'))

WebUI.click(findTestObject('OPCPage/AddAddressButtonPopup_checkout'))

WebUI.click(findTestObject('OPCPage/AddressAliase_checkout'))

WebUI.setText(findTestObject('OPCPage/AddressAliase_checkout'), 'SHiv')

WebUI.click(findTestObject('OPCPage/PostalCode_Checkout'))

WebUI.setText(findTestObject('OPCPage/PostalCode_Checkout'), '09090')

WebUI.click(findTestObject('OPCPage/SetCity_Checkout'))

WebUI.setText(findTestObject('OPCPage/SetCity_Checkout'), 'Maxico')

WebUI.click(findTestObject('OPCPage/StreetAddress_Checkout'))

WebUI.setText(findTestObject('OPCPage/StreetAddress_Checkout'), 'SanFransisco')

WebUI.click(findTestObject('OPCPage/ExtNumber_Checkout'))

WebUI.setText(findTestObject('OPCPage/ExtNumber_Checkout'), '982395823')

WebUI.click(findTestObject('OPCPage/CellPhone_Checkout'))

WebUI.setText(findTestObject('OPCPage/CellPhone_Checkout'), '892395823')

WebUI.click(findTestObject('OPCPage/ContinueButtonAddAddress_Checkout'))

WebUI.verifyElementPresent(findTestObject('OPCPage/VerifyAddressOPC_Checkout'), 0)

WebUI.scrollToElement(findTestObject('OPCPage/EDD_Checkout'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/EDD_Checkout'), 0)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)


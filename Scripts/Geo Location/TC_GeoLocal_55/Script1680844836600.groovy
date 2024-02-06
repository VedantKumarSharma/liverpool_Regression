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

WebUI.delay(5)

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : GlobalVariable.Username, ('password') : GlobalVariable.Password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CLPPage/AfterLogin_hp'))

WebUI.click(findTestObject('HomePage/myAccount_hp'))

WebUI.click(findTestObject('HomePage/DeliveryAddresses_User'))

WebUI.click(findTestObject('AccountManagement/TiendasClickNCollect'))

WebUI.click(findTestObject('HomePage/Select3DotAddress_hp'))

WebUI.click(findTestObject('AccountManagement/SelectDefaultAddress_accounta'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.SLProduct], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('HomePage/FirstProduct_plp'))

WebUI.click(findTestObject('PDPPage/AddToCart_pdp (1)'))

WebUI.click(findTestObject('HomePage/Cart_header'))

WebUI.click(findTestObject('CLPPage/MoreDeliveryLink_cart'))

WebUI.verifyElementPresent(findTestObject('CLPPage/MoreDeliveryLinkPopup_Cart'), 0)

WebUI.verifyElementPresent(findTestObject('CLPPage/ReceviceAtHome_Cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PDPPage/ClickNCollect_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/EDD_pdp'), 0)

WebUI.closeBrowser()


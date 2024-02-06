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

WebUI.callTestCase(findTestCase('CommonMethods/EmptyCart_RunAt_HP'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('CartPage/home_button_(header_liverpool)'))

WebUI.callTestCase(findTestCase('CommonMethods/clickMyAccountFromHeader'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OPCPage/deliveryAddressHeading_address_opc'))

WebUI.callTestCase(findTestCase('CommonMethods/ClickDelivery_MyAccount'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AccountManagement/ClickAndCollectStores_accounts'))

WebUI.click(findTestObject('AccountManagement/AddStoreClickNCollection_Account'))

WebUI.click(findTestObject('AccountManagement/SelectStateClickNCollection_Account'))

WebUI.click(findTestObject('AccountManagement/StateOptionClickNCollection_Account'))

WebUI.click(findTestObject('AccountManagement/SelectAddressRadioButton_Account'))

WebUI.click(findTestObject('AccountManagement/KeepButtonClickNCollection_Account'))

WebUI.callTestCase(findTestCase('CommonMethods/ClickDelivery_MyAccount'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AccountManagement/ClickAndCollectStores_accounts'))

WebUI.click(findTestObject('AccountManagement/AddStoreClickNCollection_Account'))

WebUI.click(findTestObject('AccountManagement/SelectStateClickNCollection_Account'))

WebUI.click(findTestObject('AccountManagement/StateOptionClickNCollection_Account'))

WebUI.click(findTestObject('AccountManagement/SelectAddressRadioButton_Account'))

WebUI.click(findTestObject('AccountManagement/KeepButtonClickNCollection_Account'))

WebUI.verifyElementPresent(findTestObject('AccountManagement/AlreadyAddressPresent_Account'), 0)

WebUI.closeBrowser()


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

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.SLProductNew], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(20)

WebUI.click(findTestObject('HomePage/SelectStore_hp'))

WebUI.click(findTestObject('HomePage/SelectStateLocationPoup_hp'))

WebUI.click(findTestObject('HomePage/SelectState_popup_hp'))

WebUI.click(findTestObject('HomePage/ChooseState_List_hp'))

WebUI.click(findTestObject('HomePage/SelectStoreByState_hp_'))

WebUI.verifyElementPresent(findTestObject('HomePage/FavStore_hp'), 0)

/*
 * if(WebUI.verifyElementPresent(findTestObject('PLPPage/ExpressDelivery_plp'),
 * 0) == true) {
 * WebUI.scrollToElement(findTestObject('PLPPage/ExpressDelivery_plp'), 0)
 * 
 * WebUI.click(findTestObject('PLPPage/ExpressDelivery_plp')) }
 */
not_run: WebUI.scrollToElement(findTestObject('PLPPage/PickupExpress_plp'), 0)

not_run: WebUI.click(findTestObject('PLPPage/PickupExpress_plp'))

WebUI.click(findTestObject('HomePage/Iniciarsesión_hp'))

WebUI.click(findTestObject('HomePage/myAccount_hp'))

WebUI.click(findTestObject('HomePage/DeliveryAddresses_User'))

WebUI.click(findTestObject('HomePage/Select3DotAddress_hp'))

WebUI.click(findTestObject('AccountManagement/SelectDefaultAddress_accounta'))

WebUI.callTestCase(findTestCase('null'), [('searchTerm') : 'Vaso'], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PLPPage/Pickup_plp'), 0)

WebUI.closeBrowser()


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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.click(findTestObject('SmokeSuitObjects/HomePage/MIsCompras_loginUser_HP'))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/DeliveryAddress_Account'))

WebUI.enhancedClick(findTestObject('SmokeSuitObjects/AccountManagement/ClickAndCollectStores_accounts'))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/AddClickNCollectionAddress_Account'))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/SelectStateClickNCollection_Account'))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/StateOptionClickNCollection_Account'))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/SelectAddressRadioButton_Account'))

WebUI.scrollToElement(findTestObject('SmokeSuitObjects/AccountManagement/KeepButtonClickNCollection_Account'), 0)

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/KeepButtonClickNCollection_Account'))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/ClickAndCollectStores_accounts'))

WebUI.verifyElementPresent(findTestObject('SmokeSuitObjects/AccountManagement/ClickNCollectionFirstAddress_Account'), 0)

WebUI.verifyElementPresent(findTestObject('SmokeSuitObjects/AccountManagement/liverpoolSatellite_clickAndCollect_address'), 0)

////////
WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/liverpoolSatellite_clickAndCollect_address'))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/liverpoolSatellite_clickAndCollect_eliminar_AM'))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/acceptar_RemoveAdress_AM'))


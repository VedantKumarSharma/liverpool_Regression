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

boolean a = WebUI.getText(findTestObject('SmokeSuitObjects/HomePage/span_HolaUser_hp'), FailureHandling.OPTIONAL)

System.out.println(a)

if (a == false) {
    WebUI.callTestCase(findTestCase('CommonMethodsSmoke/login_odtaqab'), [:], FailureHandling.OPTIONAL)
}

WebUI.click(findTestObject('SmokeSuitObjects/HomePage/MIsCompras_loginUser_HP'))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/DeliveryAddress_Account'))

boolean add = WebUI.verifyElementPresent(findTestObject('SmokeSuitObjects/AccountManagement/TestQA_Add_AM'), 0, FailureHandling.OPTIONAL)

if (add == true) {
    WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/Select3Dot_TestQA_Add_AM'))

    WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/ATT/TestQA_Add_Remove_AM'))

    WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/AcceptButton_AccountM'))
}

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/AddAdressPersonal_Account'), FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethodsSmoke/SaveAddress_AccountManagment'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('SmokeSuitObjects/AccountManagement/KeepButtonClickNCollection_Account'))

WebUI.verifyElementPresent(findTestObject('SmokeSuitObjects/AccountManagement/FirstPersonalShippingAddress_Account'), 0)

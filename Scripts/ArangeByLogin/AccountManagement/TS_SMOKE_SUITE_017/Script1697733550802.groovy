import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as KeywordUtil
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

boolean a = WebUI.getText(findTestObject('SmokeSuitObjects/HomePage/span_HolaUser_hp'), FailureHandling.OPTIONAL)

System.out.println(a)

if (a == true) {
    WebUI.callTestCase(findTestCase('CommonMethodsSmoke/login_odtaqab'), [:], FailureHandling.OPTIONAL)
}

WebUI.click(findTestObject('SmokeSuitObjects/HomePage/MIsCompras_loginUser_HP'))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/DeliveryAddress_Account'))

boolean add = WebUI.verifyElementPresent(findTestObject('SmokeSuitObjects/AccountManagement/QATESTING_address_AM'), 0, FailureHandling.OPTIONAL)

if (add == true) {
    WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/Select3dotQATESTING_Add_AM'))

    WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/QAtesting_Address_Remove_AM'))

    WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/AcceptButton_AccountM'))
}

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/AddAdressPersonal_Account'), FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethodsSmoke/SaveAddress_AccountManagment'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/KeepButtonClickNCollection_Account'))

address = WebUI.getText(findTestObject('SmokeSuitObjects/AccountManagement/NOTselected_personal_ShippingAddress1_AM'), FailureHandling.STOP_ON_FAILURE)

System.out.println(address)

System.out.println(GlobalVariable.TempAddress)

if (GlobalVariable.TempAddress == address) {
    println('Address is Added!')
} else {
    println('Address is not Added!')
}


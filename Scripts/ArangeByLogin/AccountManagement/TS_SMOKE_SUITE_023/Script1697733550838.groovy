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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.click(findTestObject('SmokeSuitObjects/HomePage/MIsCompras_loginUser_HP'))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/Mi Cartera_HP'))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/MyCardButton_Account'))

boolean add = WebUI.verifyElementPresent(findTestObject('SmokeSuitObjects/AccountManagement/QAtesting_card_AM'), 0, FailureHandling.OPTIONAL)

if (add == true) {
	WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/Select3dot_qatestingCard_AM'))

	WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/qatesting_eliminar_car_AM'))

	WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/AcceptButton_AccountM'))
}

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/AddCardButton_Account'), FailureHandling.STOP_ON_FAILURE)

Cardname = 'QATESTING'

WebUI.setText(findTestObject('SmokeSuitObjects/AccountManagement/CardName_Account'), Cardname)

WebUI.callTestCase(findTestCase('CommonMethodsSmoke/AddCard_Account'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(0)

CardName = WebUI.getText(findTestObject('SmokeSuitObjects/AccountManagement/CardNameGrid_Account'))

if (Cardname == CardName) {
	println('Add Card Successful')
} else {
	KeywordUtil.markFailed('Card is not Added !')
}

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/Select3dot_qatestingCard_AM'))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/EditCardDetails_Account'), FailureHandling.STOP_ON_FAILURE)

Name = RandomStringUtils.randomAlphabetic(8)

WebUI.sendKeys(findTestObject('SmokeSuitObjects/AccountManagement/FullName_Card_Edit_AM'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('SmokeSuitObjects/AccountManagement/FullName_Card_Edit_AM'), Keys.chord(Keys.CLEAR))

WebUI.sendKeys(findTestObject('SmokeSuitObjects/AccountManagement/FullName_Card_Edit_AM'), Keys.chord(Keys.BACK_SPACE))

WebUI.clearText(findTestObject('SmokeSuitObjects/AccountManagement/FullName_Card_Edit_AM'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.setText(findTestObject('SmokeSuitObjects/AccountManagement/FullName_Card_Edit_AM'), '')

WebUI.sendKeys(findTestObject('SmokeSuitObjects/AccountManagement/FullName_Card_Edit_AM'), Keys.chord(Name))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/AcceptButton_AccountM'))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/Select3dot_qatestingCard_AM'))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/qatesting_eliminar_car_AM'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SmokeSuitObjects/OPCPage/accept_deletion_card_OPC'))

if (WebUI.verifyElementNotPresent(findTestObject('SmokeSuitObjects/AccountManagement/Select3dot_qatestingCard_AM'), 0) == true) {
	println('Card remove Successful')
} else {
	KeywordUtil.markFailed('Card is not Removed !')
}


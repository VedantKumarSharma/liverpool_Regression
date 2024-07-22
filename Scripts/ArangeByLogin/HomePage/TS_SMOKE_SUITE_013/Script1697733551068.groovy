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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

randomemail = GenerateRandomEmail()

WebUI.click(findTestObject('SmokeSuitObjects/HomePage/Iniciar sesion'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('SmokeSuitObjects/HomePage/loginpage/create_account_hp'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('SmokeSuitObjects/HomePage/loginpage/newAccountemail_LP'), randomemail)

WebUI.setText(findTestObject('SmokeSuitObjects/HomePage/loginpage/newAccountPassword_LP'), 'ABCjklxyzkn7000')

WebUI.click(findTestObject('SmokeSuitObjects/HomePage/loginpage/submit_LP'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('SmokeSuitObjects/HomePage/loginpage/name_LP'), 'abc')

WebUI.setText(findTestObject('SmokeSuitObjects/HomePage/loginpage/fatherName_LP'), 'xyz')

WebUI.setText(findTestObject('SmokeSuitObjects/HomePage/loginpage/maternalName_LP'), 'jkl')

WebUI.click(findTestObject('SmokeSuitObjects/HomePage/loginpage/hombre_radioButton_LP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SmokeSuitObjects/HomePage/loginpage/createAccount_button_LP'), FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.URL)

def GenerateRandomEmail() {
    String firstName = 'automation'

    String generatedstring = RandomStringUtils.randomAlphabetic(8)

    String Email = (firstName + generatedstring) + '@digisprint.com'

    KeywordUtil.logInfo(Email)

    return Email
}

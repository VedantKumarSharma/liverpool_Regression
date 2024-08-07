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

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/UpdatePeronalData_Account'))

WebUI.verifyElementPresent(findTestObject('SmokeSuitObjects/AccountManagement/updatePage_Account'), 0)

//lastname = WebUI.getText(findTestObject('SmokeSuitObjects/AccountManagement/LastName_Account'))
'Genrating random new first name '
name = RandomStringUtils.randomAlphabetic(8)

WebUI.clearText(findTestObject('SmokeSuitObjects/AccountManagement/FirstNameProfile_Account'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('SmokeSuitObjects/AccountManagement/FirstNameProfile_Account'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('SmokeSuitObjects/AccountManagement/FirstNameProfile_Account'), name)

def lastname = WebUI.getAttribute(findTestObject('SmokeSuitObjects/AccountManagement/LastName_Account'), 'value')

println(lastname)

accountname = ((name + ' ') + lastname)

println(accountname)

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/UpdateButton_Account'))

fnamelname = WebUI.getText(findTestObject('SmokeSuitObjects/AccountManagement/PersonalDataName_Account'))

println(fnamelname)

if (fnamelname == accountname) {
    println('Checked')
} else {
    KeywordUtil.markFailed('Name is not updated !')
}


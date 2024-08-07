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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('SmokeSuitObjects/HomePage/header_Hola_text_HP'))

WebUI.scrollToElement(findTestObject('SmokeSuitObjects/AccountManagement/Tiempo_aire_MyAccount'), 0)

WebUI.scrollToElement(findTestObject('SmokeSuitObjects/AccountManagement/Tiempo_aire_MyAccount'), 0)

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/Tiempo_aire_MyAccount'))

WebUI.enhancedClick(findTestObject('SmokeSuitObjects/AccountManagement/ATT/checkbox1_MyAccount'))

WebUI.enhancedClick(findTestObject('SmokeSuitObjects/AccountManagement/ATT/paymentOption1_ATT_card_MyAccount'))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/select_month_AM'))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/ATT/SelectMonth_ATT_AM'))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/select_year_AM'))

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/ATT/selectYear_ATT_option2025_AM'))

WebUI.setText(findTestObject('SmokeSuitObjects/AccountManagement/ATT/card_cvv_ATT_MyAccount'), '805')

WebUI.click(findTestObject('SmokeSuitObjects/AccountManagement/ATT/finalize_recharge_MyAccount'))

WebUI.verifyElementPresent(findTestObject('SmokeSuitObjects/OPCPage/ConfirmOrder_Checkout'), 0)

WebUI.click(findTestObject('SmokeSuitObjects/HomePage/logo_confirmPage'))


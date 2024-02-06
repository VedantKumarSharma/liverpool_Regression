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

String StoreValue

StoreValue = CustomKeywords.'com.katalon.sudha.GenerateRandomEmail.getRandomText'('Test')

WebUI.setText(findTestObject('Object Repository/DemoObjects/checkoutpage/shortName_addAddress_opc'), StoreValue)

WebUI.setText(findTestObject('Object Repository/DemoObjects/checkoutpage/mothersLastName_addAddress_opc'), GlobalVariable.MotherName)

WebUI.setText(findTestObject('Object Repository/DemoObjects/checkoutpage/postalCode_addAddress_opc'), GlobalVariable.PostalCode)

WebUI.setText(findTestObject('Object Repository/DemoObjects/checkoutpage/city_addAddress_opc'), GlobalVariable.CityAddAddress)

not_run: WebUI.click(findTestObject('Object Repository/DemoObjects/checkoutpage/div_SeleccionarOTRA COLONIABARRIO DE LA LUZ_b7213d'))

WebUI.click(findTestObject('Object Repository/DemoObjects/checkoutpage/street_addAddress_opc'))

WebUI.setText(findTestObject('Object Repository/DemoObjects/checkoutpage/street_addAddress_opc'), GlobalVariable.StreetAddAddress)

WebUI.setText(findTestObject('Object Repository/DemoObjects/checkoutpage/noExt_addAddress_opc'), GlobalVariable.NoExtAddAddress)

WebUI.setText(findTestObject('DemoObjects/checkoutpage/cellphone_addAddress_opc'), GlobalVariable.CellPhoneAddAddress)

WebUI.setText(findTestObject('Object Repository/DemoObjects/checkoutpage/LADA_addAddress_opc'), GlobalVariable.LADAaddAddress)

WebUI.setText(findTestObject('Object Repository/DemoObjects/checkoutpage/phone_addAddress_opc'), GlobalVariable.phoneAddAddress)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/DemoObjects/checkoutpage/select_SeleccionarOTRA COLONIABARRIO DE LA _f31717'), 
    '0000000000082', true)

WebUI.click(findTestObject('OPCPage/CheckBoxAddAddressPopup_Checkout'))

WebUI.click(findTestObject('OPCPage/ContinueButtonAddAddress_Checkout'))

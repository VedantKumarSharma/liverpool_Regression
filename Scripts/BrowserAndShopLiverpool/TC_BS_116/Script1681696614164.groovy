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

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.gwpParentBTGiftBT], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('PDPPage/gwpRegaloLabel_pdp'), 0)

WebUI.click(findTestObject('PDPPage/AddToCart_pdp (1)'))

WebUI.verifyElementPresent(findTestObject('pdp/addedProductSuccessMessage_pdp'), 0)

WebUI.click(findTestObject('pdp/miniBagValue_pdp'))

WebUI.verifyElementPresent(findTestObject('CartPage/button_Comprarahora_cart (1)'), 0)

WebUI.click(findTestObject('CartPage/myBagImageProduct_cart (1)'))

not_run: WebUI.back()

WebUI.verifyElementPresent(findTestObject('PDPPage/gwpGiftDropdown_pdp'), 0)

WebUI.click(findTestObject('PDPPage/gwpGiftDropdown_pdp'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('pdp/gwpGiftItemDisabled_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('pdp/GwppFirstGiftSelected_popup'), 0)

WebUI.click(findTestObject('pdp/button_Aceptar_gwpPopup_pdp'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PDPPage/button_Agregar a mi bolsa_pdp'))

WebUI.verifyElementPresent(findTestObject('pdp/addedProductSuccessMessage_pdp'), 0)


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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl(GlobalVariable.LiverPoolURL)

not_run: WebUI.click(findTestObject('Object Repository/HomePage/Page_Liverpool es parte de Mi vida (1)/span_Selecciona tu tienda'))

not_run: WebUI.click(findTestObject('Object Repository/HomePage/Page_Liverpool es parte de Mi vida (1)/button_Buscar'))

not_run: WebUI.click(findTestObject('Object Repository/HomePage/Page_Liverpool es parte de Mi vida (1)/span_Buscar por mi ubicacin actual'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Page_Liverpool es parte de Mi vida (1)/button_Estado'), 
    0)


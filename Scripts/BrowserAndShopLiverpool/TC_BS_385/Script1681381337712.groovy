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

not_run: WebUI.navigateToUrl('https://www.liverpool.com.mx/tienda/home')

WebUI.navigateToUrl(GlobalVariable.LiverPoolURL)

not_run: WebUI.click(findTestObject('HomePage/MainSearchbar_hp (1)'))

not_run: WebUI.setText(findTestObject('HomePage/MainSearchbar_hp (1)'), 'MAC')

not_run: WebUI.click(findTestObject('HomePage/SearchButton_hp'))

not_run: WebUI.sendKeys(findTestObject('HomePage/MainSearchbar_hp (1)'), Keys.chord(Keys.ENTER))

WebUI.callTestCase(findTestCase('null'), [('searchTerm') : 'MAC'], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PLPPage/Swatche_colour1_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/Swatche_colour2_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/Swatche_colour3_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/Swatche_colour4_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/Swatche_colour5_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/Swatche_colour6_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/Swatche_Colour_1.1_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/Swatche_Colour_1.2_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/Swatche_Colour_1.3_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/Swatche_Colour_1.4_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/Swatche_Colour_1.5_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/Swatche_Colour_1.6_plp'), 0)

WebUI.click(findTestObject('PLPPage/Swatche_Colour_1.1_plp'))

WebUI.verifyElementPresent(findTestObject('PLPPage/Verify_Img_1_plp'), 0)

WebUI.click(findTestObject('PLPPage/Swatche_Colour_1.2_plp'))

WebUI.verifyElementPresent(findTestObject('PLPPage/Verify_Img_2_plp'), 0)

WebUI.click(findTestObject('PLPPage/Swatche_Colour_1.3_plp'))

WebUI.verifyElementPresent(findTestObject('PLPPage/Verify_Img_3_plp'), 0)

WebUI.closeBrowser()


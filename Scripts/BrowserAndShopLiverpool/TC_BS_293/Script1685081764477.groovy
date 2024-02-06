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

WebUI.navigateToUrl(GlobalVariable.URL2)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.GID], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PDPPage/GID collection/InformationCode_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/GID collection/ViewArticles_Button_PDP'), 0)

WebUI.click(findTestObject('PDPPage/GID collection/ViewArticles_Button_PDP'))

WebUI.verifyElementPresent(findTestObject('PDPPage/GID collection/CurrentBreadcrumb_GID_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/GID collection/Discountprice_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/GID collection/sellingprice_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/GID collection/SoftLine_product1_selectButton_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/GID collection/informationGIDcollection_PDP'), 0)

WebUI.closeBrowser()


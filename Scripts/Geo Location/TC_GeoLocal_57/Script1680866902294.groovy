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

not_run: WebUI.navigateToUrl(GlobalVariable.LiverPoolURL)

WebUI.navigateToUrl('https://odtaqab.liverpool.com.mx/tienda/pdp/JeansslimGAPlavadoobscuroparania/1031371976?hs=true')

WebUI.maximizeWindow()

WebUI.click(findTestObject('HomePage/Iniciarsesión_hp'))

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : GlobalVariable.Username, ('password') : GlobalVariable.Password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://odtaqab.liverpool.com.mx/tienda/pdp/JeansslimGAPlavadoobscuroparania/1031371976?hs=true')

WebUI.click(findTestObject('PDPPage/WishListButton_pdp'))

WebUI.click(findTestObject('CLPPage/AfterLogin_hp'))

WebUI.click(findTestObject('PDPPage/WishListHeaderButton_pdp'))

WebUI.click(findTestObject('Wishlist/WishListShowAll_Wishlist'))

WebUI.click(findTestObject('Wishlist/MoveToCart_Wishlist'))

WebUI.click(findTestObject('HomePage/Cart_header'))

WebUI.verifyElementPresent(findTestObject('CLPPage/EstimatedDelivery_Cart'), 0)

WebUI.verifyElementPresent(findTestObject('CLPPage/MoreDeliveryLink_cart'), 0)

WebUI.closeBrowser()


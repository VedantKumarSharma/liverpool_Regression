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

WebUI.click(findTestObject('PDPPage/ratingButton_PDP'))

WebUI.mouseOver(findTestObject('PDPPage/mouseover3star_PDP'))

WebUI.click(findTestObject('PDPPage/mouseover3star_PDP'))

WebUI.setText(findTestObject('PDPPage/ratingView_PDP'), 'good product')

WebUI.setText(findTestObject('PDPPage/ratingTextArea_PDP'), 'like the product money worth')

WebUI.click(findTestObject('PDPPage/SubmitReview_PDP'))

WebUI.verifyElementText(findTestObject('PDPPage/reviewSubmitedText_PDP'), 'Gracias por compartir tu opinión.')

WebUI.click(findTestObject('PDPPage/close_PDP'), FailureHandling.OPTIONAL)


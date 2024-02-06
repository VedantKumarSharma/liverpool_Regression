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
import com.kms.katalon.core.keyword.KatalonBuiltInKeywordsUtil as KatalonBuiltInKeywordsUtil
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.BigTicketWord], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/productImage2_plp'))

WebUI.delay(5)

'TC_BS_170,To verify the display of “Ver Disponsibilidad en tienda” link for softline Item in PDP. \r\n'
WebUI.verifyElementPresent(findTestObject('PDPPage/ITRLink_pdp'), 0)

'TC_BS_171,"To verify the user is able to click “Ver Disponsibilidad en tienda” link for the selected softline SKU on the PDP for Anonymous/Logged-in user.\n"\r\n'
WebUI.click(findTestObject('PDPPage/ITRLink_pdp'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PDPPage/ItrPopup_pdp'), 0)

'TC_BS_172,To verify the display of state pop-up  on clicking “Ver Disponsibilidad en tienda” link for softline item'
WebUI.verifyElementPresent(findTestObject('PDPPage/productName_itrPopup'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/productId_itrPopup'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/productImage_itrPopup'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/productPrice__itrPopup'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/listOfStates_itrPopup'), 0)

'TC_BS_173,To verify the display of list of States in the drop down on selection, for the softline item\r\n'
WebUI.verifyElementPresent(findTestObject('PDPPage/listOfStates_itrPopup'), 0)

'TC_BS_174,To verify the display of stores available in the state pop-up  for softline item'
WebUI.click(findTestObject('PDPPage/selectState9_itrPopup'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PDPPage/selectedStateDisplay__itrPopup'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/listOfStores__itrPopup'), 0)

'TC_BS_175,To verify the display of 2 radio button to select options -  Todas las Tiendas(All stores) or Solo tiendas con disponibilidad(Availability shops only) in the state pop-up for softline item'
WebUI.verifyElementPresent(findTestObject('PDPPage/conDisponsibilidad__itrPopup'), 0)

'TC_BS_176,To verify the display of  Todas las Tiendas(All stores)  radio button selected by default in state pop up for softline item\r\n'
WebUI.verifyElementPresent(findTestObject('PDPPage/listOfStores__itrPopup'), 0)

WebUI.click(findTestObject('PDPPage/close__itrPopup'))

WebUI.click(findTestObject('PDPPage/ITRLink_pdp'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PDPPage/selectState1_itrPopup'))

'TC_BS_177,To verify the display of out-of-stock label-“No Disponsible”   for  softline item in the state pop-up\r\n\r\n'
WebUI.verifyElementPresent(findTestObject('PDPPage/storesNotAvailable_itrPopup'), 0)

'TC_BS_184,To verify the display of notification message when the softline inventory record is not available in the stores\r\n'
WebUI.verifyElementPresent(findTestObject('PDPPage/InventoryNotAvailableinAllStoresMessage_itrPopup'), 0)

WebUI.click(findTestObject('PDPPage/close__itrPopup'))

WebUI.click(findTestObject('PDPPage/ITRLink_pdp'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PDPPage/selectState9_itrPopup'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PDPPage/listOfStores__itrPopup'), 0)

'TC_BS_178,To verify the display of  number of quantities available in  each store for sofline items in the state drop down'
WebUI.verifyElementPresent(findTestObject('PDPPage/NoOfPiecesInStore_itrPopup'), 0)

'TC_BS_181,To verify the display of quantities in descending order for softline items based on the inventory level for the particular store'
NoOfPiecesInStore1 = WebUI.getText(findTestObject('PDPPage/NoOfPiecesInStore1_itrPopup'))

int noOfPieces1 = NoOfPiecesInStore1.replaceAll(' piezas', '')

NoOfPiecesInStore2 = WebUI.getText(findTestObject('PDPPage/NoOfPiecesInStore2_itrPopup'))

int noOfPieces2 = NoOfPiecesInStore1.replaceAll(' piezas', '')

if (noOfPieces1 >= noOfPieces2) {
    KatalonBuiltInKeywordsUtil.println('No of pieces count is displaying based on descending order')
} else {
    KeywordUtil.markFailed('count is not in descending order')
}


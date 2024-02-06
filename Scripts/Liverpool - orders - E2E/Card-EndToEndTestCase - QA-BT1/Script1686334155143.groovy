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

WebUI.navigateToUrl('https://dtaqa.liverpool.com.mx/tienda')

WebUI.maximizeWindow()

not_run: CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.callTestCase(findTestCase('CommonMethods/clickIniciarSession_Header'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : 'UN85@digisprint.com', ('password') : 'Un85@12345'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/EmptyCart_RunAt_HP'), [:], FailureHandling.OPTIONAL)

'gift item\r\n'
WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.gwpWithSingleVariantWith2Gifts], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/product1_PLP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PDPPage/AddToCart_PDP'))

WebUI.callTestCase(findTestCase('CommonMethods/Check_gift_product_PDP'), [:], FailureHandling.STOP_ON_FAILURE)

'digital item flag\r\n'
WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.digitalP], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PDPPage/digital_item_flag_PDP'), 0)

WebUI.click(findTestObject('PDPPage/AddToCart_PDP'))

'market place '
WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : '1030531937'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/product1_PLP'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('PDPPage/marketPlase_sellerBY_link_PDP'), 0)

WebUI.click(findTestObject('PDPPage/AddToCart_PDP'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'can'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SortBY_highTOlow_check_search_plp'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SortBY_lowTOhigh_check_search_plp'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'ropa'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/facet(liverpool)_CheckBox_selected_check_PLP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/product3_PLP'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('CommonMethods/UpdateQuantity_PDP'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.callTestCase(findTestCase('CommonMethods/Submit_Rating_PDP'), [:], FailureHandling.OPTIONAL)

not_run: WebUI.verifyElementPresent(findTestObject('PDPPage/breadCrumb_pdp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/breadCrumb_pdp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PDPPage/ProductImage_pdp (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PDPPage/Quantity(plus)_PDP'), 0)

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('pdp/regularPrice_pdp'))

WebUI.verifyElementPresent(findTestObject('PDPPage/discountPrice_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/ITRLink_pdp'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('PDPPage/ratingSection_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/span_Compartir_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/AddToCart_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/h3_Ofertas y promociones_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/h3_Opiniones del artculo_pdp'), 0)

not_run: WebUI.click(findTestObject('pdp/selectSize1'))

not_run: WebUI.verifyElementPresent(findTestObject('PDPPage/Quantity(plus)_PDP'), 0)

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('pdp/regularPrice_pdp'))

WebUI.verifyElementPresent(findTestObject('PDPPage/discountPrice_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/ITRLink_pdp'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('PDPPage/ratingSection_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/span_Compartir_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/AddToCart_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/h3_Ofertas y promociones_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/h3_Opiniones del artculo_pdp'), 0)

not_run: WebUI.click(findTestObject('pdp/selectSize1'))

not_run: WebUI.verifyElementPresent(findTestObject('PDPPage/Quantity(plus)_PDP'), 0)

not_run: WebUI.click(findTestObject('pdp/selectSize1'))

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('pdp/carousels_pdp'))

not_run: WebUI.click(findTestObject('pdp/button_Agregar a mi bolsa_pdp'))

WebUI.click(findTestObject('PDPPage/close_PDP'), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.click(findTestObject('PDPPage/Colour1_PDP'), FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('PDPPage/AddToCart_PDP'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('PDPPage/AddToCart_PDP'))

WebUI.click(findTestObject('HomePage/Cart_header'))

WebUI.click(findTestObject('CartPage/BuyButton_Cart'))

WebUI.verifyElementPresent(findTestObject('PDPPage/digital_item_flag_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/Regalo_flag_OPC2'), 0)

WebUI.delay(3)

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('CartPage/span_Mi Bolsa_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/myBagImageProduct_cart (1)'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/productName_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/productPrice_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_EliminarIcon_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/totalPrice_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('CartPage/button_mesaDeRegalos_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_Mover a Wishlist_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_Eliminar_cart (1)'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_Comprarahora_cart (1)'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/priceSection_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_Comprar_cart (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('CartPage/div_Entregaestimada_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/div_carouselSection_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_SeguirComprando_cart'), 0)

WebUI.click(findTestObject('CartPage/button_Comprar_cart (1)'))

WebUI.waitForAlert(0)

WebUI.delay(3)

ActualOPCPageUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('checkoutpage/h4_Confirma tu compra_opc'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/deliveryAddressHeading_address_opc'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/label_Cambiar_Address_opc'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/Forma de Pago_payment_opc'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/paymentSection_payment_opc'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/label_Cambiar_payment_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/productSection_opc'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/productImage_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/productName_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/productprice_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/totalPrice_opc'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/promotionSection_opc'), 0, FailureHandling.OPTIONAL)

not_run: WebUI.verifyElementPresent(findTestObject('checkoutpage/button_Comprar para mesa de regalos_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/button_Mover a Wishlist_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/button_Eliminar_opc'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/button_Cupones_opc (1)'), 0)

WebUI.callTestCase(findTestCase('CommonMethods/cardSelect_card1_CO1'), [:], FailureHandling.STOP_ON_FAILURE)

'would show if the login user has a default card'
WebUI.verifyElementPresent(findTestObject('OPCPage/CardLast4Digit_OPC'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/card_pink_radiobutton_OPC'), 0)

not_run: WebUI.click(findTestObject('OPCPage/final_confirm_order_button_OPC'))

not_run: WebUI.click(findTestObject('OPCPage/button_Continuar_payment_opc (3)'))

WebUI.delay(4)

WebUI.click(findTestObject('OPCPage/button_Finalizar compra_opc (1)'))

WebUI.delay(5)

actualConfirmationUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/a_Mis compras_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/productDetailHeading_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/productImage_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/gracias por comprar_confirmation (1)'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/addressSection_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/paymentSection_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/totalPrice_confirmation'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('ConfirmationPage/carousel_confirmation'), 0)

CardOrder = WebUI.getText(findTestObject('ConfirmationPage/PaypalOrderNumber_ConfirmationPage'))

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/button_Continuar comprando_confirmation'), 0)

WebUI.click(findTestObject('ConfirmationPage/button_Ir a Mis compras_confirmation'))

WebUI.closeBrowser()


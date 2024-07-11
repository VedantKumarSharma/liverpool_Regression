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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://odtaqaa.liverpool.com.mx/tienda')

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

not_run: CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('HomePage/Logo_hp'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/searchTextbox_hp'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/a_Mis Compras_hp'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/span_Iniciar sesin_hp'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/bagIcon_hp'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/multiSites_hp'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/span_Categoras_hp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePage/primaryBanner_hp'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/secondaryBanner_hp'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/carousel1_hp'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/footer_hp'), 0)

WebUI.callTestCase(findTestCase('CommonMethods/clickIniciarSession_Header'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : GlobalVariable.username, ('password') : GlobalVariable.password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/EmptyCart_RunAt_HP'), [:], FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('HomePage/Logo_hp'), 0)

WebUI.click(findTestObject('HomePage/span_Categoras_hp'))

WebUI.click(findTestObject('HomePage/L2CategoryInFlyout_HP'))

WebUI.verifyElementPresent(findTestObject('BLPPage/breadCrumb_blp'), 0)

WebUI.verifyElementPresent(findTestObject('BLPPage/l2Category_blp'), 0)

not_run: CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.click(findTestObject('BLPPage/l2Category_blp'))

WebUI.verifyElementPresent(findTestObject('CLPPage/breadCrumb_clp'), 0)

WebUI.verifyElementPresent(findTestObject('CLPPage/l3Category_clp'), 0)

not_run: CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('PLPPage/breadCrumb_plp'), 0)

WebUI.callTestCase(findTestCase('CommonMethods/EmptyCart_RunAt_HP'), [:], FailureHandling.OPTIONAL)

'gift item\r\n'
WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.gwpWithParentOOS], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/product1_PLP'), FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('CommonMethods/Check_gift_product_PDP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('PDPPage/AddToCart_PDP'))

WebUI.click(findTestObject('PLPPage/Page_Jeans slim GAP lavado obscuro para nio para Liverpool.com.mx/button_Agregar garanta'))

'digital item flag\r\n'
WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.digitalP], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PDPPage/digital_item_flag_PDP'), 0)

WebUI.enhancedClick(findTestObject('PDPPage/AddToCart_PDP'))

'BT'
WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'samsung'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/Sortby_PLP'))

WebUI.click(findTestObject('PLPPage/HighToLowPriceSortby_PLP'))

WebUI.click(findTestObject('PLPPage/product-2-DiscountPrice_PLP'), FailureHandling.OPTIONAL)

WebUI.enhancedClick(findTestObject('PDPPage/AddToCart_PDP'))

WebUI.enhancedClick(findTestObject('CartPage/ClosePopupButton_Cart'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'el'], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PLPPage/div_Precios_plp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/div_Tamao_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/label_Color_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/label_Descuentos_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/productName_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/productImage2_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/listView_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/gridView_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/button_Relevancia_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/button_Lo Ms Nuevo_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/button_Mayor precio_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/button_Menor precio_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/button_Calificaciones_plp'), 0)

not_run: WebUI.click(findTestObject('PLPPage/a_Color_variants-normalizedColor-Blanco_plp'))

WebUI.delay(3)

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/carousel_plp'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'nat'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SortBY_lowTOhigh_check_search_plp'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SortBY_highTOlow_check_search_plp'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/a_Color_variants-normalizedColor-Blanco_plp'))

WebUI.click(findTestObject('HomePage/Logo_hp'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'jeans'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/facet(liverpool)_CheckBox_selected_check_PLP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/product2_PLP'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('PDPPage/breadCrumb_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/alternateImages_pdp'), 0)

'ejemplo'
WebUI.verifyElementPresent(findTestObject('PDPPage/productImage_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/Quantity(plus)_PDP'), 0)

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('pdp/regularPrice_pdp'))

WebUI.verifyElementPresent(findTestObject('PDPPage/discountPrice_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/ITRLink_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/ratingSection_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/span_Compartir_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/AddToCart_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/h3_Ofertas y promociones_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/h3_Opiniones del artculo_pdp'), 0)

not_run: WebUI.click(findTestObject('pdp/selectSize1'))

WebUI.verifyElementPresent(findTestObject('PDPPage/Quantity(plus)_PDP'), 0)

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

WebUI.enhancedClick(findTestObject('PDPPage/AddToCart_PDP'))

WebUI.click(findTestObject('HomePage/Cart_header'))

WebUI.delay(3)

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('CartPage/span_Mi Bolsa_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/myBagImageProduct_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/productName_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/productPrice_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_EliminarIcon_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/totalPrice_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('CartPage/button_mesaDeRegalos_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_Mover a Wishlist_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_Eliminar_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_Comprarahora_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/priceSection_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_Comprar_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('CartPage/div_Entregaestimada_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/div_carouselSection_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_SeguirComprando_cart'), 0)

WebUI.callTestCase(findTestCase('CommonMethods/updateQuantity_cart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CartPage/button_Comprar_cart'))

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

WebUI.verifyElementPresent(findTestObject('checkoutpage/Product1_Name_OPC'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/productprice_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/totalPrice_opc'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/promotionSection_opc'), 0, FailureHandling.OPTIONAL)

not_run: WebUI.verifyElementPresent(findTestObject('checkoutpage/button_Comprar para mesa de regalos_opc'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/button_Mover a Wishlist_opc'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/button_Eliminar_opc'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/button_Cupones_opc'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/digital_product_verify_flag_OPC'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/Regalo_flag_OPC2'), 0)

WebUI.enhancedClick(findTestObject('OPCPage/changeADDRESS_OPC'))

WebUI.verifyElementPresent(findTestObject('OPCPage/CheckAddressDefault_Checkout'), 0)

WebUI.verifyElementClickable(findTestObject('OPCPage/clickAndCollect_OPC'))

WebUI.click(findTestObject('OPCPage/AddAddressButtonPopup_checkout'))

WebUI.callTestCase(findTestCase('CommonMethods/addAddress_fillform_opc'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OPCPage/paymentMethod_change_OPC'))

WebUI.verifyElementPresent(findTestObject('OPCPage/paymentMethod_button1_OPC'), 0)

WebUI.click(findTestObject('OPCPage/paymentMethod_button1_OPC'), FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/cardSelect_card1_CO1'), [:], FailureHandling.STOP_ON_FAILURE)

'would show if the login user has a default card'
WebUI.verifyElementPresent(findTestObject('OPCPage/CardLast4Digit_OPC'), 0)

not_run: WebUI.click(findTestObject('OPCPage/final_confirm_order_button_OPC'))

not_run: WebUI.click(findTestObject('OPCPage/button_Continuar_payment_opc (3)'))

WebUI.delay(4)

WebUI.click(findTestObject('OPCPage/button_Finalizar compra_opc'))

WebUI.delay(5)

actualConfirmationUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/a_Mis compras_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/productDetailHeading_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/productImage_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/gracias por comprar_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/addressSection_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/paymentSection_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/totalPrice_confirmation'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('ConfirmationPage/carousel_confirmation'), 0)

CardOrder = WebUI.getText(findTestObject('ConfirmationPage/PaypalOrderNumber_ConfirmationPage'))

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/button_Continuar comprando_confirmation'), 0)

WebUI.click(findTestObject('ConfirmationPage/button_Ir a Mis compras_confirmation'))

WebUI.callTestCase(findTestCase('CommonMethods/delete_Product1_OPC2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OPCPage/button_Finalizar compra_opc'))

WebUI.delay(3)

actualConfirmationUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/gracias por comprar_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/a_Mis compras_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/productDetailHeading_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/productImage_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/div_Entrega estimada_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/addressSection_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/paymentSection_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/totalPrice_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/legalInfo_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/button_Descargar ticket de pago_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/referenceNumber_confirmation'), 0)

referenceNumber_confirmation = WebUI.getText(findTestObject('ConfirmationPage/referenceNumber_confirmation'))

not_run: WebUI.verifyElementPresent(findTestObject('ConfirmationPage/carousel_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/button_Continuar comprando_confirmation'), 0)

WebUI.click(findTestObject('ConfirmationPage/button_Descargar ticket de pago_confirmation'))

WebUI.click(findTestObject('ConfirmationPage/button_Ir a Mis compras_confirmation'))

WebUI.delay(3)

actualMisComprasUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.setText(findTestObject('MyOrderesPage/mainSearchbar_misCompras'), referenceNumber_confirmation)

WebUI.sendKeys(findTestObject('MyOrderesPage/mainSearchbar_misCompras'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('MyOrderesPage/breadCrumb_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MyOrderesPage/aside_leftNavigation_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MyOrderesPage/mainSearchbar_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MyOrderesPage/span_Filtrar compras_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MyOrderesPage/productName_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MyOrderesPage/img_product__image_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MyOrderesPage/button_Comprar nuevamente__misCompras'), 0)

WebUI.click(findTestObject('MyOrderesPage/button_Ver detalle de compra_misCompras'))

WebUI.closeBrowser()


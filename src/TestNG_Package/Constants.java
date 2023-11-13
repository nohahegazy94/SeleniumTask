package TestNG_Package;

public class Constants {

	String Website_URL = "https://subscribe.jawwy.tv/";
	String Country_Name = "h2.mobile-hidden";

	// Lite Package Elements

	String Lite_Package_Name = "//*[@id=\"name-lite\"]";
	String Lite_Start_Button = "//*[@id=\"lite-selection\"]";
	String Lite_Monthly_Price = "//*[@id=\"currency-lite\"]";
	String Lite_Price = "//*[@id=\"currency-lite\"]/b";
	String Lite_Currency = "//*[@id=\"currency-lite\"]/i";
	String Lite_Discovery = "img[src=\"https://cdn-stg.jawwy.tv/28/New Design/jawwy_check.svg\"]";
	String Lite_FreeTrail = "img[src=\"https://cdn-stg.jawwy.tv/28/New Design/jawwy_check.svg\"]";
	// String
	// Lite_VideoQuality="/html/body/div[1]/div[3]/div/div/div/div[2]/div[6]/div[2]/div[1]";
	// String
	// Lite_DeviceAccess="/html/body/div[1]/div[3]/div/div/div/div[2]/div[7]/div[2]/div[1]";
	// String
	// Lite_Rewind="/html/body/div[1]/div[3]/div/div/div/div[2]/div[8]/div[2]/div[1]";
	String Lite_Offline = "img[src=\"https://cdn-stg.jawwy.tv/28/New Design/jawwy_close.svg\"]";
	String Lite_Simultaneously = "img[src=\"https://cdn-stg.jawwy.tv/28/New Design/jawwy_close.svg\"]";
	String Lite_CastTV = "img[src=\"https://cdn-stg.jawwy.tv/28/New Design/jawwy_close.svg\"]";

	// Classic Package Elements

	String Classic_FreeMonth_Title = "div[class=\"info-flag\"]";
	String Classic_Package_Name = "//*[@id=\"name-classic\"]";
	String Classic_Start_Button = "//*[@id=\"classic-selection\"]";
	String Classic_Monthly_Price = "//*[@id=\"currency-classic\"]";
	String Classic_Price = "//*[@id=\"currency-classic\"]/b";
	String Classic_Currency = "//*[@id=\"currency-classic\"]/i";
	String Classic_Discovery = "img[src=\"https://cdn-stg.jawwy.tv/28/New Design/jawwy_check.svg\"]";
	String Classic_FreeTrail = "img[src=\"https://cdn-stg.jawwy.tv/28/New Design/jawwy_check.svg\"]";
	String Classic_VideoQuality = "//div[normalize-space()='Full HD']";
	String Classic_DeviceAccess = "div[class=\"classic\"]";
	// String
	// Classic_Rewind="/html/body/div[1]/div[3]/div/div/div/div[2]/div[8]/div[2]/div[2]";
	String Classic_Offline = "img[src=\"https://cdn-stg.jawwy.tv/28/New Design/jawwy_check.svg\"]";
	// String
	// Classic_Simultaneously="//*[@id=\"main\"]/div/div[1]/div[10]/div[2]/div[2]";
	String Classic_CastTV = "img[src=\"https://cdn-stg.jawwy.tv/28/New Design/jawwy_check.svg\"]";

	// Premium Package Elements

	String Premium_Package_Name = "//*[@id=\"name-premium\"]";
	String Premium_Start_Button = "//*[@id=\"premium-selection\"]";
	String Premium_Monthly_Price = "//*[@id=\"currency-premium\"]";
	String Premium_Price = "//*[@id=\"currency-premium\"]/b";
	String Premium_Currency = "//*[@id=\"currency-premium\"]/i";
//      String Premium_Discovery = "/html/body/div[1]/div[3]/div/div/div/div[1]/div[4]/div[2]/div[3]"; 
	String Premium_FreeTrail = "img[src=\"https://cdn-stg.jawwy.tv/28/New Design/jawwy_check.svg\"]";
	// String
	// Premium_VideoQuality="/html/body/div[1]/div[3]/div/div/div/div[1]/div[6]/div[2]/div[3]";
	// String
	// Premium_DeviceAccess="/html/body/div[1]/div[3]/div/div/div/div[2]/div[7]/div[2]/div[3]";
	// String
	// Premium_Rewind="/html/body/div[1]/div[3]/div/div/div/div[2]/div[8]/div[2]/div[3]";
	String Premium_Offline = "img[src=\"https://cdn-stg.jawwy.tv/28/New Design/jawwy_check.svg\"]";
	// String
	// Premium_Simultaneously="/html/body/div[1]/div[3]/div/div/div/div[1]/div[10]/div[2]/div[3]";
	String Premium_CastTV = "img[src=\"https://cdn-stg.jawwy.tv/28/New Design/jawwy_check.svg\"]";

	// Add-ons Section

	String Addons_Section = "div[class=\"plan-section extensions\"]";
	String Addons_Title = "/html/body/div[1]/div[3]/div/div/div/div[2]/div[1]/div/h2/b";
	String Addon_SubTitle = "/html/body/div[1]/div[3]/div/div/div/div[2]/div[1]/div/h2/span/text()";

	String GiftCard_Section = "div[class=\"giftcard\"]";
	String GiftCard_Title = "/html/body/div[1]/div[3]/div/div/div/div[3]/div[2]/h4";

	/////////////////////////////////////////////////////////////////////////////////////

	String PaymentHeader = "h3[class=\"payment-header\"]";
	String PaymentOption = "div[class=\"payment-option\"]";
	String GiftCardTitle = "//*[@id=\"giftcard-title\"]";
	String GiftCardOption = "//*[@id=\"giftcard-card\"]";
	String OrderSummaryTitle = "div[class=\"summary-group\"]";

	String PaymentMethodRadioButton = "input[type=\"radio\"]";
	String PaymentMethod_NextButton = "//*[@id=\"btnChoosePaymentMethod\"]";

	String Addons_Options = "div[class=\"two-cols\"]";
	// String OrderSummary_Button = "//*[@id=\"btnChoosePaymentMethod\"]";
	String Next_Button = "//div[@class='summary-group']//button[@id='btnChooseAddons']";

	String EmailAddress_Field = "//*[@id=\"readonlyEmail\"]";
	String Passowrd_Field = "//*[@id=\"readonlyPassword\"]";
	String UserEmail = "jawwy.test2023@gmail.com";
	String UserPasswrd = "Jawwy123";

	String GoToPaymentMethod_Button = "//*[@id=\"btnFinalStepSubscribe\"]";

	/////////////////////////////////////////////////////////////////////////////

	String PageLogo = "h2[class=\"selectPlan-logo\"]";
	String CompleteSubscription_Title = "h3[class=\"selectPlan-title\"]";
	String CardNameHolder_Field = "//*[@id=\"card_holder_name\"]";
	String CardNumber_Field = "//*[@id=\"card_number\"]";
	String CardExpiry_Month = "//*[@id=\"expiry_month\"]";
	String CardExpiry_Year = "//*[@id=\"expiry_year\"]";
	String CardCVV = "//*[@id=\"card_security_code\"]";
	String CancelButton = "a[class=\"form-btn cancel-btn\"]";
	String SubmitButton = "button[type=\"submit\"]";

	////////////////////////////////////////////////////////////////////////////

	String PromoPage = "//*[@id=\"promo-img\"]";
	String DisplayedCountryName = "//*[@id=\"country\"]";
	String AddEmailField = "//*[@id=\"email-mobile\"]";
	String RedeemTheOfferButton = "//*[@id=\"cta-label\"]";

}

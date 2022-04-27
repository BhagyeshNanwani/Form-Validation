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

WebUI.navigateToUrl('https://form.jotform.com/221159422873457')

WebUI.selectOptionByValue(findTestObject('Object Repository/Form Validation Empty Field/Page_Course Registration Form/select_January                  February   _4536b7'), 
    'November', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Form Validation Empty Field/Page_Course Registration Form/select_1                  2                _cf96f8'), 
    '22', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Form Validation Empty Field/Page_Course Registration Form/select_2022                  2021          _d5beaa'), 
    '1998', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Form Validation Empty Field/Page_Course Registration Form/select_Please Select              Male     _68ec99'), 
    'Male', true)

WebUI.setText(findTestObject('Object Repository/Form Validation Empty Field/Page_Course Registration Form/input_Address_q23_addressaddr_line1'), 
    'Mahesh Apartment, Wing -A, Room no -101')

WebUI.setText(findTestObject('Object Repository/Form Validation Empty Field/Page_Course Registration Form/input_Street Address_q23_addressaddr_line2'), 
    'Kharegaon, Bhayander(East)')

WebUI.setText(findTestObject('Object Repository/Form Validation Empty Field/Page_Course Registration Form/input_Street Address Line 2_q23_addresscity'), 
    'Mumbai')

WebUI.setText(findTestObject('Object Repository/Form Validation Empty Field/Page_Course Registration Form/input_City_q23_addressstate'), 
    'Maharashtra')

WebUI.setText(findTestObject('Object Repository/Form Validation Empty Field/Page_Course Registration Form/input_State  Province_q23_addresspostal'), 
    '401105')

WebUI.setText(findTestObject('Object Repository/Form Validation Empty Field/Page_Course Registration Form/input_Company_q14_company'), 
    'Katalon')

WebUI.scrollToElement(findTestObject('Form Validation Empty Field/Page_Course Registration Form/button_Submit Application'), 
    0)

WebUI.click(findTestObject('Object Repository/Form Validation Empty Field/Page_Course Registration Form/button_Submit Application'))

boolean flag = WebUI.verifyElementNotPresent(findTestObject('Form Validation Empty Field/Page_Course Registration Form/div_This field is required - Student name'), 
    5, FailureHandling.OPTIONAL)

if(flag == false) {
	System.out.println("Name Field Is Empty")
}

flag = WebUI.verifyElementNotPresent(findTestObject('Form Validation Empty Field/Page_Course Registration Form/div_This field is required - email'), 
    5, FailureHandling.OPTIONAL)

if(flag == false) {
	System.out.println("Email Field Is Empty")
}

flag = WebUI.verifyElementNotPresent(findTestObject('Form Validation Empty Field/Page_Course Registration Form/div_This field is required - Phone number'), 
    5, FailureHandling.OPTIONAL)

if(flag == false) {
	System.out.println("Phone Number Field Is Empty")
}

WebUI.closeBrowser()


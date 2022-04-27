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

WebUI.setText(findTestObject('Object Repository/Form Validation/Page_Course Registration Form/input__q4_studentNamefirst'), 
    'Bhagyesh')

WebUI.setText(findTestObject('Object Repository/Form Validation/Page_Course Registration Form/input_First Name_q4_studentNamemiddle'), 
    'Ravi')

WebUI.setText(findTestObject('Object Repository/Form Validation/Page_Course Registration Form/input_Middle Name_q4_studentNamelast'), 
    'Nanwani')

WebUI.selectOptionByValue(findTestObject('Object Repository/Form Validation/Page_Course Registration Form/select_January                  February   _4536b7'), 
    'November', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Form Validation/Page_Course Registration Form/select_1                  2                _cf96f8'), 
    '22', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Form Validation/Page_Course Registration Form/select_2022                  2021          _d5beaa'), 
    '1998', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Form Validation/Page_Course Registration Form/select_Please Select              Male     _68ec99'), 
    'Male', true)

WebUI.setText(findTestObject('Object Repository/Form Validation/Page_Course Registration Form/input_Address_q23_addressaddr_line1'), 
    'Mahesh Apartment, Wing -A, Room no -101, Talav Road')

WebUI.setText(findTestObject('Object Repository/Form Validation/Page_Course Registration Form/input_Street Address_q23_addressaddr_line2'), 
    'Bhayander(East), Mumbai--401102')

WebUI.setText(findTestObject('Object Repository/Form Validation/Page_Course Registration Form/input_City_q23_addressstate'), 
    'Maharashtra')

WebUI.setText(findTestObject('Object Repository/Form Validation/Page_Course Registration Form/input_Street Address Line 2_q23_addresscity'), 
    'Mumbai')

WebUI.setText(findTestObject('Object Repository/Form Validation/Page_Course Registration Form/input_State  Province_q23_addresspostal'), 
    '401105')

WebUI.setText(findTestObject('Object Repository/Form Validation/Page_Course Registration Form/input__q6_studentEmail6'), 
    'bhagyeshnanwani22@gmail.com')

WebUI.setText(findTestObject('Object Repository/Form Validation/Page_Course Registration Form/textarea_Additional Comments_q45_clickTo45'), 
    'Complete Form Submission')

WebUI.setText(findTestObject('Object Repository/Form Validation/Page_Course Registration Form/input__q27_mobileNumberfull'), 
    '(938) 210-3948')

WebUI.scrollToElement(findTestObject('Form Validation/Page_Course Registration Form/button_Submit Application'), 4)

WebUI.click(findTestObject('Object Repository/Form Validation/Page_Course Registration Form/button_Submit Application'))

WebUI.closeBrowser()


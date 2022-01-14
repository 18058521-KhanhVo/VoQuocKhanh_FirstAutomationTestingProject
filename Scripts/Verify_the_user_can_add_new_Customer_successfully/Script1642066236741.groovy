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
import org.codehaus.groovy.classgen.genDgmMath as genDgmMath
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.guru99.com/v4/')

WebUI.setText(findTestObject('Object Repository/TMA Solutions Interview Test/Page_Guru99 Bank Home Page/input_UserID_uid'), 
    GlobalVariable.UserID)

WebUI.setText(findTestObject('Object Repository/TMA Solutions Interview Test/Page_Guru99 Bank Home Page/input_Password_password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/TMA Solutions Interview Test/Page_Guru99 Bank Home Page/input_Password_btnLogin'))

WebUI.click(findTestObject('Object Repository/TMA Solutions Interview Test/Page_Guru99 Bank Manager HomePage/a_New Customer'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/TMA Solutions Interview Test/Page_Guru99 Bank Manager HomePage/a_New Customer'))

WebUI.setText(findTestObject('Object Repository/TMA Solutions Interview Test/Page_Guru99 Bank New Customer Entry Page/input_Customer Name_name'), 
    CustomerName)

if (Gender == 'm') {
    WebUI.check(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank New Customer Entry Page/input_malefemale_rad1'))
} else if (Gender == 'f') {
    WebUI.check(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank New Customer Entry Page/input_malefemale_rad2'))
}

String js = String.format('document.getElementById("dob").value = "%s";', DoB)

println(js)

WebUI.focus(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank New Customer Entry Page/input_Date of Birth_dob'))

WebUI.executeJavaScript(js, null)

//WebUI.setText(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank New Customer Entry Page/input_Date of Birth_dob'), 
//    DoB)
WebUI.setText(findTestObject('Object Repository/TMA Solutions Interview Test/Page_Guru99 Bank New Customer Entry Page/textarea_Address_addr'), 
    Address)

WebUI.setText(findTestObject('Object Repository/TMA Solutions Interview Test/Page_Guru99 Bank New Customer Entry Page/input_City_city'), 
    City)

WebUI.setText(findTestObject('Object Repository/TMA Solutions Interview Test/Page_Guru99 Bank New Customer Entry Page/input_State_state'), 
    State)

WebUI.setText(findTestObject('Object Repository/TMA Solutions Interview Test/Page_Guru99 Bank New Customer Entry Page/input_PIN_pinno'), 
    PIN)

WebUI.setText(findTestObject('Object Repository/TMA Solutions Interview Test/Page_Guru99 Bank New Customer Entry Page/input_Mobile Number_telephoneno'), 
    MobileNumber)

WebUI.setText(findTestObject('Object Repository/TMA Solutions Interview Test/Page_Guru99 Bank New Customer Entry Page/input_E-mail_emailid'), 
    Email)

WebUI.setText(findTestObject('Object Repository/TMA Solutions Interview Test/Page_Guru99 Bank New Customer Entry Page/input_Password_password'), 
    Password)

WebUI.click(findTestObject('Object Repository/TMA Solutions Interview Test/Page_Guru99 Bank New Customer Entry Page/input_Password_sub'))

WebUI.verifyTextPresent('Customer Registered Successfully!!!', false)

WebUI.verifyElementText(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank Customer Registration Page/td_customerName'), 
    CustomerName)

if (Gender == 'm') {
    WebUI.verifyElementText(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank Customer Registration Page/td_male'), 
        'male')
} else if (Gender == 'f') {
    WebUI.verifyElementText(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank Customer Registration Page/td_male'), 
        'female')
}

//String[] str = DoB.split('-')
//
//String dob = String.format('%s-%s-%s', str[2], str[0], str[1])
//
WebUI.verifyElementText(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank Customer Registration Page/td_dob'), 
    DoB)

WebUI.verifyElementText(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank Customer Registration Page/td_address'), 
    Address)

WebUI.verifyElementText(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank Customer Registration Page/td_city'), 
    City)

WebUI.verifyElementText(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank Customer Registration Page/td_state'), 
    State)

WebUI.verifyElementText(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank Customer Registration Page/td_password'), 
    PIN)

WebUI.verifyElementText(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank Customer Registration Page/td_phone'), 
    MobileNumber)

WebUI.verifyElementText(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank Customer Registration Page/td_email'), 
    Email)

WebUI.closeBrowser()


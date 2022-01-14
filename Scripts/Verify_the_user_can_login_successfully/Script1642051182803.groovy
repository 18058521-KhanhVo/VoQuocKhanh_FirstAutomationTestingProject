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

WebUI.navigateToUrl('https://demo.guru99.com/v4/')

WebUI.setText(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank Home Page/input_UserID_uid'), GlobalVariable.UserID)

WebUI.setText(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank Home Page/input_Password_password'), GlobalVariable.Password)

WebUI.click(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank Home Page/input_Password_btnLogin'))

WebUI.verifyElementVisible(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank Manager HomePage/a_Manager'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Welcome To Manager\'s Page of Guru99 Bank', false)

WebUI.closeBrowser()


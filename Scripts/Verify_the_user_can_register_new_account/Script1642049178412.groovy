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
import org.seleniumhq.jetty9.server.UserIdentity as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.guru99.com/v4/')

WebUI.click(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank Home Page/a_here'))

WebUI.back()

WebUI.waitForElementClickable(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank Home Page/a_here'), 0)

WebUI.click(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank Home Page/a_here'))

//WebUI.click(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank Home Page/span_Close'))
WebUI.setText(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank Home Page/input_Email ID_emailid'), email)

WebUI.click(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank Home Page/input_Email ID_btnLogin'))

WebUI.verifyTextPresent('Access details to demo site.', false)

GlobalVariable.UserID = WebUI.getText(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank Home Page/td_mngr380125'))

GlobalVariable.Password = WebUI.getText(findTestObject('TMA Solutions Interview Test/Page_Guru99 Bank Home Page/td_saquzav'))

WebUI.verifyTextPresent('This access is valid only for 20 days.', false)

WebUI.closeBrowser()


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sitecoreqa.frbnp2.com/')

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Send Feedback/a_Send Feedback'), 0)

WebUI.click(findTestObject('FRB.com Smoke test/Send Feedback/a_Send Feedback'))

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Send Feedback/div_Send Feedback'), 0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Send Feedback/a_Helpdesk Number'), 0)

WebUI.click(findTestObject('FRB.com Smoke test/Send Feedback/label_I have feedback or a suggestion'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('FRB.com Smoke test/Send Feedback/input_First Name'), 'FName')

WebUI.setText(findTestObject('FRB.com Smoke test/Send Feedback/input_Last Name'), 'LName')

WebUI.setText(findTestObject('FRB.com Smoke test/Send Feedback/input_Zip Code'), '94111')

WebUI.setText(findTestObject('FRB.com Smoke test/Send Feedback/input_Email Address'), 'test@gmail.com')

WebUI.setText(findTestObject('FRB.com Smoke test/Send Feedback/input_Phone Number'), '415-654-5670')

WebUI.click(findTestObject('FRB.com Smoke test/Send Feedback/label_FRB Client Yes'))

WebUI.click(findTestObject('FRB.com Smoke test/Send Feedback/label_Like a Response No'))

WebUI.setText(findTestObject('FRB.com Smoke test/Send Feedback/textarea_Details'), 'test')

WebUI.click(findTestObject('FRB.com Smoke test/Send Feedback/input_Send Contact Information '))

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Send Feedback/div_Thank You'), 0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Send Feedback/a_Helpdesk Number'), 0)

WebUI.closeBrowser()


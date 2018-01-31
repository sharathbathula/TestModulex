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

'Open First Republic Website'
WebUI.openBrowser('')

'Navigate to First Republic Website.'
WebUI.navigateToUrl('https://sitecoreqa.frbnp2.com/')

'Verify Have Us Contact You Link is present'
WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Have Us Contact You/a_Have Us Contact You'), 0)

'Verify Have Us Contact You Page apprears'
WebUI.click(findTestObject('FRB.com Smoke test/Have Us Contact You/a_Have Us Contact You'))

WebUI.setText(findTestObject('FRB.com Smoke test/Have Us Contact You/input_Firstname'), 'Test')

WebUI.setText(findTestObject('FRB.com Smoke test/Have Us Contact You/input_Lastname'), 'User')

WebUI.setText(findTestObject('FRB.com Smoke test/Have Us Contact You/input_Zip Code'), '94111')

WebUI.click(findTestObject('FRB.com Smoke test/Have Us Contact You/label_Telephone'))

WebUI.setText(findTestObject('FRB.com Smoke test/Have Us Contact You/input_Phone Number'), '1234567890')

WebUI.click(findTestObject('FRB.com Smoke test/Have Us Contact You/label_Yes'))

WebUI.setText(findTestObject('FRB.com Smoke test/Have Us Contact You/textarea_Details'), 'Test')

WebUI.click(findTestObject('FRB.com Smoke test/Have Us Contact You/input_Send Contact Information'))

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Have Us Contact You/div_Thank You'), 0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Have Us Contact You/a_Telephone Number'), 0)

WebUI.closeBrowser()


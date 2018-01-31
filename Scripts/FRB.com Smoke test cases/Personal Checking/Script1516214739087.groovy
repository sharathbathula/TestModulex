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

'Open Browser'
WebUI.openBrowser('')

'Navigate to the URL'
WebUI.navigateToUrl('https://sitecoreqa.frbnp2.com/personal/checking/')

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Page_Personal Checking/Page_Checking  First Republic Bank/h2_Get Started Today'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Page_Personal Checking/Page_Checking  First Republic Bank/span_Related articles'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Page_Personal Checking/Page_Checking  First Republic Bank/a_Raising Money Smart Kids'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Page_Personal Checking/Page_Checking  First Republic Bank/h2_You may also be interested'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Page_Personal Checking/Page_Checking  First Republic Bank/a_Client Testimonials'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Page_Personal Checking/Page_Checking  First Republic Bank/h2_What Our Clients Say'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Page_Personal Checking/Page_Checking  First Republic Bank/a_More'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Page_Personal Checking/Page_Checking  First Republic Bank/h2_Additional resources'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Page_Personal Checking/Page_Checking  First Republic Bank/a_Schedule of Fees (PDF)'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Page_Personal Checking/Page_Checking  First Republic Bank/a_Account Disclosure (PDF)'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Page_Personal Checking/Page_Checking  First Republic Bank/a_Compare'), 
    0)

WebUI.click(findTestObject('FRB.com Smoke test/Page_Personal Checking/Page_Checking  First Republic Bank/a_Compare'))

WebUI.closeBrowser()


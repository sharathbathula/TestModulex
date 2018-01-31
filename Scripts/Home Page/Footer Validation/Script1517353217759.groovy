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

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/h3_Contact Us'), 
    0)

WebUI.verifyElementClickable(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/a_Locations_1'))

WebUI.verifyElementClickable(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/a_Client Support Directory'))

WebUI.verifyElementClickable(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/a_Have Us Contact You'))

WebUI.verifyElementClickable(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/a_Send Feedback'))

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/h3_Privacy and Legal'), 
    0)

WebUI.verifyElementClickable(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/a_Online  Mobile Privacy'))

WebUI.verifyElementClickable(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/a_Security  Fraud Prevention'))

WebUI.verifyElementClickable(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/a_Accessibility'))

WebUI.verifyElementClickable(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/a_Terms  Conditions'))

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/h3_More'), 0)

WebUI.verifyElementClickable(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/a_Careers'))

WebUI.verifyElementClickable(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/a_FDIC Information'))

WebUI.verifyElementClickable(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/a_Mortgage Payment Issues'))

WebUI.verifyElementClickable(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/a_Supplier Diversity'))

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/h3_Also Find Us on'), 
    0)

not_run: WebUI.click(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/i_icon icon-share_facebook'))

not_run: WebUI.click(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/a_Back'))

not_run: WebUI.click(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/i_icon icon-share_linkedin'))

not_run: WebUI.click(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/a_Back'))

not_run: WebUI.click(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/i_icon icon-share_twitter'))

not_run: WebUI.click(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/a_Back'))

not_run: WebUI.click(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/i_icon icon-share_instagram'))

not_run: WebUI.click(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/a_Back'))

WebUI.takeScreenshot('C:\\Users\\nanjundareddy.hc\\Desktop\\Reports_Katalon\\Homepage_Footer.png')


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

not_run: WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/img'), 
    10)

WebUI.verifyElementClickable(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/a_Locations'))

WebUI.verifyElementClickable(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/a_Contact Us'))

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/span_Secure Sign In'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/a_Personal'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/a_Business'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/a_Private Wealth Management'), 
    0)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sitecoreqa.frbnp2.com/')

WebUI.click(findTestObject('Home Page/Carousel Image/a_Business'))

WebUI.click(findTestObject('Home Page/Carousel Image/a_Private Wealth Management'))

WebUI.closeBrowser()

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/a_Articles  Insights'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/a_About Us'), 
    0)

WebUI.setText(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/input_search-input'), 'Passbook Savings')

WebUI.click(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/i_icon icon-search'))

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Home Page/Page_Search Results  First Republic/div_Search Results'), 
    0)

WebUI.click(findTestObject('FRB.com Smoke test/Home Page/Page_Search Results  First Republic/a_ First Republic Bank'))

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Home Page/Page_Passbook Savings  First Republ/div_Passbook Savings'), 
    0)


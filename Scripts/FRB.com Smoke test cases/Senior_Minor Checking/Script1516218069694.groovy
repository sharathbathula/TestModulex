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

WebUI.navigateToUrl('https://sitecoreqa.frbnp2.com/personal/checking?gnav=globalheader;personal-checking')

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Page_Senior Minor Checking/Page_Checking  First Republic Bank/a_Senior  Minor Checking (MA o'), 
    0)

WebUI.click(findTestObject('FRB.com Smoke test/Page_Senior Minor Checking/Page_Checking  First Republic Bank/a_Senior  Minor Checking (MA o'))

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Page_Senior Minor Checking/Page_Senior Minor Checking (MA only/div_Senior  Minor Checking Acc'), 
    0)

WebUI.takeScreenshot('C:\\Users\\nanjundareddy.hc\\Desktop\\Reports_Katalon\\Senior Minor Checking screenshot.png')

WebUI.closeBrowser()


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

WebUI.verifyElementText(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/p_ 2018 First Republic Bank. A'), 
    '© 2018 First Republic Bank. All rights reserved.')

WebUI.verifyElementText(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/p_Deposit and loan products ar'), 
    'Deposit and loan products are offered by First Republic Bank, Member FDIC and Equal Housing Lender')

'Need to analyse how to compare images\r\n'
WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/em_icon icon-equal_housing_len'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/p_First Republic Private Wealt'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/p_First Republic Private Wealt - Line 2'), 
    0)

WebUI.verifyElementText(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/p_Brokerage services offered b'), 
    '*Brokerage services offered by First Republic Securities Company, LLC. Investment performance may vary by client.')

WebUI.verifyElementText(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/p_Insurance Services provided'), 
    'Insurance Services provided through First Republic Securities Company, DBA Grand Eagle Insurance Services, LLC, CA Insurance License # 0I13184, and First Republic Investment Management, DBA Eagle Private Insurance Services, CA Insurance License # 0K93728.')

WebUI.verifyElementText(findTestObject('FRB.com Smoke test/Home Page/Page_Its a privilege to serve you/p_Investment Insurance and Adv'), 
    'Investment, Insurance and Advisory Products and Services are Not FDIC Insured, Not Guaranteed and May Lose Value.')

WebUI.takeScreenshot('C:\\Users\\nanjundareddy.hc\\Desktop\\Reports_Katalon\\Homepage_Footer_paragrah.png')


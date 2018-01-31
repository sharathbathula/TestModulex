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

WebUI.navigateToUrl('https://sitecoreqa.frbnp2.com/personal/checking/checking-comparison')

WebUI.click(findTestObject('FRB.com Smoke test/FRB.COm Pages/Compare Checking Accounts/Page_Checking Comparison  First Rep/div_Compare Checking Accounts'))

WebUI.click(findTestObject('FRB.com Smoke test/Compare Checking Accounts/Page_Checking Comparison  First Rep/p_First Republic offers a vari'))

WebUI.click(findTestObject('FRB.com Smoke test/FRB.COm Pages/Compare Checking Accounts/Page_Checking Comparison  First Rep/h3_ATM Rebate Checking'))

WebUI.click(findTestObject('FRB.com Smoke test/FRB.COm Pages/Compare Checking Accounts/Page_Checking Comparison  First Rep/h3_Classic Checking'))

WebUI.click(findTestObject('FRB.com Smoke test/FRB.COm Pages/Compare Checking Accounts/Page_Checking Comparison  First Rep/h3_Basic Checking'))

WebUI.click(findTestObject('FRB.com Smoke test/Compare Checking Accounts/Page_Checking Comparison  First Rep/Page_Checking Comparison  First Rep (1)/div_Ideal If Youre Looking For'))

WebUI.click(findTestObject('FRB.com Smoke test/Compare Checking Accounts/Page_Checking Comparison  First Rep/Page_Checking Comparison  First Rep (1)/div_Interest'))

WebUI.click(findTestObject('FRB.com Smoke test/Compare Checking Accounts/Page_Checking Comparison  First Rep/Page_Checking Comparison  First Rep (1)/div_Monthly Service Fee'))

WebUI.click(findTestObject('FRB.com Smoke test/Compare Checking Accounts/Page_Checking Comparison  First Rep/Page_Checking Comparison  First Rep (1)/div_Minimum Opening Balance'))

WebUI.click(findTestObject('FRB.COm Pages/Compare Checking Accounts/Page_Checking Comparison  First Rep/Page_Checking Comparison  First Rep (1)/div_Additional Details'))

WebUI.click(findTestObject('FRB.COm Pages/Compare Checking Accounts/Page_Checking Comparison  First Rep/Page_Checking Comparison  First Rep (1)/div_FDIC Insurance'))

WebUI.click(findTestObject('FRB.com Smoke test/FRB.COm Pages/Compare Checking Accounts/Page_Checking Comparison  First Rep/Page_Checking Comparison  First Rep/a_View Details_ATM'))

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/FRB.COm Pages/Compare Checking Accounts/Page_ATM Rebate Checking  First Rep/div_ATM Rebate Checking'), 
    0)

WebUI.navigateToUrl('https://sitecoreqa.frbnp2.com/personal/checking/checking-comparison')

WebUI.click(findTestObject('FRB.com Smoke test/FRB.COm Pages/Compare Checking Accounts/Page_Checking Comparison  First Rep/Page_Checking Comparison  First Rep/a_View Rates'))

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Compare Checking Accounts/Page_Rate Finder  First Republic Ba/div_Rate Finder'), 
    0)

WebUI.navigateToUrl('https://www.firstrepublic.com/personal/checking/checking-comparison')

WebUI.click(findTestObject('FRB.com Smoke test/FRB.COm Pages/Compare Checking Accounts/Page_Checking Comparison  First Rep/Page_Checking Comparison  First Rep/a_View Details_Classic'))

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Compare Checking Accounts/Page_Classic Checking  First Republ/div_Classic Checking'), 
    0)

WebUI.navigateToUrl('https://www.firstrepublic.com/personal/checking/checking-comparison')

WebUI.click(findTestObject('FRB.com Smoke test/FRB.COm Pages/Compare Checking Accounts/Page_Checking Comparison  First Rep/Page_Checking Comparison  First Rep/a_View Details_Basic'))

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/FRB.COm Pages/Compare Checking Accounts/Page_Basic Checking  First Republic/div_Basic Checking'), 
    0)

WebUI.closeBrowser()


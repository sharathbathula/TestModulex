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

WebUI.navigateToUrl('https://sitecoreqa.frbnp2.com/about-us/testimonials?gnav=globalheader;articlesinsights-client-testimonials')

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/AI_Client Testimonials/Page_Client Testimonials  First Rep/h1_Client Testimonials'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/AI_Client Testimonials/Page_Client Testimonials  First Rep/p_Our clients say it best. Wat'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/AI_Client Testimonials/Page_Client Testimonials  First Rep/label_Type'), 0)

WebUI.verifyOptionsPresent(findTestObject('FRB.com Smoke test/AI_Client Testimonials/Page_Client Testimonials  First Rep/select_isVideoOnly'), 
    ['All Testimonials', 'Video Only'])

WebUI.selectOptionByLabel(findTestObject('FRB.com Smoke test/AI_Client Testimonials/Page_Client Testimonials  First Rep/select_isVideoOnly'), 
    'All Testimonials', false)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/AI_Client Testimonials/Page_Client Testimonials  First Rep/label_Location'), 
    0)

not_run: while (true) {
}

WebUI.verifyOptionPresentByValue(findTestObject('FRB.com Smoke test/AI_Client Testimonials/Page_Client Testimonials  First Rep/select_locationSearchTerm'), 
    a, false, 0)

WebUI.selectOptionByLabel(findTestObject('FRB.com Smoke test/AI_Client Testimonials/Page_Client Testimonials  First Rep/select_locationSearchTerm'), 
    'Northern California, San Francisco', false)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/AI_Client Testimonials/Page_Client Testimonials  First Rep/label_Industry'), 
    0)

WebUI.delay(5)

WebUI.verifyOptionsPresent(findTestObject('FRB.com Smoke test/AI_Client Testimonials/Page_Client Testimonials  First Rep/select_industrySearchTermID'), 
    ['All Industries', 'Accounting Firms', 'Arts', 'Corporate Executives', 'Entrepreneur', 'Financial Services', 'Independent Schools / Education'
        , 'Law Firms / Attorneys', 'Medical', 'Nonprofits', 'Philanthropists / Volunteers', 'Private Clubs', 'Real Estate / Property Management'
        , 'Restaurants', 'Small Businesses', 'Tech', 'Venture Capital / Private Equity', 'Wineries / Breweries'])

WebUI.selectOptionByLabel(findTestObject('FRB.com Smoke test/AI_Client Testimonials/Page_Client Testimonials  First Rep/select_industrySearchTermID'), 
    'Philanthropists / Volunteers', false)

WebUI.click(findTestObject('FRB.com Smoke test/AI_Client Testimonials/Page_Client Testimonials  First Rep/input_button_Filter Testimonials'))

'Need to develop logic to handle Dyanamic results'
not_run: WebUI.mouseOver(findTestObject('FRB.com Smoke test/AI_Client Testimonials/Page_Client Testimonials  First Rep/div_full-width-grid__item--des'))

not_run: WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/AI_Client Testimonials/Page_Client Testimonials  First Rep/p_Northern California San Fran'), 
    20, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'common.utilities.CommonUtilities.VerifyAllElementsContainsText'(findTestObject('FRB.com Smoke test/AI_Client Testimonials/Page_Client Testimonials  First Rep/p_Northern California San Fran'), 
    'Northern California, San Francisco')

not_run: WebUI.click(findTestObject('FRB.com Smoke test/AI_Client Testimonials/Page_Garret Tom and Family  First R/span_Northern California San F'))

WebUI.takeScreenshot('C:\\Users\\nanjundareddy.hc\\Desktop\\Reports_Katalon\\Dynamic testimonials.png')

CustomKeywords.'common.utilities.CommonUtilities.VerifyAllElementsContainsText'(findTestObject('FRB.com Smoke test/AI_Client Testimonials/Page_Client Testimonials  First Rep/p_Philanthropists or Volunteers'), 
    'Philanthropists / Volunteers')

not_run: WebUI.closeBrowser()


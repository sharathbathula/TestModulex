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

'Navigate to URL'
WebUI.navigateToUrl('https://sitecoreqa.frbnp2.com/')

'Click on Location from Page header.'
WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Its a privilege to serve you/a_Locations'), 20)

'Click on Location from Page header.'
WebUI.click(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Its a privilege to serve you/a_Locations'), FailureHandling.STOP_ON_FAILURE)

'Verify "View All Locations" button is visible.\r\n'
WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Its a privilege to serve you/a_View All Locations'), 
    20)

'Click on "View All Locations" button.'
WebUI.click(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Its a privilege to serve you/a_View All Locations'))

'Verify the link "Transbay"'
WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Office Locations  First Republ/h2_Transbay'), 'Transbay')

'Verify First address line.'
WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Office Locations  First Republ/div_405 Howard Street'), 
    '405 Howard Street')

'Verify Second address line.'
WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Office Locations  First Republ/div_(at Fremont Street)'), 
    '(at Fremont Street)')

'Verify Third address line.'
WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Office Locations  First Republ/div_San Francisco CA 94105'), 
    'San Francisco, CA 94105')

'Capture Screenshot.'
WebUI.takeScreenshot('C:\\Users\\nanjundareddy.hc\\Desktop\\Reports_Katalon\\Location Office Hours1.png')

'Verify on Phone number\r\n'
WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Office Locations  First Republ/a_(415) 975-3877'), '(415) 975-3877')

not_run: WebUI.acceptAlert()

'Verify the link "Transbay"'
WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Office Locations  First Republ/h2_Transbay'), 'Transbay')

'Click "View Hours Details" button\r\n'
WebUI.click(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Office Locations  First Republ/a_View Hours  Details'))

'Verify Location Name\r\n'
WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/h2_Transbay'), 'Transbay')

'Verify (Office Location) text'
WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/div_(Office Location)'), 
    '(Office Location)')

'Verify Office address line 1'
WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/div_405 Howard Street'), 
    '405 Howard Street')

'Verify Office address line 2'
WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/div_(at Fremont Street)'), 
    '(at Fremont Street)')

'Verify Office address line 3'
WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/div_San Francisco'), 'San Francisco, CA 94105')

'Verify Phone number\r\n'
WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/a_(415) 975-3877'), '(415) 975-3877')

not_run: WebUI.acceptAlert()

'Verify Fax\r\n'
WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/div_415-975-3822 (fax)'), 
    '415-975-3822 (fax)')

'Verify "Get Direction" button.'
not_run: WebUI.click(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/a_Get Directions'))

'Return to Locations page.'
not_run: WebUI.click(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/a_Back'))

'Validate the Office hours table presence.'
WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/div_columns small-12 medium-4'), 
    0)

WebUI.takeScreenshot('C:\\Users\\nanjundareddy.hc\\Desktop\\Reports_Katalon\\Location Office Hours2.png')

'Verify the Standard Office hours\r\n'
WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/div_Standard Hours'), 
    0)

WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/div_Mon'), 'Mon:')

not_run: if (true) {
}

WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/div_830 a.m. -  500 p.m.'), 
    '8:30 a.m. - 5:00 p.m.')

WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/div_Tues'), 'Tues:')

WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/div_830 a.m.  -  500 p.m.'), 
    '8:30 a.m. - 5:00 p.m.')

WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/div_Wed'), 'Wed:')

WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/div_830 a.m.  -  500 p.m.'), 
    '8:30 a.m. - 5:00 p.m.')

WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/div_Thu'), 'Thu:')

WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/div_830 a.m.  -  500 p.m._1'), 
    '8:30 a.m. - 5:00 p.m.')

WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/div_Fri'), 'Fri:')

WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/div_830 a.m.  -  600 p.m.'), 
    '8:30 a.m. - 6:00 p.m.')

WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/div_Sat'), 'Sat:')

WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/div_Closed'), 'Closed')

WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/div_Sun'), 'Sun:')

WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/div_Closed'), 'Closed')

'Verify If Office is Open/Closed today\r\n'
WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/h4_Open'), 'Open')

'Verify Office hours for today'
WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/span_Today'), 'Today')

WebUI.verifyElementText(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Transbay  First Republic Bank/span_830 a.m. - 500 p.m.'), 
    '8:30 a.m. - 5:00 p.m.')

'Capture a screenshot of the office hours'
WebUI.takeScreenshot('C:\\Users\\nanjundareddy.hc\\Desktop\\Reports_Katalon\\Location Office Hours.png')

'Click on "Get Directions" link.'
WebUI.click(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Office Locations  First Republ/a_Get Directions'))

'Click on "Continue" button of interstitial message.\r\n'
WebUI.click(findTestObject('FRB.com Smoke test/LOcation Office Hours/Page_Office Locations  First Republ/a_Continue'))

'Close Browser\r\n'
WebUI.closeBrowser()


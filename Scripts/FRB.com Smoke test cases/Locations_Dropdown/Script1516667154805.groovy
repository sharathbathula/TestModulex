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

WebUI.verifyElementText(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_Its a privilege to serve you/a_Locations'), 'Locations')

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_Its a privilege to serve you/a_Locations'))

WebUI.setText(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_Its a privilege to serve you/input_zipCodeAndCity'), 'San Francisco, CA 94112, United States')

not_run: WebUI.selectOptionByValue(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_Its a privilege to serve you/div_locationsDrop'), 
    'San Francisco, CA 94112, United States', false)

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_Its a privilege to serve you/button_Go'))

not_run: WebUI.switchToWindowUrl('https://sitecoreqa.frbnp2.com/locations/san-francisco')

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_Market Square'), 0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94103'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_44 Montgomery'), 0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94104'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_Transbay'), 0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94105'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_Van Ness'), 0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94109'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_Pine'), 0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94111'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_Chinatown'), 0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94108'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_Embarcadero'), 0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94111'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_Laurel Village'), 0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94118'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_The Presidio of San Francis'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94129'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_8th  Irving'), 0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94122'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_19th  Irving'), 0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94122'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_West Portal'), 0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94127'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_Geary'), 0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94121'), 
    0)

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/img'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_Its a privilege to serve you/a_Locations'))

WebUI.setText(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_Its a privilege to serve you/input_zipCodeAndCity'), 'San Francisco, CA, United States')

not_run: WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_Its a privilege to serve you/div_West'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_Its a privilege to serve you/button_Go'))

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_Market Square'), 0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94103'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_44 Montgomery'), 0)

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94104'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_Transbay'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94105'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_Van Ness'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94109'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_Pine'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94111'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_Chinatown'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94108'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_Embarcadero'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94111'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94111'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_Laurel Village'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94118'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_The Presidio of San Francis'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94129'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_8th  Irving'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94122'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_19th  Irving'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94122'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_West Portal'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94127'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/h2_Geary'))

WebUI.click(findTestObject('FRB.com Smoke test/Locations_Dropdown/Page_San Francisco  First Republic/div_San Francisco CA 94121'))

WebUI.closeBrowser()


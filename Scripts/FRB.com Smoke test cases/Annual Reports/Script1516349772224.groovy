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

WebUI.mouseOver(findTestObject('FRB.com Smoke test/About US_Annual Reports/Page_Its a privilege to serve you/a_About Us'))

WebUI.waitForElementVisible(findTestObject('FRB.com Smoke test/About US_Annual Reports/Page_Its a privilege to serve you/a_Annual Reports'), 
    5)

'Unable to click on Annual Reports. Try CSS selector\r\nUnable to click on object \'Object Repository/About US_Annual Reports/Page_Its a privilege to serve you/a_Annual Reports\' (Root cause: org.openqa.selenium.ElementNotVisibleException: element not visible\r\n  (Session info: chrome=63.0.3239.132)\r\n  (Driver info: chromedriver=2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f),platform=Windows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)\r\nCommand duration or timeout: 0 milliseconds\r\nBuild info: version: \'3.7.1\', revision: \'8a0099a\', time: \'2017-11-06T21:07:36.161Z\'\r\nSystem info: host: \'LTPUSSJO2092164\', ip: \'192.168.248.1\', os.name: \'Windows 10\', os.arch: \'amd64\', os.version: \'10.0\', java.version: \'1.8.0_102\'\r\nDriver info: com.kms.katalon.core.webui.driver.ExistingRemoteWebDriver\r\nCapabilities {javascriptEnabled: true, platform: ANY, platformName: ANY}\r\nSession ID: 643a1b7388547fe3f5dc1e8b08f07dc1)\r\n'
WebUI.mouseOver(findTestObject('FRB.com Smoke test/About US_Annual Reports/Page_Its a privilege to serve you/a_Annual Reports'))

WebUI.click(findTestObject('FRB.com Smoke test/About US_Annual Reports/Page_Its a privilege to serve you/a_Annual Reports'))

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/About US_Annual Reports/Page_2016 Annual Report  First Repu (1)/h2_2016 Annual Report'), 
    0)

WebUI.click(findTestObject('FRB.com Smoke test/About US_Annual Reports/Page_2016 Annual Report  First Repu/a_Download PDF'))

WebUI.switchToWindowIndex('1')

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('C:\\Users\\nanjundareddy.hc\\Desktop\\Reports_Katalon\\Download_PDF.png', FailureHandling.STOP_ON_FAILURE)

WebUI.closeWindowTitle('')

not_run: WebUI.closeBrowser()


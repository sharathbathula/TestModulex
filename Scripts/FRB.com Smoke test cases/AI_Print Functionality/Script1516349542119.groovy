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

WebUI.click(findTestObject('FRB.com Smoke test/AI_Print Functionality/Page_Its a privilege to serve you/a_Articles  Insights'))

WebUI.click(findTestObject('FRB.com Smoke test/AI_Print Functionality/Page_Finished Grad School Four Tips/a_Grow Your Wealth'))

WebUI.click(findTestObject('FRB.com Smoke test/AI_Print Functionality/Page_Life  Money  First Republic Ba/a_Meant To Be How to Know if Y'))

WebUI.click(findTestObject('FRB.com Smoke test/AI_Print Functionality/Page_Meant To Be How to Know if You/h1_Meant To Be How to Know if'))

WebUI.switchToWindowTitle('Meant To Be: How to Know if You and Student Loan Refinancing Are a Potential Match | First Republic Bank')

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/AI_Print Functionality/Page_Meant To Be How to Know if You/a_Print'), 
    0)

WebUI.click(findTestObject('FRB.com Smoke test/AI_Print Functionality/Page_Meant To Be How to Know if You/a_Share'))

WebUI.takeScreenshot()

WebUI.verifyElementClickable(findTestObject('FRB.com Smoke test/AI_Print Functionality/Page_Meant To Be How to Know if You/a_Email'))

'Need to explore to learn how to close the outlook that got opened during run.'
WebUI.click(findTestObject('FRB.com Smoke test/AI_Print Functionality/Page_Meant To Be How to Know if You/a_Email'))

WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('FRB.com Smoke test/AI_Print Functionality/Page_Meant To Be How to Know if You/a_Twitter'))

WebUI.delay(3)

WebUI.click(findTestObject('FRB.com Smoke test/AI_Print Functionality/Page_Meant To Be How to Know if You/a_Continue_Twitter'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.closeWindowTitle('Share a link on Twitter')

WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('FRB.com Smoke test/AI_Print Functionality/Page_Meant To Be How to Know if You/a_Facebook_latest'))

WebUI.delay(2)

WebUI.click(findTestObject('FRB.com Smoke test/AI_Print Functionality/Page_Meant To Be How to Know if You/a_Continue_Facebook'))

WebUI.closeWindowTitle('Facebook')

WebUI.switchToWindowTitle('Meant To Be: How to Know if You and Student Loan Refinancing Are a Potential Match | First Republic Bank')

WebUI.delay(3)

WebUI.click(findTestObject('FRB.com Smoke test/AI_Print Functionality/Page_Meant To Be How to Know if You/a_LinkedIn'))

WebUI.delay(3)

WebUI.click(findTestObject('FRB.com Smoke test/AI_Print Functionality/Page_Meant To Be How to Know if You/a_Continue_Linkedin'))

WebUI.delay(2)

WebUI.closeWindowUrl('https://www.linkedin.com/start/join?session_redirect=https%3A%2F%2Fwww.linkedin.com%2Fsharing%2Fshare-offsite%3Fmini%3Dtrue%26url%3Dhttps%3A%2F%2Fsitecoreqa.frbnp2.com%2Farticles-insights%2Flife-money%2Fgrow-your-wealth%2Fmeant-to-be-how-to-know-if-you-and-student-loan-refinancing-are-a-potential-match')

WebUI.delay(2)

WebUI.switchToWindowTitle('Meant To Be: How to Know if You and Student Loan Refinancing Are a Potential Match | First Republic Bank')

WebUI.delay(2)

WebUI.click(findTestObject('FRB.com Smoke test/AI_Print Functionality/Page_Meant To Be How to Know if You/a_Share'))

WebUI.takeScreenshot('C:\\Users\\nanjundareddy.hc\\Desktop\\Reports_Katalon\\AI_Print_Share.png')

WebUI.closeBrowser()


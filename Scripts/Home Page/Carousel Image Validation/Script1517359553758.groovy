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

WebUI.click(findTestObject('Home Page/Carousel Image/button_Slider number 1'))

WebUI.verifyElementText(findTestObject('Home Page/Carousel Image/h2_First Republic provides sta'), 'First Republic provides stability and clarity in an unstable world – trusted relationships matter.')

WebUI.verifyElementText(findTestObject('Home Page/Carousel Image/span_Ian Bremmer Founder and P'), 'Ian Bremmer, Founder and President of Eurasia Group and GZERO Media')

WebUI.verifyElementText(findTestObject('Home Page/Carousel Image/span_Entrepreneur'), 'Entrepreneur')

WebUI.verifyElementText(findTestObject('Home Page/Carousel Image/span_Client of First Republic'), 'Client of First Republic Bank Since \'17')

WebUI.verifyElementClickable(findTestObject('Home Page/Carousel Image/a_View Details'))

WebUI.click(findTestObject('Home Page/Carousel Image/button_Slider number 2'))

WebUI.verifyElementText(findTestObject('Home Page/Carousel Image/h2_Student Loan Refinancing'), 'Student Loan Refinancing')

WebUI.verifyElementText(findTestObject('Home Page/Carousel Image/div_For once in your life aim'), 'For once in your life, aim low.')

WebUI.verifyElementText(findTestObject('Home Page/Carousel Image/p_Fixed rates as low as 1.95 A'), 'Fixed rates as low as 1.95% APR')

WebUI.closeBrowser()


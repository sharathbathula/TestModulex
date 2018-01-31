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

WebUI.click(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Its a privilege to serve you/a_Personal'))

WebUI.click(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Its a privilege to serve you/a_Student Loan Refinancing'))

WebUI.click(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/a_Get your rate'))

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/span_Lets get started'), 
    0)

WebUI.setText(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/input_firstName'), 
    'First Name')

WebUI.setText(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/input_lastName'), 
    'Last Name')

WebUI.setText(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/input_emailAddress'), 
    'QA@test.com')

not_run: WebUI.click(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/div_columns small-12 name-inpu'))

not_run: WebUI.click(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/label_Phone (required)'))

WebUI.setText(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/input_phoneNumber'), 
    '6465467687')

WebUI.click(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/a_Continue'))

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/span_Estimate your payment'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/label_How much do you owe'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/span_150000'), 
    150000)

not_run: WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/label_Select your credit score'), 
    0)

WebUI.selectOptionByValue(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/select_creditScore'), 
    '750 or higher', true)

not_run: WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/label_Zip code (required)'), 
    0)

WebUI.setText(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/input_bankerZipCode'), 
    '94111')

WebUI.selectOptionByValue(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/select_howDidYouHear'), 
    'Gradifi', true)

WebUI.setText(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/input_howDidYouHearDesc'), 
    'Robert')

WebUI.click(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/a_See your results'))

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/div_Congrats First Name'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/h4_Meet'), 
    0)

'Validate banker\'s image. Need to analyse\r\n'
not_run: WebUI.verifyImagePresent(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/img_bankerPhoto'))

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/p_As your dedicated banker fro'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/p_Brett  Klein'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/p_Eagle Lending Relationship M'), 
    0)

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/span_(415) 364-4337'), 
    0)

not_run: WebUI.click(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/span_LinkedIn'))

not_run: WebUI.click(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/a_Continue_1'))

not_run: WebUI.switchToWindowUrl('https://www.firstrepublic.com/student-loan-refinancing/get-rates?intcmp=slide_1;aio')

not_run: WebUI.click(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/span_bkleinfirstrepublic.com'))

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/span_Your results'), 
    0)

not_run: WebUI.verifyImagePresent(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/img'))

WebUI.click(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/a_Terms and conditions'))

WebUI.delay(5)

WebUI.click(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/a_close-reveal-modal'))

WebUI.click(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/a_Continue exploring'))

WebUI.click(findTestObject('FRB.com Smoke test/AIO_Estimate Your Payment/Page_Low Fixed Rate Student Loan Re/div_Student Loan Refinancing'))

WebUI.closeBrowser()


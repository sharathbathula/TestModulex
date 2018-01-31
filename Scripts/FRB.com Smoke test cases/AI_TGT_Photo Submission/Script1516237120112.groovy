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

WebUI.navigateToUrl('https://sitecoreqa.frbnp2.com/articles-insights/travel-gallery?gnav=globalheader;articlesinsights-travel-gallery-&-tips')

WebUI.click(findTestObject('FRB.com Smoke test/AI_TGT_Photo Submission/Page_Travel Gallery and Tips  First/a_Share Your Photos'))

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/AI_TGT_Photo Submission/Page_Photo Submission  First Republ/div_Photo Submission'), 
    0)

WebUI.setText(findTestObject('FRB.com Smoke test/AI_TGT_Photo Submission/Page_Photo Submission  First Republ/input_Your Name'), 
    'FirstName')

WebUI.setText(findTestObject('FRB.com Smoke test/AI_TGT_Photo Submission/Page_Photo Submission  First Republ/input_Email'), 
    'abc@gmail.com')

WebUI.delay(5)

'\r\n'
WebUI.click(findTestObject('FRB.com Smoke test/AI_TGT_Photo Submission/Page_Photo Submission  First Republ/label_Share Anonymously_latest'))

WebUI.setText(findTestObject('FRB.com Smoke test/AI_TGT_Photo Submission/Page_Photo Submission  First Republ/input_Bankers Name'), 
    'Jill Jones')

WebUI.verifyElementPresent(findTestObject('FRB.com Smoke test/AI_TGT_Photo Submission/Page_Photo Submission  First Republ/label_Choose Image'), 
    0, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('FRB.com Smoke test/AI_TGT_Photo Submission/Page_Photo Submission  First Republ/label_Choose Image'), 
    FailureHandling.STOP_ON_FAILURE)

'\r\n'
not_run: WebUI.switchToWindowTitle('Open')

not_run: WebUI.sendKeys(findTestObject(null), '')

WebUI.uploadFile(findTestObject('FRB.com Smoke test/AI_TGT_Photo Submission/Page_Photo Submission  First Republ/label_Choose Image'), 
    'C:\\Users\\nanjundareddy.hc\\Desktop\\Capture.PNG')

WebUI.setText(findTestObject('FRB.com Smoke test/AI_TGT_Photo Submission/Page_Photo Submission  First Republ/input_Field Where Photo Was Taken'), 
    'SFO')

WebUI.click(findTestObject('FRB.com Smoke test/AI_TGT_Photo Submission/Page_Photo Submission  First Republ/label_Do you have a recommenda'))

WebUI.setText(findTestObject('FRB.com Smoke test/AI_TGT_Photo Submission/Page_Photo Submission  First Republ/textarea_Recommendation'), 
    'Test')

WebUI.click(findTestObject('FRB.com Smoke test/AI_TGT_Photo Submission/Page_Photo Submission  First Republ/label_I agree to First Republi'))

WebUI.click(findTestObject('FRB.com Smoke test/AI_TGT_Photo Submission/Page_Photo Submission  First Republ/Button_Submit My Photo'))

WebUI.click(findTestObject('FRB.com Smoke test/AI_TGT_Photo Submission/Page_Thank You  First Republic Bank/div_Thank You'))

WebUI.click(findTestObject('FRB.com Smoke test/AI_TGT_Photo Submission/Page_Thank You  First Republic Bank/p_Your photo has been successf'))

WebUI.closeBrowser()


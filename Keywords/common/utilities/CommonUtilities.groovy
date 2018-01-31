package common.utilities
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.List

import org.openqa.selenium.WebElement
import org.openqa.selenium.By.ByXPath
import org.openqa.selenium.By

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class CommonUtilities {

	@Keyword
	def VerifyAllElementsContainsText(TestObject object,String str){
	
		java.util.List<WebElement> Expectedobj = WebUiCommonHelper.findWebElements(object, 10);
		KeywordUtil.logInfo("Gather Expected WebElements having xpath as '"+ object.findPropertyValue("xpath") +"'");
		
		String Xth = object.findPropertyValue("xpath")+"[contains(text(),'"+str+"')]";
		TestObject nn = object.addProperty("xpath", ConditionType.EQUALS, Xth, true)
		KeywordUtil.logInfo("Build actual object with '"+ Xth);
		
		java.util.List<WebElement> Actualobj = WebUiCommonHelper.findWebElements(nn, 10);
		KeywordUtil.logInfo("Gather actual WebElements having xpath as '"+ nn.findPropertyValue("xpath") +"'");
		
		
		if (Actualobj.size()==Expectedobj.size()) {
			KeywordUtil.logInfo("Actual WebElements("+ Actualobj.size() +") are equal to Expected WebElements("+ Expectedobj.size() +")");
			KeywordUtil.markPassed("All the Elements with xpath " + object.findPropertyValue("xpath")+" contains "+ str+"Search Results have"+ Actualobj.size()+ "matching text");
		}
		else{
			KeywordUtil.logInfo("Actual WebElements("+ Actualobj.size() +") does not match with Expected WebElements("+ Expectedobj.size() +")");
			KeywordUtil.markFailedAndStop("Elements with xpath " + object.findPropertyValue("xpath")+" does not contain "+ str);
		}


	}
}

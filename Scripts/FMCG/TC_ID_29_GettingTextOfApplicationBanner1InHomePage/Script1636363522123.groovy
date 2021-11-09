import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('FMCG/TC_02_SkipLogin'), [:], FailureHandling.STOP_ON_FAILURE)

String text=Mobile.getText(findTestObject('FMCG/HomePage/android.widget.Image - FMCG-App-banner'), 0)

println(text)

Mobile.closeApplication()


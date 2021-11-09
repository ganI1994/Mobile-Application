import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.testng.Assert

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import io.appium.java_client.AppiumDriver

AppiumDriver driver=MobileDriverFactory.getDriver()
 
Mobile.startApplication('C:\\Users\\user\\Downloads\\FMCG_base.apk', true)

Mobile.tap(findTestObject('Object Repository/FMCG/LoginPage/android.webkit.WebView'), 0)

Mobile.tap(findTestObject('Object Repository/FMCG/LoginPage/android.widget.Button - SKIP'), 0)

Mobile.tap(findTestObject('FMCG/AddToCartPage/android.widget.Button - Use Current Address'), 0)

Mobile.tap(findTestObject('Object Repository/FMCG/LoginPage/android.widget.Button - search'), 0)

String actualData=driver.context

println(actualData)

def expected="cart 0"

Assert.assertEquals(expected , actualData)

Mobile.closeApplication()


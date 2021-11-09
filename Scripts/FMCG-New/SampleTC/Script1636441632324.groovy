import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import io.appium.java_client.android.AndroidDriver

//Mobile.startApplication('C:\\Users\\user\\Downloads\\FMCG_base.apk', true)

//Mobile.tap(findTestObject('Object Repository/FMCG/AddToCartPage/android.webkit.WebView (2)'), 0)

//Mobile.tap(findTestObject('Object Repository/FMCG/AddToCartPage/android.widget.Button - SKIP (2)'), 0)

//Mobile.tap(findTestObject('Object Repository/FMCG/AddToCartPage/android.widget.Button - Use Current Address (1)'), 0)

//Mobile.tap(findTestObject('Object Repository/FMCG/AddToCartPage/android.view.View (3)'), 0)

AndroidDriver driver=new AndroidDriver()

Mobile.tap(findTestObject('Object Repository/FMCG/AddToCartPage/android.widget.Image - Fresh-Produce-500x500'), 5)
Thread.sleep(5000)

Mobile.tap(findTestObject('Object Repository/FMCG/AddToCartPage/android.view.View - Fresh Produce'), 0)

Thread.sleep(5000)

//Mobile.closeApplication()


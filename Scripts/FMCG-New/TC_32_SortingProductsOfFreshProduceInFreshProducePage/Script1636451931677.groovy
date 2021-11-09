import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import io.appium.java_client.AppiumDriver

AppiumDriver driver=new AppiumDriver()

Mobile.tap(findTestObject('FMCG/HomePage/android.view.View - Fresh Produce'), 0)

println(driver.getContext())

Mobile.tap(findTestObject('FMCG/FreshProduceCartPage/android.view.View - Fresh AVACADO Each'), 0)

Mobile.tap(findTestObject('FMCG/FreshProduceCartPage/android.widget.Button - cart 0'), 0)


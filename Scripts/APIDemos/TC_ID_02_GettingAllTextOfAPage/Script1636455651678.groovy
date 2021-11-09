import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import io.appium.java_client.AppiumDriver

Mobile.startApplication('E:\\APK\\APIDemos.apk', true)

Mobile.tap(findTestObject('DemoAPI-AppFolder/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('DemoAPI-AppFolder/TextFolder/android.widget.ListView'), 0)

AppiumDriver driver=new AppiumDriver()

def getTexts() {
List<WebElement> list=driver.findElementsByXPath("//hierarchy/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.ListView[1][count(. | //*[@class = 'android.widget.ListView' and @resource-id = 'android:id/list' and (@text = '' or . = '')]) = count(//*[@class = 'android.widget.ListView' and @resource-id = 'android:id/list' and (@text = '' or . = '')])]")

for(WebElement ele: list)
{
	println ele
}
}
getTexts()
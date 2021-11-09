import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import io.appium.java_client.android.AndroidDriver as AndroidDriver

String app=Mobile.startApplication('C:\\Users\\user\\Downloads\\FMCG_base.apk', true)

//AppiumDriverManager adm=new AppiumDriverManager()

//Mobile.startApplication('C:\\Users\\user\\Downloads\\FMCG_base.apk', true)

//URL url=new URL("http://localhost:4723/wd/hub")

//String port=KeywordUtil.logInfo("[APPIUM PORT] " + adm.localStorageAppiumPort.get())

AndroidDriver driver = new AndroidDriver(app)

Mobile.tap(findTestObject('FMCG/HomePage/android.webkit.WebView'), 0)

Mobile.tap(findTestObject('FMCG/AddToCartPage/android.widget.Button - SIGN-UP'), 0)

Mobile.setText(findTestObject('FMCG/AddToCartPage/android.widget.EditText'), 'Adarsh', 0)

Mobile.setText(findTestObject('FMCG/AddToCartPage/android.widget.EditText (1)'), 'G', 0)

Mobile.setText(findTestObject('FMCG/AddToCartPage/android.widget.EditText (2)'), 'gani1234', 0)

Mobile.setText(findTestObject('FMCG/AddToCartPage/android.widget.EditText (3)'), 'gani1234', 0)

String list = driver.getContextHandles()

for (String page : list) {
    println(('--------->' + page) + '<---------')
}

Mobile.closeApplication()


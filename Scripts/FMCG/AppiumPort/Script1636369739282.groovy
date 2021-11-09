import org.openqa.selenium.remote.DesiredCapabilities

import com.kms.katalon.core.appium.driver.AppiumDriverManager
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.KeywordUtil

import io.appium.java_client.android.AndroidDriver

//DesiredCapabilities dc=new DesiredCapabilities()

AppiumDriverManager adm=new AppiumDriverManager()

Mobile.startApplication('C:\\Users\\user\\Downloads\\FMCG_base.apk', true)

String port=KeywordUtil.logInfo("[APPIUM PORT] " + adm.localStorageAppiumPort.get())

println(port)

//URL url=new URL(port)

//AndroidDriver driver=new AndroidDriver( url)
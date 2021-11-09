import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.testng.Assert as Assert
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import io.appium.java_client.AppiumDriver as AppiumDriver
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('E:\\APK\\APIDemos.apk', true)

Mobile.tap(findTestObject('DemoAPI-AppFolder/TextFolder/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/DemoAPI-AppFolder/TextFolder/android.widget.ListView'), 0)

Mobile.tap(findTestObject('Object Repository/DemoAPI-AppFolder/TextFolder/android.widget.TextView - Views'), 0)

Mobile.tap(findTestObject('Object Repository/DemoAPI-AppFolder/TextFolder/android.widget.TextView - 5. Preferences from code'), 
    0)

Mobile.getText(findTestObject('Object Repository/DemoAPI-AppFolder/TextFolder/android.widget.TextView - WiFi settings'), 
    0)

String actualData = Mobile.getText(findTestObject('Object Repository/DemoAPI-AppFolder/TextFolder/android.widget.TextView - Example preference dependency'), 
    0)

println(actualData)

AppiumDriver driver = new AppiumDriver()

String expData = driver.getContext()

Assert.assertEquals(expData, actualData)

Mobile.closeApplication()


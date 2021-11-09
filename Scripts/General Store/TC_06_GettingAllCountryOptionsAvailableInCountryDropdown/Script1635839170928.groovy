import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import io.appium.java_client.android.AndroidDriver

Mobile.startApplication('E:\\APK\\General-Store (1).apk', true)

AndroidDriver driver=new AndroidDriver();
driver.findel
Mobile.tap(findTestObjects('Object Repository/General Store/TC_06/android.widget.Spinner'), 0)

for (def i=0; i<Mobile.tap(findTestObjects('Object Repository/General Store/TC_06/android.widget.Spinner'), 0).size;i++  ) 
	{
		println"i"
	}


//System.out.println(list.getOptions());
Mobile.closeApplication()


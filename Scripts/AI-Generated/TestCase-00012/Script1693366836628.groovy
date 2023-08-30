import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page_product_chekhol-the-amity-affliction'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/product/chekhol-the-amity-affliction')

'step 2: Add visual checkpoint at Page_product_chekhol-the-amity-affliction'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00012_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}

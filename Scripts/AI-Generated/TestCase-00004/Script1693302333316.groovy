import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page_thank-you_f824a39e-70f1-4a1c-b83e-6e9e5cca4794'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/thank-you/f824a39e-70f1-4a1c-b83e-6e9e5cca4794')

'step 2: Add visual checkpoint at Page_thank-you_f824a39e-70f1-4a1c-b83e-6e9e5cca4794'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00004_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}

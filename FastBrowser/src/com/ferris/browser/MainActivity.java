package com.ferris.browser;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.ferris.browser.preference.PreferenceManager;
@SuppressWarnings("deprecation")
public class MainActivity extends BaseActivity {
	CookieManager mCookieManager;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}

	public void updateCookiePreference() {
		mCookieManager = CookieManager.getInstance();
		if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
			CookieSyncManager.createInstance(this);
		}
		mCookieManager.setAcceptCookie(PreferenceManager.getInstance().getCookiesEnabled());
		super.updateCookiePreference();
	}
	
	@Override
	protected void onNewIntent(Intent intent) {
		handleNewIntent(intent);
		super.onNewIntent(intent);
	}
	
	@Override
	public void closeActivity() {
		moveTaskToBack(true);
	}
	
	@Override
	public synchronized void initializeTabs() {
		restoreOrNewTab();
		// if incognito mode use newTab(null, true); instead
	}
}

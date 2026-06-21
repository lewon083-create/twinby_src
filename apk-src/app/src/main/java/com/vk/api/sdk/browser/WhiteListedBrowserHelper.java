package com.vk.api.sdk.browser;

import android.content.Context;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class WhiteListedBrowserHelper {
    private static final List<VersionedBrowserMatcher> WHITE_LIST = Arrays.asList(VersionedBrowserMatcher.CHROME_BROWSER, VersionedBrowserMatcher.CHROME_CUSTOM_TAB, VersionedBrowserMatcher.FIREFOX_CUSTOM_TAB, VersionedBrowserMatcher.FIREFOX_BROWSER, VersionedBrowserMatcher.SAMSUNG_BROWSER, VersionedBrowserMatcher.SAMSUNG_CUSTOM_TAB);

    public static BrowserDescriptor selectBestBrowser(Context context) {
        try {
            List<BrowserDescriptor> allBrowsers = BrowserSelector.getAllBrowsers(context);
            for (BrowserDescriptor browserDescriptor : allBrowsers) {
                Iterator<VersionedBrowserMatcher> it = WHITE_LIST.iterator();
                while (it.hasNext()) {
                    if (it.next().matches(browserDescriptor)) {
                        return browserDescriptor;
                    }
                }
            }
            if (allBrowsers.isEmpty()) {
                return null;
            }
            return allBrowsers.get(0);
        } catch (Exception e3) {
            Log.e("BrowserSelector", "Exception in select browser", e3);
            return null;
        }
    }
}

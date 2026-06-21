package com.vk.api.sdk.browser;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class Browsers {

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Chrome {
        public static final String PACKAGE_NAME = "com.android.chrome";
        public static final String SIGNATURE = "7fmduHKTdHHrlMvldlEqAIlSfii1tl35bxj1OXN5Ve8c4lU6URVu4xtSHc3BVZxS6WWJnxMDhIfQN0N0K2NDJg==";
        public static final Set<String> SIGNATURE_SET = Collections.singleton(SIGNATURE);
        public static final DelimitedVersion MINIMUM_VERSION_FOR_CUSTOM_TAB = DelimitedVersion.parse("45");

        private Chrome() {
        }

        public static BrowserDescriptor customTab(String str) {
            return new BrowserDescriptor(PACKAGE_NAME, SIGNATURE_SET, str, true);
        }

        public static BrowserDescriptor standaloneBrowser(String str) {
            return new BrowserDescriptor(PACKAGE_NAME, SIGNATURE_SET, str, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Firefox {
        public static final String PACKAGE_NAME = "org.mozilla.firefox";
        public static final String SIGNATURE_HASH = "2gCe6pR_AO_Q2Vu8Iep-4AsiKNnUHQxu0FaDHO_qa178GByKybdT_BuE8_dYk99G5Uvx_gdONXAOO2EaXidpVQ==";
        public static final Set<String> SIGNATURE_SET = Collections.singleton(SIGNATURE_HASH);
        public static final DelimitedVersion MINIMUM_VERSION_FOR_CUSTOM_TAB = DelimitedVersion.parse("57");

        private Firefox() {
        }

        public static BrowserDescriptor customTab(String str) {
            return new BrowserDescriptor(PACKAGE_NAME, SIGNATURE_SET, str, true);
        }

        public static BrowserDescriptor standaloneBrowser(String str) {
            return new BrowserDescriptor(PACKAGE_NAME, SIGNATURE_SET, str, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class SBrowser {
        public static final String PACKAGE_NAME = "com.sec.android.app.sbrowser";
        public static final String SIGNATURE_HASH = "ABi2fbt8vkzj7SJ8aD5jc4xJFTDFntdkMrYXL3itsvqY1QIw-dZozdop5rgKNxjbrQAd5nntAGpgh9w84O1Xgg==";
        public static final Set<String> SIGNATURE_SET = Collections.singleton(SIGNATURE_HASH);
        public static final DelimitedVersion MINIMUM_VERSION_FOR_CUSTOM_TAB = DelimitedVersion.parse("4.0");

        private SBrowser() {
        }

        public static BrowserDescriptor customTab(String str) {
            return new BrowserDescriptor(PACKAGE_NAME, SIGNATURE_SET, str, true);
        }

        public static BrowserDescriptor standaloneBrowser(String str) {
            return new BrowserDescriptor(PACKAGE_NAME, SIGNATURE_SET, str, false);
        }
    }

    private Browsers() {
    }
}

package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.protocol.App;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFf1oSDK extends AFf1sSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFLogger = 1;
    private static int registerClient;
    private final AFc1hSDK copy;
    private final String copydefault;
    private final AFg1nSDK equals;
    private final AFc1oSDK hashCode;
    private static char[] AFKeystoreWrapper = {52730, 63488, 52732, 63493, 63494, 52733, 63510, 52735, 63498};
    private static char AFInAppEventType = 52733;

    public AFf1oSDK(String str, AFd1zSDK aFd1zSDK) {
        super(new AFg1tSDK(), aFd1zSDK, str);
        this.hashCode = aFd1zSDK.AFAdRevenueData();
        this.copy = aFd1zSDK.AFInAppEventParameterName();
        this.copydefault = str;
        this.equals = aFd1zSDK.component3();
    }

    private static void a(byte b2, String str, int i, Object[] objArr) {
        int i10;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1pSDK aFk1pSDK = new AFk1pSDK();
        char[] cArr2 = AFKeystoreWrapper;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i11 = 0; i11 < length; i11++) {
                cArr3[i11] = (char) (((long) cArr2[i11]) ^ (-9203380046050046466L));
            }
            cArr2 = cArr3;
        }
        char c8 = (char) ((-9203380046050046466L) ^ ((long) AFInAppEventType));
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i10 = i - 1;
            cArr4[i10] = (char) (cArr[i10] - b2);
        } else {
            i10 = i;
        }
        if (i10 > 1) {
            int i12 = $10 + 65;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            aFk1pSDK.getMonetizationNetwork = 0;
            while (true) {
                int i14 = aFk1pSDK.getMonetizationNetwork;
                if (i14 >= i10) {
                    break;
                }
                char c9 = cArr[i14];
                aFk1pSDK.getRevenue = c9;
                char c10 = cArr[i14 + 1];
                aFk1pSDK.getCurrencyIso4217Code = c10;
                if (c9 == c10) {
                    int i15 = $11 + 115;
                    $10 = i15 % 128;
                    if (i15 % 2 != 0) {
                        cArr4[i14] = (char) (c9 >>> b2);
                        cArr4[i14 >> 1] = (char) (c10 << b2);
                    } else {
                        cArr4[i14] = (char) (c9 - b2);
                        cArr4[i14 + 1] = (char) (c10 - b2);
                    }
                } else {
                    int i16 = c9 / c8;
                    aFk1pSDK.getMediationNetwork = i16;
                    int i17 = c9 % c8;
                    aFk1pSDK.component2 = i17;
                    int i18 = c10 / c8;
                    aFk1pSDK.AFAdRevenueData = i18;
                    int i19 = c10 % c8;
                    aFk1pSDK.component3 = i19;
                    if (i17 == i19) {
                        int i20 = ((i16 + c8) - 1) % c8;
                        aFk1pSDK.getMediationNetwork = i20;
                        int i21 = ((i18 + c8) - 1) % c8;
                        aFk1pSDK.AFAdRevenueData = i21;
                        cArr4[i14] = cArr2[(i20 * c8) + i17];
                        cArr4[i14 + 1] = cArr2[(i21 * c8) + i19];
                    } else if (i16 == i18) {
                        int i22 = ((i17 + c8) - 1) % c8;
                        aFk1pSDK.component2 = i22;
                        int i23 = ((i19 + c8) - 1) % c8;
                        aFk1pSDK.component3 = i23;
                        cArr4[i14] = cArr2[(i16 * c8) + i22];
                        cArr4[i14 + 1] = cArr2[(i18 * c8) + i23];
                    } else {
                        cArr4[i14] = cArr2[(i16 * c8) + i19];
                        cArr4[i14 + 1] = cArr2[(i18 * c8) + i17];
                    }
                }
                aFk1pSDK.getMonetizationNetwork = i14 + 2;
            }
        }
        $10 = ($11 + 5) % 128;
        for (int i24 = 0; i24 < i; i24++) {
            cArr4[i24] = (char) (cArr4[i24] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private void equals() {
        int i = AFLogger + 33;
        registerClient = i % 128;
        int i10 = i % 2;
        ((AFf1sSDK) this).component2.AFAdRevenueData("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i, int i10, int i11) {
        int i12 = ~i10;
        int i13 = ~i;
        int i14 = ~i11;
        return (((~(i | i10)) | ((~(i14 | i10)) | (~(i12 | i13)))) * 494) + ((((i10 | i13) | i14) * 494) + (((i | i12) * (-988)) + ((i10 * (-493)) + (i * 495)))) != 1 ? getMonetizationNetwork(objArr) : getMediationNetwork(objArr);
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFf1oSDK aFf1oSDK = (AFf1oSDK) objArr[0];
        int i = registerClient + 109;
        AFLogger = i % 128;
        if (i % 2 == 0) {
            super.getCurrencyIso4217Code();
            throw null;
        }
        super.getCurrencyIso4217Code();
        ResponseNetwork responseNetwork = ((AFe1fSDK) aFf1oSDK).areAllFieldsValid;
        if (responseNetwork != null) {
            int i10 = registerClient + 3;
            AFLogger = i10 % 128;
            if (i10 % 2 == 0) {
                responseNetwork.isSuccessful();
                throw null;
            }
            if (responseNetwork.isSuccessful()) {
                aFf1oSDK.equals();
                registerClient = (AFLogger + 17) % 128;
            }
        }
        return null;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFf1oSDK aFf1oSDK = (AFf1oSDK) objArr[0];
        AFh1mSDK aFh1mSDK = (AFh1mSDK) objArr[1];
        super.AFAdRevenueData(aFh1mSDK);
        Context context = aFf1oSDK.copy.getMonetizationNetwork;
        AFa1ySDK revenue = AFa1ySDK.getRevenue();
        if (context == null) {
            throw new IllegalStateException("Context is not provided, can't send register request");
        }
        if (revenue.getCurrencyIso4217Code()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        try {
            aFh1mSDK.getMonetizationNetwork("app_version_code", Integer.toString(aFf1oSDK.hashCode.n_().versionCode));
            aFh1mSDK.getMonetizationNetwork(CommonUrlParts.APP_VERSION, aFf1oSDK.hashCode.n_().versionName);
            aFh1mSDK.getMonetizationNetwork(App.JsonKeys.APP_NAME, aFf1oSDK.s_(context.getPackageManager()));
            aFh1mSDK.getMonetizationNetwork("installDate", AFa1ySDK.getMonetizationNetwork(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), aFf1oSDK.hashCode.n_().firstInstallTime));
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th2);
        }
        aFf1oSDK.equals.getRevenue(aFh1mSDK.AFAdRevenueData);
        aFh1mSDK.AFAdRevenueData.remove("ivc");
        String mediationNetwork = AFa1ySDK.getMediationNetwork();
        if (mediationNetwork != null) {
            int i = AFLogger + 47;
            registerClient = i % 128;
            if (i % 2 != 0) {
                aFh1mSDK.getMonetizationNetwork("appUserId", mediationNetwork);
                int i10 = 83 / 0;
            } else {
                aFh1mSDK.getMonetizationNetwork("appUserId", mediationNetwork);
            }
        }
        try {
            aFh1mSDK.getMonetizationNetwork("model", Build.MODEL);
            Object[] objArr2 = new Object[1];
            a((byte) (3 - (ViewConfiguration.getTouchSlop() >> 8)), "\u0003\u0007\u0005\u0006㘁", 5 - (Process.myPid() >> 22), objArr2);
            aFh1mSDK.getMonetizationNetwork(((String) objArr2[0]).intern(), Build.BRAND);
        } catch (Throwable th3) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th3);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i11 = AFLogger + 89;
            registerClient = i11 % 128;
            if (i11 % 2 != 0) {
                aFh1mSDK.getMonetizationNetwork(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                int i12 = 47 / 0;
            } else {
                aFh1mSDK.getMonetizationNetwork(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            }
        }
        AFb1jSDK aFb1jSDKL_ = AFb1lSDK.l_(context.getContentResolver());
        if (aFb1jSDKL_ != null) {
            registerClient = (AFLogger + 35) % 128;
            aFh1mSDK.getMonetizationNetwork("amazon_aid", aFb1jSDKL_.getRevenue);
            aFh1mSDK.getMonetizationNetwork("amazon_aid_limit", String.valueOf(aFb1jSDKL_.getCurrencyIso4217Code));
        }
        aFh1mSDK.getMonetizationNetwork("devkey", ((AFe1fSDK) aFf1oSDK).component1.getMediationNetwork());
        aFh1mSDK.getMonetizationNetwork("uid", AFb1kSDK.getCurrencyIso4217Code(aFf1oSDK.hashCode.getMediationNetwork));
        aFh1mSDK.getMonetizationNetwork("af_gcm_token", aFf1oSDK.copydefault);
        aFh1mSDK.getMonetizationNetwork("launch_counter", Integer.toString(((AFf1sSDK) aFf1oSDK).component2.getRevenue("appsFlyerCount", 0)));
        aFh1mSDK.getMonetizationNetwork("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String strComponent3 = aFf1oSDK.hashCode.component3();
        if (strComponent3 == null) {
            return null;
        }
        aFh1mSDK.getMonetizationNetwork(AppsFlyerProperties.CHANNEL, strComponent3);
        AFLogger = (registerClient + 61) % 128;
        return null;
    }

    private String s_(PackageManager packageManager) {
        ApplicationInfo applicationInfo = this.hashCode.n_().applicationInfo;
        if (applicationInfo != null) {
            String string = packageManager.getApplicationLabel(applicationInfo).toString();
            int i = AFLogger + 95;
            registerClient = i % 128;
            if (i % 2 == 0) {
                return string;
            }
            throw null;
        }
        int i10 = AFLogger;
        int i11 = i10 + 119;
        registerClient = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        registerClient = (i10 + 71) % 128;
        return "";
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    public final void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
        getCurrencyIso4217Code(new Object[]{this, aFh1mSDK}, 908933800, -908933800, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    public final void component1(AFh1mSDK aFh1mSDK) {
        String strAreAllFieldsValid;
        int i = AFLogger + 13;
        registerClient = i % 128;
        if (i % 2 != 0) {
            strAreAllFieldsValid = this.hashCode.areAllFieldsValid();
            int i10 = 83 / 0;
            if (strAreAllFieldsValid == null) {
                return;
            }
        } else {
            strAreAllFieldsValid = this.hashCode.areAllFieldsValid();
            if (strAreAllFieldsValid == null) {
                return;
            }
        }
        registerClient = (AFLogger + 19) % 128;
        aFh1mSDK.getMonetizationNetwork("advertiserId", strAreAllFieldsValid);
        AFLogger = (registerClient + 39) % 128;
    }

    @Override // com.appsflyer.internal.AFf1sSDK, com.appsflyer.internal.AFe1fSDK
    public final boolean copydefault() {
        int i = registerClient + 87;
        int i10 = i % 128;
        AFLogger = i10;
        boolean z5 = i % 2 == 0;
        registerClient = (i10 + 117) % 128;
        return z5;
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    public final void getRevenue(AFh1mSDK aFh1mSDK) {
        int i = AFLogger + 51;
        registerClient = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    public final void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
        registerClient = (AFLogger + 67) % 128;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        getCurrencyIso4217Code(new Object[]{this}, 838739924, -838739923, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    public final void getMediationNetwork(AFh1mSDK aFh1mSDK) {
        registerClient = (AFLogger + 21) % 128;
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    public final void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
        AFLogger = (registerClient + 1) % 128;
    }
}

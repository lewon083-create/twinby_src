package com.appsflyer.internal;

import android.app.UiModeManager;
import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFg1uSDK;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.h5;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.protocol.Device;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.collections.s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFg1rSDK implements AFg1nSDK {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f2451e = 1;
    private static int unregisterClient;
    private final String AFAdRevenueData;
    private final ij.g AFKeystoreWrapper;
    private final AFh1xSDK areAllFieldsValid;
    private final AFc1qSDK component1;
    private final AFg1vSDK component2;
    private final AFi1pSDK component3;
    private final AFc1oSDK component4;
    private final AFc1hSDK copy;
    private final AFg1zSDK copydefault;
    private final ij.g equals;
    private final Context getCurrencyIso4217Code;
    private final AFi1kSDK getMediationNetwork;
    private final AFg1uSDK getMonetizationNetwork;
    private final AFj1lSDK getRevenue;
    private final AFf1eSDK hashCode;
    private final AFc1eSDK toString;
    private static char[] AFInAppEventParameterName = {35909, 35928, 35921, 35926, 35927, 35903, 35904, 35924, 35933, 35910, 35931, 35879, 35908, 35905, 35911};
    private static int registerClient = 1912311267;
    private static boolean AFLogger = true;
    private static boolean AFInAppEventType = true;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFg1rSDK$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass4 extends r implements Function0<SimpleDateFormat> {
        public static final AnonymousClass4 getMonetizationNetwork = new AnonymousClass4();

        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFg1rSDK$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass5 extends r implements Function0<AppsFlyerProperties> {
        public static final AnonymousClass5 getMediationNetwork = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final AppsFlyerProperties invoke() {
            return AppsFlyerProperties.getInstance();
        }
    }

    public AFg1rSDK(String str, Context context, AFi1kSDK aFi1kSDK, AFg1uSDK aFg1uSDK, AFj1lSDK aFj1lSDK, AFg1vSDK aFg1vSDK, AFh1xSDK aFh1xSDK, AFc1qSDK aFc1qSDK, AFc1oSDK aFc1oSDK, AFi1pSDK aFi1pSDK, AFf1eSDK aFf1eSDK, AFc1hSDK aFc1hSDK, AFg1zSDK aFg1zSDK, AFc1eSDK aFc1eSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1kSDK, "");
        Intrinsics.checkNotNullParameter(aFg1uSDK, "");
        Intrinsics.checkNotNullParameter(aFj1lSDK, "");
        Intrinsics.checkNotNullParameter(aFg1vSDK, "");
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFi1pSDK, "");
        Intrinsics.checkNotNullParameter(aFf1eSDK, "");
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFg1zSDK, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        this.AFAdRevenueData = str;
        this.getCurrencyIso4217Code = context;
        this.getMediationNetwork = aFi1kSDK;
        this.getMonetizationNetwork = aFg1uSDK;
        this.getRevenue = aFj1lSDK;
        this.component2 = aFg1vSDK;
        this.areAllFieldsValid = aFh1xSDK;
        this.component1 = aFc1qSDK;
        this.component4 = aFc1oSDK;
        this.component3 = aFi1pSDK;
        this.hashCode = aFf1eSDK;
        this.copy = aFc1hSDK;
        this.copydefault = aFg1zSDK;
        this.toString = aFc1eSDK;
        this.equals = ij.h.b(AnonymousClass5.getMediationNetwork);
        this.AFKeystoreWrapper = ij.h.b(AnonymousClass4.getMonetizationNetwork);
    }

    private void AFAdRevenueData(AFh1mSDK aFh1mSDK, String str, String str2, AFb1rSDK aFb1rSDK) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        if (aFh1mSDK.AFAdRevenueData() == AFe1pSDK.CONVERSION) {
            int i = unregisterClient + 73;
            f2451e = i % 128;
            if (i % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(map, "");
                areAllFieldsValid(map);
                toString(map);
                copydefault(map);
                AFa1vSDK.getMonetizationNetwork(this.copy, this.component4);
                throw null;
            }
            Intrinsics.checkNotNullExpressionValue(map, "");
            areAllFieldsValid(map);
            toString(map);
            copydefault(map);
            AFa1vSDK.getMonetizationNetwork(this.copy, this.component4);
        }
        Intrinsics.checkNotNullExpressionValue(map, "");
        getRevenue(new Object[]{this, map}, -1147564241, 1147564241, System.identityHashCode(this));
        component3(map);
        getRevenue(new Object[]{this, map}, -841219204, 841219208, System.identityHashCode(this));
        getMonetizationNetwork(map, str2);
        getRevenue(map, str);
        copy(map);
        if (aFb1rSDK == null) {
            f2451e = (unregisterClient + 25) % 128;
            return;
        }
        int i10 = f2451e + 103;
        unregisterClient = i10 % 128;
        if (i10 % 2 == 0) {
            aFb1rSDK.getCurrencyIso4217Code(map);
        } else {
            aFb1rSDK.getCurrencyIso4217Code(map);
            throw null;
        }
    }

    private void AFInAppEventParameterName(Map<String, Object> map) {
        unregisterClient = (f2451e + 11) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.putAll(this.copydefault.AFAdRevenueData());
        int i = unregisterClient + 65;
        f2451e = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private final String AFInAppEventType() {
        File revenue = getRevenue(getCurrencyIso4217Code("ro.appsflyer.preinstall.path"));
        if (getMediationNetwork(revenue)) {
            int i = f2451e + 121;
            unregisterClient = i % 128;
            if (i % 2 != 0) {
                revenue = getRevenue(getMediationNetwork("AF_PRE_INSTALL_PATH"));
                int i10 = 28 / 0;
            } else {
                revenue = getRevenue(getMediationNetwork("AF_PRE_INSTALL_PATH"));
            }
        }
        if (getMediationNetwork(revenue)) {
            revenue = getRevenue("/data/local/tmp/pre_install.appsflyer");
        }
        if (getMediationNetwork(revenue)) {
            int i11 = unregisterClient + 25;
            f2451e = i11 % 128;
            if (i11 % 2 == 0) {
                getRevenue("/etc/pre_install.appsflyer");
                throw null;
            }
            revenue = getRevenue("/etc/pre_install.appsflyer");
        }
        if (getMediationNetwork(revenue)) {
            int i12 = (unregisterClient + 101) % 128;
            f2451e = i12;
            unregisterClient = (i12 + 37) % 128;
            return null;
        }
        String packageName = this.getCurrencyIso4217Code.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String mediationNetwork = getMediationNetwork(revenue, packageName);
        unregisterClient = (f2451e + 33) % 128;
        return mediationNetwork;
    }

    private void AFKeystoreWrapper(Map<String, Object> map) {
        int i = f2451e + 37;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.EXTENSION);
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.EXTENSION);
        if (string != null) {
            int i10 = f2451e + 113;
            unregisterClient = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            if (string.length() == 0) {
                return;
            }
            int i11 = unregisterClient + 11;
            f2451e = i11 % 128;
            if (i11 % 2 != 0) {
                map.put(AppsFlyerProperties.EXTENSION, string);
            } else {
                map.put(AppsFlyerProperties.EXTENSION, string);
                throw null;
            }
        }
    }

    private void AFLogger(Map<String, Object> map) {
        unregisterClient = (f2451e + 93) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("af_preinstalled", String.valueOf(this.component4.getMonetizationNetwork(this.getCurrencyIso4217Code)));
        f2451e = (unregisterClient + 19) % 128;
    }

    private static void a(String str, int[] iArr, String str2, int i, Object[] objArr) throws UnsupportedEncodingException {
        Object charArray = str2;
        if (str2 != null) {
            int i10 = $10 + 51;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr2 = AFInAppEventParameterName;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                int i12 = $11 + 7;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr3[i11] = (char) (((long) cArr2[i11]) + 1825820251896122634L);
                    i11 /= 0;
                } else {
                    cArr3[i11] = (char) (((long) cArr2[i11]) ^ 1825820251896122634L);
                    i11++;
                }
            }
            cArr2 = cArr3;
        }
        int i13 = (int) (1825820251896122634L ^ ((long) registerClient));
        if (AFInAppEventType) {
            int i14 = $10 + 43;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            int length2 = bArr.length;
            aFk1oSDK.getMonetizationNetwork = length2;
            char[] cArr4 = new char[length2];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i16 = aFk1oSDK.AFAdRevenueData;
                int i17 = aFk1oSDK.getMonetizationNetwork;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr4);
                    return;
                } else {
                    cArr4[i16] = (char) (cArr2[bArr[(i17 - 1) - i16] + i] - i13);
                    aFk1oSDK.AFAdRevenueData = i16 + 1;
                }
            }
        } else if (AFLogger) {
            int length3 = cArr.length;
            aFk1oSDK.getMonetizationNetwork = length3;
            char[] cArr5 = new char[length3];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i18 = aFk1oSDK.AFAdRevenueData;
                int i19 = aFk1oSDK.getMonetizationNetwork;
                if (i18 >= i19) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i18] = (char) (cArr2[cArr[(i19 - 1) - i18] - i] - i13);
                    aFk1oSDK.AFAdRevenueData = i18 + 1;
                }
            }
        } else {
            int length4 = iArr.length;
            aFk1oSDK.getMonetizationNetwork = length4;
            char[] cArr6 = new char[length4];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i20 = aFk1oSDK.AFAdRevenueData;
                int i21 = aFk1oSDK.getMonetizationNetwork;
                if (i20 >= i21) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i20] = (char) (cArr2[iArr[(i21 - 1) - i20] - i] - i13);
                    aFk1oSDK.AFAdRevenueData = i20 + 1;
                }
            }
        }
    }

    private void afInfoLog(Map<String, Object> map) {
        String strAFAdRevenueData;
        Intrinsics.checkNotNullParameter(map, "");
        if (((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
            f2451e = (unregisterClient + 55) % 128;
            try {
                this.getCurrencyIso4217Code.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                strAFAdRevenueData = this.component4.AFAdRevenueData(this.getCurrencyIso4217Code);
            } catch (Throwable unused) {
                strAFAdRevenueData = null;
            }
            if (strAFAdRevenueData != null) {
                int i = unregisterClient + 17;
                f2451e = i % 128;
                if (i % 2 != 0) {
                    map.put("fb", strAFAdRevenueData);
                } else {
                    map.put("fb", strAFAdRevenueData);
                    throw null;
                }
            }
        }
    }

    private boolean areAllFieldsValid() {
        unregisterClient = (f2451e + 45) % 128;
        boolean z5 = Boolean.parseBoolean(this.component1.getMonetizationNetwork("sentSuccessfully", (String) null));
        unregisterClient = (f2451e + 73) % 128;
        return z5;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        try {
            long jLongValue = ((Long) getRevenue(new Object[]{aFg1rSDK}, 1297709710, -1297709700, System.identityHashCode(aFg1rSDK))).longValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(jLongValue)));
            unregisterClient = (f2451e + 13) % 128;
            return null;
        } catch (Exception e3) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e3);
            return null;
        }
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        int i = unregisterClient + 15;
        f2451e = i % 128;
        int i10 = i % 2;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) aFg1rSDK.equals.getValue();
        if (i10 == 0) {
            int i11 = 65 / 0;
        }
        int i12 = f2451e + 91;
        unregisterClient = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 19 / 0;
        }
        return appsFlyerProperties;
    }

    private void component3(Map<String, Object> map) {
        int i = unregisterClient + 81;
        f2451e = i % 128;
        if (i % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string != null) {
            map.put("onelink_id", string);
        }
        if (string2 != null) {
            f2451e = (unregisterClient + 85) % 128;
            map.put("onelink_ver", string2);
        }
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        f2451e = (unregisterClient + 79) % 128;
        Long lValueOf = Long.valueOf(aFg1rSDK.component4.n_().firstInstallTime);
        int i = unregisterClient + 85;
        f2451e = i % 128;
        if (i % 2 == 0) {
            int i10 = 20 / 0;
        }
        return lValueOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String copy() {
        String str;
        int i = f2451e + 103;
        unregisterClient = i % 128;
        int i10 = i % 2;
        try {
        } catch (Exception e3) {
            AFLogger.afErrorLog(e3.getMessage(), e3);
            str = i10;
        }
        if (i10 != 0) {
            this.component1.getMonetizationNetwork("androidIdCached", (String) null);
            Settings.Secure.getString(this.getCurrencyIso4217Code.getContentResolver(), "android_id");
            throw null;
        }
        String monetizationNetwork = this.component1.getMonetizationNetwork("androidIdCached", (String) null);
        String string = Settings.Secure.getString(this.getCurrencyIso4217Code.getContentResolver(), "android_id");
        str = monetizationNetwork;
        if (string != null) {
            int i11 = unregisterClient + 99;
            f2451e = i11 % 128;
            if (i11 % 2 != 0) {
                return string;
            }
            throw null;
        }
        if (str == 0) {
            return null;
        }
        int i12 = f2451e + 63;
        unregisterClient = i12 % 128;
        if (i12 % 2 != 0) {
            AFLogger.afDebugLog("use cached AndroidId: " + str);
            int i13 = 53 / 0;
        } else {
            AFLogger.afDebugLog("use cached AndroidId: " + str);
        }
        return str;
    }

    private final void copydefault(Map<String, Object> map) {
        f2451e = (unregisterClient + 45) % 128;
        if (AFg1iSDK.getMonetizationNetwork(this.getCurrencyIso4217Code)) {
            map.put("inst_app", Boolean.TRUE);
            unregisterClient = (f2451e + 61) % 128;
        }
    }

    private void d(Map<String, Object> map) {
        f2451e = (unregisterClient + 115) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        if (this.component1.getMonetizationNetwork("is_stop_tracking_used")) {
            map.put("istu", String.valueOf(this.component1.getMediationNetwork("is_stop_tracking_used", false)));
        }
        int i = unregisterClient + 83;
        f2451e = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(java.util.Map<java.lang.String, java.lang.Object> r4) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFg1rSDK.unregisterClient
            int r0 = r0 + 63
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1rSDK.f2451e = r1
            int r0 = r0 % 2
            java.lang.String r1 = "didConfigureTokenRefreshService="
            java.lang.String r2 = ""
            if (r0 != 0) goto L2f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            android.content.Context r0 = r3.getCurrencyIso4217Code
            boolean r0 = com.appsflyer.internal.AFg1sSDK.getMonetizationNetwork(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            com.appsflyer.AFLogger.afDebugLog(r1)
            r1 = 64
            int r1 = r1 / 0
            if (r0 != 0) goto L50
            goto L49
        L2f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            android.content.Context r0 = r3.getCurrencyIso4217Code
            boolean r0 = com.appsflyer.internal.AFg1sSDK.getMonetizationNetwork(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            com.appsflyer.AFLogger.afDebugLog(r1)
            if (r0 != 0) goto L50
        L49:
            java.lang.String r0 = "tokenRefreshConfigured"
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r4.put(r0, r1)
        L50:
            com.appsflyer.internal.AFc1qSDK r0 = r3.component1
            boolean r0 = com.appsflyer.internal.AFg1sSDK.AFAdRevenueData(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "registeredUninstall"
            r4.put(r1, r0)
            int r4 = com.appsflyer.internal.AFg1rSDK.unregisterClient
            int r4 = r4 + 51
            int r4 = r4 % 128
            com.appsflyer.internal.AFg1rSDK.f2451e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1rSDK.e(java.util.Map):void");
    }

    private void equals(Map<String, Object> map) {
        int i = unregisterClient + 41;
        f2451e = i % 128;
        if (i % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(this.getCurrencyIso4217Code.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(this.getCurrencyIso4217Code.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            throw null;
        }
    }

    private void hashCode(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -1147564241, 1147564241, System.identityHashCode(this));
    }

    private void i(Map<String, Object> map) {
        unregisterClient = (f2451e + 47) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        AFb1jSDK aFb1jSDKL_ = AFb1lSDK.l_(this.getCurrencyIso4217Code.getContentResolver());
        if (aFb1jSDKL_ == null) {
            f2451e = (unregisterClient + 109) % 128;
            return;
        }
        unregisterClient = (f2451e + 33) % 128;
        map.put("amazon_aid", aFb1jSDKL_.getRevenue);
        map.put("amazon_aid_limit", String.valueOf(aFb1jSDKL_.getCurrencyIso4217Code));
    }

    private void registerClient(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, 1731268052, -1731268046, System.identityHashCode(this));
    }

    private static /* synthetic */ Object toString(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        AFg1uSDK.AFa1zSDK currencyIso4217Code = aFg1rSDK.getMonetizationNetwork.getCurrencyIso4217Code(aFg1rSDK.getCurrencyIso4217Code);
        float f10 = currencyIso4217Code.getMonetizationNetwork;
        String str = currencyIso4217Code.AFAdRevenueData;
        map.put("btl", String.valueOf(f10));
        if (str != null) {
            int i = f2451e + 109;
            unregisterClient = i % 128;
            if (i % 2 != 0) {
                map.put("btch", str);
                throw null;
            }
            map.put("btch", str);
        }
        int i10 = f2451e + 67;
        unregisterClient = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static void unregisterClient(Map<String, Object> map) {
        getRevenue(new Object[]{map}, -1950585912, 1950585914, (int) System.currentTimeMillis());
    }

    private void w(Map<String, Object> map) {
        int i = f2451e + 87;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            this.hashCode.getMediationNetwork();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String mediationNetwork = this.hashCode.getMediationNetwork();
        if (mediationNetwork != null) {
            int i10 = unregisterClient + 71;
            f2451e = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            if (mediationNetwork.length() != 0) {
                map.put("appsflyerKey", mediationNetwork);
            }
        }
        int i11 = unregisterClient + 43;
        f2451e = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 60 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) throws UnsupportedEncodingException {
        f2451e = (unregisterClient + 25) % 128;
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        AFAdRevenueData(map, aFh1mSDK.getRevenue());
        component2(map);
        getRevenue(new Object[]{map}, -1950585912, 1950585914, (int) System.currentTimeMillis());
        getRevenue(map);
        getRevenue(new Object[]{this, map, this.toString.getCurrencyIso4217Code}, 274047423, -274047418, System.identityHashCode(this));
        i(map);
        map.put("cell", j0.g(new Pair("mcc", Integer.valueOf(this.getCurrencyIso4217Code.getResources().getConfiguration().mcc)), new Pair("mnc", Integer.valueOf(this.getCurrencyIso4217Code.getResources().getConfiguration().mnc))));
        map.put("sig", AFAdRevenueData());
        map.put("last_boot_time", Long.valueOf(component1()));
        map.put("disk", component2());
        int i = unregisterClient + 75;
        f2451e = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMediationNetwork(AFh1mSDK aFh1mSDK) {
        boolean zA;
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        if (this.component4.component2()) {
            AFh1rSDK aFh1rSDK = this.component4.getMonetizationNetwork.component3;
            if (aFh1rSDK == null) {
                return;
            }
            String str = aFh1rSDK.component3;
            if (str != null && str.length() != 0) {
                aFh1mSDK.getMonetizationNetwork("gaidError", aFh1rSDK.component3);
            }
            String str2 = aFh1rSDK.getCurrencyIso4217Code;
            if (str2 != null && aFh1rSDK.AFAdRevenueData != null) {
                f2451e = (unregisterClient + 89) % 128;
                aFh1mSDK.getMonetizationNetwork("advertiserId", str2);
                aFh1mSDK.getMonetizationNetwork("advertiserIdEnabled", String.valueOf(aFh1rSDK.AFAdRevenueData));
                aFh1mSDK.getMonetizationNetwork("isGaidWithGps", String.valueOf(aFh1rSDK.getMediationNetwork));
            }
        } else {
            int i = unregisterClient + 91;
            f2451e = i % 128;
            if (i % 2 == 0) {
                Map<String, Object> mediationNetwork = AFa1ySDK.getMediationNetwork(aFh1mSDK.AFAdRevenueData);
                Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
                mediationNetwork.put("ad_ids_disabled", Boolean.TRUE);
                throw null;
            }
            Map<String, Object> mediationNetwork2 = AFa1ySDK.getMediationNetwork(aFh1mSDK.AFAdRevenueData);
            Intrinsics.checkNotNullExpressionValue(mediationNetwork2, "");
            mediationNetwork2.put("ad_ids_disabled", Boolean.TRUE);
            f2451e = (unregisterClient + 83) % 128;
        }
        AFh1rSDK aFh1rSDK2 = this.component4.getMonetizationNetwork.component3;
        if (aFh1rSDK2 != null) {
            f2451e = (unregisterClient + 81) % 128;
            zA = Intrinsics.a(aFh1rSDK2.component2, Boolean.TRUE);
        } else {
            zA = false;
        }
        aFh1mSDK.getMonetizationNetwork("GAID_retry", String.valueOf(zA));
        if (s.f(AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH).contains(aFh1mSDK.AFAdRevenueData())) {
            AFd1aSDK aFd1aSDK = this.toString.component4;
            if (aFd1aSDK == null) {
                unregisterClient = (f2451e + 77) % 128;
                return;
            }
            Map<String, Object> mediationNetwork3 = AFa1ySDK.getMediationNetwork(aFh1mSDK.AFAdRevenueData);
            Intrinsics.checkNotNullExpressionValue(mediationNetwork3, "");
            mediationNetwork3.put("fetchAdIdLatency", Long.valueOf(aFd1aSDK.getMediationNetwork));
        }
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMonetizationNetwork(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        Object string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            map.put(AppsFlyerProperties.APP_ID, string);
        }
        String string2 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            if (string2.length() != 3) {
                StringBuilder sb2 = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb2.append(string2);
                sb2.append("' is not a legal value.");
                String string3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "");
                AFLogger.afWarnLog(string3);
            }
            map.put("currency", string2);
        } else {
            f2451e = (unregisterClient + 67) % 128;
        }
        Object string4 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.IS_UPDATE);
        if (string4 != null) {
            map.put("isUpdate", string4);
        }
        Object string5 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string5 != null) {
            map.put("customData", string5);
        }
        Object string6 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.APP_USER_ID);
        if (string6 != null) {
            map.put("appUserId", string6);
            f2451e = (unregisterClient + 35) % 128;
        }
        Object string7 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.USER_EMAILS);
        if (string7 != null) {
            map.put("user_emails", string7);
        }
        AFb1tSDK aFb1tSDK = this.toString.getRevenue;
        if (aFb1tSDK != null) {
            int i = unregisterClient + 1;
            f2451e = i % 128;
            if (i % 2 == 0) {
                String[] strArr = aFb1tSDK.AFAdRevenueData;
                throw null;
            }
            Object obj = aFb1tSDK.AFAdRevenueData;
            if (obj != null) {
                map.put("sharing_filter", obj);
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getRevenue(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFi1qSDK aFi1qSDK = this.component3.getMonetizationNetwork;
        AFi1rSDK monetizationNetwork = aFi1qSDK != null ? aFi1qSDK.getMonetizationNetwork() : null;
        if (monetizationNetwork != null) {
            map.put("network", monetizationNetwork.getCurrencyIso4217Code);
            map.put("ivc", Boolean.valueOf(monetizationNetwork.getMediationNetwork()));
            if (((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                f2451e = (unregisterClient + 41) % 128;
                return;
            }
            int i = f2451e;
            unregisterClient = (i + 69) % 128;
            String str = monetizationNetwork.getMonetizationNetwork;
            if (str != null) {
                map.put("operator", str);
            } else {
                unregisterClient = (i + 99) % 128;
            }
            String str2 = monetizationNetwork.getRevenue;
            if (str2 != null) {
                map.put("carrier", str2);
            }
        }
    }

    private final void areAllFieldsValid(Map<String, Object> map) {
        int i = f2451e + 125;
        unregisterClient = i % 128;
        if (i % 2 != 0) {
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).isOtherSdkStringDisabled();
            throw null;
        }
        if (((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).isOtherSdkStringDisabled()) {
            return;
        }
        int i10 = unregisterClient + 9;
        f2451e = i10 % 128;
        if (i10 % 2 != 0) {
            map.put("batteryLevel", String.valueOf(this.getMonetizationNetwork.getCurrencyIso4217Code(this.getCurrencyIso4217Code).getMonetizationNetwork));
        } else {
            map.put("batteryLevel", String.valueOf(this.getMonetizationNetwork.getCurrencyIso4217Code(this.getCurrencyIso4217Code).getMonetizationNetwork));
            throw null;
        }
    }

    private static String component2() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double dPow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / dPow)) + "/" + ((long) (blockCountLong / dPow));
        f2451e = (unregisterClient + 21) % 128;
        return str;
    }

    private String component4() {
        int i = unregisterClient + 61;
        f2451e = i % 128;
        if (i % 2 == 0) {
            this.component1.getMonetizationNetwork("INSTALL_STORE", (String) null);
            throw null;
        }
        String monetizationNetwork = this.component1.getMonetizationNetwork("INSTALL_STORE", (String) null);
        if (monetizationNetwork != null) {
            int i10 = unregisterClient + 37;
            f2451e = i10 % 128;
            if (i10 % 2 != 0) {
                return monetizationNetwork;
            }
            throw null;
        }
        String strComponent3 = component3();
        if (strComponent3 != null) {
            this.component1.getRevenue("INSTALL_STORE", strComponent3);
        }
        int i11 = unregisterClient + 67;
        f2451e = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 79 / 0;
        }
        return strComponent3;
    }

    private static List<AFe1pSDK> copydefault() {
        unregisterClient = (f2451e + 107) % 128;
        List<AFe1pSDK> listF = s.f(AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH, AFe1pSDK.INAPP, AFe1pSDK.MANUAL_PURCHASE_VALIDATION, AFe1pSDK.ARS_VALIDATE, AFe1pSDK.PURCHASE_VALIDATE, AFe1pSDK.ADREVENUE);
        f2451e = (unregisterClient + 41) % 128;
        return listF;
    }

    private static void component2(Map<String, Object> map) throws UnsupportedEncodingException {
        f2451e = (unregisterClient + 123) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a("\u008f\u0089\u0087\u0083\u008e", null, null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put(Device.TYPE, Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        int i = unregisterClient + 71;
        f2451e = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private final void toString(Map<String, Object> map) {
        int i = unregisterClient + 93;
        f2451e = i % 128;
        if (i % 2 != 0) {
            UiModeManager uiModeManager = (UiModeManager) this.getCurrencyIso4217Code.getSystemService(UiModeManager.class);
            if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
                return;
            }
            int i10 = unregisterClient + 33;
            f2451e = i10 % 128;
            if (i10 % 2 == 0) {
                map.put("tv", Boolean.TRUE);
                int i11 = 55 / 0;
                return;
            } else {
                map.put("tv", Boolean.TRUE);
                return;
            }
        }
        throw null;
    }

    private final boolean AFKeystoreWrapper() {
        unregisterClient = (f2451e + 29) % 128;
        if (((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            f2451e = (unregisterClient + 67) % 128;
            return true;
        }
        AFa1ySDK.getRevenue();
        return !AFa1ySDK.getRevenue(this.getCurrencyIso4217Code);
    }

    private static long component1() {
        f2451e = (unregisterClient + 73) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        f2451e = (unregisterClient + 3) % 128;
        return jCurrentTimeMillis;
    }

    private void component1(Map<String, ? extends Object> map) {
        getRevenue(new Object[]{this, map}, -841219204, 841219208, System.identityHashCode(this));
    }

    private final void component4(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -753773633, 753773645, System.identityHashCode(this));
    }

    private String component3() {
        f2451e = (unregisterClient + 107) % 128;
        String string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            return string;
        }
        int i = f2451e + 43;
        unregisterClient = i % 128;
        if (i % 2 == 0) {
            return getMediationNetwork("AF_STORE");
        }
        getMediationNetwork("AF_STORE");
        throw null;
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        boolean z5 = false;
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        Intrinsics.checkNotNullParameter(map, "");
        String strComponent3 = aFg1rSDK.component4.component3();
        String strAFAdRevenueData = AFAdRevenueData(aFg1rSDK.component1, strComponent3);
        boolean z10 = (strAFAdRevenueData == null || Intrinsics.a(strAFAdRevenueData, strComponent3)) ? false : true;
        if (strAFAdRevenueData == null && strComponent3 != null) {
            z5 = true;
        }
        if (z10 || z5) {
            map.put("af_latestchannel", strComponent3);
        }
        String strComponent4 = aFg1rSDK.component4();
        if (strComponent4 != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = strComponent4.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            map.put("af_installstore", lowerCase);
        }
        String str = (String) getRevenue(new Object[]{aFg1rSDK}, -994471321, 994471330, System.identityHashCode(aFg1rSDK));
        if (str != null) {
            f2451e = (unregisterClient + 125) % 128;
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            String lowerCase2 = str.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            map.put("af_preinstall_name", lowerCase2);
        }
        String strComponent32 = aFg1rSDK.component3();
        if (strComponent32 == null) {
            return null;
        }
        int i = unregisterClient + 29;
        f2451e = i % 128;
        if (i % 2 != 0) {
            Locale locale3 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale3, "");
            String lowerCase3 = strComponent32.toLowerCase(locale3);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            map.put("af_currentstore", lowerCase3);
            return null;
        }
        Locale locale4 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale4, "");
        String lowerCase4 = strComponent32.toLowerCase(locale4);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
        map.put("af_currentstore", lowerCase4);
        throw null;
    }

    private String equals() {
        return (String) getRevenue(new Object[]{this}, -994471321, 994471330, System.identityHashCode(this));
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        String string = ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).getString("preInstallName");
        if (string != null) {
            f2451e = (unregisterClient + 39) % 128;
            return string;
        }
        String monetizationNetwork = aFg1rSDK.component1.getMonetizationNetwork("preInstallName", (String) null);
        if (monetizationNetwork != null) {
            ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).set("preInstallName", monetizationNetwork);
            int i = f2451e + 71;
            unregisterClient = i % 128;
            if (i % 2 == 0) {
                return monetizationNetwork;
            }
            throw null;
        }
        String strAFInAppEventType = aFg1rSDK.AFInAppEventType();
        if (strAFInAppEventType == null) {
            int i10 = f2451e + 45;
            unregisterClient = i10 % 128;
            if (i10 % 2 != 0) {
                strAFInAppEventType = aFg1rSDK.getMediationNetwork("AF_PRE_INSTALL_NAME");
                int i11 = 98 / 0;
            } else {
                strAFInAppEventType = aFg1rSDK.getMediationNetwork("AF_PRE_INSTALL_NAME");
            }
        }
        if (strAFInAppEventType != null) {
            aFg1rSDK.component1.getRevenue("preInstallName", strAFInAppEventType);
            ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).set("preInstallName", strAFInAppEventType);
        }
        unregisterClient = (f2451e + 15) % 128;
        return strAFInAppEventType;
    }

    private void copy(Map<String, Object> map) {
        f2451e = (unregisterClient + 113) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        long j10 = this.areAllFieldsValid.copydefault;
        if (j10 != 0) {
            int i = unregisterClient + 59;
            f2451e = i % 128;
            if (i % 2 != 0) {
                map.put("prev_session_dur", Long.valueOf(j10));
            } else {
                map.put("prev_session_dur", Long.valueOf(j10));
                throw null;
            }
        }
    }

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i, int i10, int i11) {
        long seconds;
        int i12 = ~i11;
        int i13 = ((i10 | i11) * 521) + (((~(i12 | i10)) | i) * (-1042)) + (i10 * (-520)) + (i * 522);
        int i14 = ~i;
        switch ((((~(i | i12 | i10)) | (~(i11 | i14)) | (~((~i10) | i14))) * 521) + i13) {
            case 1:
                return AFAdRevenueData(objArr);
            case 2:
                return getCurrencyIso4217Code(objArr);
            case 3:
                return getRevenue(objArr);
            case 4:
                return getMediationNetwork(objArr);
            case 5:
                return getMonetizationNetwork(objArr);
            case 6:
                return areAllFieldsValid(objArr);
            case 7:
                return component2(objArr);
            case 8:
                return component1(objArr);
            case 9:
                return component3(objArr);
            case 10:
                return component4(objArr);
            case 11:
                AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
                AFh1mSDK aFh1mSDK = (AFh1mSDK) objArr[1];
                f2451e = (unregisterClient + 29) % 128;
                Intrinsics.checkNotNullParameter(aFh1mSDK, "");
                Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map, "");
                getRevenue(new Object[]{aFg1rSDK, map}, -539509618, 539509626, System.identityHashCode(aFg1rSDK));
                Map<String, Object> map2 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map2, "");
                aFg1rSDK.getMediationNetwork(map2, aFh1mSDK.component4);
                Map<String, Object> map3 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map3, "");
                getRevenue(new Object[]{aFg1rSDK, map3}, 1731268052, -1731268046, System.identityHashCode(aFg1rSDK));
                Map<String, Object> map4 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map4, "");
                aFg1rSDK.AFLogger(map4);
                Map<String, Object> map5 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map5, "");
                aFg1rSDK.afInfoLog(map5);
                Map<String, Object> map6 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map6, "");
                AFe1pSDK aFe1pSDKAFAdRevenueData = aFh1mSDK.AFAdRevenueData();
                Intrinsics.checkNotNullExpressionValue(aFe1pSDKAFAdRevenueData, "");
                aFg1rSDK.getMediationNetwork(map6, aFe1pSDKAFAdRevenueData);
                unregisterClient = (f2451e + 51) % 128;
                return null;
            case 12:
                return toString(objArr);
            default:
                AFg1rSDK aFg1rSDK2 = (AFg1rSDK) objArr[0];
                Map map7 = (Map) objArr[1];
                unregisterClient = (f2451e + 23) % 128;
                Intrinsics.checkNotNullParameter(map7, "");
                long monetizationNetwork = aFg1rSDK2.component1.getMonetizationNetwork("AppsFlyerTimePassedSincePrevLaunch", 0L);
                long jCurrentTimeMillis = System.currentTimeMillis();
                aFg1rSDK2.component1.AFAdRevenueData("AppsFlyerTimePassedSincePrevLaunch", jCurrentTimeMillis);
                if (monetizationNetwork > 0) {
                    int i15 = unregisterClient + 35;
                    f2451e = i15 % 128;
                    seconds = i15 % 2 == 0 ? TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis ^ monetizationNetwork) : TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - monetizationNetwork);
                } else {
                    f2451e = (unregisterClient + 1) % 128;
                    seconds = -1;
                }
                map7.put("timepassedsincelastlaunch", String.valueOf(seconds));
                return null;
        }
    }

    private static void AFInAppEventType(Map<String, Object> map) {
        getRevenue(new Object[]{map}, -1520031212, 1520031215, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void AFAdRevenueData(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(this.component4.getMediationNetwork);
        if (currencyIso4217Code != null) {
            map.put("uid", currencyIso4217Code);
            boolean mediationNetwork = this.component4.getMediationNetwork.getMediationNetwork("CUSTOM_INSTALL_ID_APPLIED", false);
            Intrinsics.checkNotNullExpressionValue(Boolean.valueOf(mediationNetwork), "");
            if (mediationNetwork) {
                int i = f2451e + 53;
                unregisterClient = i % 128;
                if (i % 2 == 0) {
                    map.put("custom_install_id", Boolean.TRUE);
                } else {
                    map.put("custom_install_id", Boolean.TRUE);
                    throw null;
                }
            }
            f2451e = (unregisterClient + 5) % 128;
        }
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final long getCurrencyIso4217Code() {
        unregisterClient = (f2451e + 103) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis();
        unregisterClient = (f2451e + 119) % 128;
        return jCurrentTimeMillis;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map, int i, int i10) {
        boolean z5;
        int i11 = unregisterClient + 121;
        f2451e = i11 % 128;
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("counter", String.valueOf(i));
            map.put("iaecounter", String.valueOf(i10));
            if (areAllFieldsValid()) {
                z5 = false;
            } else {
                f2451e = (unregisterClient + 103) % 128;
                z5 = true;
            }
            map.put("isFirstCall", String.valueOf(z5));
            f2451e = (unregisterClient + 103) % 128;
            return;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i));
        map.put("iaecounter", String.valueOf(i10));
        areAllFieldsValid();
        throw null;
    }

    private void getMonetizationNetwork(Map<String, Object> map, boolean z5) {
        unregisterClient = (f2451e + 89) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("platformextension", this.AFAdRevenueData);
        if (z5) {
            map.put("platform_extension_v2", this.getMediationNetwork.getCurrencyIso4217Code());
            unregisterClient = (f2451e + 89) % 128;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void AFAdRevenueData(java.util.Map<java.lang.String, java.lang.Object> r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "ro.product.cpu.abi"
            java.lang.String r1 = getCurrencyIso4217Code(r1)
            java.lang.String r2 = "cpu_abi"
            r0.put(r2, r1)
            java.lang.String r1 = "ro.product.cpu.abi2"
            java.lang.String r1 = getCurrencyIso4217Code(r1)
            java.lang.String r2 = "cpu_abi2"
            r0.put(r2, r1)
            java.lang.String r1 = "os.arch"
            java.lang.String r1 = getCurrencyIso4217Code(r1)
            java.lang.String r2 = "arch"
            r0.put(r2, r1)
            java.lang.String r1 = "ro.build.display.id"
            java.lang.String r1 = getCurrencyIso4217Code(r1)
            java.lang.String r2 = "build_display_id"
            r0.put(r2, r1)
            if (r9 == 0) goto L9b
            int r9 = com.appsflyer.internal.AFg1rSDK.unregisterClient
            int r9 = r9 + 55
            int r1 = r9 % 128
            com.appsflyer.internal.AFg1rSDK.f2451e = r1
            r1 = 2
            int r9 = r9 % r1
            r2 = 0
            java.lang.String r3 = "appsFlyerCount"
            r4 = 753773645(0x2cedac4d, float:6.7550744E-12)
            r5 = -753773633(0xffffffffd31253bf, float:-6.2847025E11)
            if (r9 != 0) goto L65
            java.lang.Object[] r9 = new java.lang.Object[]{r7, r0}
            int r6 = java.lang.System.identityHashCode(r7)
            getRevenue(r9, r5, r4, r6)
            com.appsflyer.internal.AFc1oSDK r9 = r7.component4
            com.appsflyer.internal.AFc1qSDK r9 = r9.getMediationNetwork
            r4 = 1
            int r9 = r9.getRevenue(r3, r4)
            r3 = 4
            if (r9 > r3) goto L9b
            goto L7a
        L65:
            java.lang.Object[] r9 = new java.lang.Object[]{r7, r0}
            int r6 = java.lang.System.identityHashCode(r7)
            getRevenue(r9, r5, r4, r6)
            com.appsflyer.internal.AFc1oSDK r9 = r7.component4
            com.appsflyer.internal.AFc1qSDK r9 = r9.getMediationNetwork
            int r9 = r9.getRevenue(r3, r2)
            if (r9 > r1) goto L9b
        L7a:
            int r9 = com.appsflyer.internal.AFg1rSDK.unregisterClient
            int r9 = r9 + 63
            int r3 = r9 % 128
            com.appsflyer.internal.AFg1rSDK.f2451e = r3
            int r9 = r9 % r1
            if (r9 != 0) goto L92
            com.appsflyer.internal.AFj1lSDK r9 = r7.getRevenue
            java.util.Map r9 = r9.getMediationNetwork()
            r0.putAll(r9)
            r9 = 65
            int r9 = r9 / r2
            goto L9b
        L92:
            com.appsflyer.internal.AFj1lSDK r9 = r7.getRevenue
            java.util.Map r9 = r9.getMediationNetwork()
            r0.putAll(r9)
        L9b:
            com.appsflyer.internal.AFg1vSDK r9 = r7.component2
            android.content.Context r1 = r7.getCurrencyIso4217Code
            java.util.Map r9 = r9.getMediationNetwork(r1)
            java.lang.String r1 = "dim"
            r0.put(r1, r9)
            java.lang.String r9 = "deviceData"
            r8.put(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1rSDK.AFAdRevenueData(java.util.Map, boolean):void");
    }

    private String getCurrencyIso4217Code(SimpleDateFormat simpleDateFormat, int i) {
        int i10 = f2451e + 57;
        unregisterClient = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(simpleDateFormat, "");
            String monetizationNetwork = this.component1.getMonetizationNetwork("appsFlyerFirstInstall", (String) null);
            if (monetizationNetwork == null) {
                int i11 = unregisterClient + 99;
                f2451e = i11 % 128;
                if (i11 % 2 != 0 ? i > 1 : i > 0) {
                    monetizationNetwork = "";
                } else {
                    AFLogger.afDebugLog("AppsFlyer: first launch detected");
                    monetizationNetwork = simpleDateFormat.format(new Date());
                }
                this.component1.getRevenue("appsFlyerFirstInstall", monetizationNetwork);
                unregisterClient = (f2451e + 77) % 128;
            }
            AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, om1.k("AppsFlyer: first launch date: ", monetizationNetwork), false, 4, null);
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            return monetizationNetwork;
        }
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        this.component1.getMonetizationNetwork("appsFlyerFirstInstall", (String) null);
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
        int i = unregisterClient + 125;
        f2451e = i % 128;
        if (i % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFh1mSDK, "");
            Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
            Intrinsics.checkNotNullExpressionValue(map, "");
            map.put("open_referrer", aFh1mSDK.getMonetizationNetwork);
            String str = aFh1mSDK.copydefault;
            if (str != null && !StringsKt.D(str)) {
                map.put("af_web_referrer", aFh1mSDK.copydefault);
            }
            f2451e = (unregisterClient + 7) % 128;
            return;
        }
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map2 = aFh1mSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        map2.put("open_referrer", aFh1mSDK.getMonetizationNetwork);
        throw null;
    }

    private final void getMediationNetwork(Map<String, Object> map, int i) {
        try {
            if (this.component4.n_().versionCode > this.component1.getRevenue("versionCode", 0)) {
                f2451e = (unregisterClient + 43) % 128;
                this.component1.getMediationNetwork("versionCode", this.component4.n_().versionCode);
            }
            map.put("app_version_code", String.valueOf(this.component4.n_().versionCode));
            map.put(CommonUrlParts.APP_VERSION, this.component4.n_().versionName);
            map.put("targetSDKver", Integer.valueOf(this.component4.getCurrencyIso4217Code.getMonetizationNetwork.getApplicationInfo().targetSdkVersion));
            map.put("date1", getRevenue().format(new Date(((Long) getRevenue(new Object[]{this}, 1297709710, -1297709700, System.identityHashCode(this))).longValue())));
            map.put("date2", getRevenue().format(new Date(this.component4.n_().lastUpdateTime)));
            Object[] objArr = new Object[1];
            a("\u008d\u0085\u0087\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            SimpleDateFormat revenue = getRevenue();
            Intrinsics.checkNotNullExpressionValue(revenue, "");
            map.put(strIntern, getCurrencyIso4217Code(revenue, i));
            int i10 = f2451e + 51;
            unregisterClient = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th2, true);
        }
    }

    private final SimpleDateFormat getRevenue() {
        f2451e = (unregisterClient + 23) % 128;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.AFKeystoreWrapper.getValue();
        f2451e = (unregisterClient + 101) % 128;
        return simpleDateFormat;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getRevenue(AFh1mSDK aFh1mSDK) {
        int i = unregisterClient + 113;
        f2451e = i % 128;
        if (i % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFh1mSDK, "");
            Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
            if (aFh1mSDK.getRevenue()) {
                String str = aFh1mSDK.component1;
                AFc1eSDK aFc1eSDK = this.toString;
                AFAdRevenueData(aFh1mSDK, str, aFc1eSDK.getMediationNetwork, aFc1eSDK.AFAdRevenueData);
                f2451e = (unregisterClient + 53) % 128;
            } else if (!(aFh1mSDK instanceof AFh1fSDK)) {
                int i10 = f2451e + 93;
                unregisterClient = i10 % 128;
                if (i10 % 2 != 0) {
                    Intrinsics.checkNotNullExpressionValue(map, "");
                    String str2 = aFh1mSDK.areAllFieldsValid;
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    getMediationNetwork(map, str2);
                    int i11 = 79 / 0;
                } else {
                    Intrinsics.checkNotNullExpressionValue(map, "");
                    String str3 = aFh1mSDK.areAllFieldsValid;
                    Intrinsics.checkNotNullExpressionValue(str3, "");
                    getMediationNetwork(map, str3);
                }
            }
            if (s.f(AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH, AFe1pSDK.INAPP).contains(aFh1mSDK.AFAdRevenueData())) {
                int i12 = f2451e + 33;
                unregisterClient = i12 % 128;
                if (i12 % 2 != 0) {
                    Intrinsics.checkNotNullExpressionValue(map, "");
                    equals(map);
                    int i13 = 79 / 0;
                } else {
                    Intrinsics.checkNotNullExpressionValue(map, "");
                    equals(map);
                }
            }
            Intrinsics.checkNotNullExpressionValue(map, "");
            w(map);
            getRevenue(new Object[]{map}, -1520031212, 1520031215, (int) System.currentTimeMillis());
            AFInAppEventParameterName(map);
            AFKeystoreWrapper(map);
            AFAdRevenueData(map);
            getMonetizationNetwork(map, aFh1mSDK.getRevenue());
            e(map);
            d(map);
            getMonetizationNetwork(map, aFh1mSDK);
            map.put("af_events_api", "1");
            return;
        }
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map2 = aFh1mSDK.AFAdRevenueData;
        aFh1mSDK.getRevenue();
        throw null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        Map map = (Map) objArr[0];
        f2451e = (unregisterClient + 65) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        try {
            map.put(VKApiCodes.PARAM_LANG, Locale.getDefault().getDisplayLanguage());
            unregisterClient = (f2451e + 25) % 128;
        } catch (Exception e3) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e3);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
        } catch (Exception e7) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e7);
        }
        try {
            map.put(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
            return null;
        } catch (Exception e10) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e10);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object getMonetizationNetwork(java.lang.Object[] r9) {
        /*
            r0 = 0
            r1 = r9[r0]
            com.appsflyer.internal.AFg1rSDK r1 = (com.appsflyer.internal.AFg1rSDK) r1
            r2 = 1
            r2 = r9[r2]
            java.util.Map r2 = (java.util.Map) r2
            r3 = 2
            r9 = r9[r3]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r4 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.Object[] r5 = new java.lang.Object[]{r1}
            int r6 = java.lang.System.identityHashCode(r1)
            r7 = -854454525(0xffffffffcd120f03, float:-1.5315358E8)
            r8 = 854454532(0x32edf104, float:2.7700032E-8)
            java.lang.Object r5 = getRevenue(r5, r7, r8, r6)
            com.appsflyer.AppsFlyerProperties r5 = (com.appsflyer.AppsFlyerProperties) r5
            java.lang.String r6 = "deviceTrackingDisabled"
            boolean r0 = r5.getBoolean(r6, r0)
            r5 = 0
            if (r0 == 0) goto L46
            int r9 = com.appsflyer.internal.AFg1rSDK.unregisterClient
            int r9 = r9 + 33
            int r0 = r9 % 128
            com.appsflyer.internal.AFg1rSDK.f2451e = r0
            int r9 = r9 % r3
            java.lang.String r0 = "true"
            if (r9 == 0) goto L42
            r2.put(r6, r0)
            return r5
        L42:
            r2.put(r6, r0)
            throw r5
        L46:
            com.appsflyer.internal.AFf1eSDK r0 = r1.hashCode
            com.appsflyer.internal.AFc1qSDK r3 = r1.component1
            java.lang.String r0 = r0.getMonetizationNetwork(r3)
            if (r0 == 0) goto L6d
            int r3 = com.appsflyer.internal.AFg1rSDK.unregisterClient
            int r3 = r3 + 79
            int r3 = r3 % 128
            com.appsflyer.internal.AFg1rSDK.f2451e = r3
            int r3 = r0.length()
            if (r3 != 0) goto L5f
            goto L6d
        L5f:
            int r3 = com.appsflyer.internal.AFg1rSDK.unregisterClient
            int r3 = r3 + 71
            int r3 = r3 % 128
            com.appsflyer.internal.AFg1rSDK.f2451e = r3
            java.lang.String r3 = "imei"
            r2.put(r3, r0)
            goto L75
        L6d:
            int r0 = com.appsflyer.internal.AFg1rSDK.unregisterClient
            int r0 = r0 + 33
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1rSDK.f2451e = r0
        L75:
            java.lang.String r9 = r1.AFAdRevenueData(r9)
            if (r9 == 0) goto L88
            com.appsflyer.internal.AFc1qSDK r0 = r1.component1
            java.lang.String r3 = "androidIdCached"
            r0.getRevenue(r3, r9)
            java.lang.String r0 = "android_id"
            r2.put(r0, r9)
            goto L8d
        L88:
            java.lang.String r9 = "Android ID was not collected."
            com.appsflyer.AFLogger.afInfoLog(r9)
        L8d:
            android.content.Context r9 = r1.getCurrencyIso4217Code
            com.appsflyer.internal.AFb1jSDK r9 = com.appsflyer.internal.AFb1lSDK.getMediationNetwork(r9)
            if (r9 == 0) goto Lbc
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Boolean r1 = r9.getMonetizationNetwork
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            java.lang.String r3 = "isManual"
            r0.put(r3, r1)
            java.lang.String r1 = r9.getRevenue
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            java.lang.String r3 = "val"
            r0.put(r3, r1)
            java.lang.Boolean r9 = r9.getCurrencyIso4217Code
            if (r9 == 0) goto Lb7
            java.lang.String r1 = "isLat"
            r0.put(r1, r9)
        Lb7:
            java.lang.String r9 = "oaid"
            r2.put(r9, r0)
        Lbc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1rSDK.getMonetizationNetwork(java.lang.Object[]):java.lang.Object");
    }

    private String AFAdRevenueData() throws NoSuchAlgorithmException {
        unregisterClient = (f2451e + 31) % 128;
        String strN_ = AFj1kSDK.N_(this.getCurrencyIso4217Code.getApplicationContext().getPackageManager(), this.getCurrencyIso4217Code.getApplicationContext().getPackageName());
        unregisterClient = (f2451e + 71) % 128;
        return strN_;
    }

    private static Object AFAdRevenueData(Object[] objArr) {
        Object objS;
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        Intrinsics.checkNotNullParameter(map, "");
        String str = aFg1rSDK.toString.getMonetizationNetwork;
        if (str != null) {
            int i = unregisterClient + 83;
            f2451e = i % 128;
            if (i % 2 == 0) {
                map.get("af_deeplink");
                throw null;
            }
            if (map.get("af_deeplink") != null) {
                AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
            } else {
                try {
                    ij.k kVar = ij.m.f21341c;
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("isPush", "true");
                    map.put("af_deeplink", jSONObject.toString());
                    objS = Unit.f27471a;
                } catch (Throwable th2) {
                    ij.k kVar2 = ij.m.f21341c;
                    objS = h5.s(th2);
                }
                Throwable thA = ij.m.a(objS);
                if (thA != null) {
                    AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "Exception while trying to create JSONObject from pushPayload", thA, false, false, false, false, 120, null);
                    unregisterClient = (f2451e + 33) % 128;
                }
            }
        }
        aFg1rSDK.toString.getMonetizationNetwork = null;
        return null;
    }

    private static String getCurrencyIso4217Code(String str) {
        f2451e = (unregisterClient + 19) % 128;
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.c(objInvoke, "");
            String str2 = (String) objInvoke;
            unregisterClient = (f2451e + 117) % 128;
            return str2;
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return null;
        }
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        Intrinsics.checkNotNullParameter(map, "");
        AFh1xSDK aFh1xSDK = aFg1rSDK.areAllFieldsValid;
        HashMap map2 = new HashMap(aFh1xSDK.getRevenue);
        aFh1xSDK.getRevenue.clear();
        aFh1xSDK.getMonetizationNetwork.AFAdRevenueData("gcd");
        Intrinsics.checkNotNullExpressionValue(map2, "");
        if (map2.isEmpty()) {
            return null;
        }
        int i = (unregisterClient + 21) % 128;
        f2451e = i;
        int i10 = i + 47;
        unregisterClient = i10 % 128;
        if (i10 % 2 != 0) {
            Map<String, Object> mediationNetwork = AFa1ySDK.getMediationNetwork((Map<String, Object>) map);
            Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
            mediationNetwork.put("gcd", map2);
            int i11 = 34 / 0;
            return null;
        }
        Map<String, Object> mediationNetwork2 = AFa1ySDK.getMediationNetwork((Map<String, Object>) map);
        Intrinsics.checkNotNullExpressionValue(mediationNetwork2, "");
        mediationNetwork2.put("gcd", map2);
        return null;
    }

    private void getCurrencyIso4217Code(Map<String, Object> map, String str) {
        getRevenue(new Object[]{this, map, str}, 274047423, -274047418, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, 528204691, -528204690, System.identityHashCode(this));
    }

    private final String AFAdRevenueData(String str) {
        int i = unregisterClient + 95;
        f2451e = i % 128;
        if (i % 2 != 0 ? ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false) : ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false)) {
            int i10 = unregisterClient + 43;
            f2451e = i10 % 128;
            if (i10 % 2 != 0) {
                if (str == null || str.length() == 0) {
                    if (!AFKeystoreWrapper()) {
                        return null;
                    }
                    f2451e = (unregisterClient + 75) % 128;
                    return copy();
                }
            } else {
                throw null;
            }
        }
        if (str == null) {
            return null;
        }
        int i11 = unregisterClient + 23;
        f2451e = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static void getMonetizationNetwork(Map<String, Object> map, String str) {
        unregisterClient = (f2451e + 77) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        if (str != null) {
            f2451e = (unregisterClient + 81) % 128;
            map.put("phone", str);
        }
    }

    private void getMediationNetwork(Map<String, Object> map, String str) {
        int i = unregisterClient + 7;
        f2451e = i % 128;
        try {
            if (i % 2 != 0) {
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(str, "");
                String monetizationNetwork = this.component1.getMonetizationNetwork("prev_event_name", (String) null);
                if (monetizationNetwork != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("prev_event_timestamp", this.component1.getMonetizationNetwork("prev_event_timestamp", -1L));
                    jSONObject.put("prev_event_name", monetizationNetwork);
                    map.put("prev_event", jSONObject);
                    unregisterClient = (f2451e + 107) % 128;
                }
                this.component1.getRevenue("prev_event_name", str);
                this.component1.AFAdRevenueData("prev_event_timestamp", System.currentTimeMillis());
                return;
            }
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.component1.getMonetizationNetwork("prev_event_name", (String) null);
            throw null;
        } catch (Exception e3) {
            AFLogger.afErrorLog("Error while processing previous event.", e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r4.getRevenue("CACHED_CHANNEL", r5);
        r4 = com.appsflyer.internal.AFg1rSDK.f2451e + 99;
        com.appsflyer.internal.AFg1rSDK.unregisterClient = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if ((r4 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        com.appsflyer.internal.AFg1rSDK.f2451e = (com.appsflyer.internal.AFg1rSDK.unregisterClient + 23) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String AFAdRevenueData(com.appsflyer.internal.AFc1qSDK r4, java.lang.String r5) {
        /*
            int r0 = com.appsflyer.internal.AFg1rSDK.unregisterClient
            int r0 = r0 + 17
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1rSDK.f2451e = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.String r2 = "CACHED_CHANNEL"
            if (r0 != 0) goto L1a
            java.lang.String r0 = r4.getMonetizationNetwork(r2, r1)
            r3 = 81
            int r3 = r3 / 0
            if (r0 == 0) goto L29
            goto L20
        L1a:
            java.lang.String r0 = r4.getMonetizationNetwork(r2, r1)
            if (r0 == 0) goto L29
        L20:
            int r4 = com.appsflyer.internal.AFg1rSDK.unregisterClient
            int r4 = r4 + 23
            int r4 = r4 % 128
            com.appsflyer.internal.AFg1rSDK.f2451e = r4
            return r0
        L29:
            r4.getRevenue(r2, r5)
            int r4 = com.appsflyer.internal.AFg1rSDK.f2451e
            int r4 = r4 + 99
            int r0 = r4 % 128
            com.appsflyer.internal.AFg1rSDK.unregisterClient = r0
            int r4 = r4 % 2
            if (r4 != 0) goto L39
            return r5
        L39:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1rSDK.AFAdRevenueData(com.appsflyer.internal.AFc1qSDK, java.lang.String):java.lang.String");
    }

    private static void getMonetizationNetwork(Map<String, Object> map, AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        String str = aFh1mSDK.areAllFieldsValid;
        if (str != null) {
            map.put("eventName", str);
            Map map2 = aFh1mSDK.getRevenue;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    private void getRevenue(Map<String, Object> map, String str) {
        int i = unregisterClient + 75;
        f2451e = i % 128;
        if (i % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            if (str != null) {
                unregisterClient = (f2451e + 33) % 128;
                if (str.length() != 0) {
                    int i10 = f2451e + 61;
                    unregisterClient = i10 % 128;
                    if (i10 % 2 == 0) {
                        map.put("referrer", str);
                        unregisterClient = (f2451e + 41) % 128;
                    } else {
                        map.put("referrer", str);
                        throw null;
                    }
                }
            }
            Object monetizationNetwork = this.component1.getMonetizationNetwork("extraReferrers", (String) null);
            if (monetizationNetwork != null) {
                map.put("extraReferrers", monetizationNetwork);
            }
            String referrer = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getReferrer(this.component1);
            if (referrer != null) {
                unregisterClient = (f2451e + 65) % 128;
                if (referrer.length() != 0) {
                    if (map.get("referrer") == null) {
                        map.put("referrer", referrer);
                        return;
                    }
                    return;
                }
            }
            unregisterClient = (f2451e + 97) % 128;
            return;
        }
        Intrinsics.checkNotNullParameter(map, "");
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final Long getMonetizationNetwork() {
        return (Long) getRevenue(new Object[]{this}, 1297709710, -1297709700, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
        getRevenue(new Object[]{this, aFh1mSDK}, 572486758, -572486747, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMediationNetwork(Map<String, Object> map, AFe1pSDK aFe1pSDK) {
        f2451e = (unregisterClient + 113) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFe1pSDK, "");
        if (!copydefault().contains(aFe1pSDK)) {
            f2451e = (unregisterClient + 39) % 128;
            return;
        }
        if (this.toString.getMediationNetwork()) {
            map.put(CommonUrlParts.APP_SET_ID, i0.c(new Pair("app_set_id_disabled", Boolean.TRUE)));
            if (this.toString.copydefault != null) {
                f2451e = (unregisterClient + 85) % 128;
                AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK.", false, 4, null);
                f2451e = (unregisterClient + 1) % 128;
                return;
            } else {
                AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set ID collection is disabled. Skipping inclusion in the event payload.", false, 4, null);
                int i = unregisterClient + 41;
                f2451e = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        AFb1gSDK aFb1gSDK = this.toString.copydefault;
        if (aFb1gSDK != null) {
            map.put(CommonUrlParts.APP_SET_ID, j0.g(new Pair("scope", Integer.valueOf(aFb1gSDK.getMonetizationNetwork)), new Pair("id", aFb1gSDK.getMediationNetwork)));
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        Map map = (Map) objArr[0];
        f2451e = (unregisterClient + 45) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        String monetizationNetwork = AFa1vSDK.getMonetizationNetwork();
        String currencyIso4217Code = AFa1vSDK.getCurrencyIso4217Code();
        if (monetizationNetwork != null) {
            int i = f2451e + 93;
            unregisterClient = i % 128;
            if (i % 2 == 0) {
                if (currencyIso4217Code != null && Integer.parseInt(currencyIso4217Code) > 0) {
                    unregisterClient = (f2451e + 1) % 128;
                    map.put("reinstallCounter", currencyIso4217Code);
                    map.put("originalAppsflyerId", monetizationNetwork);
                }
            } else {
                throw null;
            }
        }
        int i10 = f2451e + 13;
        unregisterClient = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static File getRevenue(String str) {
        int i = (unregisterClient + 9) % 128;
        f2451e = i;
        if (str != null) {
            int i10 = i + 71;
            unregisterClient = i10 % 128;
            try {
                if (i10 % 2 == 0) {
                    if (StringsKt.P(str).toString().length() > 0) {
                        return new File(StringsKt.P(str).toString());
                    }
                } else {
                    StringsKt.P(str).toString().length();
                    throw null;
                }
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getMessage(), th2);
            }
        }
        int i11 = unregisterClient + 41;
        f2451e = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 94 / 0;
        }
        return null;
    }

    private final String getMediationNetwork(String str) {
        unregisterClient = (f2451e + 73) % 128;
        String currencyIso4217Code = this.component4.getCurrencyIso4217Code(str);
        f2451e = (unregisterClient + 57) % 128;
        return currencyIso4217Code;
    }

    private static boolean getMediationNetwork(File file) {
        int i = (unregisterClient + 55) % 128;
        f2451e = i;
        if (file == null) {
            return true;
        }
        int i10 = i + 43;
        unregisterClient = i10 % 128;
        if (i10 % 2 == 0) {
            return !file.exists();
        }
        file.exists();
        throw null;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004c -> B:38:0x0077). Please report as a decompilation issue!!! */
    private static String getMediationNetwork(File file, String str) {
        InputStreamReader inputStreamReader;
        Properties properties;
        try {
            try {
                if (file == null) {
                    return null;
                }
                try {
                    properties = new Properties();
                    inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
                } catch (FileNotFoundException unused) {
                    inputStreamReader = null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStreamReader = null;
                }
                try {
                    properties.load(inputStreamReader);
                    AFLogger.afInfoLog("Found PreInstall property!");
                    String property = properties.getProperty(str);
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th3) {
                        AFLogger.afErrorLog(th3.getMessage(), th3);
                    }
                    unregisterClient = (f2451e + 73) % 128;
                    return property;
                } catch (FileNotFoundException unused2) {
                    AFLogger.afDebugLog("PreInstall file wasn't found: " + file.getAbsolutePath());
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                        unregisterClient = (f2451e + 93) % 128;
                    }
                    return null;
                } catch (Throwable th4) {
                    th = th4;
                    AFLogger.afErrorLog(th.getMessage(), th);
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    return null;
                }
            } catch (Throwable th5) {
                AFLogger.afErrorLog(th5.getMessage(), th5);
            }
        } catch (Throwable th6) {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th7) {
                    AFLogger.afErrorLog(th7.getMessage(), th7);
                }
            }
            throw th6;
        }
    }

    private final void getMediationNetwork(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -539509618, 539509626, System.identityHashCode(this));
    }

    private final AppsFlyerProperties getMediationNetwork() {
        return (AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this));
    }
}

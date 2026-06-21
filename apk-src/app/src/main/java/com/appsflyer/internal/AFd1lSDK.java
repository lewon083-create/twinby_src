package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.yandex.varioqub.config.model.ConfigValue;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFd1lSDK implements AFd1oSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] component3 = null;
    private static boolean copy = false;
    private static int copydefault = 1;
    private static int equals;
    private static final int getCurrencyIso4217Code;
    private static int hashCode;
    private static boolean toString;
    private final AFd1zSDK component2;
    private List<String> AFAdRevenueData = new ArrayList();
    private boolean getRevenue = true;
    private final Map<String, Object> getMediationNetwork = new HashMap();
    private SecureRandom areAllFieldsValid = new SecureRandom();
    private boolean component1 = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int getMonetizationNetwork = 0;
    private boolean component4 = false;

    static {
        component3();
        getCurrencyIso4217Code = 98166;
        equals = (copydefault + 23) % 128;
    }

    public AFd1lSDK(AFd1zSDK aFd1zSDK) {
        this.component2 = aFd1zSDK;
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i, int i10, int i11) {
        int i12 = i | i10;
        int i13 = (i12 * (-502)) + (i10 * 503) + (i * 503);
        int i14 = ~i;
        int i15 = ~((~i10) | i14);
        int i16 = i14 | (~i11);
        int i17 = i15 | (~i16);
        int i18 = ~(i11 | i12);
        int i19 = (((~(i16 | i10)) | i18) * 502) + ((i17 | i18) * (-502)) + i13;
        return i19 != 1 ? i19 != 2 ? i19 != 3 ? getMonetizationNetwork(objArr) : getRevenue(objArr) : getMediationNetwork(objArr) : getCurrencyIso4217Code(objArr);
    }

    private void AFInAppEventType() {
        copydefault = (equals + 119) % 128;
        this.component2.component4().AFAdRevenueData("participantInProxy");
        int i = copydefault + 89;
        equals = i % 128;
        if (i % 2 != 0) {
            int i10 = 31 / 0;
        }
    }

    private boolean AFLogger() {
        return ((Boolean) AFAdRevenueData(new Object[]{this}, -916590221, 916590222, System.identityHashCode(this))).booleanValue();
    }

    private static void a(String str, int[] iArr, String str2, int i, Object[] objArr) throws UnsupportedEncodingException {
        int i10 = ($11 + 29) % 128;
        $10 = i10;
        Object charArray = str2;
        if (str2 != null) {
            int i11 = i10 + 95;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
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
        char[] cArr2 = component3;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i12 = 0; i12 < length; i12++) {
                cArr3[i12] = (char) (((long) cArr2[i12]) ^ 1825820251896122634L);
            }
            cArr2 = cArr3;
        }
        int i13 = (int) (1825820251896122634L ^ ((long) hashCode));
        if (copy) {
            int length2 = bArr.length;
            aFk1oSDK.getMonetizationNetwork = length2;
            char[] cArr4 = new char[length2];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i14 = aFk1oSDK.AFAdRevenueData;
                int i15 = aFk1oSDK.getMonetizationNetwork;
                if (i14 >= i15) {
                    objArr[0] = new String(cArr4);
                    return;
                } else {
                    cArr4[i14] = (char) (cArr2[bArr[(i15 - 1) - i14] + i] - i13);
                    aFk1oSDK.AFAdRevenueData = i14 + 1;
                }
            }
        } else if (toString) {
            int length3 = cArr.length;
            aFk1oSDK.getMonetizationNetwork = length3;
            char[] cArr5 = new char[length3];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i16 = aFk1oSDK.AFAdRevenueData;
                int i17 = aFk1oSDK.getMonetizationNetwork;
                if (i16 >= i17) {
                    String str3 = new String(cArr5);
                    $11 = ($10 + 51) % 128;
                    objArr[0] = str3;
                    return;
                } else {
                    int i18 = $11 + 55;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        cArr5[i16] = (char) (cArr2[cArr[(i17 % 1) / i16] - i] % i13);
                    } else {
                        cArr5[i16] = (char) (cArr2[cArr[(i17 - 1) - i16] - i] - i13);
                        i16++;
                    }
                    aFk1oSDK.AFAdRevenueData = i16;
                }
            }
        } else {
            int length4 = iArr.length;
            aFk1oSDK.getMonetizationNetwork = length4;
            char[] cArr6 = new char[length4];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i19 = aFk1oSDK.AFAdRevenueData;
                int i20 = aFk1oSDK.getMonetizationNetwork;
                if (i19 >= i20) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i19] = (char) (cArr2[iArr[(i20 - 1) - i19] - i] - i13);
                    aFk1oSDK.AFAdRevenueData = i19 + 1;
                }
            }
        }
    }

    private synchronized void component1() {
        int i = copydefault + 51;
        equals = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (this.component4) {
            return;
        }
        this.component4 = true;
        try {
            getCurrencyIso4217Code("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            equals = (copydefault + 83) % 128;
            return;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while starting remote debugger", th2, true, true, true);
            return;
        }
    }

    private float component2() {
        int i = copydefault + 115;
        equals = i % 128;
        if (i % 2 == 0) {
            return this.areAllFieldsValid.nextFloat();
        }
        this.areAllFieldsValid.nextFloat();
        throw null;
    }

    public static void component3() {
        component3 = new char[]{36322, 36338, 36333, 36350, 36320};
        hashCode = 1912311180;
        toString = true;
        copy = true;
    }

    private static String component4() {
        int i = equals + 83;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return "6.17.6";
        }
        throw null;
    }

    private synchronized void copy() {
        this.AFAdRevenueData = new ArrayList();
        this.getMonetizationNetwork = 0;
        copydefault = (equals + 29) % 128;
    }

    private synchronized Map<String, Object> copydefault() {
        Map<String, Object> map;
        copydefault = (equals + 37) % 128;
        this.getMediationNetwork.put("data", this.AFAdRevenueData);
        copy();
        map = this.getMediationNetwork;
        copydefault = (equals + 111) % 128;
        return map;
    }

    private boolean equals() {
        if (this.component1) {
            int i = copydefault;
            equals = (i + 31) % 128;
            if (this.getRevenue) {
                return true;
            }
            int i10 = i + 37;
            equals = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            if (this.component4) {
                return true;
            }
        }
        int i11 = copydefault + 39;
        equals = i11 % 128;
        if (i11 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final boolean areAllFieldsValid() {
        int i = copydefault + 105;
        equals = i % 128;
        if (i % 2 == 0) {
            return this.component4;
        }
        int i10 = 7 / 0;
        return this.component4;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getCurrencyIso4217Code() {
        int i = copydefault;
        this.component1 = false;
        equals = (i + 13) % 128;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final synchronized void getMediationNetwork() {
        if (!this.component4 && !this.getRevenue) {
            copydefault = (equals + 85) % 128;
            return;
        }
        this.component4 = false;
        this.getRevenue = false;
        try {
            getCurrencyIso4217Code("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            equals = (copydefault + 91) % 128;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while stopping remote debugger", th2, true, true, true);
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final synchronized void getMonetizationNetwork() {
        equals = (copydefault + 29) % 128;
        this.getMediationNetwork.clear();
        this.AFAdRevenueData.clear();
        this.getMonetizationNetwork = 0;
        int i = equals + 61;
        copydefault = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getRevenue(String str, String... strArr) {
        int i = copydefault + 47;
        equals = i % 128;
        if (i % 2 != 0) {
            getCurrencyIso4217Code("public_api_call", str, strArr);
            int i10 = 67 / 0;
        } else {
            getCurrencyIso4217Code("public_api_call", str, strArr);
        }
        equals = (copydefault + 3) % 128;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void q_(String str, PackageManager packageManager) {
        int i = copydefault + 33;
        equals = i % 128;
        try {
            if (i % 2 != 0) {
                this.component2.getRevenue().getMediationNetwork(AFAdRevenueData(str), this.component2.AFInAppEventType().getMediationNetwork());
                throw null;
            }
            AFd1kSDK mediationNetwork = this.component2.getRevenue().getMediationNetwork(AFAdRevenueData(str), this.component2.AFInAppEventType().getMediationNetwork());
            if (mediationNetwork == null) {
                AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
            } else {
                this.component2.getMonetizationNetwork().execute(new e(2, mediationNetwork));
                equals = (copydefault + 61) % 128;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th2);
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final boolean AFAdRevenueData() {
        equals = (copydefault + 67) % 128;
        boolean monetizationNetwork = getMonetizationNetwork(getMonetizationNetwork(this.component2.component1().AFAdRevenueData.getCurrencyIso4217Code), getMonetizationNetwork(this.component2.component1().AFAdRevenueData.getMediationNetwork));
        if (monetizationNetwork) {
            equals = (copydefault + 13) % 128;
            component1();
        } else {
            getRevenue();
            getMediationNetwork();
        }
        copydefault = (equals + 119) % 128;
        return monetizationNetwork;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0041, B:10:0x005a, B:20:0x0077, B:24:0x008c), top: B:31:0x0041 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized void getCurrencyIso4217Code(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.getMediationNetwork     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = "\u0085\u0084\u0083\u0082\u0081"
            long r2 = android.view.ViewConfiguration.getZoomControlsTimeout()     // Catch: java.lang.Throwable -> L99
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            int r2 = r2 + 126
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L99
            r4 = 0
            a(r1, r4, r4, r2, r3)     // Catch: java.lang.Throwable -> L99
            r1 = 0
            r1 = r3[r1]     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = r1.intern()     // Catch: java.lang.Throwable -> L99
            java.lang.String r2 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L99
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L99
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.getMediationNetwork     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = "model"
            java.lang.String r2 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L99
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L99
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.getMediationNetwork     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = "platform"
            java.lang.String r2 = "Android"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L99
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.getMediationNetwork     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = "platform_version"
            java.lang.String r2 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> L99
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L99
            if (r7 == 0) goto L66
            int r0 = com.appsflyer.internal.AFd1lSDK.copydefault     // Catch: java.lang.Throwable -> L63
            int r0 = r0 + 19
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1lSDK.equals = r1     // Catch: java.lang.Throwable -> L63
            int r0 = r0 % 2
            if (r0 != 0) goto L65
            int r0 = r7.length()     // Catch: java.lang.Throwable -> L99
            if (r0 <= 0) goto L66
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.getMediationNetwork     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = "advertiserId"
            r0.put(r1, r7)     // Catch: java.lang.Throwable -> L99
            int r7 = com.appsflyer.internal.AFd1lSDK.equals     // Catch: java.lang.Throwable -> L63
            int r7 = r7 + 55
            int r7 = r7 % 128
            com.appsflyer.internal.AFd1lSDK.copydefault = r7     // Catch: java.lang.Throwable -> L63
            goto L66
        L63:
            r7 = move-exception
            goto L95
        L65:
            throw r4     // Catch: java.lang.Throwable -> L99
        L66:
            if (r8 == 0) goto L75
            int r7 = r8.length()     // Catch: java.lang.Throwable -> L99
            if (r7 <= 0) goto L75
            java.util.Map<java.lang.String, java.lang.Object> r7 = r6.getMediationNetwork     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = "imei"
            r7.put(r0, r8)     // Catch: java.lang.Throwable -> L99
        L75:
            if (r9 == 0) goto L97
            int r7 = com.appsflyer.internal.AFd1lSDK.copydefault     // Catch: java.lang.Throwable -> L63
            int r7 = r7 + 111
            int r7 = r7 % 128
            com.appsflyer.internal.AFd1lSDK.equals = r7     // Catch: java.lang.Throwable -> L63
            int r7 = r9.length()     // Catch: java.lang.Throwable -> L99
            if (r7 <= 0) goto L97
            java.util.Map<java.lang.String, java.lang.Object> r7 = r6.getMediationNetwork     // Catch: java.lang.Throwable -> L99
            java.lang.String r8 = "android_id"
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L99
            int r7 = com.appsflyer.internal.AFd1lSDK.copydefault     // Catch: java.lang.Throwable -> L63
            int r7 = r7 + 123
            int r7 = r7 % 128
            com.appsflyer.internal.AFd1lSDK.equals = r7     // Catch: java.lang.Throwable -> L63
            goto L97
        L95:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L63
            throw r7
        L97:
            monitor-exit(r6)
            return
        L99:
            monitor-exit(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1lSDK.getCurrencyIso4217Code(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getMonetizationNetwork(String str, String str2) {
        int i = equals + 109;
        copydefault = i % 128;
        if (i % 2 == 0) {
            getCurrencyIso4217Code((String) null, str, str2);
        } else {
            getCurrencyIso4217Code((String) null, str, str2);
        }
        int i10 = equals + 125;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[PHI: r0 r1
      0x0032: PHI (r0v10 java.lang.Throwable) = (r0v3 java.lang.Throwable), (r0v11 java.lang.Throwable) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r1v5 java.lang.String) = (r1v2 java.lang.String), (r1v7 java.lang.String) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r0 r1
      0x002d: PHI (r0v4 java.lang.Throwable) = (r0v3 java.lang.Throwable), (r0v11 java.lang.Throwable) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x002d: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v7 java.lang.String) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.appsflyer.internal.AFd1oSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void getRevenue(java.lang.Throwable r4) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFd1lSDK.equals
            int r0 = r0 + 103
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1lSDK.copydefault = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L1f
            java.lang.Throwable r0 = r4.getCause()
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r2 = 82
            int r2 = r2 / 0
            if (r0 != 0) goto L32
            goto L2d
        L1f:
            java.lang.Throwable r0 = r4.getCause()
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            if (r0 != 0) goto L32
        L2d:
            java.lang.String r2 = r4.getMessage()
            goto L36
        L32:
            java.lang.String r2 = r0.getMessage()
        L36:
            if (r0 != 0) goto L3d
            java.lang.StackTraceElement[] r4 = r4.getStackTrace()
            goto L49
        L3d:
            java.lang.StackTraceElement[] r4 = r0.getStackTrace()
            int r0 = com.appsflyer.internal.AFd1lSDK.copydefault
            int r0 = r0 + 47
            int r0 = r0 % 128
            com.appsflyer.internal.AFd1lSDK.equals = r0
        L49:
            java.lang.String[] r4 = getCurrencyIso4217Code(r2, r4)
            java.lang.String r0 = "exception"
            r3.getCurrencyIso4217Code(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1lSDK.getRevenue(java.lang.Throwable):void");
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        boolean mediationNetwork;
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        AFi1xSDK aFi1xSDK = (AFi1xSDK) objArr[1];
        AFi1xSDK aFi1xSDK2 = (AFi1xSDK) objArr[2];
        int i = equals + 87;
        copydefault = i % 128;
        if (i % 2 == 0) {
            aFi1xSDK.equals(aFi1xSDK2);
            throw null;
        }
        if (aFi1xSDK.equals(aFi1xSDK2)) {
            mediationNetwork = aFd1lSDK.AFLogger();
        } else {
            mediationNetwork = aFd1lSDK.getMediationNetwork(aFi1xSDK.getMediationNetwork);
            aFd1lSDK.getMediationNetwork(mediationNetwork);
        }
        int i10 = copydefault + 63;
        equals = i10 % 128;
        if (i10 % 2 == 0) {
            return Boolean.valueOf(mediationNetwork);
        }
        throw null;
    }

    private synchronized boolean getMonetizationNetwork(AFi1xSDK aFi1xSDK, AFi1xSDK aFi1xSDK2) {
        if (aFi1xSDK == null) {
            AFInAppEventType();
            return false;
        }
        if (!aFi1xSDK.AFAdRevenueData()) {
            return false;
        }
        if (this.component2.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0) > aFi1xSDK.getMonetizationNetwork) {
            return false;
        }
        equals = (copydefault + 113) % 128;
        if (!AFAdRevenueData(aFi1xSDK, aFi1xSDK2)) {
            return false;
        }
        if (!getMonetizationNetwork(aFi1xSDK.getCurrencyIso4217Code)) {
            return false;
        }
        if (getCurrencyIso4217Code(aFi1xSDK.component4)) {
            return true;
        }
        int i = copydefault + 115;
        equals = i % 128;
        if (i % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void AFAdRevenueData(String str, int i, String str2) {
        int i10 = copydefault + 3;
        equals = i10 % 128;
        if (i10 % 2 != 0) {
            String[] strArr = new String[4];
            strArr[1] = String.valueOf(i);
            strArr[0] = str2;
            getCurrencyIso4217Code("server_response", str, strArr);
        } else {
            getCurrencyIso4217Code("server_response", str, String.valueOf(i), str2);
        }
        int i11 = copydefault + 113;
        equals = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 72 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getRevenue(String str, String str2) {
        int i = equals + 19;
        copydefault = i % 128;
        if (i % 2 == 0) {
            String[] strArr = new String[0];
            strArr[0] = str2;
            getCurrencyIso4217Code("server_request", str, strArr);
        } else {
            getCurrencyIso4217Code("server_request", str, str2);
        }
        int i10 = copydefault + 115;
        equals = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    private void getMediationNetwork(boolean z5) {
        int i = equals + 57;
        copydefault = i % 128;
        if (i % 2 != 0) {
            this.component2.component4().AFAdRevenueData("participantInProxy", z5);
        } else {
            this.component2.component4().AFAdRevenueData("participantInProxy", z5);
            throw null;
        }
    }

    private Map<String, Object> AFAdRevenueData(String str) {
        int i = equals + 7;
        copydefault = i % 128;
        if (i % 2 != 0) {
            AFAdRevenueData(str, this.component2.AFInAppEventType(), this.component2.force());
            return copydefault();
        }
        AFAdRevenueData(str, this.component2.AFInAppEventType(), this.component2.force());
        copydefault();
        throw null;
    }

    private synchronized void getCurrencyIso4217Code(String str, String str2, String str3, String str4) {
        try {
            int i = equals + 5;
            copydefault = i % 128;
            try {
                if (i % 2 != 0) {
                    this.getMediationNetwork.put("sdk_version", str);
                    if (str2 != null) {
                        equals = (copydefault + 29) % 128;
                        if (str2.length() > 0) {
                            this.getMediationNetwork.put("devkey", str2);
                        }
                    }
                    if (str3 != null && str3.length() > 0) {
                        int i10 = copydefault + 61;
                        equals = i10 % 128;
                        if (i10 % 2 == 0) {
                            this.getMediationNetwork.put("originalAppsFlyerId", str3);
                        } else {
                            this.getMediationNetwork.put("originalAppsFlyerId", str3);
                            throw null;
                        }
                    }
                    if (str4 != null) {
                        int i11 = equals + 79;
                        copydefault = i11 % 128;
                        if (i11 % 2 != 0) {
                            if (str4.length() > 0) {
                                this.getMediationNetwork.put("uid", str4);
                            }
                        } else {
                            throw null;
                        }
                    }
                } else {
                    this.getMediationNetwork.put("sdk_version", str);
                    throw null;
                }
            } catch (Throwable unused) {
            }
        } finally {
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final synchronized void getRevenue() {
        try {
            int i = copydefault + 23;
            equals = i % 128;
            if (i % 2 != 0) {
                this.getRevenue = false;
            } else {
                this.getRevenue = false;
            }
            getMonetizationNetwork();
            copy();
            int i10 = equals + 31;
            copydefault = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 15 / 0;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private boolean getMediationNetwork(float f10) {
        return ((Boolean) AFAdRevenueData(new Object[]{this, Float.valueOf(f10)}, 1140261820, -1140261820, System.identityHashCode(this))).booleanValue();
    }

    private synchronized void AFAdRevenueData(String str, AFf1eSDK aFf1eSDK, AFc1eSDK aFc1eSDK) {
        try {
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            String string = appsFlyerProperties.getString("remote_debug_static_data");
            this.getMediationNetwork.clear();
            if (string != null) {
                try {
                    this.getMediationNetwork.putAll(AFg1eSDK.getRevenue(new JSONObject(string)));
                } catch (Throwable unused) {
                }
            } else {
                getCurrencyIso4217Code(this.component2.AFAdRevenueData().areAllFieldsValid(), aFf1eSDK.AFAdRevenueData(), aFc1eSDK.getCurrencyIso4217Code);
                StringBuilder sb2 = new StringBuilder("6.17.6.");
                sb2.append(AFa1ySDK.getMonetizationNetwork);
                getCurrencyIso4217Code(sb2.toString(), this.component2.AFInAppEventType().getMediationNetwork(), appsFlyerProperties.getString("KSAppsFlyerId"), AFb1kSDK.getCurrencyIso4217Code(this.component2.AFAdRevenueData().getMediationNetwork));
                try {
                    int i = this.component2.AFAdRevenueData().n_().versionCode;
                    getRevenue(str, String.valueOf(i), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
                    copydefault = (equals + 29) % 128;
                } catch (Throwable unused2) {
                }
                appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.getMediationNetwork).toString());
            }
            this.getMediationNetwork.put("launch_counter", String.valueOf(this.component2.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0)));
            copydefault = (equals + 41) % 128;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:4:0x0003, B:7:0x0011, B:14:0x0026, B:18:0x0038, B:19:0x0040, B:20:0x0047, B:23:0x0052, B:27:0x0064, B:28:0x006c, B:29:0x0073, B:31:0x0076, B:33:0x007c), top: B:44:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:4:0x0003, B:7:0x0011, B:14:0x0026, B:18:0x0038, B:19:0x0040, B:20:0x0047, B:23:0x0052, B:27:0x0064, B:28:0x006c, B:29:0x0073, B:31:0x0076, B:33:0x007c), top: B:44:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a A[Catch: all -> 0x0021, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x0009, B:8:0x0018, B:16:0x002c, B:22:0x004a, B:25:0x0058, B:37:0x0086), top: B:42:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized void getRevenue(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L23
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L84
            if (r0 <= 0) goto L23
            int r0 = com.appsflyer.internal.AFd1lSDK.equals     // Catch: java.lang.Throwable -> L21
            int r0 = r0 + 65
            int r0 = r0 % 128
            com.appsflyer.internal.AFd1lSDK.copydefault = r0     // Catch: java.lang.Throwable -> L21
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.getMediationNetwork     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = "app_id"
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L84
            int r3 = com.appsflyer.internal.AFd1lSDK.copydefault     // Catch: java.lang.Throwable -> L21
            int r3 = r3 + 37
            int r3 = r3 % 128
            com.appsflyer.internal.AFd1lSDK.equals = r3     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r3 = move-exception
            goto L90
        L23:
            r3 = 0
            if (r4 == 0) goto L48
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L84
            if (r0 <= 0) goto L48
            int r0 = com.appsflyer.internal.AFd1lSDK.equals     // Catch: java.lang.Throwable -> L21
            int r0 = r0 + 19
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1lSDK.copydefault = r1     // Catch: java.lang.Throwable -> L21
            int r0 = r0 % 2
            if (r0 == 0) goto L40
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.getMediationNetwork     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = "app_version"
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L84
            goto L48
        L40:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r2.getMediationNetwork     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = "app_version"
            r5.put(r6, r4)     // Catch: java.lang.Throwable -> L84
            throw r3     // Catch: java.lang.Throwable -> L84
        L48:
            if (r5 == 0) goto L74
            int r4 = com.appsflyer.internal.AFd1lSDK.copydefault     // Catch: java.lang.Throwable -> L21
            int r4 = r4 + 105
            int r4 = r4 % 128
            com.appsflyer.internal.AFd1lSDK.equals = r4     // Catch: java.lang.Throwable -> L21
            int r4 = r5.length()     // Catch: java.lang.Throwable -> L84
            if (r4 <= 0) goto L74
            int r4 = com.appsflyer.internal.AFd1lSDK.equals     // Catch: java.lang.Throwable -> L21
            int r4 = r4 + 123
            int r0 = r4 % 128
            com.appsflyer.internal.AFd1lSDK.copydefault = r0     // Catch: java.lang.Throwable -> L21
            int r4 = r4 % 2
            if (r4 == 0) goto L6c
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.getMediationNetwork     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = "channel"
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L84
            goto L74
        L6c:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.getMediationNetwork     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = "channel"
            r4.put(r6, r5)     // Catch: java.lang.Throwable -> L84
            throw r3     // Catch: java.lang.Throwable -> L84
        L74:
            if (r6 == 0) goto L86
            int r3 = r6.length()     // Catch: java.lang.Throwable -> L84
            if (r3 <= 0) goto L86
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.getMediationNetwork     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = "preInstall"
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> L84
            goto L86
        L84:
            monitor-exit(r2)
            return
        L86:
            int r3 = com.appsflyer.internal.AFd1lSDK.equals     // Catch: java.lang.Throwable -> L21
            int r3 = r3 + 57
            int r3 = r3 % 128
            com.appsflyer.internal.AFd1lSDK.copydefault = r3     // Catch: java.lang.Throwable -> L21
            monitor-exit(r2)
            return
        L90:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1lSDK.getRevenue(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r3 = r3.equals(r2.component2.AFAdRevenueData().n_().versionName);
        com.appsflyer.internal.AFd1lSDK.copydefault = (com.appsflyer.internal.AFd1lSDK.equals + 83) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (com.appsflyer.internal.AFk1wSDK.getCurrencyIso4217Code(r3) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (com.appsflyer.internal.AFk1wSDK.getCurrencyIso4217Code(r3) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        com.appsflyer.internal.AFd1lSDK.equals = (com.appsflyer.internal.AFd1lSDK.copydefault + 89) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean getMonetizationNetwork(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = com.appsflyer.internal.AFd1lSDK.equals
            int r0 = r0 + 47
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1lSDK.copydefault = r1
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L15
            boolean r0 = com.appsflyer.internal.AFk1wSDK.getCurrencyIso4217Code(r3)
            int r1 = r1 / 0
            if (r0 == 0) goto L25
            goto L1b
        L15:
            boolean r0 = com.appsflyer.internal.AFk1wSDK.getCurrencyIso4217Code(r3)
            if (r0 == 0) goto L25
        L1b:
            int r3 = com.appsflyer.internal.AFd1lSDK.copydefault
            int r3 = r3 + 89
            int r3 = r3 % 128
            com.appsflyer.internal.AFd1lSDK.equals = r3
            r3 = 1
            return r3
        L25:
            com.appsflyer.internal.AFd1zSDK r0 = r2.component2
            com.appsflyer.internal.AFc1oSDK r0 = r0.AFAdRevenueData()
            android.content.pm.PackageInfo r0 = r0.n_()
            java.lang.String r0 = r0.versionName
            boolean r3 = r3.equals(r0)
            int r0 = com.appsflyer.internal.AFd1lSDK.equals
            int r0 = r0 + 83
            int r0 = r0 % 128
            com.appsflyer.internal.AFd1lSDK.copydefault = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1lSDK.getMonetizationNetwork(java.lang.String):boolean");
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        double d10 = fFloatValue;
        if (d10 >= 1.0d) {
            int i = copydefault + 109;
            equals = i % 128;
            if (i % 2 == 0) {
                return Boolean.TRUE;
            }
            throw null;
        }
        if (d10 <= ConfigValue.DOUBLE_DEFAULT_VALUE) {
            return Boolean.FALSE;
        }
        if (aFd1lSDK.component2() <= fFloatValue) {
            int i10 = equals + 47;
            copydefault = i10 % 128;
            return i10 % 2 == 0 ? Boolean.FALSE : Boolean.TRUE;
        }
        int i11 = equals + 71;
        copydefault = i11 % 128;
        if (i11 % 2 != 0) {
            return Boolean.FALSE;
        }
        int i12 = 5 / 0;
        return Boolean.FALSE;
    }

    private synchronized void getCurrencyIso4217Code(String str, String str2, String... strArr) {
        String string;
        try {
            if (!equals() || this.getMonetizationNetwork >= 98304) {
                return;
            }
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strJoin = TextUtils.join(", ", strArr);
                if (str != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(jCurrentTimeMillis);
                    sb2.append(" ");
                    sb2.append(Thread.currentThread().getId());
                    sb2.append(" _/AppsFlyer_6.17.6 [");
                    sb2.append(str);
                    sb2.append("] ");
                    sb2.append(str2);
                    sb2.append(" ");
                    sb2.append(strJoin);
                    string = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(jCurrentTimeMillis);
                    sb3.append(" ");
                    sb3.append(Thread.currentThread().getId());
                    sb3.append(" ");
                    sb3.append(str2);
                    sb3.append("/AppsFlyer_6.17.6 ");
                    sb3.append(strJoin);
                    string = sb3.toString();
                }
                int length = this.getMonetizationNetwork + (string.length() << 1);
                int i = getCurrencyIso4217Code;
                boolean z5 = false;
                if (length > i) {
                    copydefault = (equals + 55) % 128;
                    string = string.substring(0, (i - this.getMonetizationNetwork) / 2);
                    z5 = true;
                }
                this.AFAdRevenueData.add(string);
                this.getMonetizationNetwork += string.length() << 1;
                if (z5) {
                    int i10 = equals + 113;
                    copydefault = i10 % 128;
                    if (i10 % 2 == 0) {
                        this.AFAdRevenueData.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                        this.getMonetizationNetwork *= 26120;
                    } else {
                        this.AFAdRevenueData.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                        this.getMonetizationNetwork += 138;
                    }
                }
            } catch (Throwable unused) {
            }
        } finally {
        }
    }

    private static AFi1xSDK getMonetizationNetwork(AFi1vSDK aFi1vSDK) {
        int i = copydefault + 83;
        int i10 = i % 128;
        equals = i10;
        if (i % 2 != 0) {
            int i11 = 4 / 0;
            if (aFi1vSDK == null) {
                return null;
            }
        } else if (aFi1vSDK == null) {
            return null;
        }
        AFi1zSDK aFi1zSDK = aFi1vSDK.getMonetizationNetwork;
        if (aFi1zSDK == null) {
            return null;
        }
        copydefault = (i10 + 33) % 128;
        return aFi1zSDK.getMediationNetwork;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        String str = (String) objArr[0];
        int i = equals + 87;
        copydefault = i % 128;
        if (i % 2 != 0) {
            if (!AFk1wSDK.getCurrencyIso4217Code(str)) {
                new AFd1pSDK();
                return Boolean.valueOf(AFd1pSDK.getCurrencyIso4217Code(component4(), str));
            }
            int i10 = equals + 123;
            copydefault = i10 % 128;
            return Boolean.valueOf(i10 % 2 != 0);
        }
        AFk1wSDK.getCurrencyIso4217Code(str);
        throw null;
    }

    private boolean AFAdRevenueData(AFi1xSDK aFi1xSDK, AFi1xSDK aFi1xSDK2) {
        return ((Boolean) AFAdRevenueData(new Object[]{this, aFi1xSDK, aFi1xSDK2}, 322554097, -322554095, System.identityHashCode(this))).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        r2 = 1;
        r0 = new java.lang.String[r4.length + 1];
        r0[0] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r2 >= r4.length) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        r3 = com.appsflyer.internal.AFd1lSDK.copydefault + 61;
        com.appsflyer.internal.AFd1lSDK.equals = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if ((r3 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        r0[r2] = r4[r2].toString();
        r2 = r2 + 43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        r0[r2] = r4[r2].toString();
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        return new java.lang.String[]{r3};
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String[] getCurrencyIso4217Code(java.lang.String r3, java.lang.StackTraceElement[] r4) {
        /*
            int r0 = com.appsflyer.internal.AFd1lSDK.copydefault
            int r0 = r0 + 105
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1lSDK.equals = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L13
            r0 = 86
            int r0 = r0 / r1
            if (r4 != 0) goto L1a
            goto L15
        L13:
            if (r4 != 0) goto L1a
        L15:
            java.lang.String[] r3 = new java.lang.String[]{r3}
            return r3
        L1a:
            int r0 = r4.length
            r2 = 1
            int r0 = r0 + r2
            java.lang.String[] r0 = new java.lang.String[r0]
            r0[r1] = r3
        L21:
            int r3 = r4.length
            if (r2 >= r3) goto L46
            int r3 = com.appsflyer.internal.AFd1lSDK.copydefault
            int r3 = r3 + 61
            int r1 = r3 % 128
            com.appsflyer.internal.AFd1lSDK.equals = r1
            int r3 = r3 % 2
            if (r3 == 0) goto L3b
            r3 = r4[r2]
            java.lang.String r3 = r3.toString()
            r0[r2] = r3
            int r2 = r2 + 43
            goto L21
        L3b:
            r3 = r4[r2]
            java.lang.String r3 = r3.toString()
            r0[r2] = r3
            int r2 = r2 + 1
            goto L21
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1lSDK.getCurrencyIso4217Code(java.lang.String, java.lang.StackTraceElement[]):java.lang.String[]");
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        copydefault = (equals + 117) % 128;
        boolean mediationNetwork = aFd1lSDK.component2.component4().getMediationNetwork("participantInProxy", false);
        int i = copydefault + 37;
        equals = i % 128;
        if (i % 2 == 0) {
            return Boolean.valueOf(mediationNetwork);
        }
        throw null;
    }

    private static boolean getCurrencyIso4217Code(String str) {
        return ((Boolean) AFAdRevenueData(new Object[]{str}, -1244422585, 1244422588, (int) System.currentTimeMillis())).booleanValue();
    }
}

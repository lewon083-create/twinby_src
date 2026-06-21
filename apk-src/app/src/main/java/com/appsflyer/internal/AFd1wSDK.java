package com.appsflyer.internal;

import android.graphics.PointF;
import android.os.Build;
import com.appsflyer.internal.AFd1xSDK;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import kotlin.text.Charsets;

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
public final class AFd1wSDK implements AFd1xSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFKeystoreWrapper = 1;
    private static char copy = 10357;
    private static int copydefault = 0;
    private static char equals = 787;
    private static char hashCode = 7956;
    private static char toString = 48673;
    private AFd1zSDK AFAdRevenueData;
    private final ij.g areAllFieldsValid;
    private AFd1xSDK.AFa1vSDK component1;
    private final ij.g component2;
    private final ij.g component3;
    private final String component4;
    private final ij.g getCurrencyIso4217Code;
    private final ij.g getMediationNetwork;
    private final ij.g getMonetizationNetwork;
    private final ij.g getRevenue;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1wSDK$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass1 extends r implements Function0<AFd1ySDK> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final AFd1ySDK invoke() {
            AFc1hSDK aFc1hSDKAFInAppEventParameterName = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFInAppEventParameterName();
            Intrinsics.checkNotNullExpressionValue(aFc1hSDKAFInAppEventParameterName, "");
            return new AFd1ySDK(aFc1hSDKAFInAppEventParameterName);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1wSDK$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass2 extends r implements Function0<AFc1qSDK> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final AFc1qSDK invoke() {
            AFc1qSDK aFc1qSDKComponent4 = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).component4();
            Intrinsics.checkNotNullExpressionValue(aFc1qSDKComponent4, "");
            return aFc1qSDKComponent4;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1wSDK$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass3 extends r implements Function0<AFc1oSDK> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final AFc1oSDK invoke() {
            AFc1oSDK aFc1oSDKAFAdRevenueData = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFAdRevenueData();
            Intrinsics.checkNotNullExpressionValue(aFc1oSDKAFAdRevenueData, "");
            return aFc1oSDKAFAdRevenueData;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1wSDK$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass4 extends r implements Function0<AFf1kSDK> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final AFf1kSDK invoke() {
            AFf1kSDK aFf1kSDKComponent1 = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).component1();
            Intrinsics.checkNotNullExpressionValue(aFf1kSDKComponent1, "");
            return aFf1kSDKComponent1;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1wSDK$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass5 extends r implements Function0<ExecutorService> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            ExecutorService monetizationNetwork = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).getMonetizationNetwork();
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            return monetizationNetwork;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1wSDK$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass6 extends r implements Function0<AFf1eSDK> {
        public AnonymousClass6() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final AFf1eSDK invoke() {
            AFf1eSDK aFf1eSDKAFInAppEventType = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFInAppEventType();
            Intrinsics.checkNotNullExpressionValue(aFf1eSDKAFInAppEventType, "");
            return aFf1eSDKAFInAppEventType;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1wSDK$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass7 extends r implements Function0<AFd1vSDK> {
        public AnonymousClass7() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final AFd1vSDK invoke() {
            return new AFd1vSDK(AFd1wSDK.this.getRevenue());
        }
    }

    public AFd1wSDK(AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.AFAdRevenueData = aFd1zSDK;
        this.getRevenue = ij.h.b(new AnonymousClass4());
        this.getMediationNetwork = ij.h.b(new AnonymousClass3());
        this.getMonetizationNetwork = ij.h.b(new AnonymousClass2());
        this.getCurrencyIso4217Code = ij.h.b(new AnonymousClass6());
        this.component2 = ij.h.b(new AnonymousClass5());
        this.component4 = "6.17.6";
        this.component3 = ij.h.b(new AnonymousClass1());
        this.areAllFieldsValid = ij.h.b(new AnonymousClass7());
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFi1zSDK aFi1zSDK;
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        AFKeystoreWrapper = (copydefault + 77) % 128;
        AFi1vSDK aFi1vSDK = aFd1wSDK.getCurrencyIso4217Code().AFAdRevenueData.getCurrencyIso4217Code;
        if (aFi1vSDK == null || (aFi1zSDK = aFi1vSDK.getMonetizationNetwork) == null) {
            return null;
        }
        int i = AFKeystoreWrapper + 109;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return aFi1zSDK.getCurrencyIso4217Code;
        }
        AFh1aSDK aFh1aSDK = aFi1zSDK.getCurrencyIso4217Code;
        throw null;
    }

    private final ExecutorService areAllFieldsValid() {
        copydefault = (AFKeystoreWrapper + 53) % 128;
        ExecutorService executorService = (ExecutorService) this.component2.getValue();
        AFKeystoreWrapper = (copydefault + 119) % 128;
        return executorService;
    }

    private final AFf1eSDK component1() {
        AFKeystoreWrapper = (copydefault + 109) % 128;
        AFf1eSDK aFf1eSDK = (AFf1eSDK) this.getCurrencyIso4217Code.getValue();
        copydefault = (AFKeystoreWrapper + 117) % 128;
        return aFf1eSDK;
    }

    private final AFc1qSDK component2() {
        return (AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this));
    }

    private AFd1uSDK component3() {
        copydefault = (AFKeystoreWrapper + 75) % 128;
        AFd1uSDK aFd1uSDK = (AFd1uSDK) this.areAllFieldsValid.getValue();
        int i = copydefault + 77;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            int i10 = 15 / 0;
        }
        return aFd1uSDK;
    }

    private final AFh1aSDK component4() {
        return (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (getMediationNetwork(r0) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        com.appsflyer.internal.AFd1wSDK.copydefault = (com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 121) % 128;
        r1 = component1().getMediationNetwork();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        r0 = new org.json.JSONObject(getMonetizationNetwork(getRevenue(r0), getRevenue().getRevenue())).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        getMediationNetwork(new java.lang.Object[]{r10, r0, r1}, -1856843688, 1856843689, java.lang.System.identityHashCode(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
    
        com.appsflyer.internal.AFh1ySDK.v$default(com.appsflyer.AFLogger.INSTANCE, com.appsflyer.internal.AFg1cSDK.AFKeystoreWrapper, "skipping", false, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008f, code lost:
    
        r0 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 3;
        com.appsflyer.internal.AFd1wSDK.copydefault = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0099, code lost:
    
        if ((r0 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        r0 = 18 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r0 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void copy() {
        /*
            r10 = this;
            int r0 = com.appsflyer.internal.AFd1wSDK.copydefault
            int r0 = r0 + 15
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper = r1
            int r0 = r0 % 2
            r1 = 2108652208(0x7daf7ab0, float:2.915649E37)
            r2 = -2108652204(0xffffffff82508554, float:-1.531969E-37)
            if (r0 != 0) goto L27
            java.lang.Object[] r0 = new java.lang.Object[]{r10}
            int r3 = java.lang.System.identityHashCode(r10)
            java.lang.Object r0 = getMediationNetwork(r0, r2, r1, r3)
            com.appsflyer.internal.AFh1aSDK r0 = (com.appsflyer.internal.AFh1aSDK) r0
            r1 = 33
            int r1 = r1 / 0
            if (r0 == 0) goto L8f
            goto L37
        L27:
            java.lang.Object[] r0 = new java.lang.Object[]{r10}
            int r3 = java.lang.System.identityHashCode(r10)
            java.lang.Object r0 = getMediationNetwork(r0, r2, r1, r3)
            com.appsflyer.internal.AFh1aSDK r0 = (com.appsflyer.internal.AFh1aSDK) r0
            if (r0 == 0) goto L8f
        L37:
            boolean r1 = r10.getMediationNetwork(r0)
            if (r1 == 0) goto L82
            int r1 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper
            int r1 = r1 + 121
            int r1 = r1 % 128
            com.appsflyer.internal.AFd1wSDK.copydefault = r1
            com.appsflyer.internal.AFf1eSDK r1 = r10.component1()
            java.lang.String r1 = r1.getMediationNetwork()
            if (r1 == 0) goto L9f
            java.util.Map r0 = r10.getRevenue(r0)
            com.appsflyer.internal.AFc1cSDK r2 = r10.getRevenue()
            java.util.List r2 = r2.getRevenue()
            java.util.Map r0 = getMonetizationNetwork(r0, r2)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r10, r0, r1}
            int r1 = java.lang.System.identityHashCode(r10)
            r2 = -1856843688(0xffffffff9152d058, float:-1.663028E-28)
            r3 = 1856843689(0x6ead2fa9, float:2.6799262E28)
            getMediationNetwork(r0, r2, r3, r1)
            return
        L82:
            com.appsflyer.AFLogger r4 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r5 = com.appsflyer.internal.AFg1cSDK.EXCEPTION_MANAGER
            r8 = 4
            r9 = 0
            java.lang.String r6 = "skipping"
            r7 = 0
            com.appsflyer.internal.AFh1ySDK.v$default(r4, r5, r6, r7, r8, r9)
            return
        L8f:
            int r0 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper
            int r0 = r0 + 3
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1wSDK.copydefault = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L9f
            r0 = 18
            int r0 = r0 / 0
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1wSDK.copy():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0138 A[Catch: all -> 0x0022, PHI: r6
      0x0138: PHI (r6v9 java.lang.String) = (r6v8 java.lang.String), (r6v11 java.lang.String) binds: [B:67:0x0136, B:64:0x0131] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x001f, B:9:0x0027, B:11:0x003b, B:14:0x0063, B:16:0x0074, B:18:0x007b, B:20:0x008e, B:22:0x0092, B:24:0x00a4, B:26:0x00ac, B:28:0x00b0, B:30:0x00be, B:32:0x00c4, B:34:0x00d0, B:36:0x00d4, B:38:0x00da, B:40:0x00e5, B:45:0x00ef, B:47:0x00f8, B:49:0x00fc, B:51:0x0102, B:53:0x0108, B:55:0x010b, B:57:0x0111, B:59:0x0121, B:61:0x012c, B:68:0x0138, B:70:0x013e, B:72:0x014e, B:74:0x0152, B:76:0x015d, B:77:0x0162, B:86:0x0173, B:93:0x01f2, B:95:0x01f6, B:97:0x0206, B:98:0x020a, B:88:0x018b, B:90:0x01a5, B:91:0x01bd, B:83:0x016b, B:66:0x0134, B:80:0x0167, B:92:0x01d8, B:63:0x0130, B:78:0x0165, B:42:0x00ea), top: B:105:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void copydefault() {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1wSDK.copydefault():void");
    }

    private final synchronized void equals() {
        boolean zAFAdRevenueData;
        try {
            copydefault = (AFKeystoreWrapper + 119) % 128;
            AFh1aSDK aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
            if (aFh1aSDK != null) {
                if (aFh1aSDK.getMediationNetwork == -1) {
                    ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                } else if (((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L) == -1) {
                    AFKeystoreWrapper = (copydefault + 21) % 128;
                    getCurrencyIso4217Code(aFh1aSDK);
                }
                zAFAdRevenueData = AFAdRevenueData(aFh1aSDK);
            } else {
                zAFAdRevenueData = false;
            }
            AFd1xSDK.AFa1vSDK aFa1vSDK = this.component1;
            if (aFa1vSDK != null) {
                aFa1vSDK.onConfigurationChanged(zAFAdRevenueData);
                int i = AFKeystoreWrapper + 111;
                copydefault = i % 128;
                if (i % 2 == 0) {
                } else {
                    throw null;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFd1wSDK aFd1wSDK, Throwable th2, String str) {
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFh1aSDK aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{aFd1wSDK}, -2108652204, 2108652208, System.identityHashCode(aFd1wSDK));
        if (aFh1aSDK != null) {
            int i = copydefault + 99;
            AFKeystoreWrapper = i % 128;
            if (i % 2 != 0 ? !aFd1wSDK.AFAdRevenueData(aFh1aSDK) : aFd1wSDK.AFAdRevenueData(aFh1aSDK)) {
                AFKeystoreWrapper = (copydefault + 49) % 128;
            } else {
                AFKeystoreWrapper = (copydefault + 91) % 128;
                aFd1wSDK.getRevenue().AFAdRevenueData(th2, str);
            }
        }
    }

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i, int i10, int i11) {
        int i12 = ~((~i) | (~i10));
        int i13 = ~i11;
        int i14 = ((i | i10 | i11) * 220) + (((~(i13 | i10)) | i) * (-440)) + ((i12 | (~(i13 | i | i10))) * 220) + (i10 * (-219)) + (i * 221);
        return i14 != 1 ? i14 != 2 ? i14 != 3 ? i14 != 4 ? getMonetizationNetwork(objArr) : AFAdRevenueData(objArr) : getMediationNetwork(objArr) : getRevenue(objArr) : getCurrencyIso4217Code(objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFd1wSDK aFd1wSDK) {
        int i = copydefault + 13;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFd1wSDK, "");
            aFd1wSDK.copydefault();
        } else {
            Intrinsics.checkNotNullParameter(aFd1wSDK, "");
            aFd1wSDK.copydefault();
            throw null;
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        int i = copydefault + 25;
        AFKeystoreWrapper = i % 128;
        int i10 = i % 2;
        AFc1qSDK aFc1qSDK = (AFc1qSDK) aFd1wSDK.getMonetizationNetwork.getValue();
        if (i10 == 0) {
            int i11 = 60 / 0;
        }
        AFKeystoreWrapper = (copydefault + 51) % 128;
        return aFc1qSDK;
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] charArray;
        if (str != null) {
            $11 = ($10 + 51) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        char[] cArr2 = new char[cArr.length];
        aFk1qSDK.getRevenue = 0;
        char[] cArr3 = new char[2];
        while (true) {
            int i10 = aFk1qSDK.getRevenue;
            if (i10 >= cArr.length) {
                break;
            }
            cArr3[0] = cArr[i10];
            cArr3[1] = cArr[i10 + 1];
            int i11 = 58224;
            for (int i12 = 0; i12 < 16; i12++) {
                char c8 = cArr3[1];
                char c9 = cArr3[0];
                char c10 = (char) (c8 - (((c9 + i11) ^ ((c9 << 4) + ((char) (((long) toString) ^ (-1199070254561146252L))))) ^ ((c9 >>> 5) + ((char) (((long) copy) ^ (-1199070254561146252L))))));
                cArr3[1] = c10;
                cArr3[0] = (char) (c9 - (((c10 >>> 5) + ((char) (((long) hashCode) ^ (-1199070254561146252L)))) ^ ((c10 + i11) ^ ((c10 << 4) + ((char) (((long) equals) ^ (-1199070254561146252L)))))));
                i11 -= 40503;
            }
            int i13 = aFk1qSDK.getRevenue;
            cArr2[i13] = cArr3[0];
            cArr2[i13 + 1] = cArr3[1];
            aFk1qSDK.getRevenue = i13 + 2;
        }
        String str2 = new String(cArr2, 0, i);
        int i14 = $10 + 97;
        $11 = i14 % 128;
        if (i14 % 2 != 0) {
            objArr[0] = str2;
        } else {
            int i15 = 2 / 0;
            objArr[0] = str2;
        }
    }

    private final AFc1oSDK getMediationNetwork() {
        copydefault = (AFKeystoreWrapper + 9) % 128;
        AFc1oSDK aFc1oSDK = (AFc1oSDK) this.getMediationNetwork.getValue();
        copydefault = (AFKeystoreWrapper + 21) % 128;
        return aFc1oSDK;
    }

    public final AFc1cSDK getRevenue() {
        copydefault = (AFKeystoreWrapper + 93) % 128;
        AFc1cSDK aFc1cSDK = (AFc1cSDK) this.component3.getValue();
        int i = copydefault + 121;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            int i10 = 3 / 0;
        }
        return aFc1cSDK;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        Throwable th2 = (Throwable) objArr[1];
        String str = (String) objArr[2];
        AFKeystoreWrapper = (copydefault + 49) % 128;
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        aFd1wSDK.areAllFieldsValid().execute(new a1.c(aFd1wSDK, th2, str, 3));
        int i = copydefault + 41;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFd1wSDK aFd1wSDK) {
        int i = AFKeystoreWrapper + 61;
        copydefault = i % 128;
        if (i % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFd1wSDK, "");
            aFd1wSDK.equals();
            copydefault = (AFKeystoreWrapper + 99) % 128;
        } else {
            Intrinsics.checkNotNullParameter(aFd1wSDK, "");
            aFd1wSDK.equals();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1wSDK aFd1wSDK) {
        AFKeystoreWrapper = (copydefault + 83) % 128;
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        aFd1wSDK.copy();
        AFKeystoreWrapper = (copydefault + 45) % 128;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork(AFd1xSDK.AFa1vSDK aFa1vSDK) {
        int i = AFKeystoreWrapper + 31;
        copydefault = i % 128;
        if (i % 2 == 0) {
            this.component1 = aFa1vSDK;
            areAllFieldsValid().execute(new h(this, 0));
        } else {
            this.component1 = aFa1vSDK;
            areAllFieldsValid().execute(new h(this, 0));
            throw null;
        }
    }

    public static final /* synthetic */ AFd1zSDK getCurrencyIso4217Code(AFd1wSDK aFd1wSDK) {
        int i = copydefault + 101;
        AFKeystoreWrapper = i % 128;
        int i10 = i % 2;
        AFd1zSDK aFd1zSDK = aFd1wSDK.AFAdRevenueData;
        if (i10 != 0) {
            return aFd1zSDK;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void AFAdRevenueData() {
        int i = AFKeystoreWrapper + 97;
        copydefault = i % 128;
        if (i % 2 != 0) {
            areAllFieldsValid().execute(new h(this, 1));
            int i10 = 82 / 0;
        } else {
            areAllFieldsValid().execute(new h(this, 1));
        }
        copydefault = (AFKeystoreWrapper + 119) % 128;
    }

    private final AFf1kSDK getCurrencyIso4217Code() {
        copydefault = (AFKeystoreWrapper + 1) % 128;
        AFf1kSDK aFf1kSDK = (AFf1kSDK) this.getRevenue.getValue();
        int i = AFKeystoreWrapper + 1;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return aFf1kSDK;
        }
        throw null;
    }

    private final Map<String, String> getRevenue(AFh1aSDK aFh1aSDK) {
        Object[] objArr = new Object[1];
        a("炜桪ꪴ鐅⠖ᰫ", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, objArr);
        Map<String, String> mapG = j0.g(new Pair(((String) objArr[0]).intern(), Build.BRAND), new Pair("model", Build.MODEL), new Pair(CommonUrlParts.APP_ID, getMediationNetwork().getCurrencyIso4217Code.getMonetizationNetwork.getPackageName()), new Pair("p_ex", new AFa1uSDK().AFAdRevenueData()), new Pair("api", String.valueOf(Build.VERSION.SDK_INT)), new Pair("sdk", this.component4), new Pair("uid", AFb1kSDK.getCurrencyIso4217Code(getMediationNetwork().getMediationNetwork)), new Pair("exc_config", aFh1aSDK.AFAdRevenueData()));
        int i = AFKeystoreWrapper + 111;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return mapG;
        }
        throw null;
    }

    private final void getCurrencyIso4217Code(AFh1aSDK aFh1aSDK) {
        copydefault = (AFKeystoreWrapper + 97) % 128;
        int i = aFh1aSDK.getCurrencyIso4217Code;
        long millis = TimeUnit.DAYS.toMillis(aFh1aSDK.getMediationNetwork) + System.currentTimeMillis();
        AFc1qSDK aFc1qSDK = (AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this));
        aFc1qSDK.AFAdRevenueData("af_send_exc_to_server_window", millis);
        aFc1qSDK.getMediationNetwork("af_send_exc_min", i);
        int i10 = AFKeystoreWrapper + 17;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (r0 == (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
    
        if (r0 >= r7) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        r0 = ((com.appsflyer.internal.AFc1qSDK) getMediationNetwork(new java.lang.Object[]{r13}, 1891172040, -1891172038, java.lang.System.identityHashCode(r13))).getRevenue("af_send_exc_min", -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (r0 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        r1 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 31;
        com.appsflyer.internal.AFd1wSDK.copydefault = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if ((r1 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
    
        r2 = 95 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        if (getRevenue().getMediationNetwork() >= r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        if (getRevenue().getMediationNetwork() >= r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a9, code lost:
    
        return getMonetizationNetwork(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        r14 = com.appsflyer.internal.AFd1wSDK.copydefault + 63;
        com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b5, code lost:
    
        if ((r14 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
    
        if (r14.getMonetizationNetwork < java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r7)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005d, code lost:
    
        if (r14.getMonetizationNetwork < java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r7)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005f, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean getMediationNetwork(com.appsflyer.internal.AFh1aSDK r14) {
        /*
            r13 = this;
            int r0 = com.appsflyer.internal.AFd1wSDK.copydefault
            int r0 = r0 + 19
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper = r1
            int r0 = r0 % 2
            java.lang.String r1 = "af_send_exc_to_server_window"
            r2 = -1
            r4 = -1891172038(0xffffffff8f47013a, float:-9.811694E-30)
            r5 = 1891172040(0x70b8fec8, float:4.5802603E29)
            r6 = 0
            if (r0 != 0) goto L3d
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.Object[] r0 = new java.lang.Object[]{r13}
            int r9 = java.lang.System.identityHashCode(r13)
            java.lang.Object r0 = getMediationNetwork(r0, r5, r4, r9)
            com.appsflyer.internal.AFc1qSDK r0 = (com.appsflyer.internal.AFc1qSDK) r0
            long r0 = r0.getMonetizationNetwork(r1, r2)
            long r9 = r14.getMonetizationNetwork
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r11 = r11.toSeconds(r7)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r10 = 9
            int r10 = r10 / r6
            if (r9 >= 0) goto L60
            goto L5f
        L3d:
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.Object[] r0 = new java.lang.Object[]{r13}
            int r9 = java.lang.System.identityHashCode(r13)
            java.lang.Object r0 = getMediationNetwork(r0, r5, r4, r9)
            com.appsflyer.internal.AFc1qSDK r0 = (com.appsflyer.internal.AFc1qSDK) r0
            long r0 = r0.getMonetizationNetwork(r1, r2)
            long r9 = r14.getMonetizationNetwork
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r11 = r11.toSeconds(r7)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L60
        L5f:
            return r6
        L60:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto Lab
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L69
            goto Lab
        L69:
            java.lang.Object[] r0 = new java.lang.Object[]{r13}
            int r1 = java.lang.System.identityHashCode(r13)
            java.lang.Object r0 = getMediationNetwork(r0, r5, r4, r1)
            com.appsflyer.internal.AFc1qSDK r0 = (com.appsflyer.internal.AFc1qSDK) r0
            java.lang.String r1 = "af_send_exc_min"
            r2 = -1
            int r0 = r0.getRevenue(r1, r2)
            if (r0 == r2) goto Laa
            int r1 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper
            int r1 = r1 + 31
            int r2 = r1 % 128
            com.appsflyer.internal.AFd1wSDK.copydefault = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L9a
            com.appsflyer.internal.AFc1cSDK r1 = r13.getRevenue()
            int r1 = r1.getMediationNetwork()
            r2 = 95
            int r2 = r2 / r6
            if (r1 >= r0) goto La5
            goto Laa
        L9a:
            com.appsflyer.internal.AFc1cSDK r1 = r13.getRevenue()
            int r1 = r1.getMediationNetwork()
            if (r1 >= r0) goto La5
            goto Laa
        La5:
            boolean r14 = r13.getMonetizationNetwork(r14)
            return r14
        Laa:
            return r6
        Lab:
            int r14 = com.appsflyer.internal.AFd1wSDK.copydefault
            int r14 = r14 + 63
            int r0 = r14 % 128
            com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper = r0
            int r14 = r14 % 2
            if (r14 == 0) goto Lb8
            return r6
        Lb8:
            r14 = 0
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1wSDK.getMediationNetwork(com.appsflyer.internal.AFh1aSDK):boolean");
    }

    private final boolean AFAdRevenueData(AFh1aSDK aFh1aSDK) {
        AFKeystoreWrapper = (copydefault + 29) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long monetizationNetwork = ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L);
        if (aFh1aSDK.getMonetizationNetwork >= TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis) && monetizationNetwork != -1) {
            AFKeystoreWrapper = (copydefault + 123) % 128;
            if (monetizationNetwork >= jCurrentTimeMillis) {
                return getMonetizationNetwork(aFh1aSDK);
            }
        }
        return false;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        int i = AFKeystoreWrapper + 77;
        copydefault = i % 128;
        if (i % 2 != 0) {
            aFd1wSDK.areAllFieldsValid().execute(new h(aFd1wSDK, 2));
            int i10 = 69 / 0;
            return null;
        }
        aFd1wSDK.areAllFieldsValid().execute(new h(aFd1wSDK, 2));
        return null;
    }

    private static Map<String, Object> getMonetizationNetwork(Map<String, ? extends Object> map, List<AFc1aSDK> list) {
        AFKeystoreWrapper = (copydefault + 121) % 128;
        Map<String, Object> mapG = j0.g(new Pair("deviceInfo", map), new Pair("excs", AFd1qSDK.getMediationNetwork(list)));
        copydefault = (AFKeystoreWrapper + 15) % 128;
        return mapG;
    }

    private static Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        copydefault = (AFKeystoreWrapper + 61) % 128;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        aFd1wSDK.component3().getMonetizationNetwork(bytes, i0.c(new Pair("Authorization", AFj1dSDK.getMonetizationNetwork(str, str2))), 2000);
        int i = AFKeystoreWrapper + 69;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i10 = 36 / 0;
        }
        return null;
    }

    private final boolean getMonetizationNetwork(AFh1aSDK aFh1aSDK) {
        new AFd1pSDK();
        String str = this.component4;
        String str2 = aFh1aSDK.getRevenue;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean currencyIso4217Code = AFd1pSDK.getCurrencyIso4217Code(str, str2);
        int i = copydefault + 97;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            int i10 = 79 / 0;
        }
        return currencyIso4217Code;
    }

    private final void getMediationNetwork(String str, String str2) {
        getMediationNetwork(new Object[]{this, str, str2}, -1856843688, 1856843689, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork() {
        getMediationNetwork(new Object[]{this}, 452613973, -452613973, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork(Throwable th2, String str) {
        getMediationNetwork(new Object[]{this, th2, str}, -1045855402, 1045855405, System.identityHashCode(this));
    }
}

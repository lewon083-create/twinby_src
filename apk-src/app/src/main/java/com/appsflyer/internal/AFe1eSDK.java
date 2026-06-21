package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1vSDK;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.om1;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import kotlin.text.StringsKt;

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
@Metadata
public final class AFe1eSDK extends AFe1mSDK<AFh1rSDK> {
    public static final AFa1tSDK AFa1tSDK = new AFa1tSDK(null);
    private final ij.g areAllFieldsValid;
    private final AFc1oSDK component1;
    private final AFc1eSDK component2;
    private final AFh1rSDK component3;
    private final AFc1hSDK component4;
    private final ij.g copy;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1eSDK$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass1 extends r implements Function0<Boolean> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFe1eSDK.this.component1.getCurrencyIso4217Code("com.appsflyer.enable_instant_plays")));
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1eSDK$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass4 extends r implements Function0<Long> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            Long lO;
            String currencyIso4217Code = AFe1eSDK.this.component1.getCurrencyIso4217Code("com.appsflyer.fetch_ids.timeout");
            return Long.valueOf((currencyIso4217Code == null || (lO = StringsKt.O(currencyIso4217Code)) == null) ? 1000L : lO.longValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AFa1tSDK {
        private AFa1tSDK() {
        }

        public /* synthetic */ AFa1tSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AFa1uSDK {
        private String advertisingId;
        private boolean advertisingIdWithGps;
        private final StringBuilder gaidError;
        private Boolean isLimitAdTrackingEnabled;

        public AFa1uSDK() {
            this(null, null, false, null, 15, null);
        }

        public static /* synthetic */ AFa1uSDK copy$default(AFa1uSDK aFa1uSDK, String str, Boolean bool, boolean z5, StringBuilder sb2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aFa1uSDK.advertisingId;
            }
            if ((i & 2) != 0) {
                bool = aFa1uSDK.isLimitAdTrackingEnabled;
            }
            if ((i & 4) != 0) {
                z5 = aFa1uSDK.advertisingIdWithGps;
            }
            if ((i & 8) != 0) {
                sb2 = aFa1uSDK.gaidError;
            }
            return aFa1uSDK.copy(str, bool, z5, sb2);
        }

        public final String component1() {
            return this.advertisingId;
        }

        public final Boolean component2() {
            return this.isLimitAdTrackingEnabled;
        }

        public final boolean component3() {
            return this.advertisingIdWithGps;
        }

        public final StringBuilder component4() {
            return this.gaidError;
        }

        public final AFa1uSDK copy(String str, Boolean bool, boolean z5, StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            return new AFa1uSDK(str, bool, z5, gaidError);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1uSDK)) {
                return false;
            }
            AFa1uSDK aFa1uSDK = (AFa1uSDK) obj;
            return Intrinsics.a(this.advertisingId, aFa1uSDK.advertisingId) && Intrinsics.a(this.isLimitAdTrackingEnabled, aFa1uSDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1uSDK.advertisingIdWithGps && Intrinsics.a(this.gaidError, aFa1uSDK.gaidError);
        }

        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v9 */
        public final int hashCode() {
            String str = this.advertisingId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z5 = this.advertisingIdWithGps;
            ?? r12 = z5;
            if (z5) {
                r12 = 1;
            }
            return this.gaidError.hashCode() + ((iHashCode2 + r12) * 31);
        }

        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final void setAdvertisingId(String str) {
            this.advertisingId = str;
        }

        public final void setAdvertisingIdWithGps(boolean z5) {
            this.advertisingIdWithGps = z5;
        }

        public final void setLimitAdTrackingEnabled(Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        public final String toString() {
            return "FetchGaidData(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ")";
        }

        public AFa1uSDK(String str, Boolean bool, boolean z5, StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z5;
            this.gaidError = gaidError;
        }

        public /* synthetic */ AFa1uSDK(String str, Boolean bool, boolean z5, StringBuilder sb2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? false : z5, (i & 8) != 0 ? new StringBuilder() : sb2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AFa1ySDK implements CloudDevCallback {
        final /* synthetic */ AFa1uSDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        public AFa1ySDK(AFa1uSDK aFa1uSDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1uSDK;
            this.$latch = countDownLatch;
        }

        public final void onError(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFh1ySDK.w$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, om1.k("Could not fetch GAID using CloudDevSdk: ", reason), false, 4, null);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1eSDK(AFd1zSDK aFd1zSDK) {
        super(AFe1pSDK.FETCH_ADVERTISING_ID, new AFe1pSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        AFc1hSDK aFc1hSDKAFInAppEventParameterName = aFd1zSDK.AFInAppEventParameterName();
        Intrinsics.checkNotNullExpressionValue(aFc1hSDKAFInAppEventParameterName, "");
        this.component4 = aFc1hSDKAFInAppEventParameterName;
        AFc1oSDK aFc1oSDKAFAdRevenueData = aFd1zSDK.AFAdRevenueData();
        Intrinsics.checkNotNullExpressionValue(aFc1oSDKAFAdRevenueData, "");
        this.component1 = aFc1oSDKAFAdRevenueData;
        AFc1eSDK aFc1eSDKForce = aFd1zSDK.force();
        Intrinsics.checkNotNullExpressionValue(aFc1eSDKForce, "");
        this.component2 = aFc1eSDKForce;
        this.component3 = new AFh1rSDK(null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
        this.areAllFieldsValid = ij.h.b(new AnonymousClass4());
        this.copy = ij.h.b(new AnonymousClass1());
    }

    private static boolean component2() {
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th2) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, th2 instanceof ClassNotFoundException ? "CloudDevSdk not found" : om1.k("Unexpected exception while checking if running in cloud environment: ", th2.getMessage()), th2, true, false, false, false, 112, null);
            return false;
        }
    }

    private final boolean component3() {
        return ((Boolean) this.copy.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[LOOP:0: B:3:0x0005->B:15:0x0045, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[EDGE_INSN: B:19:0x0048->B:16:0x0048 BREAK  A[LOOP:0: B:3:0x0005->B:15:0x0045], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean copydefault() {
        /*
            r17 = this;
            r0 = r17
            r1 = 2
            r2 = 0
            r3 = r2
        L5:
            if (r1 <= 0) goto L48
            boolean r3 = r0.component3()
            r4 = 1
            if (r3 == 0) goto L22
            boolean r3 = r0.getMonetizationNetwork(r1)
            if (r3 == 0) goto L22
            com.appsflyer.AFLogger r5 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r6 = com.appsflyer.internal.AFg1cSDK.ADVERTISING_ID
            r9 = 4
            r10 = 0
            java.lang.String r7 = "GAID fetched using Samsung Cloud dev SDK"
            r8 = 0
            com.appsflyer.internal.AFh1ySDK.v$default(r5, r6, r7, r8, r9, r10)
        L20:
            r3 = r4
            goto L43
        L22:
            boolean r3 = r0.getCurrencyIso4217Code(r1)
            if (r3 == 0) goto L35
            com.appsflyer.AFLogger r5 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r6 = com.appsflyer.internal.AFg1cSDK.ADVERTISING_ID
            r9 = 4
            r10 = 0
            java.lang.String r7 = "GAID fetched using GMS"
            r8 = 0
            com.appsflyer.internal.AFh1ySDK.v$default(r5, r6, r7, r8, r9, r10)
            goto L20
        L35:
            com.appsflyer.AFLogger r11 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r12 = com.appsflyer.internal.AFg1cSDK.ADVERTISING_ID
            r15 = 4
            r16 = 0
            java.lang.String r13 = "Failed to fetch GAID"
            r14 = 0
            com.appsflyer.internal.AFh1ySDK.v$default(r11, r12, r13, r14, r15, r16)
            r3 = r2
        L43:
            if (r3 != 0) goto L48
            int r1 = r1 + (-1)
            goto L5
        L48:
            com.appsflyer.internal.AFc1eSDK r1 = r0.component2
            com.appsflyer.internal.AFh1rSDK r2 = r0.component3
            r1.component3 = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1eSDK.copydefault():boolean");
    }

    private final boolean getMediationNetwork(int i) {
        String str;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Trying to fetch GAID using Samsung Cloud Dev...", false, 4, null);
        if (component2()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.component4.getMonetizationNetwork;
            Intrinsics.b(context);
            if (cloudDevSdk.isCloudEnvironment(context)) {
                AFa1uSDK aFa1uSDK = new AFa1uSDK(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.component4.getMonetizationNetwork;
                    Intrinsics.b(context2);
                    cloudDevSdk2.request(context2, kotlin.collections.r.c("gaid"), new AFa1ySDK(aFa1uSDK, countDownLatch));
                    countDownLatch.await(((Number) this.areAllFieldsValid.getValue()).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            str = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                        } else if (th2 instanceof ClassNotFoundException) {
                            str = "CloudDevSdk not found";
                        } else {
                            str = "Unexpected exception while fetching GAID using Samsung Cloud Dev " + th2.getMessage();
                        }
                        AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, str, th2, true, false, false, false, 112, null);
                        StringBuilder gaidError = aFa1uSDK.getGaidError();
                        gaidError.append(th2.getClass().getSimpleName());
                        gaidError.append(" |");
                        if (aFa1uSDK.getGaidError().length() > 0) {
                        }
                    } catch (Throwable th3) {
                        if (aFa1uSDK.getGaidError().length() > 0) {
                            getRevenue(this.component3, aFa1uSDK.getGaidError().toString());
                        }
                        throw th3;
                    }
                }
                if (aFa1uSDK.getGaidError().length() > 0) {
                    getRevenue(this.component3, aFa1uSDK.getGaidError().toString());
                }
                String advertisingId = aFa1uSDK.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    return false;
                }
                AFh1rSDK aFh1rSDK = this.component3;
                aFh1rSDK.getCurrencyIso4217Code = aFa1uSDK.getAdvertisingId();
                Boolean bool = Boolean.FALSE;
                aFh1rSDK.getRevenue = bool;
                Boolean bool2 = Boolean.TRUE;
                aFh1rSDK.AFAdRevenueData = bool2;
                aFh1rSDK.getMediationNetwork = bool;
                aFh1rSDK.getMonetizationNetwork = bool2;
                aFh1rSDK.component2 = Boolean.valueOf(i != 2);
                return true;
            }
        }
        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
        return false;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return ((Number) this.areAllFieldsValid.getValue()).longValue();
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final AFe1uSDK getRevenue() {
        if (this.component2.AFAdRevenueData()) {
            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFe1uSDK.FAILURE;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Boolean boolValueOf = Boolean.valueOf(copydefault());
        Boolean bool = Boolean.FALSE;
        AFe1uSDK aFe1uSDK = s.f(boolValueOf, bool, bool).contains(Boolean.TRUE) ? AFe1uSDK.SUCCESS : AFe1uSDK.FAILURE;
        AFc1eSDK aFc1eSDK = this.component2;
        AFd1aSDK aFd1aSDK = new AFd1aSDK(System.currentTimeMillis() - jCurrentTimeMillis);
        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: FetchAdvertisingIdTask: took " + aFd1aSDK.getMediationNetwork + "ms", false, 4, null);
        aFc1eSDK.getMediationNetwork(aFd1aSDK);
        return aFe1uSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean getCurrencyIso4217Code(int r14) {
        /*
            r13 = this;
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r1 = com.appsflyer.internal.AFg1cSDK.ADVERTISING_ID
            r4 = 4
            r5 = 0
            java.lang.String r2 = "Trying to fetch GAID..."
            r3 = 0
            com.appsflyer.internal.AFh1ySDK.i$default(r0, r1, r2, r3, r4, r5)
            com.appsflyer.internal.AFe1eSDK$AFa1uSDK r6 = new com.appsflyer.internal.AFe1eSDK$AFa1uSDK
            r11 = 15
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            com.appsflyer.internal.AFc1hSDK r0 = r13.component4
            android.content.Context r0 = r0.getMonetizationNetwork
            kotlin.jvm.internal.Intrinsics.b(r0)
            int r0 = getRevenue(r0)
            com.appsflyer.internal.AFc1hSDK r1 = r13.component4
            android.content.Context r1 = r1.getMonetizationNetwork
            kotlin.jvm.internal.Intrinsics.b(r1)
            boolean r1 = r13.getCurrencyIso4217Code(r1, r6)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L83
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r4 = "enableGpsFallback"
            boolean r1 = r1.getBoolean(r4, r3)
            if (r1 == 0) goto L4d
            com.appsflyer.internal.AFc1hSDK r1 = r13.component4
            android.content.Context r1 = r1.getMonetizationNetwork
            kotlin.jvm.internal.Intrinsics.b(r1)
            boolean r1 = r13.getRevenue(r1, r6)
            if (r1 == 0) goto L4d
            r1 = r3
            goto L4e
        L4d:
            r1 = r2
        L4e:
            java.lang.StringBuilder r4 = r6.getGaidError()
            java.lang.String r4 = r4.toString()
            if (r4 == 0) goto L7b
            boolean r5 = kotlin.text.StringsKt.D(r4)
            if (r5 == 0) goto L5f
            goto L7b
        L5f:
            java.lang.CharSequence r4 = kotlin.text.StringsKt.P(r4)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = ": "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
        L7b:
            com.appsflyer.internal.AFh1rSDK r0 = r13.component3
            getRevenue(r0, r4)
            if (r1 != 0) goto L83
            return r2
        L83:
            com.appsflyer.internal.AFh1rSDK r0 = r13.component3
            java.lang.String r1 = r6.getAdvertisingId()
            r0.getCurrencyIso4217Code = r1
            java.lang.Boolean r1 = r6.isLimitAdTrackingEnabled()
            r0.getRevenue = r1
            java.lang.Boolean r1 = r6.isLimitAdTrackingEnabled()
            if (r1 == 0) goto La1
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ r3
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto La2
        La1:
            r1 = 0
        La2:
            r0.AFAdRevenueData = r1
            boolean r1 = r6.getAdvertisingIdWithGps()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.getMediationNetwork = r1
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.getMonetizationNetwork = r1
            r1 = 2
            if (r14 == r1) goto Lb6
            r2 = r3
        Lb6:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r2)
            r0.component2 = r14
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1eSDK.getCurrencyIso4217Code(int):boolean");
    }

    private final boolean getMonetizationNetwork(int i) {
        return getMediationNetwork(i);
    }

    private static int getRevenue(Context context) {
        try {
            return ma.f.f28773d.c(context, ma.g.f28774a);
        } catch (Throwable th2) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th2, false, false, false, false, 96, null);
            return -1;
        }
    }

    private final boolean getRevenue(Context context, AFa1uSDK aFa1uSDK) {
        try {
            AFb1vSDK.AFa1ySDK aFa1ySDKAFAdRevenueData = AFb1vSDK.AFAdRevenueData(context);
            aFa1uSDK.setAdvertisingId(aFa1ySDKAFAdRevenueData.getCurrencyIso4217Code);
            aFa1uSDK.setLimitAdTrackingEnabled(Boolean.valueOf(aFa1ySDKAFAdRevenueData.AFAdRevenueData()));
            String advertisingId = aFa1uSDK.getAdvertisingId();
            if (advertisingId == null || advertisingId.length() == 0) {
                aFa1uSDK.getGaidError().append("emptyOrNull (bypass) |");
            }
            if (Unit.f27471a != null) {
                return true;
            }
            aFa1uSDK.getGaidError().append("gpsAdInfo-null (bypass) |");
            throw new IllegalStateException("GpsAdInfo is null (bypass)");
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            AFh1ySDK.e$default(aFLogger, aFg1cSDK, om1.k("Failed to fetch GAID: ", th2.getMessage()), th2, true, false, false, false, 64, null);
            StringBuilder gaidError = aFa1uSDK.getGaidError();
            gaidError.append(th2.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th2.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th2.toString();
            }
            AFh1ySDK.i$default(aFLogger, aFg1cSDK, localizedMessage, false, 4, null);
            return false;
        }
    }

    private final boolean getCurrencyIso4217Code(Context context, AFa1uSDK aFa1uSDK) {
        Unit unit;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                aFa1uSDK.setAdvertisingId(advertisingIdInfo.getId());
                aFa1uSDK.setLimitAdTrackingEnabled(Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                aFa1uSDK.setAdvertisingIdWithGps(true);
                String advertisingId = aFa1uSDK.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    aFa1uSDK.getGaidError().append("emptyOrNull |");
                }
                unit = Unit.f27471a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return true;
            }
            aFa1uSDK.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            AFh1ySDK.e$default(aFLogger, aFg1cSDK, om1.k("Google Play Services is missing ", th2.getMessage()), th2, false, false, false, false, 88, null);
            StringBuilder gaidError = aFa1uSDK.getGaidError();
            gaidError.append(th2.getClass().getSimpleName());
            gaidError.append(" |");
            AFh1ySDK.i$default(aFLogger, aFg1cSDK, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }

    private static void getRevenue(AFh1rSDK aFh1rSDK, String str) {
        String strK;
        if (str == null) {
            return;
        }
        String str2 = aFh1rSDK.component3;
        if (str2 != null && (strK = gf.a.k(str2, " | ", str)) != null) {
            str = strK;
        }
        aFh1rSDK.component3 = str;
    }
}

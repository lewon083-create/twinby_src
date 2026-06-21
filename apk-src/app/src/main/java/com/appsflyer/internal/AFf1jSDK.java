package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.google.android.gms.internal.measurement.h5;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;

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
public final class AFf1jSDK {
    public static final AFa1vSDK AFa1vSDK = new AFa1vSDK(null);
    private static final long getMonetizationNetwork = TimeUnit.HOURS.toSeconds(24);
    private final AFc1oSDK AFAdRevenueData;
    private final ij.g getCurrencyIso4217Code;
    private final ij.g getMediationNetwork;
    private final AFf1hSDK getRevenue;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1jSDK$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass4 extends r implements Function0<Boolean> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1jSDK.this.AFAdRevenueData.getCurrencyIso4217Code("com.appsflyer.rc.sandbox")));
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1jSDK$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass5 extends r implements Function0<Boolean> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1jSDK.this.AFAdRevenueData.getCurrencyIso4217Code("com.appsflyer.rc.staging")));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AFa1vSDK {
        private AFa1vSDK() {
        }

        public /* synthetic */ AFa1vSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AFf1jSDK(AFc1oSDK aFc1oSDK, AFf1hSDK aFf1hSDK) {
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFf1hSDK, "");
        this.AFAdRevenueData = aFc1oSDK;
        this.getRevenue = aFf1hSDK;
        this.getMediationNetwork = ij.h.b(new AnonymousClass4());
        this.getCurrencyIso4217Code = ij.h.b(new AnonymousClass5());
    }

    public final boolean AFAdRevenueData() {
        AFi1xSDK aFi1xSDK;
        AFi1vSDK aFi1vSDK = this.getRevenue.getCurrencyIso4217Code;
        if (aFi1vSDK == null) {
            AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFi1zSDK aFi1zSDK = aFi1vSDK.getMonetizationNetwork;
        boolean zAFAdRevenueData = (aFi1zSDK == null || (aFi1xSDK = aFi1zSDK.getMediationNetwork) == null) ? false : aFi1xSDK.AFAdRevenueData();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AFf1hSDK aFf1hSDK = this.getRevenue;
        return zAFAdRevenueData || jCurrentTimeMillis - aFf1hSDK.getRevenue > TimeUnit.SECONDS.toMillis(aFf1hSDK.getMonetizationNetwork);
    }

    public final long getCurrencyIso4217Code() {
        Object objS;
        String currencyIso4217Code = this.AFAdRevenueData.getCurrencyIso4217Code("com.appsflyer.rc.cache.max-age-fallback");
        if (currencyIso4217Code == null) {
            return getMonetizationNetwork;
        }
        try {
            ij.k kVar = ij.m.f21341c;
            objS = Long.valueOf(Long.parseLong(currencyIso4217Code));
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = h5.s(th2);
        }
        Throwable thA = ij.m.a(objS);
        if (thA != null) {
            AFLogger.afErrorLog("Can't read maxAgeFallback from Manifest: " + thA.getMessage(), thA);
            objS = Long.valueOf(getMonetizationNetwork);
        }
        return ((Number) objS).longValue();
    }

    public final boolean getMediationNetwork() {
        return ((Boolean) this.getCurrencyIso4217Code.getValue()).booleanValue();
    }

    public final boolean getMonetizationNetwork() {
        return ((Boolean) this.getMediationNetwork.getValue()).booleanValue();
    }
}

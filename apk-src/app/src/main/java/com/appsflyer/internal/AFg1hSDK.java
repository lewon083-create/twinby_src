package com.appsflyer.internal;

import android.util.Log;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

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
public final class AFg1hSDK extends AFh1ySDK {
    public static final AFa1zSDK AFa1zSDK = new AFa1zSDK(null);

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFLogger.LogLevel.values().length];
            try {
                iArr[AFLogger.LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFLogger.LogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFLogger.LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AFLogger.LogLevel.VERBOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AFLogger.LogLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AFLogger.LogLevel.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            getRevenue = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AFa1zSDK {
        private AFa1zSDK() {
        }

        public /* synthetic */ AFa1zSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static boolean getMediationNetwork(AFLogger.LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    private final void getRevenue(AFLogger.LogLevel logLevel, AFg1cSDK aFg1cSDK, String str, Throwable th2) {
        if (getMediationNetwork(logLevel)) {
            String mediationNetwork = getMediationNetwork(str, aFg1cSDK);
            int i = AFa1vSDK.getRevenue[logLevel.ordinal()];
            if (i == 1) {
                Log.d("AppsFlyer_6.17.6", mediationNetwork);
                return;
            }
            if (i == 2) {
                Log.i("AppsFlyer_6.17.6", mediationNetwork);
                return;
            }
            if (i == 3) {
                Log.w("AppsFlyer_6.17.6", mediationNetwork);
            } else if (i == 4) {
                Log.v("AppsFlyer_6.17.6", mediationNetwork);
            } else {
                if (i != 5) {
                    return;
                }
                Log.e("AppsFlyer_6.17.6", mediationNetwork, th2);
            }
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void d(AFg1cSDK aFg1cSDK, String str, boolean z5) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        getRevenue(AFLogger.LogLevel.DEBUG, aFg1cSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th2, boolean z5, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        if (z10) {
            getRevenue(AFLogger.LogLevel.ERROR, aFg1cSDK, str, th2);
        } else if (z5) {
            getRevenue(AFLogger.LogLevel.DEBUG, aFg1cSDK, str, null);
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void force(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (AppsFlyerProperties.getInstance().isLogsDisabledCompletely()) {
            return;
        }
        Log.d("AppsFlyer_6.17.6", withTag$SDK_prodRelease(str, aFg1cSDK));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final boolean getShouldExtendMsg() {
        return AFLogger.LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void i(AFg1cSDK aFg1cSDK, String str, boolean z5) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        getRevenue(AFLogger.LogLevel.INFO, aFg1cSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void v(AFg1cSDK aFg1cSDK, String str, boolean z5) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        getRevenue(AFLogger.LogLevel.VERBOSE, aFg1cSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void w(AFg1cSDK aFg1cSDK, String str, boolean z5) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        getRevenue(AFLogger.LogLevel.WARNING, aFg1cSDK, str, null);
    }
}

package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.google.android.gms.internal.ads.om1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
public final class AFc1pSDK implements AFc1qSDK {
    private final ij.g getMediationNetwork;
    private final AFc1gSDK<SharedPreferences> getMonetizationNetwork;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFc1pSDK$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass4 extends r implements Function0<SharedPreferences> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: m_, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return (SharedPreferences) AFc1pSDK.this.getMonetizationNetwork.getMonetizationNetwork.invoke();
        }
    }

    public AFc1pSDK(AFc1gSDK<SharedPreferences> aFc1gSDK) {
        Intrinsics.checkNotNullParameter(aFc1gSDK, "");
        this.getMonetizationNetwork = aFc1gSDK;
        this.getMediationNetwork = ij.h.b(new AnonymousClass4());
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void AFAdRevenueData(String str, boolean z5) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putBoolean(str, z5).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final String getMonetizationNetwork(String str, String str2) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getString(str, str2);
        } catch (ClassCastException e3) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, om1.k("Unexpected data type found for key ", str), e3, false, false, false, false, 120, null);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getRevenue(String str, String str2) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final boolean getMediationNetwork(String str, boolean z5) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getBoolean(str, z5);
        } catch (ClassCastException e3) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, om1.k("Unexpected data type found for key ", str), e3, false, false, false, false, 120, null);
            return z5;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void AFAdRevenueData(String str, long j10) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putLong(str, j10).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final int getRevenue(String str, int i) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getInt(str, i);
        } catch (ClassCastException e3) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, om1.k("Unexpected data type found for key ", str), e3, false, false, false, false, 120, null);
            return i;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void AFAdRevenueData(String str) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final long getMonetizationNetwork(String str, long j10) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getLong(str, j10);
        } catch (ClassCastException e3) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, om1.k("Unexpected data type found for key ", str), e3, false, false, false, false, 120, null);
            return j10;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getMediationNetwork(String str, int i) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putInt(str, i).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final boolean getMonetizationNetwork(String str) {
        return ((SharedPreferences) this.getMediationNetwork.getValue()).contains(str);
    }
}

package com.appsflyer.internal;

import java.util.LinkedHashMap;
import java.util.Map;
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
public final class AFa1jSDK {
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);
    final AFa1lSDK AFAdRevenueData;
    final Map<String, Object> getMonetizationNetwork;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        public static AFa1jSDK AFAdRevenueData(AFh1mSDK aFh1mSDK) {
            Intrinsics.checkNotNullParameter(aFh1mSDK, "");
            Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
            Intrinsics.checkNotNullExpressionValue(map, "");
            return new AFa1jSDK(map, null, 2, 0 == true ? 1 : 0);
        }

        public static AFa1jSDK getRevenue(AFa1lSDK aFa1lSDK) {
            Intrinsics.checkNotNullParameter(aFa1lSDK, "");
            return new AFa1jSDK(new LinkedHashMap(), aFa1lSDK, null);
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AFa1jSDK(Map<String, Object> map, AFa1lSDK aFa1lSDK) {
        this.getMonetizationNetwork = map;
        this.AFAdRevenueData = aFa1lSDK;
    }

    public static final AFa1jSDK getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
        return AFa1ySDK.AFAdRevenueData(aFh1mSDK);
    }

    public static final AFa1jSDK getMediationNetwork(AFa1lSDK aFa1lSDK) {
        return AFa1ySDK.getRevenue(aFa1lSDK);
    }

    public final boolean getMonetizationNetwork(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.getMonetizationNetwork.containsKey(str);
    }

    public final void getRevenue(String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getMonetizationNetwork.put(str, obj);
        AFa1lSDK aFa1lSDK = this.AFAdRevenueData;
        if (aFa1lSDK != null) {
            aFa1lSDK.getMonetizationNetwork(this.getMonetizationNetwork);
        }
    }

    public /* synthetic */ AFa1jSDK(Map map, AFa1lSDK aFa1lSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? null : aFa1lSDK);
    }

    public /* synthetic */ AFa1jSDK(Map map, AFa1lSDK aFa1lSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFa1lSDK);
    }
}

package com.appsflyer.internal;

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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFd1kSDK extends AFc1dSDK {
    private final AFd1jSDK component4;
    private final boolean getCurrencyIso4217Code;
    public AFc1oSDK getMediationNetwork;

    public /* synthetic */ AFd1kSDK(AFc1oSDK aFc1oSDK, byte[] bArr, Map map, int i, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1oSDK, bArr, (i10 & 4) != 0 ? null : map, (i10 & 8) != 0 ? 2000 : i);
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final String AFAdRevenueData(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[RD]: " + str;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final String getCurrencyIso4217Code() {
        AFj1cSDK aFj1cSDK = new AFj1cSDK(this.getMediationNetwork, null, 2, null);
        return aFj1cSDK.getMediationNetwork(aFj1cSDK.getRevenue.getMediationNetwork(AFj1cSDK.component3));
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFd1jSDK getMediationNetwork() {
        return this.component4;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final boolean getRevenue() {
        return this.getCurrencyIso4217Code;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFd1kSDK(AFc1oSDK aFc1oSDK, byte[] bArr, Map<String, String> map, int i) {
        super(bArr, map, i);
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getMediationNetwork = aFc1oSDK;
        this.component4 = AFd1jSDK.OCTET_STREAM;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFd1kSDK(AFc1oSDK aFc1oSDK, byte[] bArr) {
        this(aFc1oSDK, bArr, null, 0, 12, null);
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
    }
}

package com.appsflyer.internal;

import a0.u;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l7.o;

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
public final class AFi1xSDK {
    public List<String> AFAdRevenueData;
    public final String component4;
    public final String getCurrencyIso4217Code;
    public final float getMediationNetwork;
    public final int getMonetizationNetwork;
    public long getRevenue;

    public AFi1xSDK(long j10, float f10, List<String> list, int i, String str, String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.getRevenue = j10;
        this.getMediationNetwork = f10;
        this.AFAdRevenueData = list;
        this.getMonetizationNetwork = i;
        this.getCurrencyIso4217Code = str;
        this.component4 = str2;
    }

    public final boolean AFAdRevenueData() {
        return TimeUnit.SECONDS.toMillis(this.getRevenue) > AFa1ySDK.getRevenue().getMonetizationNetwork().component3().getCurrencyIso4217Code();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AFi1xSDK.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "");
        AFi1xSDK aFi1xSDK = (AFi1xSDK) obj;
        return this.getRevenue == aFi1xSDK.getRevenue && this.getMediationNetwork == aFi1xSDK.getMediationNetwork && Intrinsics.a(this.AFAdRevenueData, aFi1xSDK.AFAdRevenueData) && this.getMonetizationNetwork == aFi1xSDK.getMonetizationNetwork && Intrinsics.a(this.getCurrencyIso4217Code, aFi1xSDK.getCurrencyIso4217Code) && Intrinsics.a(this.component4, aFi1xSDK.component4);
    }

    public final int hashCode() {
        return this.component4.hashCode() + ((this.getCurrencyIso4217Code.hashCode() + ((u.i(this.AFAdRevenueData, o.b(this.getMediationNetwork, Long.hashCode(this.getRevenue) * 31, 31), 31) + this.getMonetizationNetwork) * 31)) * 31);
    }
}

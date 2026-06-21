package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t.z;

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
public final class AFe1xSDK {
    public final AFe1tSDK getCurrencyIso4217Code;
    public final String getMonetizationNetwork;
    public final String getRevenue;

    public AFe1xSDK(String str, String str2, AFe1tSDK aFe1tSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFe1tSDK, "");
        this.getMonetizationNetwork = str;
        this.getRevenue = str2;
        this.getCurrencyIso4217Code = aFe1tSDK;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1xSDK)) {
            return false;
        }
        AFe1xSDK aFe1xSDK = (AFe1xSDK) obj;
        return Intrinsics.a(this.getMonetizationNetwork, aFe1xSDK.getMonetizationNetwork) && Intrinsics.a(this.getRevenue, aFe1xSDK.getRevenue) && this.getCurrencyIso4217Code == aFe1xSDK.getCurrencyIso4217Code;
    }

    public final int hashCode() {
        int iHashCode = this.getMonetizationNetwork.hashCode() * 31;
        String str = this.getRevenue;
        return this.getCurrencyIso4217Code.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.getMonetizationNetwork;
        String str2 = this.getRevenue;
        AFe1tSDK aFe1tSDK = this.getCurrencyIso4217Code;
        StringBuilder sbJ = z.j("HostMeta(name=", str, ", prefix=", str2, ", method=");
        sbJ.append(aFe1tSDK);
        sbJ.append(")");
        return sbJ.toString();
    }
}

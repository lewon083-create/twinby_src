package io.appmetrica.analytics.coreapi.internal.model;

import a0.u;
import gf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class SdkInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21737c;

    public SdkInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.f21735a = str;
        this.f21736b = str2;
        this.f21737c = str3;
    }

    public static /* synthetic */ SdkInfo copy$default(SdkInfo sdkInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sdkInfo.f21735a;
        }
        if ((i & 2) != 0) {
            str2 = sdkInfo.f21736b;
        }
        if ((i & 4) != 0) {
            str3 = sdkInfo.f21737c;
        }
        return sdkInfo.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.f21735a;
    }

    @NotNull
    public final String component2() {
        return this.f21736b;
    }

    @NotNull
    public final String component3() {
        return this.f21737c;
    }

    @NotNull
    public final SdkInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return new SdkInfo(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkInfo)) {
            return false;
        }
        SdkInfo sdkInfo = (SdkInfo) obj;
        return Intrinsics.a(this.f21735a, sdkInfo.f21735a) && Intrinsics.a(this.f21736b, sdkInfo.f21736b) && Intrinsics.a(this.f21737c, sdkInfo.f21737c);
    }

    @NotNull
    public final String getSdkBuildNumber() {
        return this.f21736b;
    }

    @NotNull
    public final String getSdkBuildType() {
        return this.f21737c;
    }

    @NotNull
    public final String getSdkVersionName() {
        return this.f21735a;
    }

    public int hashCode() {
        return this.f21737c.hashCode() + a.e(this.f21735a.hashCode() * 31, 31, this.f21736b);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SdkInfo(sdkVersionName=");
        sb2.append(this.f21735a);
        sb2.append(", sdkBuildNumber=");
        sb2.append(this.f21736b);
        sb2.append(", sdkBuildType=");
        return u.n(sb2, this.f21737c, ')');
    }
}

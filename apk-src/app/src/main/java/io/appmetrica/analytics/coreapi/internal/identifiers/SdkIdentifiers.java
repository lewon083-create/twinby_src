package io.appmetrica.analytics.coreapi.internal.identifiers;

import a0.u;
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
public final class SdkIdentifiers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21721c;

    public SdkIdentifiers(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f21719a = str;
        this.f21720b = str2;
        this.f21721c = str3;
    }

    public static /* synthetic */ SdkIdentifiers copy$default(SdkIdentifiers sdkIdentifiers, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sdkIdentifiers.f21719a;
        }
        if ((i & 2) != 0) {
            str2 = sdkIdentifiers.f21720b;
        }
        if ((i & 4) != 0) {
            str3 = sdkIdentifiers.f21721c;
        }
        return sdkIdentifiers.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.f21719a;
    }

    @Nullable
    public final String component2() {
        return this.f21720b;
    }

    @Nullable
    public final String component3() {
        return this.f21721c;
    }

    @NotNull
    public final SdkIdentifiers copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new SdkIdentifiers(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkIdentifiers)) {
            return false;
        }
        SdkIdentifiers sdkIdentifiers = (SdkIdentifiers) obj;
        return Intrinsics.a(this.f21719a, sdkIdentifiers.f21719a) && Intrinsics.a(this.f21720b, sdkIdentifiers.f21720b) && Intrinsics.a(this.f21721c, sdkIdentifiers.f21721c);
    }

    @Nullable
    public final String getDeviceId() {
        return this.f21720b;
    }

    @Nullable
    public final String getDeviceIdHash() {
        return this.f21721c;
    }

    @Nullable
    public final String getUuid() {
        return this.f21719a;
    }

    public int hashCode() {
        String str = this.f21719a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21720b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21721c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SdkIdentifiers(uuid=");
        sb2.append(this.f21719a);
        sb2.append(", deviceId=");
        sb2.append(this.f21720b);
        sb2.append(", deviceIdHash=");
        return u.n(sb2, this.f21721c, ')');
    }
}

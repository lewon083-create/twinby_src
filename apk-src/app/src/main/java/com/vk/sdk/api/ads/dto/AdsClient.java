package com.vk.sdk.api.ads.dto;

import a0.u;
import gf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class AdsClient {

    @b("all_limit")
    @NotNull
    private final String allLimit;

    @b("day_limit")
    @NotNull
    private final String dayLimit;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15113id;

    @b("name")
    @NotNull
    private final String name;

    public AdsClient(@NotNull String allLimit, @NotNull String dayLimit, int i, @NotNull String name) {
        Intrinsics.checkNotNullParameter(allLimit, "allLimit");
        Intrinsics.checkNotNullParameter(dayLimit, "dayLimit");
        Intrinsics.checkNotNullParameter(name, "name");
        this.allLimit = allLimit;
        this.dayLimit = dayLimit;
        this.f15113id = i;
        this.name = name;
    }

    public static /* synthetic */ AdsClient copy$default(AdsClient adsClient, String str, String str2, int i, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = adsClient.allLimit;
        }
        if ((i10 & 2) != 0) {
            str2 = adsClient.dayLimit;
        }
        if ((i10 & 4) != 0) {
            i = adsClient.f15113id;
        }
        if ((i10 & 8) != 0) {
            str3 = adsClient.name;
        }
        return adsClient.copy(str, str2, i, str3);
    }

    @NotNull
    public final String component1() {
        return this.allLimit;
    }

    @NotNull
    public final String component2() {
        return this.dayLimit;
    }

    public final int component3() {
        return this.f15113id;
    }

    @NotNull
    public final String component4() {
        return this.name;
    }

    @NotNull
    public final AdsClient copy(@NotNull String allLimit, @NotNull String dayLimit, int i, @NotNull String name) {
        Intrinsics.checkNotNullParameter(allLimit, "allLimit");
        Intrinsics.checkNotNullParameter(dayLimit, "dayLimit");
        Intrinsics.checkNotNullParameter(name, "name");
        return new AdsClient(allLimit, dayLimit, i, name);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsClient)) {
            return false;
        }
        AdsClient adsClient = (AdsClient) obj;
        return Intrinsics.a(this.allLimit, adsClient.allLimit) && Intrinsics.a(this.dayLimit, adsClient.dayLimit) && this.f15113id == adsClient.f15113id && Intrinsics.a(this.name, adsClient.name);
    }

    @NotNull
    public final String getAllLimit() {
        return this.allLimit;
    }

    @NotNull
    public final String getDayLimit() {
        return this.dayLimit;
    }

    public final int getId() {
        return this.f15113id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + u.g(this.f15113id, a.e(this.allLimit.hashCode() * 31, 31, this.dayLimit), 31);
    }

    @NotNull
    public String toString() {
        String str = this.allLimit;
        String str2 = this.dayLimit;
        int i = this.f15113id;
        String str3 = this.name;
        StringBuilder sbJ = z.j("AdsClient(allLimit=", str, ", dayLimit=", str2, ", id=");
        sbJ.append(i);
        sbJ.append(", name=");
        sbJ.append(str3);
        sbJ.append(")");
        return sbJ.toString();
    }
}

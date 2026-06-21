package com.vk.sdk.api.ads.dto;

import a0.u;
import gf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
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
public final class AdsMusician {

    @b("avatar")
    @Nullable
    private final String avatar;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15120id;

    @b("name")
    @NotNull
    private final String name;

    public AdsMusician(int i, @NotNull String name, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f15120id = i;
        this.name = name;
        this.avatar = str;
    }

    public static /* synthetic */ AdsMusician copy$default(AdsMusician adsMusician, int i, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = adsMusician.f15120id;
        }
        if ((i10 & 2) != 0) {
            str = adsMusician.name;
        }
        if ((i10 & 4) != 0) {
            str2 = adsMusician.avatar;
        }
        return adsMusician.copy(i, str, str2);
    }

    public final int component1() {
        return this.f15120id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final String component3() {
        return this.avatar;
    }

    @NotNull
    public final AdsMusician copy(int i, @NotNull String name, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new AdsMusician(i, name, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsMusician)) {
            return false;
        }
        AdsMusician adsMusician = (AdsMusician) obj;
        return this.f15120id == adsMusician.f15120id && Intrinsics.a(this.name, adsMusician.name) && Intrinsics.a(this.avatar, adsMusician.avatar);
    }

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    public final int getId() {
        return this.f15120id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iE = a.e(Integer.hashCode(this.f15120id) * 31, 31, this.name);
        String str = this.avatar;
        return iE + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.f15120id;
        String str = this.name;
        return u.o(pe.a.i(i, "AdsMusician(id=", ", name=", str, ", avatar="), this.avatar, ")");
    }

    public /* synthetic */ AdsMusician(int i, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i10 & 4) != 0 ? null : str2);
    }
}

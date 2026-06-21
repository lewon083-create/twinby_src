package com.yandex.mobile.ads.common;

import a0.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.a;

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
public final class AdRequestError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15276c;

    public AdRequestError(int i, @NotNull String str, @Nullable String str2) {
        this.f15274a = i;
        this.f15275b = str;
        this.f15276c = str2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AdRequestError.class.equals(obj.getClass())) {
            return false;
        }
        AdRequestError adRequestError = (AdRequestError) obj;
        if (this.f15274a == adRequestError.f15274a && Intrinsics.a(this.f15276c, adRequestError.f15276c)) {
            return Intrinsics.a(this.f15275b, adRequestError.f15275b);
        }
        return false;
    }

    public final int getCode() {
        return this.f15274a;
    }

    @NotNull
    public final String getDescription() {
        return this.f15275b;
    }

    public int hashCode() {
        int iHashCode = ((this.f15275b.hashCode() * 31) + this.f15274a) * 31;
        String str = this.f15276c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.f15274a;
        String str = this.f15275b;
        String str2 = this.f15276c;
        if (str2 == null) {
            str2 = "";
        }
        return u.o(a.i(i, "AdRequestError (code: ", ", description: ", str, ", adUnitId: "), str2, ")");
    }
}

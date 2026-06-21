package io.appmetrica.analytics.coreapi.internal.model;

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
public final class AppVersionInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21724b;

    public AppVersionInfo(@NotNull String str, @NotNull String str2) {
        this.f21723a = str;
        this.f21724b = str2;
    }

    public static /* synthetic */ AppVersionInfo copy$default(AppVersionInfo appVersionInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appVersionInfo.f21723a;
        }
        if ((i & 2) != 0) {
            str2 = appVersionInfo.f21724b;
        }
        return appVersionInfo.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.f21723a;
    }

    @NotNull
    public final String component2() {
        return this.f21724b;
    }

    @NotNull
    public final AppVersionInfo copy(@NotNull String str, @NotNull String str2) {
        return new AppVersionInfo(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppVersionInfo)) {
            return false;
        }
        AppVersionInfo appVersionInfo = (AppVersionInfo) obj;
        return Intrinsics.a(this.f21723a, appVersionInfo.f21723a) && Intrinsics.a(this.f21724b, appVersionInfo.f21724b);
    }

    @NotNull
    public final String getAppBuildNumber() {
        return this.f21724b;
    }

    @NotNull
    public final String getAppVersionName() {
        return this.f21723a;
    }

    public int hashCode() {
        return this.f21724b.hashCode() + (this.f21723a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppVersionInfo(appVersionName=");
        sb2.append(this.f21723a);
        sb2.append(", appBuildNumber=");
        return u.n(sb2, this.f21724b, ')');
    }
}

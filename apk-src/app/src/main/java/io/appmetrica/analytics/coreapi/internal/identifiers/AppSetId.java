package io.appmetrica.analytics.coreapi.internal.identifiers;

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
public final class AppSetId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppSetIdScope f21712b;

    public AppSetId(@Nullable String str, @NotNull AppSetIdScope appSetIdScope) {
        this.f21711a = str;
        this.f21712b = appSetIdScope;
    }

    public static /* synthetic */ AppSetId copy$default(AppSetId appSetId, String str, AppSetIdScope appSetIdScope, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appSetId.f21711a;
        }
        if ((i & 2) != 0) {
            appSetIdScope = appSetId.f21712b;
        }
        return appSetId.copy(str, appSetIdScope);
    }

    @Nullable
    public final String component1() {
        return this.f21711a;
    }

    @NotNull
    public final AppSetIdScope component2() {
        return this.f21712b;
    }

    @NotNull
    public final AppSetId copy(@Nullable String str, @NotNull AppSetIdScope appSetIdScope) {
        return new AppSetId(str, appSetIdScope);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSetId)) {
            return false;
        }
        AppSetId appSetId = (AppSetId) obj;
        return Intrinsics.a(this.f21711a, appSetId.f21711a) && this.f21712b == appSetId.f21712b;
    }

    @Nullable
    public final String getId() {
        return this.f21711a;
    }

    @NotNull
    public final AppSetIdScope getScope() {
        return this.f21712b;
    }

    public int hashCode() {
        String str = this.f21711a;
        return this.f21712b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "AppSetId(id=" + this.f21711a + ", scope=" + this.f21712b + ')';
    }
}

package io.appmetrica.analytics.idsync.internal.model;

import a0.u;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
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
public final class IdSyncConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f22037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f22038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f22039c;

    public IdSyncConfig(boolean z5, long j10, @NotNull List<RequestConfig> list) {
        this.f22037a = z5;
        this.f22038b = j10;
        this.f22039c = list;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!IdSyncConfig.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.idsync.internal.model.IdSyncConfig");
        }
        IdSyncConfig idSyncConfig = (IdSyncConfig) obj;
        return this.f22037a == idSyncConfig.f22037a && this.f22038b == idSyncConfig.f22038b && Intrinsics.a(this.f22039c, idSyncConfig.f22039c);
    }

    public final boolean getEnabled() {
        return this.f22037a;
    }

    public final long getLaunchDelay() {
        return this.f22038b;
    }

    @NotNull
    public final List<RequestConfig> getRequests() {
        return this.f22039c;
    }

    public int hashCode() {
        return this.f22039c.hashCode() + o.d(this.f22038b, Boolean.hashCode(this.f22037a) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IdSyncConfig(enabled=");
        sb2.append(this.f22037a);
        sb2.append(", launchDelay=");
        sb2.append(this.f22038b);
        sb2.append(", requests=");
        return u.p(sb2, this.f22039c, ')');
    }
}

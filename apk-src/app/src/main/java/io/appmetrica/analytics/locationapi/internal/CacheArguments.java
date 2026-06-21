package io.appmetrica.analytics.locationapi.internal;

import com.google.android.gms.internal.ads.om1;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
public final class CacheArguments {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f25202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f25203b;

    public CacheArguments() {
        this(0L, 0L, 3, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!CacheArguments.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.CacheArguments");
        }
        CacheArguments cacheArguments = (CacheArguments) obj;
        return this.f25202a == cacheArguments.f25202a && this.f25203b == cacheArguments.f25203b;
    }

    public final long getOutdatedTimeInterval() {
        return this.f25203b;
    }

    public final long getRefreshPeriod() {
        return this.f25202a;
    }

    public int hashCode() {
        return Long.hashCode(this.f25203b) + (Long.hashCode(this.f25202a) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CacheArguments(refreshPeriod=");
        sb2.append(this.f25202a);
        sb2.append(", outdatedTimeInterval=");
        return om1.m(sb2, this.f25203b, ')');
    }

    public CacheArguments(long j10, long j11) {
        this.f25202a = j10;
        this.f25203b = j11;
    }

    public /* synthetic */ CacheArguments(long j10, long j11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TimeUnit.SECONDS.toMillis(10L) : j10, (i & 2) != 0 ? TimeUnit.MINUTES.toMillis(2L) : j11);
    }
}

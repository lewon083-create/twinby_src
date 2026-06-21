package io.appmetrica.analytics.locationapi.internal;

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
public final class LocationFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f25204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f25205b;

    public LocationFilter() {
        this(0L, 0.0f, 3, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LocationFilter.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.LocationFilter");
        }
        LocationFilter locationFilter = (LocationFilter) obj;
        return this.f25204a == locationFilter.f25204a && this.f25205b == locationFilter.f25205b;
    }

    public final float getUpdateDistanceInterval() {
        return this.f25205b;
    }

    public final long getUpdateTimeInterval() {
        return this.f25204a;
    }

    public int hashCode() {
        return Float.hashCode(this.f25205b) + (Long.hashCode(this.f25204a) * 31);
    }

    @NotNull
    public String toString() {
        return "LocationFilter(updateTimeInterval=" + this.f25204a + ", updateDistanceInterval=" + this.f25205b + ')';
    }

    public LocationFilter(long j10, float f10) {
        this.f25204a = j10;
        this.f25205b = f10;
    }

    public /* synthetic */ LocationFilter(long j10, float f10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 5000L : j10, (i & 2) != 0 ? 10.0f : f10);
    }
}

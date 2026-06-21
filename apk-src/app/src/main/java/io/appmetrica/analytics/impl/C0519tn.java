package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0519tn implements TempCacheStorage.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f24819d;

    public C0519tn(long j10, @NotNull String str, long j11, @NotNull byte[] bArr) {
        this.f24816a = j10;
        this.f24817b = str;
        this.f24818c = j11;
        this.f24819d = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0519tn.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
        }
        C0519tn c0519tn = (C0519tn) obj;
        if (this.f24816a == c0519tn.f24816a && Intrinsics.a(this.f24817b, c0519tn.f24817b) && this.f24818c == c0519tn.f24818c) {
            return Arrays.equals(this.f24819d, c0519tn.f24819d);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    @NotNull
    public final byte[] getData() {
        return this.f24819d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.f24816a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    @NotNull
    public final String getScope() {
        return this.f24817b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.f24818c;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f24819d) + l7.o.d(this.f24818c, gf.a.e(Long.hashCode(this.f24816a) * 31, 31, this.f24817b), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TempCacheEntry(id=");
        sb2.append(this.f24816a);
        sb2.append(", scope='");
        sb2.append(this.f24817b);
        sb2.append("', timestamp=");
        sb2.append(this.f24818c);
        sb2.append(", data=array[");
        return t.z.d(this.f24819d.length, "])", sb2);
    }
}

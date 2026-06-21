package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0474s3 implements U7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f24724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T7 f24725b;

    public C0474s3(@Nullable Map<String, String> map, @NotNull T7 t72) {
        this.f24724a = map;
        this.f24725b = t72;
    }

    @NotNull
    public final C0474s3 a(@Nullable Map<String, String> map, @NotNull T7 t72) {
        return new C0474s3(map, t72);
    }

    @Nullable
    public final Map<String, String> b() {
        return this.f24724a;
    }

    @NotNull
    public final T7 c() {
        return this.f24725b;
    }

    @Nullable
    public final Map<String, String> d() {
        return this.f24724a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0474s3)) {
            return false;
        }
        C0474s3 c0474s3 = (C0474s3) obj;
        return Intrinsics.a(this.f24724a, c0474s3.f24724a) && this.f24725b == c0474s3.f24725b;
    }

    public final int hashCode() {
        Map map = this.f24724a;
        return this.f24725b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "Candidate(clids=" + this.f24724a + ", source=" + this.f24725b + ')';
    }

    public static C0474s3 a(C0474s3 c0474s3, Map map, T7 t72, int i, Object obj) {
        if ((i & 1) != 0) {
            map = c0474s3.f24724a;
        }
        if ((i & 2) != 0) {
            t72 = c0474s3.f24725b;
        }
        c0474s3.getClass();
        return new C0474s3(map, t72);
    }

    @Override // io.appmetrica.analytics.impl.U7
    @NotNull
    public final T7 a() {
        return this.f24725b;
    }
}

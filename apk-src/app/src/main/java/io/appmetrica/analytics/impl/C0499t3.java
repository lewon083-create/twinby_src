package io.appmetrica.analytics.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0499t3 implements R7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0474s3 f24754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f24755b;

    public C0499t3(@NotNull C0474s3 c0474s3, @NotNull List<C0474s3> list) {
        this.f24754a = c0474s3;
        this.f24755b = list;
    }

    @NotNull
    public final C0499t3 a(@NotNull C0474s3 c0474s3, @NotNull List<C0474s3> list) {
        return new C0499t3(c0474s3, list);
    }

    @Override // io.appmetrica.analytics.impl.R7
    public final Object b() {
        return this.f24754a;
    }

    @NotNull
    public final C0474s3 c() {
        return this.f24754a;
    }

    @NotNull
    public final List<C0474s3> d() {
        return this.f24755b;
    }

    @NotNull
    public final C0474s3 e() {
        return this.f24754a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0499t3)) {
            return false;
        }
        C0499t3 c0499t3 = (C0499t3) obj;
        return Intrinsics.a(this.f24754a, c0499t3.f24754a) && Intrinsics.a(this.f24755b, c0499t3.f24755b);
    }

    public final int hashCode() {
        return this.f24755b.hashCode() + (this.f24754a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClidsInfo(chosen=");
        sb2.append(this.f24754a);
        sb2.append(", candidates=");
        return a0.u.p(sb2, this.f24755b, ')');
    }

    public static C0499t3 a(C0499t3 c0499t3, C0474s3 c0474s3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            c0474s3 = c0499t3.f24754a;
        }
        if ((i & 2) != 0) {
            list = c0499t3.f24755b;
        }
        c0499t3.getClass();
        return new C0499t3(c0474s3, list);
    }

    @Override // io.appmetrica.analytics.impl.R7
    @NotNull
    public final List<C0474s3> a() {
        return this.f24755b;
    }
}

package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0451r5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24678a;

    public C0451r5(@NotNull String str) {
        this.f24678a = str;
    }

    @NotNull
    public final C0451r5 a(@NotNull String str) {
        return new C0451r5(str);
    }

    @NotNull
    public final String b() {
        return this.f24678a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0451r5) && Intrinsics.a(this.f24678a, ((C0451r5) obj).f24678a);
    }

    public final int hashCode() {
        return this.f24678a.hashCode();
    }

    @NotNull
    public final String toString() {
        return a0.u.n(new StringBuilder("ConstantModuleEntryPointProvider(className="), this.f24678a, ')');
    }

    @NotNull
    public final String a() {
        return this.f24678a;
    }

    public static C0451r5 a(C0451r5 c0451r5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c0451r5.f24678a;
        }
        c0451r5.getClass();
        return new C0451r5(str);
    }
}

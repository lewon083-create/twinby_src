package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0634yd extends We implements InterfaceC0517tl {
    public AbstractC0634yd(@NotNull Ia ia2, @Nullable String str) {
        super(ia2, str);
    }

    @Nullable
    public final String c(@NotNull String str, @Nullable String str2) {
        return this.f23219a.getString(f(str), str2);
    }

    @NotNull
    public final InterfaceC0517tl d(@NotNull String str, @Nullable String str2) {
        return (InterfaceC0517tl) b(f(str), str2);
    }

    public final boolean e(@NotNull String str) {
        return this.f23219a.a(f(str));
    }

    @NotNull
    public abstract String f(@NotNull String str);

    @NotNull
    public InterfaceC0517tl g(@NotNull String str) {
        return (InterfaceC0517tl) d(f(str));
    }

    public AbstractC0634yd(@NotNull Ia ia2) {
        this(ia2, null);
    }

    @NotNull
    public final InterfaceC0517tl d(@NotNull String str, int i) {
        return (InterfaceC0517tl) b(f(str), i);
    }

    public final int c(@NotNull String str, int i) {
        return this.f23219a.getInt(f(str), i);
    }

    @NotNull
    public final InterfaceC0517tl d(@NotNull String str, long j10) {
        return (InterfaceC0517tl) b(f(str), j10);
    }

    @NotNull
    public final InterfaceC0517tl d(@NotNull String str, boolean z5) {
        return (InterfaceC0517tl) b(f(str), z5);
    }

    public final long c(@NotNull String str, long j10) {
        return this.f23219a.getLong(f(str), j10);
    }

    public final boolean c(@NotNull String str, boolean z5) {
        return this.f23219a.getBoolean(f(str), z5);
    }
}

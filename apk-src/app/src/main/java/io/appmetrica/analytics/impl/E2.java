package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class E2 implements ModulePreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0517tl f22269a;

    public E2(@NotNull InterfaceC0517tl interfaceC0517tl) {
        this.f22269a = interfaceC0517tl;
    }

    @NotNull
    public abstract String a(@NotNull String str);

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final boolean getBoolean(@NotNull String str, boolean z5) {
        return ((AbstractC0634yd) this.f22269a).c(str, z5);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final int getInt(@NotNull String str, int i) {
        return ((AbstractC0634yd) this.f22269a).c(str, i);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final long getLong(@NotNull String str, long j10) {
        return ((AbstractC0634yd) this.f22269a).c(a(str), j10);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    @Nullable
    public final String getString(@NotNull String str, @Nullable String str2) {
        return ((AbstractC0634yd) this.f22269a).c(a(str), str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putBoolean(@NotNull String str, boolean z5) {
        AbstractC0634yd abstractC0634yd = (AbstractC0634yd) this.f22269a;
        ((We) ((InterfaceC0517tl) abstractC0634yd.b(abstractC0634yd.f(a(str)), z5))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putInt(@NotNull String str, int i) {
        AbstractC0634yd abstractC0634yd = (AbstractC0634yd) this.f22269a;
        ((We) ((InterfaceC0517tl) abstractC0634yd.b(abstractC0634yd.f(str), i))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putLong(@NotNull String str, long j10) {
        AbstractC0634yd abstractC0634yd = (AbstractC0634yd) this.f22269a;
        ((We) ((InterfaceC0517tl) abstractC0634yd.b(abstractC0634yd.f(a(str)), j10))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putString(@NotNull String str, @Nullable String str2) {
        AbstractC0634yd abstractC0634yd = (AbstractC0634yd) this.f22269a;
        ((We) ((InterfaceC0517tl) abstractC0634yd.b(abstractC0634yd.f(a(str)), str2))).b();
    }
}

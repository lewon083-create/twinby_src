package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModuleDummy;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Af f22145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NativeCrashClientModule f22146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I0 f22147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public H0 f22148d;

    public Bd(Af af2) {
        this.f22145a = af2;
        NativeCrashClientModule nativeCrashClientModule = (NativeCrashClientModule) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashClientModuleImpl", NativeCrashClientModule.class);
        this.f22146b = nativeCrashClientModule == null ? new NativeCrashClientModuleDummy() : nativeCrashClientModule;
        this.f22147c = new I0();
    }
}

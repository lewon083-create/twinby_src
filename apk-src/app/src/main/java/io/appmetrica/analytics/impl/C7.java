package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7 implements ClientComponentsInitializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22195a = kotlin.collections.s.f("io.appmetrica.analytics.adrevenue.admob.v23.internal.AdMobClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.applovin.v12.internal.AppLovinClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.fyber.v3.internal.FyberClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.ironsource.v7.internal.IronSourceClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.ironsource.v9.internal.IronSourceV9ClientModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudClientModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint", "io.appmetrica.analytics.reporterextension.internal.ReporterExtensionClientModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer
    public final void onCreate() {
        if (C0071c4.l().f23535a.b()) {
            Sc sc2 = C0071c4.l().f23546m;
            List list = this.f22195a;
            ArrayList arrayList = new ArrayList(kotlin.collections.t.j(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C0451r5((String) it.next()));
            }
            Object[] array = arrayList.toArray(new C0451r5[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            C0451r5[] c0451r5Arr = (C0451r5[]) array;
            C0451r5[] c0451r5Arr2 = (C0451r5[]) Arrays.copyOf(c0451r5Arr, c0451r5Arr.length);
            synchronized (sc2) {
                kotlin.collections.x.n(sc2.f22956a, c0451r5Arr2);
            }
        }
    }
}

package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Z3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public I5 f23366c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y3 f23364a = new Y3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f23365b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f23367d = new CopyOnWriteArrayList();

    public static void a(String str, String str2, Throwable th2) {
        Pj pj2 = AbstractC0366nj.f24449a;
        Map mapC = kotlin.collections.i0.c(new Pair(str, kotlin.collections.i0.c(new Pair(str2, ij.d.b(th2)))));
        pj2.getClass();
        pj2.a(new Oj("client_module_errors", mapC));
    }

    @Nullable
    public final ModuleAdRevenueProcessor b() {
        L5 l52;
        I5 i52 = this.f23366c;
        if (i52 == null || (l52 = ((L3) i52).f22592b) == null) {
            return null;
        }
        return l52.f22601a;
    }

    public final void c() {
        for (ModuleClientEntryPoint moduleClientEntryPoint : this.f23365b) {
            try {
                moduleClientEntryPoint.onActivated();
            } catch (Throwable th2) {
                a(moduleClientEntryPoint.getIdentifier(), "onActivated", th2);
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f23367d;
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f23365b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList2.iterator();
        while (it.hasNext()) {
            AdRevenueCollector adRevenueCollector = ((ModuleClientEntryPoint) it.next()).getAdRevenueCollector();
            if (adRevenueCollector != null) {
                arrayList.add(adRevenueCollector);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((AdRevenueCollector) obj).getEnabled()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(kotlin.collections.t.j(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((AdRevenueCollector) it2.next()).getSourceIdentifier());
        }
        copyOnWriteArrayList.addAll(CollectionsKt.y(arrayList3));
    }

    @NotNull
    public final List<String> a() {
        return this.f23367d;
    }

    public final void a(@NotNull ModuleClientEntryPoint<Object> moduleClientEntryPoint) {
        this.f23365b.add(moduleClientEntryPoint);
    }

    public final void a(@NotNull I5 i52) {
        this.f23366c = i52;
        HashSet hashSet = new HashSet();
        for (ModuleClientEntryPoint moduleClientEntryPoint : this.f23365b) {
            try {
                moduleClientEntryPoint.initClientSide(i52);
            } catch (Throwable th2) {
                a(moduleClientEntryPoint.getIdentifier(), "initClientSide", th2);
                hashSet.add(moduleClientEntryPoint);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        this.f23365b.removeAll(hashSet);
    }

    public final void a(@Nullable Bundle bundle, @NotNull SdkIdentifiers sdkIdentifiers) {
        if (bundle == null) {
            return;
        }
        for (ModuleClientEntryPoint moduleClientEntryPoint : this.f23365b) {
            try {
                ServiceConfigExtensionConfiguration serviceConfigExtensionConfiguration = moduleClientEntryPoint.getServiceConfigExtensionConfiguration();
                if (serviceConfigExtensionConfiguration != null) {
                    ServiceConfigUpdateListener serviceConfigUpdateListener = serviceConfigExtensionConfiguration.getServiceConfigUpdateListener();
                    Y3 y32 = this.f23364a;
                    String identifier = moduleClientEntryPoint.getIdentifier();
                    y32.getClass();
                    Bundle bundle2 = bundle.getBundle(identifier);
                    X3 x32 = bundle2 != null ? new X3(sdkIdentifiers, serviceConfigExtensionConfiguration.getBundleConverter().fromBundle(bundle2)) : null;
                    if (x32 != null) {
                        serviceConfigUpdateListener.onServiceConfigUpdated(x32);
                    }
                }
            } catch (Throwable th2) {
                a(moduleClientEntryPoint.getIdentifier(), "notifyModulesWithConfig", th2);
            }
        }
    }
}

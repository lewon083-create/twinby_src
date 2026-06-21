package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceExtension;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import io.sentry.Session;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0591wk implements Qc, InterfaceC0269jm, AskForPermissionStrategyModuleProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24987a = "rp";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f24988b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile AskForPermissionStrategyModuleProvider f24989c = new B7();

    public static void a(String str, String str2, Throwable th2) {
        Pj pj2 = AbstractC0366nj.f24449a;
        Map mapC = kotlin.collections.i0.c(new Pair(str, kotlin.collections.i0.c(new Pair(str2, ij.d.b(th2)))));
        pj2.getClass();
        pj2.a(new Oj("service_module_errors", mapC));
    }

    @Override // io.appmetrica.analytics.impl.Qc
    @NotNull
    public final List<ModuleServicesDatabase> b() {
        Object objValueOf;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f24988b;
        ArrayList arrayList2 = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            try {
                ModuleServicesDatabase moduleServicesDatabase = moduleServiceEntryPoint.getModuleServicesDatabase();
                objValueOf = moduleServicesDatabase != null ? Boolean.valueOf(arrayList.add(moduleServicesDatabase)) : null;
            } catch (Throwable th2) {
                hashSet.add(moduleServiceEntryPoint);
                a(moduleServiceEntryPoint.getIdentifier(), "db", th2);
                objValueOf = Unit.f27471a;
            }
            if (objValueOf != null) {
                arrayList2.add(objValueOf);
            }
        }
        a(hashSet);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Qc
    @NotNull
    public final Map<String, Yc> c() {
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f24988b;
        ArrayList arrayList = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            Pair pair = null;
            try {
                RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration != null) {
                    pair = new Pair(moduleServiceEntryPoint.getIdentifier(), new Yc(remoteConfigExtensionConfiguration));
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "remote_config_controller", th2);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map<String, Yc> mapK = kotlin.collections.j0.k(arrayList);
        a(hashSet);
        return mapK;
    }

    @Override // io.appmetrica.analytics.impl.Qc
    @NotNull
    public final Map<String, Integer> d() {
        Iterable iterableN;
        Map<String, Integer> blocks;
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f24988b;
        ArrayList arrayList = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            try {
                RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration == null || (blocks = remoteConfigExtensionConfiguration.getBlocks()) == null || (iterableN = kotlin.collections.l0.n(blocks)) == null) {
                    iterableN = kotlin.collections.b0.f27475b;
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "blocks", th2);
                hashSet.add(moduleServiceEntryPoint);
                iterableN = kotlin.collections.b0.f27475b;
            }
            kotlin.collections.x.m(arrayList, iterableN);
        }
        Map<String, Integer> mapK = kotlin.collections.j0.k(arrayList);
        a(hashSet);
        return mapK;
    }

    @Override // io.appmetrica.analytics.impl.Qc
    @NotNull
    public final List<Consumer<Location>> e() {
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f24988b;
        ArrayList arrayList = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            Consumer<Location> locationConsumer = null;
            try {
                LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    locationConsumer = locationServiceExtension.getLocationConsumer();
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "location_consumer", th2);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (locationConsumer != null) {
                arrayList.add(locationConsumer);
            }
        }
        a(hashSet);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Qc
    @Nullable
    public final ModuleLocationSourcesServiceController f() {
        ModuleLocationSourcesServiceController locationSourcesController;
        HashSet hashSet = new HashSet();
        Iterator it = this.f24988b.iterator();
        do {
            locationSourcesController = null;
            if (!it.hasNext()) {
                break;
            }
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    locationSourcesController = locationServiceExtension.getLocationSourcesController();
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "location_source_controller", th2);
                hashSet.add(moduleServiceEntryPoint);
            }
        } while (locationSourcesController == null);
        a(hashSet);
        return locationSourcesController;
    }

    @Override // io.appmetrica.analytics.impl.Qc
    @Nullable
    public final Toggle g() {
        Toggle locationControllerAppStateToggle;
        HashSet hashSet = new HashSet();
        Iterator it = this.f24988b.iterator();
        do {
            locationControllerAppStateToggle = null;
            if (!it.hasNext()) {
                break;
            }
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    locationControllerAppStateToggle = locationServiceExtension.getLocationControllerAppStateToggle();
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "location_app_state_control_toggle", th2);
                hashSet.add(moduleServiceEntryPoint);
            }
        } while (locationControllerAppStateToggle == null);
        a(hashSet);
        return locationControllerAppStateToggle;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    @NotNull
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.f24989c.getAskForPermissionStrategy();
    }

    @Override // io.appmetrica.analytics.impl.Qc
    @NotNull
    public final List<String> h() {
        List<String> features;
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f24988b;
        ArrayList arrayList = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            try {
                RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration == null || (features = remoteConfigExtensionConfiguration.getFeatures()) == null) {
                    features = kotlin.collections.b0.f27475b;
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "features", th2);
                hashSet.add(moduleServiceEntryPoint);
                features = kotlin.collections.b0.f27475b;
            }
            kotlin.collections.x.m(arrayList, features);
        }
        a(hashSet);
        return arrayList;
    }

    @NotNull
    public final Bundle i() {
        Bundle bundle = new Bundle();
        HashSet hashSet = new HashSet();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.f24988b) {
            Bundle configBundleForClient = null;
            try {
                ClientConfigProvider clientConfigProvider = moduleServiceEntryPoint.getClientConfigProvider();
                if (clientConfigProvider != null) {
                    configBundleForClient = clientConfigProvider.getConfigBundleForClient();
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "config_bundle", th2);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (configBundleForClient != null) {
                bundle.putBundle(moduleServiceEntryPoint.getIdentifier(), configBundleForClient);
            }
        }
        a(hashSet);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(@NotNull ModuleServiceEntryPoint<Object> moduleServiceEntryPoint) {
        this.f24988b.add(moduleServiceEntryPoint);
        if (Intrinsics.a(this.f24987a, moduleServiceEntryPoint.getIdentifier()) && (moduleServiceEntryPoint instanceof AskForPermissionStrategyModuleProvider)) {
            this.f24989c = (AskForPermissionStrategyModuleProvider) moduleServiceEntryPoint;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0269jm
    public final void a(@NotNull C0140em c0140em) {
        HashSet hashSet = new HashSet();
        SdkIdentifiers sdkIdentifiers = new SdkIdentifiers(c0140em.f23788d, c0140em.f23785a, c0140em.f23786b);
        Jg jg = new Jg(c0140em.f23805v, c0140em.f23804u);
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.f24988b) {
            try {
                RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration != null) {
                    remoteConfigExtensionConfiguration.getRemoteConfigUpdateListener().onRemoteConfigUpdated(new C0516tk(sdkIdentifiers, jg, c0140em.A.get(moduleServiceEntryPoint.getIdentifier())));
                }
            } catch (Throwable th2) {
                hashSet.add(moduleServiceEntryPoint);
                a(moduleServiceEntryPoint.getIdentifier(), "remote_config_updated", th2);
            }
        }
        a(hashSet);
    }

    public final void a(@NotNull ServiceContext serviceContext, @NotNull C0140em c0140em) {
        HashSet hashSet = new HashSet();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.f24988b) {
            try {
                moduleServiceEntryPoint.initServiceSide(serviceContext, new C0516tk(new SdkIdentifiers(c0140em.f23788d, c0140em.f23785a, c0140em.f23786b), new Jg(c0140em.f23805v, c0140em.f23804u), c0140em.A.get(moduleServiceEntryPoint.getIdentifier())));
                ModuleEventServiceHandlerFactory moduleEventServiceHandlerFactory = moduleServiceEntryPoint.getModuleEventServiceHandlerFactory();
                if (moduleEventServiceHandlerFactory != null) {
                    Uc uc2 = C0382oa.I.f24508t;
                    String identifier = moduleServiceEntryPoint.getIdentifier();
                    synchronized (uc2) {
                        uc2.f23073a.put(identifier, moduleEventServiceHandlerFactory);
                    }
                } else {
                    continue;
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), Session.JsonKeys.INIT, th2);
                hashSet.add(moduleServiceEntryPoint);
            }
        }
        a(hashSet);
    }

    public final void a(HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        this.f24988b.removeAll(hashSet);
    }
}

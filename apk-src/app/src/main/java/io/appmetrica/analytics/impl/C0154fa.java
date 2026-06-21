package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0154fa {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0154fa f23871d = new C0154fa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0484sd f23872a = new C0484sd();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ServiceComponentsInitializer f23873b = AbstractC0035ak.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23874c = false;

    public final void a(Context context) {
        C0054bd c0054bd;
        C0382oa.a(context);
        this.f23873b.onCreate(context);
        this.f23872a.getClass();
        List<String> listA = C0382oa.I.f24507s.a();
        ArrayList arrayList = new ArrayList(kotlin.collections.t.j(listA, 10));
        for (String str : listA) {
            Object objLoadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleServiceEntryPoint.class);
            if (objLoadAndInstantiateClassWithDefaultConstructor == null) {
                c0054bd = new C0054bd(str, false);
            } else {
                C0382oa.I.p().a((ModuleServiceEntryPoint<Object>) objLoadAndInstantiateClassWithDefaultConstructor);
                c0054bd = new C0054bd(str, true);
            }
            arrayList.add(c0054bd);
        }
        new C0342mk(C0382oa.I.D().f25134d).a(context);
        vo voVar = C0382oa.I.D().f25133c;
        synchronized (voVar) {
            voVar.f24950a.a();
        }
        C0382oa.I.q().a();
        a().a(arrayList);
    }

    public final void b(Context context) {
        if (this.f23874c) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f23874c) {
                    a(context);
                    this.f23874c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static C0080cd a() {
        C0267jk c0267jk = C0382oa.I.f24493d;
        if (c0267jk.f24179b == null) {
            synchronized (c0267jk) {
                try {
                    if (c0267jk.f24179b == null) {
                        c0267jk.f24178a.getClass();
                        HandlerThreadC0104db handlerThreadC0104dbA = A9.a("IAA-SC");
                        c0267jk.f24179b = new A9(handlerThreadC0104dbA, handlerThreadC0104dbA.getLooper(), new Handler(handlerThreadC0104dbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return new C0080cd(c0267jk.f24179b, C0382oa.I.y(), "service_modules", new SystemTimeProvider());
    }
}

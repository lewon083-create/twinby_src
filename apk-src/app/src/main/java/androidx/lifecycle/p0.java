package androidx.lifecycle;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g8.g f1579a = new g8.g(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final nc.e f1580b = new nc.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wd.d f1581c = new wd.d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wd.d f1582d = new wd.d();

    public static final void a(w0 viewModel, o6.e registry, p lifecycle) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
        g3.a aVar = viewModel.f1612a;
        if (aVar != null) {
            Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
            synchronized (aVar.f19955a) {
                autoCloseable = (AutoCloseable) aVar.f19956b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        n0 n0Var = (n0) autoCloseable;
        if (n0Var == null || n0Var.f1572d) {
            return;
        }
        n0Var.a(lifecycle, registry);
        o oVar = ((w) lifecycle).f1606c;
        if (oVar == o.f1574c || oVar.a(o.f1576e)) {
            registry.d();
        } else {
            lifecycle.a(new g(lifecycle, registry));
        }
    }

    public static m0 b(Bundle source, Bundle bundle) {
        if (source == null) {
            source = bundle;
        }
        if (source == null) {
            m0 m0Var = new m0();
            new LinkedHashMap();
            m0Var.f1569a = new a1.m(kotlin.collections.j0.d());
            return m0Var;
        }
        ClassLoader classLoader = m0.class.getClassLoader();
        Intrinsics.b(classLoader);
        source.setClassLoader(classLoader);
        Intrinsics.checkNotNullParameter(source, "source");
        jj.i builder = new jj.i(source.size());
        for (String str : source.keySet()) {
            Intrinsics.b(str);
            builder.put(str, source.get(str));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        jj.i initialState = builder.b();
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        m0 m0Var2 = new m0();
        new LinkedHashMap();
        m0Var2.f1569a = new a1.m(initialState);
        return m0Var2;
    }

    public static final m0 c(f3.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        o6.g gVar = (o6.g) dVar.a(f1579a);
        if (gVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        a1 a1Var = (a1) dVar.a(f1580b);
        if (a1Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) dVar.a(f1581c);
        String key = (String) dVar.a(f1582d);
        if (key == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        o6.d dVarB = gVar.getSavedStateRegistry().b();
        Bundle bundle2 = null;
        r0 r0Var = dVarB instanceof r0 ? (r0) dVarB : null;
        if (r0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        s0 s0VarE = e(a1Var);
        m0 m0Var = (m0) s0VarE.f1590b.get(key);
        if (m0Var != null) {
            return m0Var;
        }
        Intrinsics.checkNotNullParameter(key, "key");
        r0Var.b();
        Bundle source = r0Var.f1588c;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(key, "key");
            if (source.containsKey(key)) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(key, "key");
                Bundle source2 = source.getBundle(key);
                if (source2 == null) {
                    kotlin.collections.j0.d();
                    source2 = i0.o.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    Intrinsics.checkNotNullParameter(source2, "source");
                }
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(key, "key");
                source.remove(key);
                Intrinsics.checkNotNullParameter(source, "source");
                if (source.isEmpty()) {
                    r0Var.f1588c = null;
                }
                bundle2 = source2;
            }
        }
        m0 m0VarB = b(bundle2, bundle);
        s0VarE.f1590b.put(key, m0VarB);
        return m0VarB;
    }

    public static final void d(o6.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        o oVar = ((w) gVar.getLifecycle()).f1606c;
        if (oVar != o.f1574c && oVar != o.f1575d) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (gVar.getSavedStateRegistry().b() == null) {
            r0 r0Var = new r0(gVar.getSavedStateRegistry(), (a1) gVar);
            gVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", r0Var);
            gVar.getLifecycle().a(new o6.b(r0Var));
        }
    }

    public static final s0 e(a1 owner) {
        Intrinsics.checkNotNullParameter(owner, "<this>");
        o0 factory = new o0();
        Intrinsics.checkNotNullParameter(owner, "owner");
        f3.c defaultCreationExtras = owner instanceof j ? ((j) owner).getDefaultViewModelCreationExtras() : f3.a.f16575b;
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "extras");
        z0 store = owner.getViewModelStore();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        s7.g gVar = new s7.g(store, factory, defaultCreationExtras);
        kotlin.jvm.internal.i modelClass = kotlin.jvm.internal.g0.a(s0.class);
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesVM", "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (s0) gVar.C(modelClass, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}

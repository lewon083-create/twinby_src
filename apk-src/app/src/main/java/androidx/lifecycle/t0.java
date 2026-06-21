package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.j4;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f1591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f1592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f1593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f1594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o6.e f1595f;

    public t0(Application application, o6.g owner, Bundle bundle) {
        x0 x0Var;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f1595f = owner.getSavedStateRegistry();
        this.f1594e = owner.getLifecycle();
        this.f1593d = bundle;
        this.f1591b = application;
        if (application != null) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (x0.f1614e == null) {
                Intrinsics.checkNotNullParameter(application, "application");
                x0.f1614e = new x0(application);
            }
            x0Var = x0.f1614e;
            Intrinsics.b(x0Var);
        } else {
            x0Var = new x0(null);
        }
        this.f1592c = x0Var;
    }

    @Override // androidx.lifecycle.y0
    public final w0 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return c(modelClass, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.y0
    public final w0 b(kotlin.jvm.internal.i modelClass, f3.d extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return e(h5.t(modelClass), extras);
    }

    public final w0 c(Class modelClass, String key) {
        AutoCloseable autoCloseable;
        Application application;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        p lifecycle = this.f1594e;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = a.class.isAssignableFrom(modelClass);
        Constructor constructorA = (!zIsAssignableFrom || this.f1591b == null) ? u0.a(modelClass, u0.f1597b) : u0.a(modelClass, u0.f1596a);
        if (constructorA == null) {
            if (this.f1591b != null) {
                return this.f1592c.a(modelClass);
            }
            if (nc.e.f29207b == null) {
                nc.e.f29207b = new nc.e();
            }
            Intrinsics.b(nc.e.f29207b);
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return j4.m(modelClass);
        }
        o6.e registry = this.f1595f;
        Intrinsics.b(registry);
        Bundle bundle = this.f1593d;
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        m0 m0VarB = p0.b(registry.a(key), bundle);
        n0 closeable = new n0(key, m0VarB);
        closeable.a(lifecycle, registry);
        o oVar = ((w) lifecycle).f1606c;
        if (oVar == o.f1574c || oVar.a(o.f1576e)) {
            registry.d();
        } else {
            lifecycle.a(new g(lifecycle, registry));
        }
        w0 w0VarB = (!zIsAssignableFrom || (application = this.f1591b) == null) ? u0.b(modelClass, constructorA, m0VarB) : u0.b(modelClass, constructorA, application, m0VarB);
        w0VarB.getClass();
        Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        g3.a aVar = w0VarB.f1612a;
        if (aVar == null) {
            return w0VarB;
        }
        Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        if (aVar.f19958d) {
            g3.a.a(closeable);
            return w0VarB;
        }
        synchronized (aVar.f19955a) {
            autoCloseable = (AutoCloseable) aVar.f19956b.put("androidx.lifecycle.savedstate.vm.tag", closeable);
        }
        g3.a.a(autoCloseable);
        return w0VarB;
    }

    @Override // androidx.lifecycle.y0
    public final w0 e(Class modelClass, f3.d extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(p0.f1582d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(p0.f1579a) == null || extras.a(p0.f1580b) == null) {
            if (this.f1594e != null) {
                return c(modelClass, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(x0.f1615f);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(modelClass);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? u0.a(modelClass, u0.f1597b) : u0.a(modelClass, u0.f1596a);
        return constructorA == null ? this.f1592c.e(modelClass, extras) : (!zIsAssignableFrom || application == null) ? u0.b(modelClass, constructorA, p0.c(extras)) : u0.b(modelClass, constructorA, application, p0.c(extras));
    }
}

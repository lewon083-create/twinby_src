package o6;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.a1;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.p0;
import androidx.lifecycle.r0;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.google.android.gms.internal.ads.om1;
import ii.h;
import ii.o;
import ii.p;
import io.appmetrica.analytics.impl.A2;
import io.appmetrica.analytics.impl.C0232ia;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import z2.t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements s, o, h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f29780c;

    @Override // androidx.lifecycle.s
    public final void d(u source, n event) {
        ii.g gVar;
        ii.g gVar2;
        View view;
        switch (this.f29779b) {
            case 0:
                g owner = (g) this.f29780c;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event != n.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                source.getLifecycle().b(this);
                Bundle source2 = owner.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (source2 == null) {
                    return;
                }
                Intrinsics.checkNotNullParameter(source2, "source");
                Intrinsics.checkNotNullParameter("classes_to_restore", "key");
                ArrayList<String> stringArrayList = source2.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(c.class);
                        Intrinsics.b(clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                Intrinsics.b(objNewInstance);
                                Intrinsics.checkNotNullParameter(owner, "owner");
                                if (!(owner instanceof a1)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + owner).toString());
                                }
                                z0 viewModelStore = ((a1) owner).getViewModelStore();
                                e savedStateRegistry = owner.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f1619a;
                                for (String key : new HashSet(linkedHashMap.keySet())) {
                                    Intrinsics.checkNotNullParameter(key, "key");
                                    w0 w0Var = (w0) linkedHashMap.get(key);
                                    if (w0Var != null) {
                                        p0.a(w0Var, savedStateRegistry, owner.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e3) {
                                throw new RuntimeException(om1.k("Failed to instantiate ", str), e3);
                            }
                        } catch (NoSuchMethodException e7) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
                        }
                    } catch (ClassNotFoundException e10) {
                        throw new RuntimeException(pe.a.f("Class ", str, " wasn't found"), e10);
                    }
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                new HashMap();
                i[] iVarArr = (i[]) this.f29780c;
                if (iVarArr.length > 0) {
                    i iVar = iVarArr[0];
                    throw null;
                }
                if (iVarArr.length <= 0) {
                    return;
                }
                i iVar2 = iVarArr[0];
                throw null;
            case 2:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event != n.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
                }
                source.getLifecycle().b(this);
                ((r0) this.f29780c).b();
                return;
            case 3:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                d.n nVar = (d.n) this.f29780c;
                d.n.access$ensureViewModelStore(nVar);
                nVar.getLifecycle().b(this);
                return;
            case 4:
                if (event == n.ON_START && (gVar2 = (ii.g) this.f29780c) != null) {
                    gVar2.b(C0232ia.f24064g);
                    return;
                } else {
                    if (event != n.ON_STOP || (gVar = (ii.g) this.f29780c) == null) {
                        return;
                    }
                    gVar.b(A2.f22054g);
                    return;
                }
            default:
                if (event != n.ON_STOP || (view = ((t) this.f29780c).G) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
        }
    }

    @Override // ii.h
    public void e(Object obj, ii.g gVar) {
        this.f29780c = gVar;
    }

    @Override // ii.h
    public void k(Object obj) {
        this.f29780c = null;
    }

    @Override // ii.o
    public void onMethodCall(ii.n nVar, p pVar) {
        String str = nVar.f21315a;
        if (str.equals("stop")) {
            ProcessLifecycleOwner.f1526j.f1532g.b(this);
        } else if (str.equals("start")) {
            ProcessLifecycleOwner.f1526j.f1532g.a(this);
        } else {
            ((hi.g) pVar).a();
        }
    }

    public /* synthetic */ b(int i, Object obj) {
        this.f29779b = i;
        this.f29780c = obj;
    }

    public b(i[] generatedAdapters) {
        this.f29779b = 1;
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.f29780c = generatedAdapters;
    }

    public b(g owner) {
        this.f29779b = 0;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f29780c = owner;
    }

    public b(r0 provider) {
        this.f29779b = 2;
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f29780c = provider;
    }
}

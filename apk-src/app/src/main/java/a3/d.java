package a3;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import z2.h0;
import z2.t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f416a = c.f413c;

    public static c a(t tVar) {
        while (tVar != null) {
            if (tVar.f45986u != null && tVar.f45977l) {
                Intrinsics.checkNotNullExpressionValue(tVar.n(), "declaringFragment.parentFragmentManager");
            }
            tVar = tVar.f45988w;
        }
        return f416a;
    }

    public static void b(c cVar, f fVar) {
        t tVar = fVar.f418b;
        String name = tVar.getClass().getName();
        Set set = cVar.f414a;
        if (set.contains(b.f406b)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), fVar);
        }
        if (set.contains(b.f407c)) {
            a0.d dVar = new a0.d(9, name, fVar);
            if (tVar.f45986u == null || !tVar.f45977l) {
                dVar.run();
                throw null;
            }
            Handler handler = tVar.n().f45862v.f45997e;
            if (Intrinsics.a(handler.getLooper(), Looper.myLooper())) {
                dVar.run();
                throw null;
            }
            handler.post(dVar);
        }
    }

    public static void c(f fVar) {
        if (h0.K(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(fVar.f418b.getClass().getName()), fVar);
        }
    }

    public static final void d(t fragment, String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        a aVar = new a(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        c(aVar);
        c cVarA = a(fragment);
        if (cVarA.f414a.contains(b.f408d) && e(cVarA, fragment.getClass(), a.class)) {
            b(cVarA, aVar);
        }
    }

    public static boolean e(c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.f415b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.a(cls2.getSuperclass(), f.class) || !CollectionsKt.x(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}

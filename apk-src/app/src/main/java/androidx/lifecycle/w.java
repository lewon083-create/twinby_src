package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o.a f1605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f1606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f1607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f1611h;
    public final kk.t i;

    public w(u provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f1604a = true;
        this.f1605b = new o.a();
        o oVar = o.f1574c;
        this.f1606c = oVar;
        this.f1611h = new ArrayList();
        this.f1607d = new WeakReference(provider);
        this.i = new kk.t(oVar);
    }

    @Override // androidx.lifecycle.p
    public final void a(t object) {
        s gVar;
        Object obj;
        u uVar;
        Intrinsics.checkNotNullParameter(object, "observer");
        d("addObserver");
        o oVar = this.f1606c;
        o initialState = o.f1573b;
        if (oVar != initialState) {
            initialState = o.f1574c;
        }
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        v vVar = new v();
        Intrinsics.b(object);
        HashMap map = y.f1617a;
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z5 = object instanceof s;
        boolean z10 = object instanceof DefaultLifecycleObserver;
        if (z5 && z10) {
            gVar = new g((DefaultLifecycleObserver) object, (s) object);
        } else if (z10) {
            gVar = new g((DefaultLifecycleObserver) object, (s) null);
        } else if (z5) {
            gVar = (s) object;
        } else {
            Class<?> cls = object.getClass();
            if (y.c(cls) == 2) {
                Object obj2 = y.f1618b.get(cls);
                Intrinsics.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    y.a((Constructor) list.get(0), object);
                    throw null;
                }
                int size = list.size();
                i[] iVarArr = new i[size];
                if (size > 0) {
                    y.a((Constructor) list.get(0), object);
                    throw null;
                }
                gVar = new o6.b(iVarArr);
            } else {
                gVar = new g(object);
            }
        }
        vVar.f1599b = gVar;
        vVar.f1598a = initialState;
        o.a aVar = this.f1605b;
        o.c cVarA = aVar.a(object);
        if (cVarA != null) {
            obj = cVarA.f29587c;
        } else {
            HashMap map2 = aVar.f29582f;
            o.c cVar = new o.c(object, vVar);
            aVar.f29596e++;
            o.c cVar2 = aVar.f29594c;
            if (cVar2 == null) {
                aVar.f29593b = cVar;
                aVar.f29594c = cVar;
            } else {
                cVar2.f29588d = cVar;
                cVar.f29589e = cVar2;
                aVar.f29594c = cVar;
            }
            map2.put(object, cVar);
            obj = null;
        }
        if (((v) obj) == null && (uVar = (u) this.f1607d.get()) != null) {
            boolean z11 = this.f1608e != 0 || this.f1609f;
            o oVarC = c(object);
            this.f1608e++;
            while (vVar.f1598a.compareTo(oVarC) < 0 && this.f1605b.f29582f.containsKey(object)) {
                o oVar2 = vVar.f1598a;
                ArrayList arrayList = this.f1611h;
                arrayList.add(oVar2);
                l lVar = n.Companion;
                o state = vVar.f1598a;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(state, "state");
                int iOrdinal = state.ordinal();
                n nVar = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : n.ON_RESUME : n.ON_START : n.ON_CREATE;
                if (nVar == null) {
                    throw new IllegalStateException("no event up from " + vVar.f1598a);
                }
                vVar.a(uVar, nVar);
                arrayList.remove(arrayList.size() - 1);
                oVarC = c(object);
            }
            if (!z11) {
                h();
            }
            this.f1608e--;
        }
    }

    @Override // androidx.lifecycle.p
    public final void b(t observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        d("removeObserver");
        this.f1605b.c(observer);
    }

    public final o c(t tVar) {
        HashMap map = this.f1605b.f29582f;
        o.c cVar = map.containsKey(tVar) ? ((o.c) map.get(tVar)).f29589e : null;
        o state1 = cVar != null ? ((v) cVar.f29587c).f1598a : null;
        ArrayList arrayList = this.f1611h;
        o oVar = arrayList.isEmpty() ? null : (o) gf.a.g(1, arrayList);
        o state12 = this.f1606c;
        Intrinsics.checkNotNullParameter(state12, "state1");
        if (state1 == null || state1.compareTo(state12) >= 0) {
            state1 = state12;
        }
        Intrinsics.checkNotNullParameter(state1, "state1");
        return (oVar == null || oVar.compareTo(state1) >= 0) ? state1 : oVar;
    }

    public final void d(String str) {
        if (this.f1604a) {
            n.a.B().f28960a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(pe.a.f("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        d("handleLifecycleEvent");
        f(event.a());
    }

    public final void f(o next) {
        if (this.f1606c == next) {
            return;
        }
        u uVar = (u) this.f1607d.get();
        o current = this.f1606c;
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(next, "next");
        if (current == o.f1574c && next == o.f1573b) {
            throw new IllegalStateException(("State must be at least '" + o.f1575d + "' to be moved to '" + next + "' in component " + uVar).toString());
        }
        o oVar = o.f1573b;
        if (current == oVar && current != next) {
            throw new IllegalStateException(("State is '" + oVar + "' and cannot be moved to `" + next + "` in component " + uVar).toString());
        }
        this.f1606c = next;
        if (this.f1609f || this.f1608e != 0) {
            this.f1610g = true;
            return;
        }
        this.f1609f = true;
        h();
        this.f1609f = false;
        if (this.f1606c == oVar) {
            this.f1605b = new o.a();
        }
    }

    public final void g() {
        o state = o.f1575d;
        Intrinsics.checkNotNullParameter(state, "state");
        d("setCurrentState");
        f(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r12.f1610g = false;
        r12.i.G(r12.f1606c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.w.h():void");
    }
}

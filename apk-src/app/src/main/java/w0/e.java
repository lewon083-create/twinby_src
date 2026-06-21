package w0;

import a0.u1;
import androidx.lifecycle.o;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import f2.g;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f34951f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static e f34952g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34953a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f34954b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f34955c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f34956d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y.a f34957e;

    public final void a(b bVar, u1 u1Var, y.a aVar) {
        boolean z5;
        synchronized (this.f34953a) {
            try {
                g.b(!((List) u1Var.f229e).isEmpty());
                this.f34957e = aVar;
                u uVarE = bVar.e();
                d dVarC = c(uVarE);
                if (dVarC == null) {
                    return;
                }
                Set set = (Set) this.f34955c.get(dVarC);
                y.a aVar2 = this.f34957e;
                if (aVar2 == null || aVar2.b() != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        b bVar2 = (b) this.f34954b.get((a) it.next());
                        bVar2.getClass();
                        if (!bVar2.equals(bVar) && !bVar2.h().isEmpty()) {
                            synchronized (bVar2.f34944b) {
                                u1 u1Var2 = bVar2.f34948f;
                                z5 = u1Var2 == null ? false : u1Var2.f226b;
                            }
                            if (z5 || u1Var.f226b) {
                                throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                            }
                            bVar2.u();
                        }
                    }
                }
                try {
                    bVar.c(u1Var);
                    if (((w) uVarE.getLifecycle()).f1606c.a(o.f1576e)) {
                        g(uVarE);
                    }
                } catch (l0.d e3) {
                    throw new IllegalArgumentException(e3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final b b(u uVar, l0.f fVar) {
        synchronized (this.f34953a) {
            try {
                g.a("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", this.f34954b.get(new a(System.identityHashCode(uVar), fVar.f27724e)) == null);
                b bVar = new b(uVar, fVar);
                if (((ArrayList) fVar.x()).isEmpty()) {
                    bVar.s();
                }
                if (((w) uVar.getLifecycle()).f1606c == o.f1573b) {
                    return bVar;
                }
                f(bVar);
                return bVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final d c(u uVar) {
        synchronized (this.f34953a) {
            try {
                for (d dVar : this.f34955c.keySet()) {
                    if (uVar.equals(dVar.f34950c)) {
                        return dVar;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Collection d() {
        Collection collectionUnmodifiableCollection;
        synchronized (this.f34953a) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f34954b.values());
        }
        return collectionUnmodifiableCollection;
    }

    public final boolean e(u uVar) {
        synchronized (this.f34953a) {
            try {
                d dVarC = c(uVar);
                if (dVarC == null) {
                    return false;
                }
                Iterator it = ((Set) this.f34955c.get(dVarC)).iterator();
                while (it.hasNext()) {
                    b bVar = (b) this.f34954b.get((a) it.next());
                    bVar.getClass();
                    if (!bVar.h().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(b bVar) {
        synchronized (this.f34953a) {
            try {
                u uVarE = bVar.e();
                a aVar = new a(System.identityHashCode(uVarE), bVar.f34946d.f27724e);
                d dVarC = c(uVarE);
                Set hashSet = dVarC != null ? (Set) this.f34955c.get(dVarC) : new HashSet();
                hashSet.add(aVar);
                this.f34954b.put(aVar, bVar);
                if (dVarC == null) {
                    d dVar = new d(uVarE, this);
                    this.f34955c.put(dVar, hashSet);
                    uVarE.getLifecycle().a(dVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g(u uVar) {
        synchronized (this.f34953a) {
            try {
                if (e(uVar)) {
                    if (this.f34956d.isEmpty()) {
                        this.f34956d.push(uVar);
                    } else {
                        y.a aVar = this.f34957e;
                        if (aVar == null || aVar.b() != 2) {
                            u uVar2 = (u) this.f34956d.peek();
                            if (!uVar.equals(uVar2)) {
                                i(uVar2);
                                this.f34956d.remove(uVar);
                                this.f34956d.push(uVar);
                            }
                        }
                    }
                    n(uVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(u uVar) {
        synchronized (this.f34953a) {
            try {
                this.f34956d.remove(uVar);
                i(uVar);
                if (!this.f34956d.isEmpty()) {
                    n((u) this.f34956d.peek());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(u uVar) {
        synchronized (this.f34953a) {
            try {
                d dVarC = c(uVar);
                if (dVarC == null) {
                    return;
                }
                Iterator it = ((Set) this.f34955c.get(dVarC)).iterator();
                while (it.hasNext()) {
                    b bVar = (b) this.f34954b.get((a) it.next());
                    bVar.getClass();
                    bVar.s();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j(u1 u1Var, HashSet hashSet) {
        Set<a> setKeySet = hashSet;
        synchronized (this.f34953a) {
            if (hashSet == null) {
                try {
                    setKeySet = this.f34954b.keySet();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (a aVar : setKeySet) {
                if (this.f34954b.containsKey(aVar)) {
                    b bVar = (b) this.f34954b.get(aVar);
                    boolean zIsEmpty = bVar.h().isEmpty();
                    bVar.t(u1Var);
                    if (!zIsEmpty && bVar.h().isEmpty()) {
                        h(bVar.e());
                    }
                } else {
                    com.google.android.gms.internal.auth.g.O("LifecycleCameraRepository", "Attempt to unbind use cases from an invalid camera.");
                }
            }
        }
    }

    public final void k(HashSet hashSet) {
        Set setKeySet = hashSet;
        synchronized (this.f34953a) {
            if (hashSet == null) {
                try {
                    setKeySet = this.f34954b.keySet();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                b bVar = (b) this.f34954b.get((a) it.next());
                if (bVar != null) {
                    bVar.u();
                    h(bVar.e());
                }
            }
        }
    }

    public final void l(b bVar) {
        synchronized (this.f34953a) {
            try {
                u uVarE = bVar.e();
                a aVar = new a(System.identityHashCode(uVarE), bVar.f34946d.f27724e);
                this.f34954b.remove(aVar);
                HashSet hashSet = new HashSet();
                for (d dVar : this.f34955c.keySet()) {
                    if (uVarE.equals(dVar.f34950c)) {
                        Set set = (Set) this.f34955c.get(dVar);
                        set.remove(aVar);
                        if (set.isEmpty()) {
                            hashSet.add(dVar.f34950c);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m((u) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(u uVar) {
        synchronized (this.f34953a) {
            try {
                d dVarC = c(uVar);
                if (dVarC == null) {
                    return;
                }
                h(uVar);
                Iterator it = ((Set) this.f34955c.get(dVarC)).iterator();
                while (it.hasNext()) {
                    this.f34954b.remove((a) it.next());
                }
                this.f34955c.remove(dVarC);
                dVarC.f34950c.getLifecycle().b(dVarC);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(u uVar) {
        synchronized (this.f34953a) {
            try {
                Iterator it = ((Set) this.f34955c.get(c(uVar))).iterator();
                while (it.hasNext()) {
                    b bVar = (b) this.f34954b.get((a) it.next());
                    bVar.getClass();
                    if (!bVar.h().isEmpty()) {
                        bVar.v();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

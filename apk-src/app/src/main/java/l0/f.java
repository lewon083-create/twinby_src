package l0;

import a0.a2;
import a0.g0;
import a0.n;
import a0.q2;
import a0.t0;
import a0.v;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import com.google.android.gms.internal.ads.om1;
import g0.a3;
import g0.c0;
import g0.d0;
import g0.f0;
import g0.h2;
import g0.i1;
import g0.q1;
import g0.u0;
import g0.u1;
import g0.v0;
import g0.v1;
import g0.w;
import g0.x2;
import g0.z2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0.d f27721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0.d f27722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a3 f27723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f27724e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y.a f27727h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w f27729k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q2 f27733o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public u0.d f27734p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g0 f27735q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g0 f27736r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h3.e f27738t;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f27725f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f27726g = new ArrayList();
    public List i = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Range f27728j = g0.n.f19676h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f27730l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f27731m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public v0 f27732n = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l6.i f27737s = new l6.i(8);

    public f(f0 f0Var, f0 f0Var2, g0.c cVar, g0.c cVar2, g0 g0Var, g0 g0Var2, y.a aVar, h3.e eVar, a3 a3Var) {
        this.f27729k = cVar.f19524c;
        this.f27721b = new g0.d(f0Var, cVar);
        if (f0Var2 == null || cVar2 == null) {
            this.f27722c = null;
        } else {
            this.f27722c = new g0.d(f0Var2, cVar2);
        }
        this.f27735q = g0Var;
        this.f27736r = g0Var2;
        this.f27727h = aVar;
        this.f27723d = a3Var;
        this.f27724e = a.a.g(cVar, cVar2);
        this.f27738t = eVar;
    }

    public static void B(HashMap map) {
        HashSet hashSet;
        for (Map.Entry entry : map.entrySet()) {
            q2 q2Var = (q2) entry.getKey();
            Set set = (Set) entry.getValue();
            if (set != null) {
                q2Var.getClass();
                hashSet = new HashSet(set);
            } else {
                hashSet = null;
            }
            q2Var.f208g = hashSet;
        }
    }

    public static ArrayList C(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((q2) it.next()).getClass();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw om1.i(it2);
            }
        }
        return arrayList2;
    }

    public static HashMap e(LinkedHashSet linkedHashSet, c0.c cVar) {
        HashMap map = new HashMap();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            q2 q2Var = (q2) it.next();
            map.put(q2Var, q2Var.f208g);
            HashSet hashSet = null;
            LinkedHashSet linkedHashSet2 = cVar != null ? cVar.f2179a : null;
            if (linkedHashSet2 != null) {
                hashSet = new HashSet(linkedHashSet2);
            }
            q2Var.f208g = hashSet;
        }
        return map;
    }

    public static Matrix s(Rect rect, Size size) {
        f2.g.a("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static HashMap v(ArrayList arrayList, a3 a3Var, a3 a3Var2, Range range) {
        x2 x2VarH;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q2 q2Var = (q2) it.next();
            if (q2Var instanceof u0.d) {
                u0.d dVar = (u0.d) q2Var;
                v1 v1Var = new v1(u1.u(new t0(2).f224b));
                i1.r(v1Var);
                a2 a2Var = new a2(v1Var);
                a2Var.f17r = a2.f15y;
                x2 x2VarH2 = a2Var.h(false, a3Var);
                if (x2VarH2 == null) {
                    x2VarH = null;
                } else {
                    q1 q1VarW = q1.w(x2VarH2);
                    q1VarW.z(k.J);
                    x2VarH = ((s.a) dVar.n(q1VarW)).b();
                }
            } else {
                x2VarH = q2Var.h(false, a3Var);
            }
            x2 x2VarH3 = q2Var.h(true, a3Var2);
            q1 q1VarW2 = x2VarH3 != null ? q1.w(x2VarH3) : q1.v();
            q1VarW2.y(x2.f19802x, 0);
            if (!g0.n.f19676h.equals(range)) {
                q1VarW2.x(x2.f19803y, u0.f19773c, range);
                q1VarW2.y(x2.f19804z, Boolean.TRUE);
            }
            x2 x2VarB = q2Var.n(q1VarW2).b();
            e eVar = new e();
            eVar.f27719a = x2VarH;
            eVar.f27720b = x2VarB;
            map.put(q2Var, eVar);
        }
        return map;
    }

    public static boolean z(q2 q2Var) {
        if (q2Var != null) {
            if (q2Var.f209h.h(x2.C)) {
                return q2Var.f209h.n() == z2.f19815e;
            }
            Log.e("CameraUseCaseAdapter", q2Var + " UseCase does not have capture type.");
        }
        return false;
    }

    public final void A(ArrayList arrayList) {
        synchronized (this.f27730l) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((q2) it.next()).f208g = null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f27725f);
            linkedHashSet.removeAll(arrayList);
            d(r(linkedHashSet, this.f27722c != null));
        }
    }

    @Override // a0.n
    public final c0 a() {
        return this.f27721b.f19536d;
    }

    @Override // a0.n
    public final d0 b() {
        return this.f27721b.f19535c;
    }

    public final void c(Collection collection, c0.c cVar) {
        com.google.android.gms.internal.auth.g.e("CameraUseCaseAdapter", "addUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + cVar);
        synchronized (this.f27730l) {
            try {
                g0.d dVar = this.f27721b;
                w wVar = this.f27729k;
                dVar.q(wVar);
                g0.d dVar2 = this.f27722c;
                if (dVar2 != null) {
                    dVar2.q(wVar);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f27725f);
                linkedHashSet.addAll(collection);
                HashMap mapE = e(linkedHashSet, cVar);
                try {
                    d(r(linkedHashSet, this.f27722c != null));
                } catch (IllegalArgumentException e3) {
                    B(mapE);
                    throw new d(e3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
    public final void d(b bVar) {
        ?? r02 = bVar.i.f27745a;
        ArrayList<q2> arrayList = bVar.f27710b;
        synchronized (this.f27730l) {
            try {
                for (q2 q2Var : arrayList) {
                    Rect rectH = this.f27721b.f19535c.f19556a.h();
                    g0.n nVar = (g0.n) r02.get(q2Var);
                    nVar.getClass();
                    q2Var.B(s(rectH, nVar.f19677a));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        List list = this.i;
        ArrayList arrayList2 = bVar.f27710b;
        LinkedHashSet linkedHashSet = bVar.f27709a;
        ArrayList arrayListC = C(arrayList2, list);
        ArrayList arrayList3 = new ArrayList(linkedHashSet);
        arrayList3.removeAll(arrayList2);
        ArrayList arrayListC2 = C(arrayList3, arrayListC);
        if (!arrayListC2.isEmpty()) {
            com.google.android.gms.internal.auth.g.O("CameraUseCaseAdapter", "Unused effects: " + arrayListC2);
        }
        Iterator it = bVar.f27713e.iterator();
        while (it.hasNext()) {
            ((q2) it.next()).E(this.f27721b);
        }
        this.f27721b.l(bVar.f27713e);
        if (this.f27722c != null) {
            for (q2 q2Var2 : bVar.f27713e) {
                g0.d dVar = this.f27722c;
                Objects.requireNonNull(dVar);
                q2Var2.E(dVar);
            }
            g0.d dVar2 = this.f27722c;
            Objects.requireNonNull(dVar2);
            dVar2.l(bVar.f27713e);
        }
        if (bVar.f27713e.isEmpty()) {
            for (q2 q2Var3 : bVar.f27712d) {
                ?? r22 = bVar.i.f27745a;
                if (r22.containsKey(q2Var3)) {
                    g0.n nVar2 = (g0.n) r22.get(q2Var3);
                    Objects.requireNonNull(nVar2);
                    v0 v0Var = nVar2.f19682f;
                    if (v0Var != null) {
                        h2 h2Var = q2Var3.f215o;
                        u1 u1Var = h2Var.f19589g.f19746b;
                        Objects.requireNonNull(v0Var);
                        if (v0Var.d().size() == h2Var.f19589g.f19746b.d().size()) {
                            for (g0.g gVar : v0Var.d()) {
                                if (!u1Var.L.containsKey(gVar) || !Objects.equals(u1Var.a(gVar), v0Var.a(gVar))) {
                                }
                            }
                        }
                        q2Var3.i = q2Var3.y(v0Var);
                        if (this.f27731m) {
                            this.f27721b.c(q2Var3);
                            g0.d dVar3 = this.f27722c;
                            if (dVar3 != null) {
                                dVar3.c(q2Var3);
                            }
                        }
                    }
                }
            }
        }
        for (q2 q2Var4 : bVar.f27711c) {
            e eVar = (e) bVar.f27716h.get(q2Var4);
            Objects.requireNonNull(eVar);
            g0.d dVar4 = this.f27722c;
            if (dVar4 != null) {
                q2Var4.b(this.f27721b, dVar4, eVar.f27719a, eVar.f27720b);
                g0.n nVar3 = (g0.n) bVar.i.f27745a.get(q2Var4);
                nVar3.getClass();
                j jVar = bVar.f27717j;
                jVar.getClass();
                q2Var4.i = q2Var4.z(nVar3, (g0.n) jVar.f27745a.get(q2Var4));
            } else {
                q2Var4.b(this.f27721b, null, eVar.f27719a, eVar.f27720b);
                g0.n nVar4 = (g0.n) bVar.i.f27745a.get(q2Var4);
                nVar4.getClass();
                q2Var4.i = q2Var4.z(nVar4, null);
            }
        }
        if (this.f27731m) {
            this.f27721b.k(bVar.f27711c);
            g0.d dVar5 = this.f27722c;
            if (dVar5 != null) {
                dVar5.k(bVar.f27711c);
            }
        }
        Iterator it2 = bVar.f27711c.iterator();
        while (it2.hasNext()) {
            ((q2) it2.next()).s();
        }
        this.f27725f.clear();
        this.f27725f.addAll(bVar.f27709a);
        this.f27726g.clear();
        this.f27726g.addAll(bVar.f27710b);
        this.f27733o = bVar.f27715g;
        this.f27734p = bVar.f27714f;
    }

    public final void h() {
        synchronized (this.f27730l) {
            try {
                if (!this.f27731m) {
                    if (!this.f27726g.isEmpty()) {
                        this.f27721b.q(this.f27729k);
                        g0.d dVar = this.f27722c;
                        if (dVar != null) {
                            dVar.q(this.f27729k);
                        }
                    }
                    this.f27721b.k(this.f27726g);
                    g0.d dVar2 = this.f27722c;
                    if (dVar2 != null) {
                        dVar2.k(this.f27726g);
                    }
                    synchronized (this.f27730l) {
                        try {
                            v0 v0Var = this.f27732n;
                            if (v0Var != null) {
                                this.f27721b.f19536d.h(v0Var);
                            }
                        } finally {
                        }
                    }
                    Iterator it = this.f27726g.iterator();
                    while (it.hasNext()) {
                        ((q2) it.next()).s();
                    }
                    this.f27731m = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x016b, code lost:
    
        if (r2 != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0171, code lost:
    
        return r(r25, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l0.b r(java.util.LinkedHashSet r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.f.r(java.util.LinkedHashSet, boolean):l0.b");
    }

    public final void t() {
        synchronized (this.f27730l) {
            try {
                if (this.f27731m) {
                    this.f27721b.l(new ArrayList(this.f27726g));
                    g0.d dVar = this.f27722c;
                    if (dVar != null) {
                        dVar.l(new ArrayList(this.f27726g));
                    }
                    synchronized (this.f27730l) {
                        g0.b bVar = this.f27721b.f19536d;
                        this.f27732n = bVar.f19520b.l();
                        bVar.o();
                    }
                    this.f27731m = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int u() {
        synchronized (this.f27730l) {
            try {
                return this.f27727h.b() == 2 ? 1 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final HashSet w(LinkedHashSet linkedHashSet, boolean z5) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.f27730l) {
            Iterator it = this.i.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
            i = z5 ? 3 : 0;
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            q2 q2Var = (q2) it2.next();
            f2.g.a("Only support one level of sharing for now.", !(q2Var instanceof u0.d));
            Iterator it3 = q2Var.m().iterator();
            while (true) {
                if (it3.hasNext()) {
                    int iIntValue = ((Integer) it3.next()).intValue();
                    if ((i & iIntValue) == iIntValue) {
                        hashSet.add(q2Var);
                        break;
                    }
                }
            }
        }
        return hashSet;
    }

    public final List x() {
        ArrayList arrayList;
        synchronized (this.f27730l) {
            arrayList = new ArrayList(this.f27725f);
        }
        return arrayList;
    }

    public final void y() {
        synchronized (this.f27730l) {
            this.f27729k.p();
        }
    }
}

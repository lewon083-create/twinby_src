package a6;

import d.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kk.q;
import kk.t;
import kotlin.collections.b0;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f456a = new t(h.f469b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kotlin.collections.l f459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kotlin.collections.l f460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f463h;
    public final LinkedHashSet i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f465k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f466l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f467m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f468n;

    public g() {
        t tVar = new t(new d());
        this.f457b = tVar;
        this.f458c = new q(tVar);
        this.f459d = new kotlin.collections.l();
        this.f460e = new kotlin.collections.l();
        this.i = new LinkedHashSet();
        this.f464j = new LinkedHashSet();
        this.f465k = new LinkedHashSet();
    }

    public final void a(c dispatcher, f input, int i) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.f454a != null) {
            throw new IllegalArgumentException(("Input '" + input + "' is already added to dispatcher " + input.f454a + '.').toString());
        }
        (i != 0 ? i != 1 ? this.i : this.f464j : this.f465k).add(input);
        input.f454a = dispatcher;
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        d history = (d) this.f458c.f27454b.F();
        Intrinsics.checkNotNullParameter(history, "history");
        Intrinsics.checkNotNullParameter(history, "history");
        input.b(i != 0 ? i != 1 ? this.f468n : this.f466l : this.f467m);
    }

    public final void b() {
        boolean z5;
        boolean z10;
        d history;
        kotlin.collections.l<r> lVar = this.f459d;
        if (lVar == null || !lVar.isEmpty()) {
            Iterator it = lVar.iterator();
            while (it.hasNext()) {
                if (((r) it.next()).f15472d) {
                    z5 = true;
                    break;
                }
            }
            z5 = false;
        } else {
            z5 = false;
        }
        kotlin.collections.l<r> lVar2 = this.f460e;
        if (lVar2 == null || !lVar2.isEmpty()) {
            Iterator it2 = lVar2.iterator();
            while (it2.hasNext()) {
                if (((r) it2.next()).f15472d) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        } else {
            z10 = false;
        }
        boolean z11 = z5 || z10;
        boolean z12 = this.f467m != z5;
        boolean z13 = this.f466l != z10;
        boolean z14 = this.f468n != z11;
        LinkedHashSet linkedHashSet = this.f465k;
        if (z12) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((f) it3.next()).b(z5);
            }
        }
        LinkedHashSet linkedHashSet2 = this.f464j;
        if (z13) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((f) it4.next()).b(z10);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z14) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((f) it5.next()).b(z11);
            }
        }
        this.f467m = z5;
        this.f466l = z10;
        this.f468n = z11;
        r rVarC = this.f461f;
        if (rVarC == null) {
            rVarC = c(0);
        }
        r rVarC2 = this.f461f;
        if (rVarC2 == null) {
            rVarC2 = c(0);
        }
        if (Intrinsics.a(rVarC2, rVarC)) {
            if (rVarC2 == null) {
                history = new d();
            } else {
                ArrayList backInfo = new ArrayList();
                for (r rVar : lVar) {
                    if (rVar.f15472d) {
                        rVar.f15470b.getClass();
                    }
                }
                for (r rVar2 : lVar2) {
                    if (rVar2.f15472d) {
                        rVar2.f15470b.getClass();
                    }
                }
                e currentInfo = rVarC2.f15469a;
                b0 forwardInfo = rVarC2.f15471c;
                Intrinsics.checkNotNullParameter(currentInfo, "currentInfo");
                Intrinsics.checkNotNullParameter(backInfo, "backInfo");
                Intrinsics.checkNotNullParameter(forwardInfo, "forwardInfo");
                jj.e eVarB = kotlin.collections.r.b();
                x.m(eVarB, backInfo);
                eVarB.add(currentInfo);
                x.m(eVarB, forwardInfo);
                history = new d(kotlin.collections.r.a(eVarB), backInfo.size());
            }
            t tVar = this.f457b;
            if (Intrinsics.a((d) tVar.F(), history)) {
                return;
            }
            tVar.H(null, history);
            Iterator it6 = linkedHashSet.iterator();
            while (it6.hasNext()) {
                ((f) it6.next()).getClass();
                Intrinsics.checkNotNullParameter(history, "history");
                Intrinsics.checkNotNullParameter(history, "history");
            }
            Iterator it7 = linkedHashSet2.iterator();
            while (it7.hasNext()) {
                ((f) it7.next()).getClass();
                Intrinsics.checkNotNullParameter(history, "history");
                Intrinsics.checkNotNullParameter(history, "history");
            }
            Iterator it8 = linkedHashSet3.iterator();
            while (it8.hasNext()) {
                ((f) it8.next()).getClass();
                Intrinsics.checkNotNullParameter(history, "history");
                Intrinsics.checkNotNullParameter(history, "history");
            }
        }
    }

    public final r c(int i) {
        Object next;
        Object next2;
        kotlin.collections.l lVar = this.f460e;
        kotlin.collections.l lVar2 = this.f459d;
        Object obj = null;
        if (i == -1) {
            Iterator it = lVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((r) next).f15472d) {
                    break;
                }
            }
            r rVar = (r) next;
            if (rVar != null) {
                return rVar;
            }
            Iterator it2 = lVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next3 = it2.next();
                if (((r) next3).f15472d) {
                    obj = next3;
                    break;
                }
            }
            return (r) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = lVar2.iterator();
            while (it3.hasNext()) {
                ((r) it3.next()).getClass();
            }
            Iterator it4 = lVar.iterator();
            while (it4.hasNext()) {
                ((r) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = lVar2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it5.next();
            if (((r) next2).f15472d) {
                break;
            }
        }
        r rVar2 = (r) next2;
        if (rVar2 != null) {
            return rVar2;
        }
        Iterator it6 = lVar.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next4 = it6.next();
            if (((r) next4).f15472d) {
                obj = next4;
                break;
            }
        }
        return (r) obj;
    }
}

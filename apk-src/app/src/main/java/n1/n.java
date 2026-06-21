package n1;

import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m1.d f29001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f29002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f29004e = new f(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29005f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f29006g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f29007h = new e(this);
    public final e i = new e(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f29008j = 1;

    public n(m1.d dVar) {
        this.f29001b = dVar;
    }

    public static void b(e eVar, e eVar2, int i) {
        eVar.f28986l.add(eVar2);
        eVar.f28981f = i;
        eVar2.f28985k.add(eVar);
    }

    public static e h(m1.c cVar) {
        m1.c cVar2 = cVar.f28447f;
        if (cVar2 == null) {
            return null;
        }
        m1.d dVar = cVar2.f28445d;
        int iM = z.m(cVar2.f28446e);
        if (iM == 1) {
            return dVar.f28456d.f29007h;
        }
        if (iM == 2) {
            return dVar.f28458e.f29007h;
        }
        if (iM == 3) {
            return dVar.f28456d.i;
        }
        if (iM == 4) {
            return dVar.f28458e.i;
        }
        if (iM != 5) {
            return null;
        }
        return dVar.f28458e.f28992k;
    }

    public static e i(m1.c cVar, int i) {
        m1.c cVar2 = cVar.f28447f;
        if (cVar2 == null) {
            return null;
        }
        m1.d dVar = cVar2.f28445d;
        n nVar = i == 0 ? dVar.f28456d : dVar.f28458e;
        int iM = z.m(cVar2.f28446e);
        if (iM == 1 || iM == 2) {
            return nVar.f29007h;
        }
        if (iM == 3 || iM == 4) {
            return nVar.i;
        }
        return null;
    }

    public final void c(e eVar, e eVar2, int i, f fVar) {
        eVar.f28986l.add(eVar2);
        eVar.f28986l.add(this.f29004e);
        eVar.f28983h = i;
        eVar.i = fVar;
        eVar2.f28985k.add(eVar);
        fVar.f28985k.add(eVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i10) {
        if (i10 == 0) {
            m1.d dVar = this.f29001b;
            int i11 = dVar.f28484v;
            int iMax = Math.max(dVar.f28483u, i);
            if (i11 > 0) {
                iMax = Math.min(i11, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            m1.d dVar2 = this.f29001b;
            int i12 = dVar2.f28487y;
            int iMax2 = Math.max(dVar2.f28486x, i);
            if (i12 > 0) {
                iMax2 = Math.min(i12, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        if (this.f29004e.f28984j) {
            return r0.f28982g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(m1.c r12, m1.c r13, int r14) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.n.l(m1.c, m1.c, int):void");
    }
}

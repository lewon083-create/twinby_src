package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f1495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f1496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f1497c;

    public u0(k1 k1Var, r rVar, a aVar) {
        this.f1496b = k1Var;
        rVar.getClass();
        this.f1497c = rVar;
        this.f1495a = aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final void a(Object obj, Object obj2) {
        d1.k(this.f1496b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final void b(Object obj, l0 l0Var) {
        this.f1497c.getClass();
        a0.u.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final void c(Object obj) {
        this.f1496b.getClass();
        j1 j1Var = ((z) obj).unknownFields;
        if (j1Var.f1431e) {
            j1Var.f1431e = false;
        }
        this.f1497c.getClass();
        a0.u.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final boolean d(Object obj) {
        this.f1497c.getClass();
        a0.u.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final int e(z zVar) {
        this.f1496b.getClass();
        j1 j1Var = zVar.unknownFields;
        int i = j1Var.f1430d;
        if (i != -1) {
            return i;
        }
        int iP = 0;
        for (int i10 = 0; i10 < j1Var.f1427a; i10++) {
            int i11 = j1Var.f1428b[i10] >>> 3;
            iP += n.P(3, (h) j1Var.f1429c[i10]) + n.S(i11) + n.R(2) + (n.R(1) * 2);
        }
        j1Var.f1430d = iP;
        return iP;
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final int f(z zVar) {
        this.f1496b.getClass();
        return zVar.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final boolean g(z zVar, z zVar2) {
        this.f1496b.getClass();
        return zVar.unknownFields.equals(zVar2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final void h(Object obj, l lVar, q qVar) {
        this.f1496b.getClass();
        k1.a(obj);
        this.f1497c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final z i() {
        a aVar = this.f1495a;
        return aVar instanceof z ? ((z) aVar).i() : ((x) ((z) aVar).c(5)).b();
    }
}

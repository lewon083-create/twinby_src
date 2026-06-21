package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qr implements o30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nr f42373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bv0 f42374b = new bv0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yr f42375c = yr.f45147a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o30 f42376d;

    public final rr a() {
        o30 o30Var = this.f42376d;
        return a(o30Var != null ? o30Var.createDataSource() : null, 1, -1000);
    }

    public final nr b() {
        return this.f42373a;
    }

    public final yr c() {
        return this.f42375c;
    }

    @Override // yads.o30
    public final p30 createDataSource() {
        o30 o30Var = this.f42376d;
        return a(o30Var != null ? o30Var.createDataSource() : null, 0, 0);
    }

    public final rr a(p30 p30Var, int i, int i10) {
        nr nrVar = this.f42373a;
        nrVar.getClass();
        pr prVar = p30Var == null ? null : new pr(nrVar);
        this.f42374b.getClass();
        return new rr(nrVar, p30Var, new dv0(), prVar, this.f42375c, i);
    }
}

package yads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gv0 implements ch3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f38888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j62 f38889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hv0 f38890c;

    public gv0(w5 w5Var, j62 j62Var, c62 c62Var, Iterator it, z30 z30Var) {
        this.f38888a = w5Var;
        this.f38889b = j62Var;
        this.f38890c = new hv0(w5Var, j62Var, c62Var, it, z30Var);
    }

    @Override // yads.ch3
    public final void a() {
        this.f38888a.a(v5.f43884p);
        this.f38889b.a();
        this.f38890c.a();
    }

    @Override // yads.ch3
    public final void b() {
        this.f38888a.a(v5.f43884p);
        this.f38889b.a();
        this.f38890c.f39343e.a(y30.f44899f);
    }

    @Override // yads.ch3
    public final void c() {
    }
}

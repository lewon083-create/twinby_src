package androidx.lifecycle;

import g0.o1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f1542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f1543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1544c = -1;

    public c0(d0 d0Var, o1 o1Var) {
        this.f1542a = d0Var;
        this.f1543b = o1Var;
    }

    @Override // androidx.lifecycle.e0
    public final void a(Object obj) {
        int i = this.f1544c;
        int i10 = this.f1542a.f1556g;
        if (i != i10) {
            this.f1544c = i10;
            this.f1543b.a(obj);
        }
    }
}

package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class me2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dw0 f40898a = new dw0();

    public final me2 a(int i) {
        this.f40898a.a(i);
        return this;
    }

    public final me2 a(ne2 ne2Var) {
        dw0 dw0Var = this.f40898a;
        ew0 ew0Var = ne2Var.f41243b;
        dw0Var.getClass();
        for (int i = 0; i < ew0Var.f38269a.size(); i++) {
            dw0Var.a(ew0Var.a(i));
        }
        return this;
    }

    public final me2 a(int... iArr) {
        dw0 dw0Var = this.f40898a;
        dw0Var.getClass();
        for (int i : iArr) {
            dw0Var.a(i);
        }
        return this;
    }

    public final me2 a(boolean z5, int i) {
        dw0 dw0Var = this.f40898a;
        if (z5) {
            dw0Var.a(i);
            return this;
        }
        dw0Var.getClass();
        return this;
    }

    public final ne2 a() {
        return new ne2(this.f40898a.a());
    }
}

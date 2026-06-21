package k6;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f27059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27060c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27061d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27062e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f27063f = null;

    public f(v7.f fVar) {
        this.f27059b = fVar;
    }

    @Override // k6.f0
    public final void a(int i, int i10) {
        b();
        this.f27059b.a(i, i10);
    }

    public final void b() {
        int i = this.f27060c;
        if (i == 0) {
            return;
        }
        f0 f0Var = this.f27059b;
        if (i == 1) {
            f0Var.c(this.f27061d, this.f27062e);
        } else if (i == 2) {
            f0Var.j(this.f27061d, this.f27062e);
        } else if (i == 3) {
            f0Var.l(this.f27061d, this.f27062e, this.f27063f);
        }
        this.f27063f = null;
        this.f27060c = 0;
    }

    @Override // k6.f0
    public final void c(int i, int i10) {
        int i11;
        if (this.f27060c == 1 && i >= (i11 = this.f27061d)) {
            int i12 = this.f27062e;
            if (i <= i11 + i12) {
                this.f27062e = i12 + i10;
                this.f27061d = Math.min(i, i11);
                return;
            }
        }
        b();
        this.f27061d = i;
        this.f27062e = i10;
        this.f27060c = 1;
    }

    @Override // k6.f0
    public final void j(int i, int i10) {
        int i11;
        if (this.f27060c == 2 && (i11 = this.f27061d) >= i && i11 <= i + i10) {
            this.f27062e += i10;
            this.f27061d = i;
        } else {
            b();
            this.f27061d = i;
            this.f27062e = i10;
            this.f27060c = 2;
        }
    }

    @Override // k6.f0
    public final void l(int i, int i10, Object obj) {
        int i11;
        int i12;
        int i13;
        if (this.f27060c == 3 && i <= (i12 = this.f27062e + (i11 = this.f27061d)) && (i13 = i + i10) >= i11 && this.f27063f == obj) {
            this.f27061d = Math.min(i, i11);
            this.f27062e = Math.max(i12, i13) - this.f27061d;
            return;
        }
        b();
        this.f27061d = i;
        this.f27062e = i10;
        this.f27063f = obj;
        this.f27060c = 3;
    }
}

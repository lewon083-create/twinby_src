package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r40 implements pj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eq0 f9696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xp0 f9697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u60 f9698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y60 f9699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bp0 f9700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e60 f9701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s70 f9702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a70 f9703h;
    public final q80 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r50 f9704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final de0 f9705k;

    public r40(sa saVar) {
        this.f9696a = (eq0) saVar.f10208a;
        this.f9697b = (xp0) saVar.f10209b;
        this.f9698c = (u60) saVar.f10210c;
        this.f9699d = (y60) saVar.f10211d;
        this.f9700e = (bp0) saVar.f10212e;
        this.f9701f = (e60) saVar.f10213f;
        this.f9702g = (s70) saVar.f10214g;
        this.f9703h = (a70) saVar.f10215h;
        this.i = (q80) saVar.i;
        this.f9704j = (r50) saVar.f10216j;
        this.f9705k = (de0) saVar.f10217k;
    }

    public void a() {
        this.f9699d.k();
        this.f9703h.H(this);
    }

    public final void b() {
        de0 de0Var;
        r51 r51Var = this.f9697b.C0;
        if (r51Var == null || r51Var.isEmpty() || (de0Var = this.f9705k) == null) {
            return;
        }
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.H8)).booleanValue() || r51Var.isEmpty()) {
            return;
        }
        v41 v41VarListIterator = r51Var.listIterator(0);
        while (v41VarListIterator.hasNext()) {
            ee0 ee0Var = (ee0) v41VarListIterator.next();
            int[] iArr = ee0Var.f4927b;
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 1) {
                    long j10 = ee0Var.f4926a;
                    p9.k.C.f31304k.getClass();
                    de0Var.a(1, j10, System.currentTimeMillis());
                    break;
                }
                i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final void p() {
        this.i.f();
    }
}

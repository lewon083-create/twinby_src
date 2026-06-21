package yads;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xi1 extends ry {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final mo f44717k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f44718l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u63 f44719m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s63 f44720n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public vi1 f44721o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ui1 f44722p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f44723q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f44724r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f44725s;

    public xi1(mo moVar, boolean z5) {
        boolean z10;
        this.f44717k = moVar;
        if (z5) {
            moVar.getClass();
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44718l = z10;
        this.f44719m = new u63();
        this.f44720n = new s63();
        moVar.getClass();
        this.f44721o = vi1.a(moVar.c());
    }

    @Override // yads.mo
    public final rm1 a(an1 an1Var, qe qeVar, long j10) {
        ui1 ui1Var = new ui1(an1Var, qeVar, j10);
        ui1Var.a(this.f44717k);
        if (this.f44724r) {
            ui1Var.a(an1Var.a(a(an1Var.f43366a)));
            return ui1Var;
        }
        this.f44722p = ui1Var;
        if (!this.f44723q) {
            this.f44723q = true;
            a((Object) null, this.f44717k);
        }
        return ui1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // yads.ry
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r13, yads.mo r14, yads.v63 r15) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.xi1.a(java.lang.Object, yads.mo, yads.v63):void");
    }

    @Override // yads.mo
    public final hm1 c() {
        return this.f44717k.c();
    }

    @Override // yads.ry, yads.mo
    public final void e() {
        this.f44724r = false;
        this.f44723q = false;
        super.e();
    }

    public final Object a(Object obj) {
        return (this.f44721o.f44059e == null || !obj.equals(vi1.f44057f)) ? obj : this.f44721o.f44059e;
    }

    @Override // yads.ry
    public final an1 a(Object obj, an1 an1Var) {
        Object obj2 = an1Var.f43366a;
        Object obj3 = this.f44721o.f44059e;
        if (obj3 != null && obj3.equals(obj2)) {
            obj2 = vi1.f44057f;
        }
        return an1Var.a(obj2);
    }

    @Override // yads.ry, yads.mo
    public final void d() {
    }

    @Override // yads.mo
    public final void a(u83 u83Var) {
        this.f42764j = u83Var;
        this.i = lb3.a((Handler.Callback) null);
        if (this.f44718l) {
            return;
        }
        this.f44723q = true;
        a((Object) null, this.f44717k);
    }

    @Override // yads.mo
    public final void a(rm1 rm1Var) {
        ((ui1) rm1Var).a();
        if (rm1Var == this.f44722p) {
            this.f44722p = null;
        }
    }

    public final void a(long j10) {
        ui1 ui1Var = this.f44722p;
        int iA = this.f44721o.a(ui1Var.f43675b.f43366a);
        if (iA == -1) {
            return;
        }
        long j11 = this.f44721o.a(iA, this.f44720n, false).f42826e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        ui1Var.f43681h = j10;
    }
}

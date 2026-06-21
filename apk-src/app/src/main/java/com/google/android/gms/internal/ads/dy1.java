package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dy1 extends tx1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final nx1 f4742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f4743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final nh f4744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final bh f4745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public by1 f4746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ay1 f4747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4748q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4749r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4750s;

    public dy1(nx1 nx1Var, boolean z5) {
        boolean z10;
        this.f4742k = nx1Var;
        if (z5) {
            nx1Var.e();
            z10 = true;
        } else {
            z10 = false;
        }
        this.f4743l = z10;
        this.f4744m = new nh();
        this.f4745n = new bh();
        nx1Var.d();
        this.f4746o = new by1(new cy1(nx1Var.f()), nh.f8296m, by1.f3965e);
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public final void a(n5 n5Var) {
        if (this.f4750s) {
            by1 by1Var = this.f4746o;
            this.f4746o = new by1(new pu1(this.f4746o.f11916b, n5Var), by1Var.f3966c, by1Var.f3967d);
        } else {
            this.f4746o = new by1(new cy1(n5Var), nh.f8296m, by1.f3965e);
        }
        this.f4742k.a(n5Var);
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public final void b(gy1 gy1Var) {
        ay1 ay1Var = (ay1) gy1Var;
        gy1 gy1Var2 = ay1Var.f3482f;
        if (gy1Var2 != null) {
            nx1 nx1Var = ay1Var.f3481e;
            nx1Var.getClass();
            nx1Var.b(gy1Var2);
        }
        if (gy1Var == this.f4747p) {
            this.f4747p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public final void d() {
        this.f4742k.d();
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public final void e() {
        this.f4742k.e();
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public final n5 f() {
        return this.f4742k.f();
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public final void h(em1 em1Var) {
        this.f10748j = em1Var;
        this.i = cq0.n();
        if (this.f4743l) {
            return;
        }
        this.f4748q = true;
        t(null, this.f4742k);
    }

    @Override // com.google.android.gms.internal.ads.tx1, com.google.android.gms.internal.ads.nx1
    public final void j() {
        this.f4749r = false;
        this.f4748q = false;
        super.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    @Override // com.google.android.gms.internal.ads.tx1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(java.lang.Object r10, com.google.android.gms.internal.ads.nx1 r11, com.google.android.gms.internal.ads.ci r12) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dy1.s(java.lang.Object, com.google.android.gms.internal.ads.nx1, com.google.android.gms.internal.ads.ci):void");
    }

    @Override // com.google.android.gms.internal.ads.tx1
    public final /* bridge */ /* synthetic */ void u(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.tx1
    public final hy1 v(Object obj, hy1 hy1Var) {
        Object obj2 = this.f4746o.f3967d;
        Object obj3 = hy1Var.f6299a;
        if (obj2 != null && obj2.equals(obj3)) {
            obj3 = by1.f3965e;
        }
        return hy1Var.a(obj3);
    }

    @Override // com.google.android.gms.internal.ads.tx1
    public final /* synthetic */ void w(long j10, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.nx1
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final ay1 c(hy1 hy1Var, i iVar, long j10) {
        ay1 ay1Var = new ay1(hy1Var, iVar, j10);
        ix.k0(ay1Var.f3481e == null);
        nx1 nx1Var = this.f4742k;
        ay1Var.f3481e = nx1Var;
        if (!this.f4749r) {
            this.f4747p = ay1Var;
            if (!this.f4748q) {
                this.f4748q = true;
                t(null, nx1Var);
            }
            return ay1Var;
        }
        Object obj = hy1Var.f6299a;
        if (this.f4746o.f3967d != null && obj.equals(by1.f3965e)) {
            obj = this.f4746o.f3967d;
        }
        ay1Var.o(hy1Var.a(obj));
        return ay1Var;
    }

    public final boolean y(long j10) {
        ay1 ay1Var = this.f4747p;
        int iE = this.f4746o.e(ay1Var.f3478b.f6299a);
        if (iE == -1) {
            return false;
        }
        by1 by1Var = this.f4746o;
        bh bhVar = this.f4745n;
        by1Var.d(iE, bhVar, false);
        long j11 = bhVar.f3787d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        ay1Var.f3484h = j10;
        return true;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f10499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f10504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10506h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f10507j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f10508k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f10509l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f10510m;

    public t6(int i) {
        switch (i) {
            case 1:
                this.i = new p6(1);
                this.f10510m = new h3.e(29);
                break;
            default:
                this.i = new p6(0);
                this.f10510m = new zd1(2, false);
                break;
        }
    }

    public void a(long j10) {
        this.f10501c = j10;
    }

    public abstract long b(m3.p pVar);

    public abstract boolean c(m3.p pVar, long j10, h3.e eVar);

    public void d(boolean z5) {
        if (z5) {
            this.f10510m = new h3.e(29);
            this.f10500b = 0L;
            this.f10502d = 0;
        } else {
            this.f10502d = 1;
        }
        this.f10499a = -1L;
        this.f10501c = 0L;
    }

    public void e(boolean z5) {
        int i;
        if (z5) {
            this.f10510m = new zd1(2, false);
            this.f10500b = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.f10502d = i;
        this.f10499a = -1L;
        this.f10501c = 0L;
    }

    public abstract long f(tk0 tk0Var);

    public abstract boolean g(tk0 tk0Var, long j10, zd1 zd1Var);

    public void h(long j10) {
        this.f10501c = j10;
    }
}

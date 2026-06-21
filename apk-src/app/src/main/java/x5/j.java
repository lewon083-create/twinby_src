package x5;

import com.google.android.gms.internal.ads.h9;
import com.google.android.gms.internal.ads.r9;
import com.google.android.gms.internal.ads.x8;
import q4.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f35855l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u7.f f35856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.p f35857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f35858c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f35859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h9 f35860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x8 f35861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f35862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f35863h;
    public a0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f35864j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f35865k;

    public j(u7.f fVar) {
        this.f35856a = fVar;
        i iVar = new i();
        iVar.f35854e = new byte[128];
        this.f35859d = iVar;
        this.f35865k = -9223372036854775807L;
        this.f35860e = new h9(178, 1);
        this.f35857b = new m3.p();
    }

    @Override // x5.f
    public final void a() {
        n3.n.a(this.f35858c);
        i iVar = this.f35859d;
        iVar.f35850a = false;
        iVar.f35852c = 0;
        iVar.f35851b = 0;
        x8 x8Var = this.f35861f;
        if (x8Var != null) {
            x8Var.f12066a = false;
            x8Var.f12067b = false;
            x8Var.f12068c = false;
            x8Var.f12069d = -1;
        }
        h9 h9Var = this.f35860e;
        if (h9Var != null) {
            h9Var.c();
        }
        this.f35862g = 0L;
        this.f35865k = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0232  */
    @Override // x5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(m3.p r20) {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.j.c(m3.p):void");
    }

    @Override // x5.f
    public final void e(q4.m mVar, r9 r9Var) {
        r9Var.a();
        r9Var.b();
        this.f35863h = (String) r9Var.f9764e;
        r9Var.b();
        a0 a0VarP = mVar.P(r9Var.f9763d, 2);
        this.i = a0VarP;
        this.f35861f = new x8(a0VarP);
        this.f35856a.e(mVar, r9Var);
    }

    @Override // x5.f
    public final void f(boolean z5) {
        this.f35861f.getClass();
        if (z5) {
            this.f35861f.b(0, this.f35862g, this.f35864j);
            x8 x8Var = this.f35861f;
            x8Var.f12066a = false;
            x8Var.f12067b = false;
            x8Var.f12068c = false;
            x8Var.f12069d = -1;
        }
    }

    @Override // x5.f
    public final void i(int i, long j10) {
        this.f35865k = j10;
    }
}

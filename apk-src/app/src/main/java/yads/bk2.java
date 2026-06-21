package yads;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bk2 implements dg1, m21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f37075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u33 f37076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cr f37077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qq0 f37078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vy f37079e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f37081g;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u30 f37083j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public os2 f37084k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f37085l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ gk2 f37086m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ig2 f37080f = new ig2();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f37082h = true;

    public bk2(gk2 gk2Var, Uri uri, p30 p30Var, cr crVar, qq0 qq0Var, vy vyVar) {
        this.f37086m = gk2Var;
        this.f37075a = uri;
        this.f37076b = new u33(p30Var);
        this.f37077c = crVar;
        this.f37078d = qq0Var;
        this.f37079e = vyVar;
        xf1.a();
        this.f37083j = a(0L);
    }

    public final u30 a(long j10) {
        Uri uri = this.f37075a;
        String str = this.f37086m.f38794j;
        Map map = gk2.N;
        ni.a(uri, "The uri must be set.");
        return new u30(uri, 0L, 1, null, map, j10, -1L, str, 6, null);
    }

    @Override // yads.dg1
    public final void b() {
        this.f37081g = true;
    }

    @Override // yads.dg1
    public final void a() {
        p30 n21Var;
        int i;
        int iA = 0;
        while (iA == 0 && !this.f37081g) {
            try {
                long j10 = this.f37080f.f39538a;
                u30 u30VarA = a(j10);
                this.f37083j = u30VarA;
                long jA = this.f37076b.a(u30VarA);
                if (jA != -1) {
                    jA += j10;
                    this.f37086m.h();
                }
                long j11 = jA;
                this.f37086m.f38803s = q21.a(this.f37076b.f43543a.getResponseHeaders());
                u33 u33Var = this.f37076b;
                q21 q21Var = this.f37086m.f38803s;
                if (q21Var == null || (i = q21Var.f42146g) == -1) {
                    n21Var = u33Var;
                } else {
                    n21Var = new n21(u33Var, i, this);
                    gk2 gk2Var = this.f37086m;
                    gk2Var.getClass();
                    os2 os2VarA = gk2Var.a(new ek2(true, 0));
                    this.f37084k = os2VarA;
                    os2VarA.a(gk2.O);
                }
                this.f37077c.a(n21Var, this.f37075a, this.f37076b.f43543a.getResponseHeaders(), j10, j11, this.f37078d);
                if (this.f37086m.f38803s != null) {
                    nq0 nq0Var = this.f37077c.f37479b;
                    if (nq0Var instanceof kv1) {
                        ((kv1) nq0Var).f40372q = true;
                    }
                }
                if (this.f37082h) {
                    cr crVar = this.f37077c;
                    long j12 = this.i;
                    nq0 nq0Var2 = crVar.f37479b;
                    nq0Var2.getClass();
                    nq0Var2.seek(j10, j12);
                    this.f37082h = false;
                }
                while (iA == 0 && !this.f37081g) {
                    try {
                        this.f37079e.a();
                        cr crVar2 = this.f37077c;
                        ig2 ig2Var = this.f37080f;
                        nq0 nq0Var3 = crVar2.f37479b;
                        nq0Var3.getClass();
                        ld0 ld0Var = crVar2.f37480c;
                        ld0Var.getClass();
                        iA = nq0Var3.a(ld0Var, ig2Var);
                        ld0 ld0Var2 = this.f37077c.f37480c;
                        long j13 = ld0Var2 != null ? ld0Var2.f40505d : -1L;
                        if (j13 > this.f37086m.f38795k + j10) {
                            vy vyVar = this.f37079e;
                            synchronized (vyVar) {
                                vyVar.f44222a = false;
                            }
                            gk2 gk2Var2 = this.f37086m;
                            gk2Var2.f38801q.post(gk2Var2.f38800p);
                            j10 = j13;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iA == 1) {
                    iA = 0;
                } else {
                    ld0 ld0Var3 = this.f37077c.f37480c;
                    if ((ld0Var3 != null ? ld0Var3.f40505d : -1L) != -1) {
                        this.f37080f.f39538a = ld0Var3 != null ? ld0Var3.f40505d : -1L;
                    }
                }
                s30.a(this.f37076b);
            } catch (Throwable th2) {
                if (iA != 1) {
                    ld0 ld0Var4 = this.f37077c.f37480c;
                    if ((ld0Var4 != null ? ld0Var4.f40505d : -1L) != -1) {
                        this.f37080f.f39538a = ld0Var4 != null ? ld0Var4.f40505d : -1L;
                    }
                }
                s30.a(this.f37076b);
                throw th2;
            }
        }
    }
}

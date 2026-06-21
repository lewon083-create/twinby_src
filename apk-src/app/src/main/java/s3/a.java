package s3;

import com.google.android.gms.internal.measurement.h5;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32431c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a1 f32433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t3.j f32435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m3.t f32436h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i4.b1 f32437j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j3.o[] f32438k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f32439l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f32440m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f32442o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f32443p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i4.c0 f32445r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public l4.p f32446s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f32430b = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r3.b f32432d = new r3.b(2, false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f32441n = Long.MIN_VALUE;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public j3.o0 f32444q = j3.o0.f26348a;

    public a(int i) {
        this.f32431c = i;
    }

    public static int b(int i, int i10, int i11, int i12) {
        return i | i10 | i11 | 128 | i12;
    }

    public static boolean l(int i, boolean z5) {
        int i10 = i & 7;
        if (i10 != 4) {
            return z5 && i10 == 3;
        }
        return true;
    }

    public abstract int B(j3.o oVar);

    public int C() {
        return 0;
    }

    public boolean D(long j10) {
        return false;
    }

    public final i d(Exception exc, j3.o oVar, boolean z5, int i) {
        int iB;
        if (oVar == null || this.f32443p) {
            iB = 4;
        } else {
            this.f32443p = true;
            try {
                iB = B(oVar) & 7;
            } catch (i unused) {
                iB = 4;
            } finally {
                this.f32443p = false;
            }
        }
        return new i(1, exc, null, i, i(), this.f32434f, oVar, oVar == null ? 4 : iB, this.f32445r, z5);
    }

    public long g(long j10, long j11) {
        if (this.i == 1) {
            return (m() || k()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public i0 h() {
        return null;
    }

    public abstract String i();

    public final boolean j() {
        return this.f32441n == Long.MIN_VALUE;
    }

    public abstract boolean k();

    public abstract boolean m();

    public abstract void n();

    public abstract void p(long j10, boolean z5, boolean z10);

    public final int w(r3.b bVar, r3.e eVar, int i) {
        i4.b1 b1Var = this.f32437j;
        b1Var.getClass();
        int iD = b1Var.d(bVar, eVar, i);
        if (iD == -4) {
            if (eVar.c(4)) {
                this.f32441n = Long.MIN_VALUE;
                return this.f32442o ? -4 : -3;
            }
            long j10 = eVar.f32194h + this.f32439l;
            eVar.f32194h = j10;
            this.f32441n = Math.max(this.f32441n, j10);
            return iD;
        }
        if (iD == -5) {
            j3.o oVar = (j3.o) bVar.f32189d;
            oVar.getClass();
            long j11 = oVar.f26340s;
            if (j11 != Long.MAX_VALUE) {
                j3.n nVarA = oVar.a();
                nVarA.f26297r = j11 + this.f32439l;
                bVar.f32189d = new j3.o(nVarA);
            }
        }
        return iD;
    }

    public abstract void x(long j10, long j11);

    public final void y(j3.o[] oVarArr, i4.b1 b1Var, long j10, long j11, i4.c0 c0Var) {
        h5.r(!this.f32442o);
        this.f32437j = b1Var;
        this.f32445r = c0Var;
        if (this.f32441n == Long.MIN_VALUE) {
            this.f32441n = j10;
        }
        this.f32438k = oVarArr;
        this.f32439l = j11;
        u(oVarArr, j10, j11, c0Var);
    }

    public final void z(long j10, boolean z5, boolean z10) {
        this.f32442o = false;
        this.f32440m = j10;
        this.f32441n = j10;
        if (!z10) {
            i4.b1 b1Var = this.f32437j;
            b1Var.getClass();
            z10 = b1Var.h(j10 - this.f32439l) != 0;
        }
        p(j10, z5, z10);
    }

    public void f() {
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    public void v() {
    }

    public void A(float f10, float f11) {
    }

    @Override // s3.w0
    public void handleMessage(int i, Object obj) {
    }

    public void o(boolean z5, boolean z10) {
    }

    public void u(j3.o[] oVarArr, long j10, long j11, i4.c0 c0Var) {
    }
}

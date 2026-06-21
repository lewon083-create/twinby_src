package yads;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ro implements cf2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42644b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public on2 f42646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public af2 f42648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f42649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ps2 f42650h;
    public nx0[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f42651j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f42653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f42654m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ox0 f42645c = new ox0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f42652k = Long.MIN_VALUE;

    public ro(int i) {
        this.f42644b = i;
    }

    public static int a(int i) {
        return i & 128;
    }

    public static int b(int i) {
        return i & 64;
    }

    public abstract int a(nx0 nx0Var);

    public abstract void a(long j10, long j11);

    public abstract void a(long j10, boolean z5);

    public abstract void a(nx0[] nx0VarArr, long j10, long j11);

    public bk1 c() {
        return null;
    }

    public abstract String d();

    public final boolean e() {
        return this.f42652k == Long.MIN_VALUE;
    }

    public abstract boolean f();

    public abstract boolean g();

    public abstract void h();

    public int l() {
        return 0;
    }

    public static int a(int i, int i10, int i11) {
        return i | i10 | i11 | 128;
    }

    public final ro b() {
        return this;
    }

    public /* bridge */ /* synthetic */ void a(float f10, float f11) {
    }

    public void a(boolean z5) {
    }

    public final qn0 a(int i, nx0 nx0Var, Exception exc, boolean z5) {
        int iA;
        if (nx0Var == null || this.f42654m) {
            iA = 4;
        } else {
            this.f42654m = true;
            try {
                iA = a(nx0Var) & 7;
            } catch (qn0 unused) {
                iA = 4;
            } finally {
                this.f42654m = false;
            }
        }
        String strD = d();
        int i10 = this.f42647e;
        int i11 = nx0Var == null ? 4 : iA;
        return new qn0(qn0.a(1, null, strD, i10, nx0Var, i11), exc, i, 1, strD, i10, nx0Var, i11, null, SystemClock.elapsedRealtime(), z5);
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public final void a(int i, af2 af2Var) {
        this.f42647e = i;
        this.f42648f = af2Var;
    }

    public final int a(ox0 ox0Var, sa0 sa0Var, int i) {
        ps2 ps2Var = this.f42650h;
        ps2Var.getClass();
        int iA = ps2Var.a(ox0Var, sa0Var, i);
        if (iA == -4) {
            if (sa0Var.b(4)) {
                this.f42652k = Long.MIN_VALUE;
                return this.f42653l ? -4 : -3;
            }
            long j10 = sa0Var.f42866f + this.f42651j;
            sa0Var.f42866f = j10;
            this.f42652k = Math.max(this.f42652k, j10);
            return iA;
        }
        if (iA == -5) {
            nx0 nx0Var = ox0Var.f41759b;
            nx0Var.getClass();
            if (nx0Var.f41379q != Long.MAX_VALUE) {
                mx0 mx0Var = new mx0(nx0Var);
                mx0Var.f41079o = nx0Var.f41379q + this.f42651j;
                ox0Var.f41759b = new nx0(mx0Var);
            }
        }
        return iA;
    }

    @Override // yads.cf2
    public void handleMessage(int i, Object obj) {
    }
}

package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gw0 implements nq0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public qq0 f38907f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f38909h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f38910j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f38911k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f38912l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f38913m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f38914n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public kl f38915o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public xj3 f38916p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb2 f38902a = new lb2(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb2 f38903b = new lb2(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb2 f38904c = new lb2(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lb2 f38905d = new lb2();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ws2 f38906e = new ws2();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38908g = 1;

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.f38907f = qq0Var;
    }

    @Override // yads.nq0
    public final void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f38908g = 1;
            this.f38909h = false;
        } else {
            this.f38908g = 3;
        }
        this.f38910j = 0;
    }

    public final lb2 a(ld0 ld0Var) throws EOFException, InterruptedIOException {
        int i = this.f38912l;
        lb2 lb2Var = this.f38905d;
        byte[] bArr = lb2Var.f40463a;
        if (i > bArr.length) {
            lb2Var.f40463a = new byte[Math.max(bArr.length * 2, i)];
            lb2Var.f40465c = 0;
            lb2Var.f40464b = 0;
        } else {
            lb2Var.e(0);
        }
        this.f38905d.d(this.f38912l);
        ld0Var.a(this.f38905d.f40463a, 0, this.f38912l, false);
        return this.f38905d;
    }

    @Override // yads.nq0
    public final void release() {
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00eb A[SYNTHETIC] */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.oq0 r17, yads.ig2 r18) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.gw0.a(yads.oq0, yads.ig2):int");
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        ld0 ld0Var = (ld0) oq0Var;
        ld0Var.b(this.f38902a.f40463a, 0, 3, false);
        this.f38902a.e(0);
        if (this.f38902a.o() != 4607062) {
            return false;
        }
        ld0Var.b(this.f38902a.f40463a, 0, 2, false);
        this.f38902a.e(0);
        if ((this.f38902a.r() & 250) != 0) {
            return false;
        }
        ld0Var.b(this.f38902a.f40463a, 0, 4, false);
        this.f38902a.e(0);
        int iB = this.f38902a.b();
        ld0Var.f40507f = 0;
        ld0Var.a(false, iB);
        ld0Var.b(this.f38902a.f40463a, 0, 4, false);
        this.f38902a.e(0);
        return this.f38902a.b() == 0;
    }

    public static /* synthetic */ nq0[] a() {
        return new nq0[]{new gw0()};
    }
}

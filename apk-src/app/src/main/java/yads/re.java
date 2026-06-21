package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class re implements nq0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f42561q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f42564t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f42568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f42571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f42572h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f42573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f42574k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public qq0 f42575l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p73 f42576m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public yw2 f42577n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f42578o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f42560p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f42562r = lb3.c("#!AMR\n");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f42563s = lb3.c("#!AMR-WB\n");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42566b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f42565a = new byte[1];
    public int i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f42561q = iArr;
        f42564t = iArr[8];
    }

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.f42575l = qq0Var;
        this.f42576m = qq0Var.a(0, 1);
        qq0Var.a();
    }

    @Override // yads.nq0
    public final void seek(long j10, long j11) {
        this.f42568d = 0L;
        this.f42569e = 0;
        this.f42570f = 0;
        if (j10 != 0) {
            yw2 yw2Var = this.f42577n;
            if (yw2Var instanceof gz) {
                gz gzVar = (gz) yw2Var;
                this.f42574k = gz.a(gzVar.f38951e, j10, gzVar.f38948b);
                return;
            }
        }
        this.f42574k = 0L;
    }

    public final int a(ld0 ld0Var) throws qb2 {
        boolean z5;
        ld0Var.f40507f = 0;
        ld0Var.b(this.f42565a, 0, 1, false);
        byte b2 = this.f42565a[0];
        if ((b2 & 131) > 0) {
            throw new qb2(og2.a("Invalid padding bits for frame header ", b2), null, true, 1);
        }
        int i = (b2 >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z5 = this.f42567c) && (i < 10 || i > 13)) || (!z5 && (i < 12 || i > 14)))) {
            return z5 ? f42561q[i] : f42560p[i];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f42567c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i);
        throw new qb2(sb2.toString(), null, true, 1);
    }

    @Override // yads.nq0
    public final void release() {
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.oq0 r20, yads.ig2 r21) throws yads.qb2 {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.re.a(yads.oq0, yads.ig2):int");
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        ld0 ld0Var = (ld0) oq0Var;
        byte[] bArr = f42562r;
        ld0Var.f40507f = 0;
        byte[] bArr2 = new byte[bArr.length];
        ld0Var.b(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f42567c = false;
            ld0Var.a(bArr.length);
            return true;
        }
        byte[] bArr3 = f42563s;
        ld0Var.f40507f = 0;
        byte[] bArr4 = new byte[bArr3.length];
        ld0Var.b(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f42567c = true;
        ld0Var.a(bArr3.length);
        return true;
    }

    public static nq0[] a() {
        return new nq0[]{new re()};
    }
}

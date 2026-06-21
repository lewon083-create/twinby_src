package yads;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kv1 implements nq0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final t21 f40356t = new zl.g0(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bl0 f40362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qq0 f40363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p73 f40364h;
    public p73 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40365j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public vs1 f40366k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f40368m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f40369n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f40370o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public cx2 f40371p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f40372q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f40373r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f40374s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40357a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb2 f40358b = new lb2(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qv1 f40359c = new qv1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final az0 f40360d = new az0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f40367l = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x21 f40361e = new x21();

    public kv1(int i) {
        bl0 bl0Var = new bl0();
        this.f40362f = bl0Var;
        this.i = bl0Var;
    }

    public static /* synthetic */ boolean a(int i, int i10, int i11, int i12, int i13) {
        if (i10 == 67 && i11 == 79 && i12 == 77 && (i13 == 77 || i == 2)) {
            return true;
        }
        if (i10 == 77 && i11 == 76 && i12 == 76) {
            return i13 == 84 || i == 2;
        }
        return false;
    }

    @Override // yads.nq0
    public final void seek(long j10, long j11) {
        this.f40365j = 0;
        this.f40367l = -9223372036854775807L;
        this.f40368m = 0L;
        this.f40370o = 0;
        this.f40374s = j11;
        cx2 cx2Var = this.f40371p;
        if (!(cx2Var instanceof l61) || ((l61) cx2Var).c(j11)) {
            return;
        }
        this.f40373r = true;
        this.i = this.f40362f;
    }

    public static long a(vs1 vs1Var) {
        if (vs1Var == null) {
            return -9223372036854775807L;
        }
        int length = vs1Var.f44117b.length;
        for (int i = 0; i < length; i++) {
            us1 us1Var = vs1Var.f44117b[i];
            if (us1Var instanceof b63) {
                b63 b63Var = (b63) us1Var;
                if (b63Var.f44259b.equals("TLEN")) {
                    return lb3.a(Long.parseLong(b63Var.f36946d));
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.f40363g = qq0Var;
        p73 p73VarA = qq0Var.a(0, 1);
        this.f40364h = p73VarA;
        this.i = p73VarA;
        this.f40363g.a();
    }

    public final boolean a(ld0 ld0Var) {
        cx2 cx2Var = this.f40371p;
        if (cx2Var != null) {
            long jA = cx2Var.a();
            if (jA != -1 && ld0Var.f40505d + ((long) ld0Var.f40507f) > jA - 4) {
                return true;
            }
        }
        try {
            return !ld0Var.b(this.f40358b.f40463a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // yads.nq0
    public final void release() {
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.oq0 r43, yads.ig2 r44) throws yads.qb2 {
        /*
            Method dump skipped, instruction units count: 1184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.kv1.a(yads.oq0, yads.ig2):int");
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        return a((ld0) oq0Var, true);
    }

    public final boolean a(ld0 ld0Var, boolean z5) throws qb2, EOFException {
        int i;
        int i10;
        int iA;
        int i11 = z5 ? 32768 : 131072;
        ld0Var.f40507f = 0;
        if (ld0Var.f40505d == 0) {
            vs1 vs1VarA = this.f40361e.a(ld0Var, (this.f40357a & 8) == 0 ? null : f40356t);
            this.f40366k = vs1VarA;
            if (vs1VarA != null) {
                this.f40360d.a(vs1VarA);
            }
            i = (int) (ld0Var.f40505d + ((long) ld0Var.f40507f));
            if (!z5) {
                ld0Var.a(i);
            }
            i10 = 0;
        } else {
            i = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (!a(ld0Var)) {
                this.f40358b.e(0);
                int iB = this.f40358b.b();
                if ((i10 == 0 || ((-128000) & iB) == (((long) i10) & (-128000))) && (iA = rv1.a(iB)) != -1) {
                    i12++;
                    if (i12 != 1) {
                        if (i12 == 4) {
                            break;
                        }
                    } else {
                        this.f40359c.a(iB);
                        i10 = iB;
                    }
                    ld0Var.a(false, iA - 4);
                } else {
                    int i14 = i13 + 1;
                    if (i13 == i11) {
                        if (z5) {
                            return false;
                        }
                        throw new qb2("Searched too many bytes.", null, true, 1);
                    }
                    if (z5) {
                        ld0Var.f40507f = 0;
                        ld0Var.a(false, i + i14);
                    } else {
                        ld0Var.a(1);
                    }
                    i12 = 0;
                    i13 = i14;
                    i10 = 0;
                }
            } else if (i12 <= 0) {
                throw new EOFException();
            }
        }
        if (z5) {
            ld0Var.a(i + i13);
        } else {
            ld0Var.f40507f = 0;
        }
        this.f40365j = i10;
        return true;
    }

    public static nq0[] a() {
        return new nq0[]{new kv1(0)};
    }
}

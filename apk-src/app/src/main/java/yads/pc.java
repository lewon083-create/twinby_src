package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pc implements nq0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lb2 f41876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kb2 f41877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public qq0 f41878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f41879g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f41881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f41882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f41883l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41873a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qc f41874b = new qc();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb2 f41875c = new lb2(2048);
    public int i = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f41880h = -1;

    public pc() {
        lb2 lb2Var = new lb2(10);
        this.f41876d = lb2Var;
        this.f41877e = new kb2(lb2Var.a());
    }

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.f41878f = qq0Var;
        this.f41874b.a(qq0Var, new o93(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, 0, 1));
        qq0Var.a();
    }

    @Override // yads.nq0
    public final void seek(long j10, long j11) {
        this.f41882k = false;
        this.f41874b.a();
        this.f41879g = j11;
    }

    public final int a(ld0 ld0Var) {
        int i = 0;
        while (true) {
            ld0Var.b(this.f41876d.f40463a, 0, 10, false);
            this.f41876d.e(0);
            if (this.f41876d.o() != 4801587) {
                break;
            }
            lb2 lb2Var = this.f41876d;
            lb2Var.e(lb2Var.f40464b + 3);
            int iL = this.f41876d.l();
            i += iL + 10;
            ld0Var.a(false, iL);
        }
        ld0Var.f40507f = 0;
        ld0Var.a(false, i);
        if (this.f41880h == -1) {
            this.f41880h = i;
        }
        return i;
    }

    @Override // yads.nq0
    public final void release() {
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0125  */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.oq0 r20, yads.ig2 r21) throws yads.qb2, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.pc.a(yads.oq0, yads.ig2):int");
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        ld0 ld0Var = (ld0) oq0Var;
        int iA = a(ld0Var);
        int i = iA;
        int i10 = 0;
        int i11 = 0;
        do {
            ld0Var.b(this.f41876d.f40463a, 0, 2, false);
            this.f41876d.e(0);
            if ((this.f41876d.r() & 65526) == 65520) {
                i10++;
                if (i10 >= 4 && i11 > 188) {
                    return true;
                }
                ld0Var.b(this.f41876d.f40463a, 0, 4, false);
                this.f41877e.b(14);
                int iA2 = this.f41877e.a(13);
                if (iA2 <= 6) {
                    i++;
                    ld0Var.f40507f = 0;
                    ld0Var.a(false, i);
                } else {
                    ld0Var.a(false, iA2 - 6);
                    i11 += iA2;
                }
            } else {
                i++;
                ld0Var.f40507f = 0;
                ld0Var.a(false, i);
            }
            i10 = 0;
            i11 = 0;
        } while (i - iA < 8192);
        return false;
    }

    public static nq0[] a() {
        return new nq0[]{new pc()};
    }
}

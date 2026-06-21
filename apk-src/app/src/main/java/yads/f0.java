package yads;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements nq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f38302a = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb2 f38303b = new lb2(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f38304c;

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        g0 g0Var = this.f38302a;
        g0Var.getClass();
        g0Var.f38588d = CommonUrlParts.Values.FALSE_INTEGER;
        g0Var.f38589e = qq0Var.a(0, 1);
        qq0Var.a();
        qq0Var.a(new xw2(-9223372036854775807L, 0L));
    }

    @Override // yads.nq0
    public final void seek(long j10, long j11) {
        this.f38304c = false;
        this.f38302a.a();
    }

    @Override // yads.nq0
    public final int a(oq0 oq0Var, ig2 ig2Var) throws EOFException, InterruptedIOException {
        int i = ((ld0) oq0Var).read(this.f38303b.f40463a, 0, 2786);
        if (i == -1) {
            return -1;
        }
        this.f38303b.e(0);
        this.f38303b.d(i);
        if (!this.f38304c) {
            this.f38302a.a(4, 0L);
            this.f38304c = true;
        }
        this.f38302a.a(this.f38303b);
        return 0;
    }

    @Override // yads.nq0
    public final void release() {
    }

    public static /* synthetic */ nq0[] a() {
        return new nq0[]{new f0()};
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        ld0 ld0Var;
        int iA;
        lb2 lb2Var = new lb2(10);
        int i = 0;
        while (true) {
            ld0Var = (ld0) oq0Var;
            ld0Var.b(lb2Var.f40463a, 0, 10, false);
            lb2Var.e(0);
            if (lb2Var.o() != 4801587) {
                break;
            }
            lb2Var.e(lb2Var.f40464b + 3);
            int iL = lb2Var.l();
            i += iL + 10;
            ld0Var.a(false, iL);
        }
        ld0Var.f40507f = 0;
        ld0Var.a(false, i);
        int i10 = 0;
        int i11 = i;
        while (true) {
            ld0Var.b(lb2Var.f40463a, 0, 6, false);
            lb2Var.e(0);
            if (lb2Var.r() != 2935) {
                ld0Var.f40507f = 0;
                i11++;
                if (i11 - i >= 8192) {
                    return false;
                }
                ld0Var.a(false, i11);
                i10 = 0;
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                byte[] bArr = lb2Var.f40463a;
                if (bArr.length < 6) {
                    iA = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iA = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b2 = bArr[4];
                    iA = h0.a((b2 & 192) >> 6, b2 & 63);
                }
                if (iA == -1) {
                    return false;
                }
                ld0Var.a(false, iA - 6);
            }
        }
    }
}

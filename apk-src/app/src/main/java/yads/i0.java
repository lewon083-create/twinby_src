package yads;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i0 implements nq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f39381a = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb2 f39382b = new lb2(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39383c;

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        j0 j0Var = this.f39381a;
        j0Var.getClass();
        j0Var.f39675d = CommonUrlParts.Values.FALSE_INTEGER;
        j0Var.f39676e = qq0Var.a(0, 1);
        qq0Var.a();
        qq0Var.a(new xw2(-9223372036854775807L, 0L));
    }

    @Override // yads.nq0
    public final void seek(long j10, long j11) {
        this.f39383c = false;
        this.f39381a.a();
    }

    @Override // yads.nq0
    public final int a(oq0 oq0Var, ig2 ig2Var) throws EOFException, InterruptedIOException {
        int i = ((ld0) oq0Var).read(this.f39382b.f40463a, 0, 16384);
        if (i == -1) {
            return -1;
        }
        this.f39382b.e(0);
        this.f39382b.d(i);
        if (!this.f39383c) {
            this.f39381a.a(4, 0L);
            this.f39383c = true;
        }
        this.f39381a.a(this.f39382b);
        return 0;
    }

    @Override // yads.nq0
    public final void release() {
    }

    public static /* synthetic */ nq0[] a() {
        return new nq0[]{new i0()};
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        ld0 ld0Var;
        int i;
        lb2 lb2Var = new lb2(10);
        int i10 = 0;
        while (true) {
            ld0Var = (ld0) oq0Var;
            ld0Var.b(lb2Var.f40463a, 0, 10, false);
            lb2Var.e(0);
            if (lb2Var.o() != 4801587) {
                break;
            }
            lb2Var.e(lb2Var.f40464b + 3);
            int iL = lb2Var.l();
            i10 += iL + 10;
            ld0Var.a(false, iL);
        }
        ld0Var.f40507f = 0;
        ld0Var.a(false, i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            int i13 = 7;
            ld0Var.b(lb2Var.f40463a, 0, 7, false);
            lb2Var.e(0);
            int iR = lb2Var.r();
            if (iR == 44096 || iR == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = lb2Var.f40463a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i14 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i14 == 65535) {
                        i14 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i13 = 4;
                    }
                    if (iR == 44097) {
                        i13 += 2;
                    }
                    i = i14 + i13;
                }
                if (i == -1) {
                    return false;
                }
                ld0Var.a(false, i - 7);
            } else {
                ld0Var.f40507f = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                ld0Var.a(false, i12);
                i11 = 0;
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n8 implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m8 f8234a = new m8(0, 1, null, "audio/ac4");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tk0 f8235b = new tk0(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8236c;

    static {
        int i = nz.G;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final boolean a(a2 a2Var) throws EOFException, InterruptedIOException {
        v1 v1Var;
        int i;
        tk0 tk0Var = new tk0(10);
        int i10 = 0;
        while (true) {
            v1Var = (v1) a2Var;
            v1Var.R(tk0Var.f10641a, 0, 10, false);
            tk0Var.E(0);
            if (tk0Var.O() != 4801587) {
                break;
            }
            tk0Var.G(3);
            int iG = tk0Var.g();
            i10 += iG + 10;
            v1Var.b(iG, false);
        }
        v1Var.f11181g = 0;
        v1Var.b(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            int i13 = 7;
            v1Var.R(tk0Var.f10641a, 0, 7, false);
            tk0Var.E(0);
            int iL = tk0Var.L();
            if (iL != 44096 && iL != 44097) {
                v1Var.f11181g = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    break;
                }
                v1Var.b(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = tk0Var.f10641a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i14 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i14 == 65535) {
                        i14 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i13 = 4;
                    }
                    if (iL == 44097) {
                        i13 += 2;
                    }
                    i = i14 + i13;
                }
                if (i == -1) {
                    break;
                }
                v1Var.b(i - 7, false);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void b(b2 b2Var) {
        this.f8234a.j(b2Var, new r9(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, 0, 1, 0));
        b2Var.u();
        b2Var.U(new f2(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void d(long j10, long j11) {
        this.f8236c = false;
        this.f8234a.h();
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final int e(a2 a2Var, e2 e2Var) throws EOFException, InterruptedIOException {
        tk0 tk0Var = this.f8235b;
        int iC = ((v1) a2Var).C(tk0Var.f10641a, 0, 16384);
        if (iC == -1) {
            return -1;
        }
        tk0Var.E(0);
        tk0Var.C(iC);
        boolean z5 = this.f8236c;
        m8 m8Var = this.f8234a;
        if (!z5) {
            m8Var.f7816o = 0L;
            this.f8236c = true;
        }
        m8Var.g(tk0Var);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void c() {
    }
}

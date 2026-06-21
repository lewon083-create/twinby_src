package com.google.android.gms.internal.ads;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l8 implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m8 f7417a = new m8(0, 0, null, "audio/ac3");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tk0 f7418b = new tk0(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7419c;

    static {
        int i = rs.H;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final boolean a(a2 a2Var) throws EOFException, InterruptedIOException {
        v1 v1Var;
        int iU;
        tk0 tk0Var = new tk0(10);
        int i = 0;
        while (true) {
            v1Var = (v1) a2Var;
            v1Var.R(tk0Var.f10641a, 0, 10, false);
            tk0Var.E(0);
            if (tk0Var.O() != 4801587) {
                break;
            }
            tk0Var.G(3);
            int iG = tk0Var.g();
            i += iG + 10;
            v1Var.b(iG, false);
        }
        v1Var.f11181g = 0;
        v1Var.b(i, false);
        int i10 = 0;
        int i11 = i;
        while (true) {
            v1Var.R(tk0Var.f10641a, 0, 6, false);
            tk0Var.E(0);
            if (tk0Var.L() != 2935) {
                v1Var.f11181g = 0;
                i11++;
                if (i11 - i >= 8192) {
                    break;
                }
                v1Var.b(i11, false);
                i10 = 0;
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                byte[] bArr = tk0Var.f10641a;
                if (bArr.length < 6) {
                    iU = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    int i12 = (((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1;
                    iU = i12 + i12;
                } else {
                    byte b2 = bArr[4];
                    iU = nz.u((b2 & 192) >> 6, b2 & 63);
                }
                if (iU == -1) {
                    break;
                }
                v1Var.b(iU - 6, false);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void b(b2 b2Var) {
        this.f7417a.j(b2Var, new r9(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, 0, 1, 0));
        b2Var.u();
        b2Var.U(new f2(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void d(long j10, long j11) {
        this.f7419c = false;
        this.f7417a.h();
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final int e(a2 a2Var, e2 e2Var) throws EOFException, InterruptedIOException {
        tk0 tk0Var = this.f7418b;
        int iC = ((v1) a2Var).C(tk0Var.f10641a, 0, 2786);
        if (iC == -1) {
            return -1;
        }
        tk0Var.E(0);
        tk0Var.C(iC);
        boolean z5 = this.f7419c;
        m8 m8Var = this.f7417a;
        if (!z5) {
            m8Var.f7816o = 0L;
            this.f7419c = true;
        }
        m8Var.g(tk0Var);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void c() {
    }
}

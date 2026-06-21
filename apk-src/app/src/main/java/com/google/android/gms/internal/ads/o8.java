package com.google.android.gms.internal.ads;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o8 implements z1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tk0 f8632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ik0 f8633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b2 f8634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f8635f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8637h;
    public boolean i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p8 f8630a = new p8(0, null, "audio/mp4a-latm", true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tk0 f8631b = new tk0(2048);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f8636g = -1;

    static {
        int i = c80.P;
    }

    public o8() {
        tk0 tk0Var = new tk0(10);
        this.f8632c = tk0Var;
        byte[] bArr = tk0Var.f10641a;
        this.f8633d = new ik0(bArr.length, bArr);
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final boolean a(a2 a2Var) throws EOFException, InterruptedIOException {
        tk0 tk0Var;
        v1 v1Var;
        int i = 0;
        while (true) {
            tk0Var = this.f8632c;
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
        if (this.f8636g == -1) {
            this.f8636g = i;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = i;
        do {
            v1Var.R(tk0Var.f10641a, 0, 2, false);
            tk0Var.E(0);
            if ((tk0Var.L() & 65526) == 65520) {
                i10++;
                if (i10 >= 4 && i11 > 188) {
                    return true;
                }
                v1Var.R(tk0Var.f10641a, 0, 4, false);
                ik0 ik0Var = this.f8633d;
                ik0Var.d(14);
                int iH = ik0Var.h(13);
                if (iH <= 6) {
                    i12++;
                    v1Var.f11181g = 0;
                    v1Var.b(i12, false);
                } else {
                    v1Var.b(iH - 6, false);
                    i11 += iH;
                }
            } else {
                i12++;
                v1Var.f11181g = 0;
                v1Var.b(i12, false);
            }
            i10 = 0;
            i11 = 0;
        } while (i12 - i < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void b(b2 b2Var) {
        this.f8634e = b2Var;
        this.f8630a.j(b2Var, new r9(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, 0, 1, 0));
        b2Var.u();
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void d(long j10, long j11) {
        this.f8637h = false;
        this.f8630a.h();
        this.f8635f = j11;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final int e(a2 a2Var, e2 e2Var) throws eb, EOFException, InterruptedIOException {
        this.f8634e.getClass();
        tk0 tk0Var = this.f8631b;
        int iC = ((v1) a2Var).C(tk0Var.f10641a, 0, 2048);
        if (!this.i) {
            this.f8634e.U(new f2(-9223372036854775807L, 0L));
            this.i = true;
        }
        if (iC == -1) {
            return -1;
        }
        tk0Var.E(0);
        tk0Var.C(iC);
        boolean z5 = this.f8637h;
        p8 p8Var = this.f8630a;
        if (!z5) {
            p8Var.f8975u = this.f8635f;
            this.f8637h = true;
        }
        p8Var.g(tk0Var);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void c() {
    }
}

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s6 extends t6 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f10181o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f10182p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10183n;

    public static boolean i(tk0 tk0Var, byte[] bArr) {
        if (tk0Var.B() < 8) {
            return false;
        }
        int i = tk0Var.f10642b;
        byte[] bArr2 = new byte[8];
        tk0Var.H(bArr2, 0, 8);
        tk0Var.E(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final void e(boolean z5) {
        super.e(z5);
        if (z5) {
            this.f10183n = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final long f(tk0 tk0Var) {
        byte[] bArr = tk0Var.f10641a;
        return (((long) this.f10503e) * pn1.F(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final boolean g(tk0 tk0Var, long j10, zd1 zd1Var) {
        if (i(tk0Var, f10181o)) {
            byte[] bArrCopyOf = Arrays.copyOf(tk0Var.f10641a, tk0Var.f10643c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListE = pn1.e(bArrCopyOf);
            if (((jx1) zd1Var.f12971c) == null) {
                ow1 ow1Var = new ow1();
                ow1Var.d("audio/ogg");
                ow1Var.e("audio/opus");
                ow1Var.D = i;
                ow1Var.E = 48000;
                ow1Var.f8835o = arrayListE;
                zd1Var.f12971c = new jx1(ow1Var);
                return true;
            }
        } else {
            if (!i(tk0Var, f10182p)) {
                ((jx1) zd1Var.f12971c).getClass();
                return false;
            }
            ((jx1) zd1Var.f12971c).getClass();
            if (!this.f10183n) {
                this.f10183n = true;
                tk0Var.G(8);
                f9 f9VarQ = rs.q(x41.w((String[]) rs.l(tk0Var, false, false).f7326c));
                if (f9VarQ != null) {
                    jx1 jx1Var = (jx1) zd1Var.f12971c;
                    jx1Var.getClass();
                    ow1 ow1Var2 = new ow1(jx1Var);
                    ow1Var2.f8830j = f9VarQ.b(((jx1) zd1Var.f12971c).f6973k);
                    zd1Var.f12971c = new jx1(ow1Var2);
                    return true;
                }
            }
        }
        return true;
    }
}

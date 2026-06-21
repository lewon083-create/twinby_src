package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w3 implements z1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b2 f11605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11608e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y3 f11610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a2 f11611h;
    public com.google.android.gms.ads.identifier.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b6 f11612j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tk0 f11604a = new tk0(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f11609f = -1;

    @Override // com.google.android.gms.internal.ads.z1
    public final boolean a(a2 a2Var) throws EOFException, InterruptedIOException {
        String strM;
        v1 v1Var = (v1) a2Var;
        tk0 tk0Var = this.f11604a;
        tk0Var.y(2);
        v1Var.R(tk0Var.f10641a, 0, 2, false);
        if (tk0Var.L() == 65496) {
            while (true) {
                tk0Var.y(2);
                v1Var.R(tk0Var.f10641a, 0, 2, false);
                int iL = tk0Var.L();
                this.f11607d = iL;
                if (iL == 65498) {
                    break;
                }
                tk0Var.y(2);
                v1Var.E(tk0Var.f10641a, 0, 2);
                int iL2 = tk0Var.L() - 2;
                if (iL2 < 0) {
                    break;
                }
                if (this.f11607d != 65505) {
                    v1Var.b(iL2, false);
                } else {
                    tk0Var.y(iL2);
                    v1Var.R(tk0Var.f10641a, 0, iL2, false);
                    if (Objects.equals(tk0Var.m(), "http://ns.adobe.com/xap/1.0/") && (strM = tk0Var.m()) != null) {
                        String[] strArr = nz.i;
                        for (int i = 0; i < 4; i++) {
                            if (strM.contains(String.valueOf(strArr[i]).concat("=\"1\""))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void b(b2 b2Var) {
        this.f11605b = b2Var;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f11606c = 0;
            this.f11612j = null;
        } else if (this.f11606c == 5) {
            b6 b6Var = this.f11612j;
            b6Var.getClass();
            b6Var.d(j10, j11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0185, code lost:
    
        r16 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x020d  */
    @Override // com.google.android.gms.internal.ads.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(com.google.android.gms.internal.ads.a2 r34, com.google.android.gms.internal.ads.e2 r35) throws com.google.android.gms.internal.ads.eb {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w3.e(com.google.android.gms.internal.ads.a2, com.google.android.gms.internal.ads.e2):int");
    }

    public final void f() {
        b2 b2Var = this.f11605b;
        b2Var.getClass();
        b2Var.u();
        this.f11605b.U(new f2(-9223372036854775807L, 0L));
        this.f11606c = 6;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void c() {
    }
}

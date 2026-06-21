package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q3 implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tk0 f9302a = new tk0(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tk0 f9303b = new tk0(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tk0 f9304c = new tk0(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tk0 f9305d = new tk0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r3 f9306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b2 f9307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9309h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9310j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9311k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9312l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f9313m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9314n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p3 f9315o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t3 f9316p;

    static {
        int i = c80.P;
    }

    public q3() {
        r3 r3Var = new r3(new y1());
        r3Var.f9688d = -9223372036854775807L;
        r3Var.f9689e = new long[0];
        r3Var.f9690f = new long[0];
        this.f9306e = r3Var;
        this.f9308g = 1;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final boolean a(a2 a2Var) throws EOFException, InterruptedIOException {
        tk0 tk0Var = this.f9302a;
        v1 v1Var = (v1) a2Var;
        v1Var.R(tk0Var.f10641a, 0, 3, false);
        tk0Var.E(0);
        if (tk0Var.O() == 4607062) {
            v1Var.R(tk0Var.f10641a, 0, 2, false);
            tk0Var.E(0);
            if ((tk0Var.L() & 250) == 0) {
                v1Var.R(tk0Var.f10641a, 0, 4, false);
                tk0Var.E(0);
                int iB = tk0Var.b();
                v1Var.f11181g = 0;
                v1Var.b(iB, false);
                v1Var.R(tk0Var.f10641a, 0, 4, false);
                tk0Var.E(0);
                if (tk0Var.b() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void b(b2 b2Var) {
        this.f9307f = b2Var;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f9308g = 1;
            this.f9309h = false;
        } else {
            this.f9308g = 3;
        }
        this.f9310j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x039f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0290  */
    @Override // com.google.android.gms.internal.ads.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(com.google.android.gms.internal.ads.a2 r32, com.google.android.gms.internal.ads.e2 r33) throws com.google.android.gms.internal.ads.eb, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 1125
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q3.e(com.google.android.gms.internal.ads.a2, com.google.android.gms.internal.ads.e2):int");
    }

    public final tk0 f(a2 a2Var) {
        int i = this.f9312l;
        tk0 tk0Var = this.f9305d;
        byte[] bArr = tk0Var.f10641a;
        if (i > bArr.length) {
            int length = bArr.length;
            tk0Var.z(0, new byte[Math.max(length + length, i)]);
        } else {
            tk0Var.E(0);
        }
        tk0Var.C(this.f9312l);
        a2Var.w(tk0Var.f10641a, 0, this.f9312l);
        return tk0Var;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void c() {
    }
}

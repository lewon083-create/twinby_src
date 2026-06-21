package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yy1 implements gz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ az1 f12800b;

    public yy1(az1 az1Var, int i) {
        this.f12800b = az1Var;
        this.f12799a = i;
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final int a(zd1 zd1Var, zq1 zq1Var, int i) {
        int i10;
        boolean z5;
        int i11;
        az1 az1Var = this.f12800b;
        int i12 = this.f12799a;
        if (az1Var.r()) {
            return -3;
        }
        az1Var.o(i12);
        fz1 fz1Var = az1Var.f3513t[i12];
        boolean z10 = az1Var.N;
        fz1Var.getClass();
        boolean z11 = (i & 2) != 0;
        a4.g gVar = fz1Var.f5528b;
        synchronized (fz1Var) {
            try {
                zq1Var.f13080g = false;
                int i13 = fz1Var.f5543r;
                i10 = -4;
                if (i13 != fz1Var.f5540o) {
                    jx1 jx1Var = ((ez1) fz1Var.f5529c.f(fz1Var.f5541p + i13)).f5153a;
                    if (!z11 && jx1Var == fz1Var.f5532f) {
                        int iJ = fz1Var.j(fz1Var.f5543r);
                        if (fz1Var.f5533g != null) {
                            int i14 = fz1Var.f5537l[iJ];
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (z5) {
                            int i15 = fz1Var.f5537l[iJ];
                            zq1Var.f7316c = i15;
                            if (fz1Var.f5543r == fz1Var.f5540o - 1 && (z10 || fz1Var.f5547v)) {
                                zq1Var.f7316c = 536870912 | i15;
                            }
                            zq1Var.f13081h = fz1Var.f5538m[iJ];
                            gVar.f431d = fz1Var.f5536k[iJ];
                            gVar.f430c = fz1Var.f5535j[iJ];
                            gVar.f432e = fz1Var.f5539n[iJ];
                            i11 = -4;
                        } else {
                            zq1Var.f13080g = true;
                            i11 = -3;
                        }
                    }
                    fz1Var.g(jx1Var, zd1Var);
                    i11 = -5;
                } else {
                    if (!z10 && !fz1Var.f5547v) {
                        jx1 jx1Var2 = fz1Var.f5550y;
                        if (jx1Var2 == null || (!z11 && jx1Var2 == fz1Var.f5532f)) {
                            i11 = -3;
                        }
                        fz1Var.g(jx1Var2, zd1Var);
                        i11 = -5;
                    }
                    zq1Var.f7316c = 4;
                    zq1Var.f13081h = Long.MIN_VALUE;
                    i11 = -4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 != -4) {
            i10 = i11;
        } else if (!zq1Var.q(4)) {
            int i16 = i & 1;
            if ((i & 4) == 0) {
                if (i16 != 0) {
                    dz1 dz1Var = fz1Var.f5527a;
                    dz1.d((m6) dz1Var.f4771e, zq1Var, gVar, (tk0) dz1Var.f4769c);
                } else {
                    dz1 dz1Var2 = fz1Var.f5527a;
                    dz1Var2.f4771e = dz1.d((m6) dz1Var2.f4771e, zq1Var, gVar, (tk0) dz1Var2.f4769c);
                    fz1Var.f5543r++;
                }
            } else if (i16 == 0) {
                fz1Var.f5543r++;
            }
        }
        if (i10 == -3) {
            az1Var.p(i12);
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final boolean j() {
        az1 az1Var = this.f12800b;
        return !az1Var.r() && az1Var.f3513t[this.f12799a].l(az1Var.N);
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final void l() throws IOException {
        IOException iOException;
        int i = this.f12799a;
        az1 az1Var = this.f12800b;
        nu0 nu0Var = az1Var.f3513t[i].f5533g;
        if (nu0Var != null) {
            throw ((tw1) nu0Var.f8456c);
        }
        int i10 = az1Var.D == 7 ? 6 : 3;
        oq0 oq0Var = az1Var.f3504k;
        IOException iOException2 = (IOException) oq0Var.f8764e;
        if (iOException2 != null) {
            throw iOException2;
        }
        q qVar = (q) oq0Var.f8763d;
        if (qVar != null && (iOException = qVar.f9246d) != null && qVar.f9247e > i10) {
            throw iOException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    @Override // com.google.android.gms.internal.ads.gz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m(long r14) {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.az1 r0 = r13.f12800b
            int r1 = r13.f12799a
            boolean r2 = r0.r()
            r3 = 0
            if (r2 == 0) goto Lc
            return r3
        Lc:
            r0.o(r1)
            com.google.android.gms.internal.ads.fz1[] r2 = r0.f3513t
            r4 = r2[r1]
            boolean r2 = r0.N
            monitor-enter(r4)
            int r5 = r4.f5543r     // Catch: java.lang.Throwable -> L4c
            r6 = r5
            int r5 = r4.j(r6)     // Catch: java.lang.Throwable -> L4c
            int r7 = r4.f5543r     // Catch: java.lang.Throwable -> L4c
            int r8 = r4.f5540o     // Catch: java.lang.Throwable -> L4c
            r10 = 1
            if (r7 == r8) goto L26
            r7 = r10
            goto L27
        L26:
            r7 = r3
        L27:
            if (r7 == 0) goto L4f
            long[] r7 = r4.f5538m     // Catch: java.lang.Throwable -> L4c
            r11 = r7[r5]     // Catch: java.lang.Throwable -> L4c
            int r7 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r7 >= 0) goto L32
            goto L4f
        L32:
            long r11 = r4.f5546u     // Catch: java.lang.Throwable -> L4c
            int r7 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r7 <= 0) goto L3e
            if (r2 != 0) goto L3b
            goto L3e
        L3b:
            int r8 = r8 - r6
            monitor-exit(r4)
            goto L51
        L3e:
            int r6 = r8 - r6
            r9 = 1
            r7 = r14
            int r8 = r4.h(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L4c
            r14 = -1
            monitor-exit(r4)
            if (r8 != r14) goto L51
        L4a:
            r8 = r3
            goto L51
        L4c:
            r0 = move-exception
            r14 = r0
            goto L73
        L4f:
            monitor-exit(r4)
            goto L4a
        L51:
            monitor-enter(r4)
            if (r8 < 0) goto L5c
            int r14 = r4.f5543r     // Catch: java.lang.Throwable -> L5e
            int r14 = r14 + r8
            int r15 = r4.f5540o     // Catch: java.lang.Throwable -> L5e
            if (r14 > r15) goto L5c
            goto L61
        L5c:
            r10 = r3
            goto L61
        L5e:
            r0 = move-exception
            r14 = r0
            goto L71
        L61:
            com.google.android.gms.internal.ads.ix.o(r10)     // Catch: java.lang.Throwable -> L5e
            int r14 = r4.f5543r     // Catch: java.lang.Throwable -> L5e
            int r14 = r14 + r8
            r4.f5543r = r14     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r4)
            if (r8 != 0) goto L70
            r0.p(r1)
            return r3
        L70:
            return r8
        L71:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5e
            throw r14
        L73:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4c
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yy1.m(long):int");
    }
}

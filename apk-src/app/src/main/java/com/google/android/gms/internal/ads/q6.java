package com.google.android.gms.internal.ads;

import java.io.EOFException;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f9354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f9355g;

    public q6(int i) {
        switch (i) {
            case 1:
                this.f9354f = new int[KotlinVersion.MAX_COMPONENT_VALUE];
                this.f9355g = new m3.p(KotlinVersion.MAX_COMPONENT_VALUE);
                break;
            default:
                this.f9354f = new int[KotlinVersion.MAX_COMPONENT_VALUE];
                this.f9355g = new tk0(KotlinVersion.MAX_COMPONENT_VALUE);
                break;
        }
    }

    public boolean a(q4.l lVar, boolean z5) throws j3.d0, EOFException {
        boolean zY;
        boolean zY2;
        this.f9349a = 0;
        this.f9350b = 0L;
        this.f9351c = 0;
        this.f9352d = 0;
        this.f9353e = 0;
        m3.p pVar = (m3.p) this.f9355g;
        pVar.J(27);
        try {
            zY = lVar.y(pVar.f28589a, 0, 27, z5);
        } catch (EOFException e3) {
            if (!z5) {
                throw e3;
            }
            zY = false;
        }
        if (zY && pVar.B() == 1332176723) {
            if (pVar.z() == 0) {
                this.f9349a = pVar.z();
                this.f9350b = pVar.p();
                pVar.q();
                pVar.q();
                pVar.q();
                int iZ = pVar.z();
                this.f9351c = iZ;
                this.f9352d = iZ + 27;
                pVar.J(iZ);
                try {
                    zY2 = lVar.y(pVar.f28589a, 0, this.f9351c, z5);
                } catch (EOFException e7) {
                    if (!z5) {
                        throw e7;
                    }
                    zY2 = false;
                }
                if (zY2) {
                    for (int i = 0; i < this.f9351c; i++) {
                        int iZ2 = pVar.z();
                        this.f9354f[i] = iZ2;
                        this.f9353e += iZ2;
                    }
                    return true;
                }
            } else if (!z5) {
                throw j3.d0.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r11 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (r10.getPosition() >= r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r10.F(1) == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(q4.l r10, long r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f9355g
            m3.p r0 = (m3.p) r0
            long r1 = r10.getPosition()
            long r3 = r10.z()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L14
            r1 = r3
            goto L15
        L14:
            r1 = r2
        L15:
            com.google.android.gms.internal.measurement.h5.h(r1)
            r1 = 4
            r0.J(r1)
        L1c:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L2d
            long r5 = r10.getPosition()
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L4d
        L2d:
            byte[] r5 = r0.f28589a
            boolean r5 = r10.y(r5, r2, r1, r3)     // Catch: java.io.EOFException -> L34
            goto L35
        L34:
            r5 = r2
        L35:
            if (r5 == 0) goto L4d
            r0.M(r2)
            long r4 = r0.B()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L49
            r10.L()
            return r3
        L49:
            r10.M(r3)
            goto L1c
        L4d:
            if (r4 == 0) goto L57
            long r0 = r10.getPosition()
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 >= 0) goto L5f
        L57:
            int r0 = r10.F(r3)
            r1 = -1
            if (r0 == r1) goto L5f
            goto L4d
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q6.b(q4.l, long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (r11 == (-1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r10.q() >= r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r10.g() != (-1)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(com.google.android.gms.internal.ads.a2 r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.q()
            long r2 = r10.p()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            com.google.android.gms.internal.ads.ix.o(r0)
            java.lang.Object r0 = r9.f9355g
            com.google.android.gms.internal.ads.tk0 r0 = (com.google.android.gms.internal.ads.tk0) r0
            r3 = 4
            r0.y(r3)
        L1c:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L2e
            long r5 = r10.q()
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 < 0) goto L2e
            goto L4e
        L2e:
            byte[] r5 = r0.f10641a
            boolean r5 = r10.R(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L35
            goto L36
        L35:
            r5 = r1
        L36:
            if (r5 == 0) goto L4e
            r0.E(r1)
            long r4 = r0.P()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L4a
            r10.e()
            return r2
        L4a:
            r10.t(r2)
            goto L1c
        L4e:
            if (r4 == 0) goto L58
            long r2 = r10.q()
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L5f
        L58:
            int r0 = r10.g()
            r2 = -1
            if (r0 != r2) goto L4e
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q6.c(com.google.android.gms.internal.ads.a2, long):boolean");
    }

    public boolean d(a2 a2Var, boolean z5) throws eb, EOFException {
        boolean zR;
        boolean zR2;
        this.f9349a = 0;
        this.f9350b = 0L;
        this.f9351c = 0;
        this.f9352d = 0;
        this.f9353e = 0;
        tk0 tk0Var = (tk0) this.f9355g;
        tk0Var.y(27);
        try {
            zR = a2Var.R(tk0Var.f10641a, 0, 27, z5);
        } catch (EOFException e3) {
            if (!z5) {
                throw e3;
            }
            zR = false;
        }
        if (zR && tk0Var.P() == 1332176723) {
            if (tk0Var.K() == 0) {
                this.f9349a = tk0Var.K();
                this.f9350b = tk0Var.e();
                tk0Var.a();
                tk0Var.a();
                tk0Var.a();
                int iK = tk0Var.K();
                this.f9351c = iK;
                this.f9352d = iK + 27;
                tk0Var.y(iK);
                try {
                    zR2 = a2Var.R(tk0Var.f10641a, 0, this.f9351c, z5);
                } catch (EOFException e7) {
                    if (!z5) {
                        throw e7;
                    }
                    zR2 = false;
                }
                if (zR2) {
                    for (int i = 0; i < this.f9351c; i++) {
                        int iK2 = tk0Var.K();
                        this.f9354f[i] = iK2;
                        this.f9353e += iK2;
                    }
                    return true;
                }
            } else if (!z5) {
                throw eb.b("unsupported bit stream revision");
            }
        }
        return false;
    }
}

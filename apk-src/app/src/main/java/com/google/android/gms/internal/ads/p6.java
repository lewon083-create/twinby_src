package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p6 implements p3.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f8936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f8937f;

    public p6(int i) {
        switch (i) {
            case 1:
                this.f8936e = new q6(1);
                this.f8937f = new m3.p(0, new byte[65025]);
                this.f8933b = -1;
                break;
            case 2:
                this.f8936e = new p3.x();
                this.f8933b = 8000;
                this.f8934c = 8000;
                break;
            default:
                this.f8936e = new q6(0);
                this.f8937f = new tk0(0, new byte[65025]);
                this.f8933b = -1;
                break;
        }
    }

    public int a(int i) {
        int i10;
        int i11 = 0;
        this.f8934c = 0;
        do {
            int i12 = this.f8934c;
            int i13 = i + i12;
            q6 q6Var = (q6) this.f8936e;
            if (i13 >= q6Var.f9351c) {
                break;
            }
            int[] iArr = q6Var.f9354f;
            this.f8934c = i12 + 1;
            i10 = iArr[i13];
            i11 += i10;
        } while (i10 == 255);
        return i11;
    }

    public boolean b(q4.l lVar) {
        int i;
        q6 q6Var = (q6) this.f8936e;
        m3.p pVar = (m3.p) this.f8937f;
        com.google.android.gms.internal.measurement.h5.r(lVar != null);
        if (this.f8935d) {
            this.f8935d = false;
            pVar.J(0);
        }
        while (!this.f8935d) {
            if (this.f8933b < 0) {
                if (q6Var.b(lVar, -1L) && q6Var.a(lVar, true)) {
                    int iA = q6Var.f9352d;
                    if ((q6Var.f9349a & 1) == 1 && pVar.f28591c == 0) {
                        iA += a(0);
                        i = this.f8934c;
                    } else {
                        i = 0;
                    }
                    try {
                        lVar.M(iA);
                        this.f8933b = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.f8933b);
            int i10 = this.f8933b + this.f8934c;
            if (iA2 > 0) {
                pVar.c(pVar.f28591c + iA2);
                try {
                    lVar.readFully(pVar.f28589a, pVar.f28591c, iA2);
                    pVar.L(pVar.f28591c + iA2);
                    this.f8935d = q6Var.f9354f[i10 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i10 == q6Var.f9351c) {
                i10 = -1;
            }
            this.f8933b = i10;
        }
        return true;
    }

    public boolean c(a2 a2Var) {
        int i;
        q6 q6Var = (q6) this.f8936e;
        tk0 tk0Var = (tk0) this.f8937f;
        if (this.f8935d) {
            this.f8935d = false;
            tk0Var.y(0);
        }
        while (true) {
            if (this.f8935d) {
                return true;
            }
            int i10 = this.f8933b;
            if (i10 < 0) {
                if (!q6Var.c(a2Var, -1L) || !q6Var.d(a2Var, true)) {
                    break;
                }
                int iD = q6Var.f9352d;
                if ((q6Var.f9349a & 1) == 1 && tk0Var.f10643c == 0) {
                    iD += d(0);
                    i = this.f8934c;
                } else {
                    i = 0;
                }
                try {
                    a2Var.t(iD);
                    this.f8933b = i;
                    i10 = i;
                } catch (EOFException unused) {
                }
            }
            int iD2 = d(i10);
            int i11 = this.f8933b + this.f8934c;
            if (iD2 > 0) {
                tk0Var.A(tk0Var.f10643c + iD2);
                try {
                    a2Var.w(tk0Var.f10641a, tk0Var.f10643c, iD2);
                    tk0Var.C(tk0Var.f10643c + iD2);
                    this.f8935d = q6Var.f9354f[i11 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i11 == q6Var.f9351c) {
                i11 = -1;
            }
            this.f8933b = i11;
        }
        return false;
    }

    @Override // p3.g
    public p3.h createDataSource() {
        return new p3.p((String) this.f8937f, this.f8933b, this.f8934c, this.f8935d, (p3.x) this.f8936e);
    }

    public int d(int i) {
        int i10;
        int i11 = 0;
        this.f8934c = 0;
        do {
            int i12 = this.f8934c;
            int i13 = i + i12;
            q6 q6Var = (q6) this.f8936e;
            if (i13 >= q6Var.f9351c) {
                break;
            }
            this.f8934c = i12 + 1;
            i10 = q6Var.f9354f[i13];
            i11 += i10;
        } while (i10 == 255);
        return i11;
    }
}

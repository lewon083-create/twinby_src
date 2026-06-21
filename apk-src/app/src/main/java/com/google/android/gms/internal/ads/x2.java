package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f11976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11982g;

    public x2(int i) {
        switch (i) {
            case 1:
                this.f11976a = new byte[10];
                break;
            default:
                this.f11976a = new byte[10];
                break;
        }
    }

    public void a(q4.a0 a0Var, q4.z zVar) {
        if (this.f11978c > 0) {
            a0Var.f(this.f11979d, this.f11980e, this.f11981f, this.f11982g, zVar);
            this.f11978c = 0;
        }
    }

    public void b(q4.a0 a0Var, long j10, int i, int i10, int i11, q4.z zVar) {
        com.google.android.gms.internal.measurement.h5.q("TrueHD chunk samples must be contiguous in the sample queue.", this.f11982g <= i10 + i11);
        if (this.f11977b) {
            int i12 = this.f11978c;
            int i13 = i12 + 1;
            this.f11978c = i13;
            if (i12 == 0) {
                this.f11979d = j10;
                this.f11980e = i;
                this.f11981f = 0;
            }
            this.f11981f += i10;
            this.f11982g = i11;
            if (i13 >= 16) {
                a(a0Var, zVar);
            }
        }
    }

    public void c(q4.l lVar) {
        if (this.f11977b) {
            return;
        }
        byte[] bArr = this.f11976a;
        lVar.V(bArr, 0, 10);
        lVar.L();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                i = 40 << ((bArr[((b2 & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.f11977b = true;
    }

    public void d(a2 a2Var) {
        if (this.f11977b) {
            return;
        }
        byte[] bArr = this.f11976a;
        a2Var.E(bArr, 0, 10);
        a2Var.e();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f11977b = true;
        }
    }

    public void e(w2 w2Var, long j10, int i, int i10, int i11, v2 v2Var) {
        ix.l0("TrueHD chunk samples must be contiguous in the sample queue.", this.f11982g <= i10 + i11);
        if (this.f11977b) {
            int i12 = this.f11978c;
            int i13 = i12 + 1;
            this.f11978c = i13;
            if (i12 == 0) {
                this.f11979d = j10;
                this.f11980e = i;
                this.f11981f = 0;
            }
            this.f11981f += i10;
            this.f11982g = i11;
            if (i13 >= 16) {
                f(w2Var, v2Var);
            }
        }
    }

    public void f(w2 w2Var, v2 v2Var) {
        if (this.f11978c > 0) {
            w2Var.c(this.f11979d, this.f11980e, this.f11981f, this.f11982g, v2Var);
            this.f11978c = 0;
        }
    }
}

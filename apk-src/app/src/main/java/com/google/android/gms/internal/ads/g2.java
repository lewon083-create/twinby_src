package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5611h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f5612j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f5613k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f5614l;

    public g2(int i, int i10, int i11, int i12, int i13, int i14, int i15, long j10, ut utVar, f9 f9Var) {
        this.f5604a = i;
        this.f5605b = i10;
        this.f5606c = i11;
        this.f5607d = i12;
        this.f5608e = i13;
        this.f5609f = g(i13);
        this.f5610g = i14;
        this.f5611h = i15;
        this.i = h(i15);
        this.f5612j = j10;
        this.f5613k = utVar;
        this.f5614l = f9Var;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public static int g(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public static int h(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public long b() {
        long j10 = this.f5612j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f5608e);
    }

    public j3.o c(byte[] bArr, j3.b0 b0Var) {
        bArr[4] = -128;
        int i = this.f5607d;
        if (i <= 0) {
            i = -1;
        }
        j3.b0 b0Var2 = (j3.b0) this.f5614l;
        if (b0Var2 != null) {
            b0Var = b0Var2.b(b0Var);
        }
        j3.n nVar = new j3.n();
        nVar.f26292m = j3.c0.n("audio/flac");
        nVar.f26293n = i;
        nVar.E = this.f5610g;
        nVar.F = this.f5608e;
        String str = m3.z.f28608a;
        nVar.G = m3.z.B(this.f5611h, ByteOrder.LITTLE_ENDIAN);
        nVar.f26295p = Collections.singletonList(bArr);
        nVar.f26290k = b0Var;
        return new j3.o(nVar);
    }

    public long e() {
        long j10 = this.f5612j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f5608e);
    }

    public jx1 f(byte[] bArr, f9 f9Var) {
        bArr[4] = -128;
        f9 f9Var2 = (f9) this.f5614l;
        if (f9Var2 != null) {
            f9Var = f9Var2.b(f9Var);
        }
        ow1 ow1Var = new ow1();
        ow1Var.e("audio/flac");
        int i = this.f5607d;
        if (i <= 0) {
            i = -1;
        }
        ow1Var.f8833m = i;
        ow1Var.D = this.f5610g;
        ow1Var.E = this.f5608e;
        ow1Var.F = cq0.y(this.f5611h, ByteOrder.LITTLE_ENDIAN);
        ow1Var.f8835o = Collections.singletonList(bArr);
        ow1Var.f8830j = f9Var;
        return new jx1(ow1Var);
    }

    public g2(byte[] bArr, int i, int i10) {
        switch (i10) {
            case 1:
                y2 y2Var = new y2(bArr.length, bArr);
                y2Var.q(i * 8);
                this.f5604a = y2Var.i(16);
                this.f5605b = y2Var.i(16);
                this.f5606c = y2Var.i(24);
                this.f5607d = y2Var.i(24);
                int i11 = y2Var.i(20);
                this.f5608e = i11;
                this.f5609f = d(i11);
                this.f5610g = y2Var.i(3) + 1;
                int i12 = y2Var.i(5) + 1;
                this.f5611h = i12;
                this.i = a(i12);
                this.f5612j = y2Var.k(36);
                this.f5613k = null;
                this.f5614l = null;
                break;
            default:
                ik0 ik0Var = new ik0(bArr.length, bArr);
                ik0Var.d(i * 8);
                this.f5604a = ik0Var.h(16);
                this.f5605b = ik0Var.h(16);
                this.f5606c = ik0Var.h(24);
                this.f5607d = ik0Var.h(24);
                int iH = ik0Var.h(20);
                this.f5608e = iH;
                this.f5609f = g(iH);
                this.f5610g = ik0Var.h(3) + 1;
                int iH2 = ik0Var.h(5) + 1;
                this.f5611h = iH2;
                this.i = h(iH2);
                this.f5612j = ik0Var.i(36);
                this.f5613k = null;
                this.f5614l = null;
                break;
        }
    }

    public g2(int i, int i10, int i11, int i12, int i13, int i14, int i15, long j10, l6.i iVar, j3.b0 b0Var) {
        this.f5604a = i;
        this.f5605b = i10;
        this.f5606c = i11;
        this.f5607d = i12;
        this.f5608e = i13;
        this.f5609f = d(i13);
        this.f5610g = i14;
        this.f5611h = i15;
        this.i = a(i15);
        this.f5612j = j10;
        this.f5613k = iVar;
        this.f5614l = b0Var;
    }
}

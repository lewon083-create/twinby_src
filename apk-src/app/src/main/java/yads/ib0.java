package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ib0 implements qe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f39482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pe[] f39486g;

    public ib0() {
        this(0);
    }

    public final synchronized pe a() {
        pe peVar;
        try {
            int i = this.f39484e + 1;
            this.f39484e = i;
            int i10 = this.f39485f;
            if (i10 > 0) {
                pe[] peVarArr = this.f39486g;
                int i11 = i10 - 1;
                this.f39485f = i11;
                peVar = peVarArr[i11];
                peVar.getClass();
                this.f39486g[this.f39485f] = null;
            } else {
                pe peVar2 = new pe(0, new byte[this.f39481b]);
                pe[] peVarArr2 = this.f39486g;
                if (i > peVarArr2.length) {
                    this.f39486g = (pe[]) Arrays.copyOf(peVarArr2, peVarArr2.length * 2);
                }
                peVar = peVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return peVar;
    }

    public final int b() {
        return this.f39481b;
    }

    public final synchronized void c() {
        try {
            int i = this.f39483d;
            int i10 = this.f39481b;
            int i11 = lb3.f40466a;
            int i12 = (((i + i10) - 1) / i10) - this.f39484e;
            int i13 = 0;
            int iMax = Math.max(0, i12);
            int i14 = this.f39485f;
            if (iMax >= i14) {
                return;
            }
            if (this.f39482c != null) {
                int i15 = i14 - 1;
                while (i13 <= i15) {
                    pe peVar = this.f39486g[i13];
                    peVar.getClass();
                    if (peVar.f41903a == this.f39482c) {
                        i13++;
                    } else {
                        pe peVar2 = this.f39486g[i15];
                        peVar2.getClass();
                        if (peVar2.f41903a != this.f39482c) {
                            i15--;
                        } else {
                            pe[] peVarArr = this.f39486g;
                            peVarArr[i13] = peVar2;
                            peVarArr[i15] = peVar;
                            i15--;
                            i13++;
                        }
                    }
                }
                iMax = Math.max(iMax, i13);
                if (iMax >= this.f39485f) {
                    return;
                }
            }
            Arrays.fill(this.f39486g, iMax, this.f39485f, (Object) null);
            this.f39485f = iMax;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public ib0(int i) {
        this.f39480a = true;
        this.f39481b = 65536;
        this.f39485f = 0;
        this.f39486g = new pe[100];
        this.f39482c = null;
    }

    public final synchronized void a(int i) {
        boolean z5 = i < this.f39483d;
        this.f39483d = i;
        if (z5) {
            c();
        }
    }
}

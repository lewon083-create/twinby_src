package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class f2 implements o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5181c;

    public /* synthetic */ f2(Object obj, long j10, int i) {
        this.f5179a = i;
        this.f5181c = obj;
        this.f5180b = j10;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final n2 b(long j10) {
        int i = this.f5179a;
        int i10 = 1;
        Object obj = this.f5181c;
        switch (i) {
            case 0:
                g2 g2Var = (g2) obj;
                ut utVar = (ut) g2Var.f5613k;
                utVar.getClass();
                String str = cq0.f4293a;
                long jMax = Math.max(0L, Math.min((((long) g2Var.f5608e) * j10) / 1000000, g2Var.f5612j - 1));
                long[] jArr = (long[]) utVar.f11061c;
                int iQ = cq0.q(jArr, jMax, false);
                long j11 = iQ == -1 ? 0L : jArr[iQ];
                long[] jArr2 = (long[]) utVar.f11062d;
                long j12 = iQ != -1 ? jArr2[iQ] : 0L;
                int i11 = g2Var.f5608e;
                long j13 = (j11 * 1000000) / ((long) i11);
                long j14 = this.f5180b;
                p2 p2Var = new p2(j13, j12 + j14);
                if (j13 == j10 || iQ == jArr.length - 1) {
                    return new n2(p2Var, p2Var);
                }
                int i12 = iQ + 1;
                return new n2(p2Var, new p2((jArr[i12] * 1000000) / ((long) i11), j14 + jArr2[i12]));
            case 1:
                return (n2) obj;
            default:
                d3 d3Var = (d3) obj;
                n2 n2VarA = d3Var.i[0].a(j10);
                while (true) {
                    g3[] g3VarArr = d3Var.i;
                    if (i10 >= g3VarArr.length) {
                        return n2VarA;
                    }
                    n2 n2VarA2 = g3VarArr[i10].a(j10);
                    if (n2VarA2.f8151a.f8888b < n2VarA.f8151a.f8888b) {
                        n2VarA = n2VarA2;
                    }
                    i10++;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final long h() {
        switch (this.f5179a) {
        }
        return this.f5180b;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final boolean j() {
        switch (this.f5179a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    public f2(long j10, long j11) {
        this.f5179a = 1;
        this.f5180b = j10;
        p2 p2Var = j11 == 0 ? p2.f8886c : new p2(0L, j11);
        this.f5181c = new n2(p2Var, p2Var);
    }
}

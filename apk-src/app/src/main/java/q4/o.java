package q4;

import com.google.android.gms.internal.ads.g2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class o implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f31753c;

    public /* synthetic */ o(Object obj, long j10, int i) {
        this.f31751a = i;
        this.f31753c = obj;
        this.f31752b = j10;
    }

    @Override // q4.t
    public final boolean a() {
        switch (this.f31751a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // q4.t
    public final s e(long j10) {
        switch (this.f31751a) {
            case 0:
                g2 g2Var = (g2) this.f31753c;
                ((l6.i) g2Var.f5613k).getClass();
                l6.i iVar = (l6.i) g2Var.f5613k;
                long[] jArr = (long[]) iVar.f27978c;
                long[] jArr2 = (long[]) iVar.f27979d;
                int iF = m3.z.f(jArr, m3.z.k((((long) g2Var.f5608e) * j10) / 1000000, 0L, g2Var.f5612j - 1), false);
                long j11 = iF == -1 ? 0L : jArr[iF];
                long j12 = iF != -1 ? jArr2[iF] : 0L;
                int i = g2Var.f5608e;
                long j13 = (j11 * 1000000) / ((long) i);
                long j14 = this.f31752b;
                u uVar = new u(j13, j12 + j14);
                if (j13 == j10 || iF == jArr.length - 1) {
                    return new s(uVar, uVar);
                }
                int i10 = iF + 1;
                return new s(uVar, new u((jArr[i10] * 1000000) / ((long) i), j14 + jArr2[i10]));
            case 1:
                return (s) this.f31753c;
            default:
                s4.b bVar = (s4.b) this.f31753c;
                s sVarB = bVar.i[0].b(j10);
                int i11 = 1;
                while (true) {
                    s4.e[] eVarArr = bVar.i;
                    if (i11 >= eVarArr.length) {
                        return sVarB;
                    }
                    s sVarB2 = eVarArr[i11].b(j10);
                    if (sVarB2.f31761a.f31765b < sVarB.f31761a.f31765b) {
                        sVarB = sVarB2;
                    }
                    i11++;
                }
                break;
        }
    }

    @Override // q4.t
    public final long g() {
        switch (this.f31751a) {
        }
        return this.f31752b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(long j10) {
        this(j10, 0L);
        this.f31751a = 1;
    }

    public o(long j10, long j11) {
        this.f31751a = 1;
        this.f31752b = j10;
        u uVar = j11 == 0 ? u.f31763c : new u(0L, j11);
        this.f31753c = new s(uVar, uVar);
    }
}

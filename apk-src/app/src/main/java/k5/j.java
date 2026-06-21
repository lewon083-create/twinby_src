package k5;

import q4.t;
import q4.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k[] f26952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26953c;

    public j(long j10, k[] kVarArr, int i) {
        this.f26951a = j10;
        this.f26952b = kVarArr;
        this.f26953c = i;
    }

    @Override // q4.t
    public final boolean a() {
        return true;
    }

    @Override // q4.t
    public final q4.s e(long j10) {
        long j11;
        long jMin;
        long j12;
        long j13;
        long j14;
        int iB;
        long j15 = j10;
        k[] kVarArr = this.f26952b;
        int length = kVarArr.length;
        u uVar = u.f31763c;
        if (length == 0) {
            return new q4.s(uVar, uVar);
        }
        int i = this.f26953c;
        int i10 = -1;
        if (i != -1) {
            s sVar = kVarArr[i].f26955b;
            int iA = sVar.a(j15);
            if (iA == -1) {
                iA = sVar.b(j15);
            }
            long[] jArr = sVar.f27012c;
            long[] jArr2 = sVar.f27015f;
            if (iA == -1) {
                return new q4.s(uVar, uVar);
            }
            long j16 = jArr2[iA];
            j11 = jArr[iA];
            if (j16 >= j15 || iA >= sVar.f27011b - 1 || (iB = sVar.b(j15)) == -1 || iB == iA) {
                j14 = -1;
                j12 = -9223372036854775807L;
            } else {
                j12 = jArr2[iB];
                j14 = jArr[iB];
            }
            jMin = j14;
            j15 = j16;
        } else {
            j11 = Long.MAX_VALUE;
            jMin = -1;
            j12 = -9223372036854775807L;
        }
        int i11 = 0;
        long jMin2 = j11;
        while (i11 < kVarArr.length) {
            if (i11 != i) {
                s sVar2 = kVarArr[i11].f26955b;
                long[] jArr3 = sVar2.f27012c;
                int iA2 = sVar2.a(j15);
                if (iA2 == i10) {
                    iA2 = sVar2.b(j15);
                }
                if (iA2 == i10) {
                    j13 = j12;
                } else {
                    j13 = j12;
                    jMin2 = Math.min(jArr3[iA2], jMin2);
                }
                if (j13 != -9223372036854775807L) {
                    long j17 = j13;
                    int iA3 = sVar2.a(j17);
                    if (iA3 == -1) {
                        iA3 = sVar2.b(j17);
                    }
                    if (iA3 == -1) {
                        j13 = j17;
                    } else {
                        j13 = j17;
                        jMin = Math.min(jArr3[iA3], jMin);
                    }
                }
            } else {
                j13 = j12;
            }
            i11++;
            j12 = j13;
            i10 = -1;
        }
        long j18 = j12;
        u uVar2 = new u(j15, jMin2);
        return j18 == -9223372036854775807L ? new q4.s(uVar2, uVar2) : new q4.s(uVar2, new u(j18, jMin));
    }

    @Override // q4.t
    public final long g() {
        return this.f26951a;
    }
}

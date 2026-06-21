package j5;

import m3.z;
import q4.s;
import q4.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f26562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f26563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26566e;

    public i(long[] jArr, long[] jArr2, long j10, long j11, long j12, int i) {
        this.f26562a = jArr;
        this.f26563b = jArr2;
        this.f26564c = j10;
        this.f26565d = j12;
        this.f26566e = i;
    }

    @Override // q4.t
    public final boolean a() {
        return true;
    }

    @Override // j5.h
    public final long b(long j10) {
        return this.f26562a[z.f(this.f26563b, j10, true)];
    }

    @Override // j5.h
    public final long c() {
        return this.f26565d;
    }

    @Override // q4.t
    public final s e(long j10) {
        long[] jArr = this.f26562a;
        int iF = z.f(jArr, j10, true);
        long j11 = jArr[iF];
        long[] jArr2 = this.f26563b;
        u uVar = new u(j11, jArr2[iF]);
        if (j11 >= j10 || iF == jArr.length - 1) {
            return new s(uVar, uVar);
        }
        int i = iF + 1;
        return new s(uVar, new u(jArr[i], jArr2[i]));
    }

    @Override // j5.h
    public final int f() {
        return this.f26566e;
    }

    @Override // q4.t
    public final long g() {
        return this.f26564c;
    }
}

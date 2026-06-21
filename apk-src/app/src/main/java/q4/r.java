package q4;

import com.google.android.gms.internal.ads.lg0;
import com.google.android.gms.internal.measurement.h5;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg0 f31758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lg0 f31759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f31760c;

    public r(long j10, long[] jArr, long[] jArr2) {
        h5.h(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f31758a = new lg0(length, 1);
            this.f31759b = new lg0(length, 1);
        } else {
            int i = length + 1;
            lg0 lg0Var = new lg0(i, 1);
            this.f31758a = lg0Var;
            lg0 lg0Var2 = new lg0(i, 1);
            this.f31759b = lg0Var2;
            lg0Var.a(0L);
            lg0Var2.a(0L);
        }
        this.f31758a.b(jArr);
        this.f31759b.b(jArr2);
        this.f31760c = j10;
    }

    @Override // q4.t
    public final boolean a() {
        return this.f31759b.f7509a > 0;
    }

    @Override // q4.t
    public final s e(long j10) {
        lg0 lg0Var = this.f31759b;
        if (lg0Var.f7509a == 0) {
            u uVar = u.f31763c;
            return new s(uVar, uVar);
        }
        int iC = m3.z.c(lg0Var, j10);
        long jC = lg0Var.c(iC);
        lg0 lg0Var2 = this.f31758a;
        u uVar2 = new u(jC, lg0Var2.c(iC));
        if (jC == j10 || iC == lg0Var.f7509a - 1) {
            return new s(uVar2, uVar2);
        }
        int i = iC + 1;
        return new s(uVar2, new u(lg0Var.c(i), lg0Var2.c(i)));
    }

    @Override // q4.t
    public final long g() {
        return this.f31760c;
    }
}

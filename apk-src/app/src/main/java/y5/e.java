package y5;

import com.google.android.gms.internal.ads.x9;
import java.math.RoundingMode;
import m3.z;
import q4.s;
import q4.t;
import q4.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x9 f36480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f36482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f36483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f36484e;

    public e(x9 x9Var, int i, long j10, long j11) {
        this.f36480a = x9Var;
        this.f36481b = i;
        this.f36482c = j10;
        long j12 = (j11 - j10) / ((long) x9Var.f12081c);
        this.f36483d = j12;
        this.f36484e = h(j12);
    }

    @Override // q4.t
    public final boolean a() {
        return true;
    }

    @Override // q4.t
    public final s e(long j10) {
        x9 x9Var = this.f36480a;
        long j11 = (((long) x9Var.f12080b) * j10) / (((long) this.f36481b) * 1000000);
        long j12 = this.f36483d;
        long jK = z.k(j11, 0L, j12 - 1);
        long j13 = ((long) x9Var.f12081c) * jK;
        long j14 = this.f36482c;
        long jH = h(jK);
        u uVar = new u(jH, j13 + j14);
        if (jH >= j10 || jK == j12 - 1) {
            return new s(uVar, uVar);
        }
        long j15 = jK + 1;
        return new s(uVar, new u(h(j15), (((long) x9Var.f12081c) * j15) + j14));
    }

    @Override // q4.t
    public final long g() {
        return this.f36484e;
    }

    public final long h(long j10) {
        long j11 = j10 * ((long) this.f36481b);
        long j12 = this.f36480a.f12080b;
        String str = z.f28608a;
        return z.U(j11, 1000000L, j12, RoundingMode.DOWN);
    }
}

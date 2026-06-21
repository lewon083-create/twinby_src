package yads;

import android.util.Pair;
import com.yandex.varioqub.config.model.ConfigValue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nt1 implements cx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f41349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f41350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f41351c;

    public nt1(long j10, long[] jArr, long[] jArr2) {
        this.f41349a = jArr;
        this.f41350b = jArr2;
        this.f41351c = j10 == -9223372036854775807L ? lb3.a(jArr2[jArr2.length - 1]) : j10;
    }

    @Override // yads.cx2
    public final long a() {
        return -1L;
    }

    @Override // yads.yw2
    public final boolean b() {
        return true;
    }

    @Override // yads.yw2
    public final long c() {
        return this.f41351c;
    }

    @Override // yads.cx2
    public final long a(long j10) {
        return lb3.a(((Long) a(j10, this.f41349a, this.f41350b).second).longValue());
    }

    @Override // yads.yw2
    public final ww2 b(long j10) {
        long j11 = this.f41351c;
        int i = lb3.f40466a;
        Pair pairA = a(lb3.b(Math.max(0L, Math.min(j10, j11))), this.f41350b, this.f41349a);
        ax2 ax2Var = new ax2(lb3.a(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new ww2(ax2Var, ax2Var);
    }

    public static Pair a(long j10, long[] jArr, long[] jArr2) {
        int iB = lb3.b(jArr, j10, true);
        long j11 = jArr[iB];
        long j12 = jArr2[iB];
        int i = iB + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i] == j11 ? ConfigValue.DOUBLE_DEFAULT_VALUE : (j10 - j11) / (r6 - j11)) * (jArr2[i] - j12))) + j12));
    }
}

package j5;

import android.util.Pair;
import com.yandex.varioqub.config.model.ConfigValue;
import m3.z;
import q4.s;
import q4.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f26533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f26534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26535c;

    public c(long j10, long[] jArr, long[] jArr2) {
        this.f26533a = jArr;
        this.f26534b = jArr2;
        this.f26535c = j10 == -9223372036854775807L ? z.M(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair h(long j10, long[] jArr, long[] jArr2) {
        int iF = z.f(jArr, j10, true);
        long j11 = jArr[iF];
        long j12 = jArr2[iF];
        int i = iF + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i] == j11 ? ConfigValue.DOUBLE_DEFAULT_VALUE : (j10 - j11) / (r6 - j11)) * (jArr2[i] - j12))) + j12));
    }

    @Override // q4.t
    public final boolean a() {
        return true;
    }

    @Override // j5.h
    public final long b(long j10) {
        return z.M(((Long) h(j10, this.f26533a, this.f26534b).second).longValue());
    }

    @Override // j5.h
    public final long c() {
        return -1L;
    }

    @Override // q4.t
    public final s e(long j10) {
        Pair pairH = h(z.Z(z.k(j10, 0L, this.f26535c)), this.f26534b, this.f26533a);
        u uVar = new u(z.M(((Long) pairH.first).longValue()), ((Long) pairH.second).longValue());
        return new s(uVar, uVar);
    }

    @Override // j5.h
    public final int f() {
        return -2147483647;
    }

    @Override // q4.t
    public final long g() {
        return this.f26535c;
    }
}

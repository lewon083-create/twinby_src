package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.yandex.varioqub.config.model.ConfigValue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e5 implements h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f4834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f4835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4836c;

    public e5(long j10, long[] jArr, long[] jArr2) {
        this.f4834a = jArr;
        this.f4835b = jArr2;
        this.f4836c = j10 == -9223372036854775807L ? cq0.s(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair a(long j10, long[] jArr, long[] jArr2) {
        int iQ = cq0.q(jArr, j10, true);
        long j11 = jArr[iQ];
        long j12 = jArr2[iQ];
        int i = iQ + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i] == j11 ? ConfigValue.DOUBLE_DEFAULT_VALUE : (j10 - j11) / (r6 - j11)) * (jArr2[i] - j12))) + j12));
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final n2 b(long j10) {
        String str = cq0.f4293a;
        Pair pairA = a(cq0.r(Math.max(0L, Math.min(j10, this.f4836c))), this.f4835b, this.f4834a);
        p2 p2Var = new p2(cq0.s(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new n2(p2Var, p2Var);
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final long c() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final long h() {
        return this.f4836c;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final int k() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final long m(long j10) {
        return cq0.s(((Long) a(j10, this.f4834a, this.f4835b).second).longValue());
    }
}

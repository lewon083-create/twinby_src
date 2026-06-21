package j5;

import com.yandex.varioqub.config.model.ConfigValue;
import m3.z;
import q4.s;
import q4.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f26571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f26572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f26573g;

    public j(long j10, int i, long j11, int i10, long j12, long[] jArr) {
        this.f26567a = j10;
        this.f26568b = i;
        this.f26569c = j11;
        this.f26570d = i10;
        this.f26571e = j12;
        this.f26573g = jArr;
        this.f26572f = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override // q4.t
    public final boolean a() {
        return this.f26573g != null;
    }

    @Override // j5.h
    public final long b(long j10) {
        long j11 = j10 - this.f26567a;
        if (!a() || j11 <= this.f26568b) {
            return 0L;
        }
        long[] jArr = this.f26573g;
        jArr.getClass();
        double d10 = (j11 * 256.0d) / this.f26571e;
        int iF = z.f(jArr, (long) d10, true);
        long j12 = this.f26569c;
        long j13 = (((long) iF) * j12) / 100;
        long j14 = jArr[iF];
        int i = iF + 1;
        long j15 = (j12 * ((long) i)) / 100;
        return Math.round((j14 == (iF == 99 ? 256L : jArr[i]) ? ConfigValue.DOUBLE_DEFAULT_VALUE : (d10 - j14) / (r0 - j14)) * (j15 - j13)) + j13;
    }

    @Override // j5.h
    public final long c() {
        return this.f26572f;
    }

    @Override // q4.t
    public final s e(long j10) {
        double d10;
        double d11;
        boolean zA = a();
        int i = this.f26568b;
        long j11 = this.f26567a;
        if (!zA) {
            u uVar = new u(0L, j11 + ((long) i));
            return new s(uVar, uVar);
        }
        long jK = z.k(j10, 0L, this.f26569c);
        double d12 = (jK * 100.0d) / this.f26569c;
        double d13 = ConfigValue.DOUBLE_DEFAULT_VALUE;
        if (d12 <= ConfigValue.DOUBLE_DEFAULT_VALUE) {
            d10 = 256.0d;
        } else if (d12 >= 100.0d) {
            d10 = 256.0d;
            d13 = 256.0d;
        } else {
            int i10 = (int) d12;
            long[] jArr = this.f26573g;
            jArr.getClass();
            double d14 = jArr[i10];
            if (i10 == 99) {
                d10 = 256.0d;
                d11 = 256.0d;
            } else {
                d10 = 256.0d;
                d11 = jArr[i10 + 1];
            }
            d13 = ((d11 - d14) * (d12 - ((double) i10))) + d14;
        }
        long j12 = this.f26571e;
        u uVar2 = new u(jK, j11 + z.k(Math.round((d13 / d10) * j12), i, j12 - 1));
        return new s(uVar2, uVar2);
    }

    @Override // j5.h
    public final int f() {
        return this.f26570d;
    }

    @Override // q4.t
    public final long g() {
        return this.f26569c;
    }
}

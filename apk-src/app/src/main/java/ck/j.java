package ck;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class j implements Iterable, xj.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final i f2385e = new i(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2388d;

    public j(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f2386b = j10;
        if (j12 > 0) {
            if (j10 < j11) {
                long j13 = j11 % j12;
                long j14 = j10 % j12;
                long j15 = ((j13 < 0 ? j13 + j12 : j13) - (j14 < 0 ? j14 + j12 : j14)) % j12;
                j11 -= j15 < 0 ? j15 + j12 : j15;
            }
        } else {
            if (j12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (j10 > j11) {
                long j16 = -j12;
                long j17 = j10 % j16;
                long j18 = j11 % j16;
                long j19 = ((j17 < 0 ? j17 + j16 : j17) - (j18 < 0 ? j18 + j16 : j18)) % j16;
                j11 += j19 < 0 ? j19 + j16 : j19;
            }
        }
        this.f2387c = j11;
        this.f2388d = j12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (isEmpty() && ((j) obj).isEmpty()) {
            return true;
        }
        j jVar = (j) obj;
        return this.f2386b == jVar.f2386b && this.f2387c == jVar.f2387c && this.f2388d == jVar.f2388d;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = 31;
        long j11 = this.f2386b;
        long j12 = this.f2387c;
        long j13 = (((j11 ^ (j11 >>> 32)) * j10) + (j12 ^ (j12 >>> 32))) * j10;
        long j14 = this.f2388d;
        return (int) (j13 + (j14 ^ (j14 >>> 32)));
    }

    public boolean isEmpty() {
        long j10 = this.f2388d;
        long j11 = this.f2387c;
        long j12 = this.f2386b;
        return j10 > 0 ? j12 > j11 : j12 < j11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new k(this.f2386b, this.f2387c, this.f2388d);
    }

    public String toString() {
        StringBuilder sb2;
        long j10 = this.f2388d;
        long j11 = this.f2387c;
        long j12 = this.f2386b;
        if (j10 > 0) {
            sb2 = new StringBuilder();
            sb2.append(j12);
            sb2.append("..");
            sb2.append(j11);
            sb2.append(" step ");
            sb2.append(j10);
        } else {
            sb2 = new StringBuilder();
            sb2.append(j12);
            sb2.append(" downTo ");
            sb2.append(j11);
            sb2.append(" step ");
            sb2.append(-j10);
        }
        return sb2.toString();
    }
}

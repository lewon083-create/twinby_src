package x0;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f35516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Throwable f35518d;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));
    }

    public b(int i, double d10, long j10, Throwable th2) {
        this.f35515a = i;
        this.f35516b = d10;
        this.f35517c = j10;
        this.f35518d = th2;
    }

    public final boolean equals(Object obj) {
        Throwable th2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            Throwable th3 = bVar.f35518d;
            if (this.f35515a == bVar.f35515a && Double.doubleToLongBits(this.f35516b) == Double.doubleToLongBits(bVar.f35516b) && this.f35517c == bVar.f35517c && ((th2 = this.f35518d) != null ? th2.equals(th3) : th3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f35515a ^ 1000003) * 1000003;
        double d10 = this.f35516b;
        int iDoubleToLongBits = (i ^ ((int) (Double.doubleToLongBits(d10) ^ (Double.doubleToLongBits(d10) >>> 32)))) * 1000003;
        long j10 = this.f35517c;
        int i10 = (iDoubleToLongBits ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Throwable th2 = this.f35518d;
        return i10 ^ (th2 == null ? 0 : th2.hashCode());
    }

    public final String toString() {
        return "AudioStats{audioState=" + this.f35515a + ", audioAmplitudeInternal=" + this.f35516b + ", audioBytesRecorded=" + this.f35517c + ", errorCause=" + this.f35518d + "}";
    }
}

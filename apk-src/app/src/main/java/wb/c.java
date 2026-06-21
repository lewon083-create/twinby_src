package wb;

import android.animation.TimeInterpolator;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f35224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f35225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeInterpolator f35226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35228e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f35226c;
        return timeInterpolator != null ? timeInterpolator : a.f35219b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f35224a == cVar.f35224a && this.f35225b == cVar.f35225b && this.f35227d == cVar.f35227d && this.f35228e == cVar.f35228e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f35224a;
        long j11 = this.f35225b;
        return ((((a().getClass().hashCode() + (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31)) * 31) + this.f35227d) * 31) + this.f35228e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(c.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f35224a);
        sb2.append(" duration: ");
        sb2.append(this.f35225b);
        sb2.append(" interpolator: ");
        sb2.append(a().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f35227d);
        sb2.append(" repeatMode: ");
        return z.d(this.f35228e, "}\n", sb2);
    }
}

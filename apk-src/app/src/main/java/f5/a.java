package f5;

import com.google.android.gms.internal.measurement.h5;
import java.util.Locale;
import java.util.Objects;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16659c;

    public a(int i, long j10, long j11) {
        h5.h(j10 < j11);
        this.f16657a = j10;
        this.f16658b = j11;
        this.f16659c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f16657a == aVar.f16657a && this.f16658b == aVar.f16658b && this.f16659c == aVar.f16659c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f16657a), Long.valueOf(this.f16658b), Integer.valueOf(this.f16659c));
    }

    public final String toString() {
        String str = z.f28608a;
        Locale locale = Locale.US;
        StringBuilder sbN = gf.a.n("Segment: startTimeMs=", ", endTimeMs=", this.f16657a);
        sbN.append(this.f16658b);
        sbN.append(", speedDivisor=");
        sbN.append(this.f16659c);
        return sbN.toString();
    }
}
